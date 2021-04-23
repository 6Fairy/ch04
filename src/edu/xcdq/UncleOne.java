package edu.xcdq;

public class UncleOne extends Uncle {

    public UncleOne(){
        super();
        System.out.println("uncleone的构造方法");
    }

    public void  chouyan(){
        System.out.println("大舅喜欢抽烟");
    }
    //方法的重写 覆写
    public void faHongbao(){
        System.out.println("大舅家道中落，发不起红包了，该送祝福了");
    }
}
