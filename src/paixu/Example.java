package paixu;

import java.util.Arrays;

import static sun.java2d.cmm.ColorTransform.In;


class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("A");
        }

    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("B");
        }
    }
}
class Thread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("C");
        }
    }
}

class waitThread extends Thread{
    private volatile boolean fire=false;
    @Override
    public void run() {
        try{
            synchronized (this){
                while(!fire){
                    System.out.println("nowait");
                    wait();
                    System.out.println("wait");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fire(){
        synchronized (this){
//            this.fire=true;
            notify();
        }
    }
}
class Test2{
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1=new Thread1();
        Thread2 thread2=new Thread2();
        Thread3 thread3=new Thread3();
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
    }
}
class Solution {

    public int jump(int[] nums) {
        int bushu=0;
        int total=nums[0];
        int i=0;
//        int i_value=0;
        if(nums.length==1){
            return 0;
        }
        while(i<=nums.length){

            if(i+nums[i]>=nums.length-1){
                bushu+=1;
                break;
            }

            int[] newData;
            newData= Arrays.copyOfRange(nums,i+1,i+1+nums[i]);
            int value=getBig(newData);
            i=i+value+1;
//            i_value=nums[i];
//            total=nums.length-nums[i];
            bushu+=1;

        }
        System.out.println(bushu);
        return bushu;
    }
//    索引加值的最大值
    public int getBig(int[] nums){
        int index=0;
        int value=0;
        int bigest=0;
        for (int i = 0; i <nums.length ; i++) {
            if (bigest<nums[i]+i){
                bigest=nums[i]+i;
//                value=nums[i];
                index=i;

            }
        }
        return index;
    }
}
class test3{
    public static void main(String[] args) throws InterruptedException {
        Solution solution=new Solution();
        int[] a=new int[]{1,1,1,1,1,1};
        solution.jump(a);
    }
}
