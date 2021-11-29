package com.company;
//Box деген generic класс тузунуз.
//        Ичинде Box деген объектти
//        кайтарган статический generic метод болсун.


public class Box <T,T1,T2>{
    private T quantities;
    private T1 money;
    private T2 where;

    public Box(T quantities, T1 money, T2 where) {
        this.quantities = quantities;
        this.money = money;
        this.where = where;
    }
    @Override
    public String toString() {
        return "Box{" +
                "quantities=" + quantities +
                ", money=" + money +
                ", where=" + where +
                '}';
    }
    public static Box sum(){
        Box<String,Integer,String>stringIntegerStringBox=new Box<>("good",45,"London");
        return stringIntegerStringBox;
    }
}

