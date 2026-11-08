package org.example;

public class Singer extends Actor{
    private String nickName;
    public Singer(String name, int age, String genre,String nickName){
        super(name, age, genre);
        this.nickName=nickName;
    }
    public void sing(){
        System.out.println("Поет");
    }
    public void sing(String songName){
        System.out.println(nickName+ " поет " + songName);
    }
    @Override
    public void getAwards() {
        System.out.println("5 наград");
    }
}
