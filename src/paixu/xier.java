package paixu;

import java.util.Arrays;

/*
 希尔排序
 主要的实现思想：
 希尔排序把记录按 下标的一定增量分组，对每组使用 直接插入排序算法 排序，随着 增量逐渐减少，每组包含的关键词越来越多（要排序的数），当增量减至 1 时，整个文件被分成一组，算法遍终止。

 希尔排序有两种方式：
 1. 交换
 2. 移动

 */
public class xier {
    /*
    解题思路：
    先使用交换的方式进行处理
     */
    public static void jiaohuan(int[] nums){
        int temp=0;
//         先得到每步的步长
        for (int i = nums.length/2; i>0 ; i=i/2) {
//            然后外层嵌套，获取无序数组的最外面的数据
            for (int j = i; j <nums.length ; j++) {
//                然后进行内层处理，拿得到的和有序的进行比较然后交换
                for (int k = j-i; k>=0; k-=i) {
                    if (nums[k]>nums[k+i]){
                        temp=nums[k];
                        nums[k]=nums[k+i];
                        nums[k+i]=temp;
                    }
                }
            }
            System.out.println("增量为 " + i + " 的这一轮排序后：" + Arrays.toString(nums));
        }
    }

    public static void yidong(int[] nums){
        int temp=0;
//         先得到每步的步长
        for (int i = nums.length/2; i>0 ; i=i/2) {
//            然后外层嵌套，获取无序数组的最外面的数据
            for (int j = i; j <nums.length ; j++) {
//                获取最后一个有序的参数
                int index=j-i;
                int current=nums[j];
//                然后进行内层处理，拿得到的和有序的进行比较然后交换
                    while (index>=0 && current<nums[index]){
                        nums[index+i]=nums[index];
                        index-=i;

                }
                    nums[index+i]=current;
            }
            System.out.println("增量为 " +  i + " 的这一轮排序后：" + Arrays.toString(nums));
        }

    }


    public static void main(String[] args) {
        int arr[] = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        yidong(arr);
    }
}
