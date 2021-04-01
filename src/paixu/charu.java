package paixu;
/*
 插入排序 插入的方式寻找该元素的适当位置，以达到排序的目的。

 基本思想
 把 n 个待排序的元素 看成 为一个 有序表 和 无序表
 开始时，有序表中只包含一个元素，无序表中包含有 n - 1 个 元素

排序过程中每次 从无序表中取出第一个元素，把它的排序码 依次与有序表元素的排序码进行比较，将它插入到有序表中的适当位置，使之成为新的有序表。
 */


import java.util.Arrays;

public class charu {
//  个人认为的思路如下：
/*
首先循环从下标为1 的地方开始（默认下标为0的是有序的）
然后创建一个变量去保存 要插入的元素
最后进行挨个的比较
 */
    public static void shixian(int[] nums){
        for (int i = 1; i <nums.length ; i++) {
            int current=nums[i];
            int insertIndex=i-1;
//           insertIndex>=0 则表示是循环到最后一个位置
            while (insertIndex>=0 && current<nums[insertIndex]){
                nums[insertIndex+1]=nums[insertIndex];
                insertIndex--;
            }
            nums[insertIndex+1]=current;
            System.out.println("第"+i+"轮排序后"+ Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        int arr[] = {101, 34, 119, 1};
        shixian(arr);
    }
}
