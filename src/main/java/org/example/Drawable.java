package org.example;

public interface Drawable {
    float rateOfInterest();
}
class SBI implements Drawable{
    public float rateOfInterest(){return 9.15f;}
}
class PNB implements Drawable{
    public float rateOfInterest(){return 9.7f;}
}
class TestInterface2{
    public static void main(String[] args){
        Drawable b=new SBI();
        System.out.println("ROI: "+b.rateOfInterest());
    }
}
