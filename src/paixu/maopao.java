package paixu;

import java.util.Arrays;

/*
：通过对待排序序列 从前向后（从下标较小的元素开始），依次比较相邻元素的值，若发现逆序则交换，使值较大的元素逐渐从前移向后部，就像水底下的旗袍一样逐渐向上冒。
 */
public class maopao {
    public void processDemo2(){
        int arr[]={3,9,-1,10,-2};
//        用来交换值的中间者
        int temp=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
            System.out.println("第"+(i+1)+"趟排序后的数组");
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        maopao maopao=new maopao();
        maopao.processDemo2();
    }
}
