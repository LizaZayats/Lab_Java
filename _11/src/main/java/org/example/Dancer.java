package org.example;

public class Dancer extends Actor{
    private String signatureMove;
    public Dancer(String name, int age, String genre,String signatureMove){
        super(name, age, genre);
        this.signatureMove=signatureMove;
    }
    public void special(){
        System.out.println("Имеет фирменое движение ");
    }
    public void special(int count){
        System.out.println(signatureMove+ " использовано " + count +" раз");
    }
    @Override
    public void getAwards() {
        System.out.println("3 награды");
    }
}
