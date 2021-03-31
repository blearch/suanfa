package paixu;

import java.util.Arrays;

/*
，基本思想为每一趟从待排序的数据元素中选择最小（或最大）的一个元素作为首元素，直到所有元素排完为止，简单选择排序是不稳定排序。
 */
public class xuanze {
    public void processSelectSort2(int[] arr){
        for (int i = 0; i <arr.length -1; i++) {
//            每轮默认把第一个数当成最小的数
            int min=arr[i];
            int minIndex=1;
            for (int j = i; j <arr.length ; j++) {
                if(min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
            }
//            然后把最小的值进行置换
            arr[minIndex]=arr[i];
            arr[i]=min;
            System.out.println("第"+(i+1)+"轮排序后"+ Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int arr[]={101,34,119,1};
        xuanze xuanze=new xuanze();
        xuanze.processSelectSort2(arr);
    }
}
