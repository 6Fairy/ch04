package edu.xcdq;

public class Demo01 {
    public static void main(String[] args) {
        final  double PI= 3.14;
       // PI = 6.25;
        final int[] a= new int[]{1,2,3};
        a[0]=10;
        a[1]=20;
        a[2]=30;
        int [] b= new int[3];
        //  a=b;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
