import java.util.*;

public class RadixSort {
	public static void main(String[] args) {

        int[] array = {278,109,63,930,589,184,505,269,8,83};  
        radixSort(array);  
		for(double a : array){
			System.out.println(a);
		}
	}
public static void radixSort(int[] array){
		
		//------------------------------------------ȷ�����������----------------------------------
		int max=array[0];
		for(int i=1;i<array.length;i++){
			if(array[i]>max){
				max=array[i];
			}
		}
		int time=0;
		while(max>0){
			max/=10;
			time++;
		}
		//----------------------------------------��ʼ��10�������û�����ʱ�ݴ�-------------------------------
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		for(int i=0;i<10;i++){
			List<Integer> item=new ArrayList<Integer>();
			list.add(item);
		}
		
		//-----------------------------------------����time�η�����ռ�-------------------------------------
	  for(int i=0;i<time;i++){
		    //����Ԫ��;
			for(int j=0;j<array.length;j++){
				int index = array[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10, i);
				list.get(index).add(array[j]);
			}
			//�ռ�Ԫ��;
			int count=0;
			for(int k=0;k<10;k++){
				if(list.get(k).size()>0){
					for(int a : list.get(k)){
						array[count]=a;
						count++;
					}
					//������ݣ��Ա��´��ռ�
					list.get(k).clear();
				}
			}
		}
	}
}
