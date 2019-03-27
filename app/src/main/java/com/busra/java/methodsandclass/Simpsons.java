package com.busra.java.methodsandclass;

public class Simpsons {
/*
 public    String name;
 public   int age;
 public String occupation;//meslek*/

    //degistenler private olarak tanımlanırsa bu class haricindde ulasılamaz
    // protected sadece class içinde ulasılabilir fakat extends edilirse ulasılablir.arada kalan bir erişebilirlik seviyesidir.

    private String name;
    private int age;
    private String occupation;


    public Simpsons(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    //get&set
    //diger classlardan verileri alıp vermeye yarıyor. degistenler private olsa bile.
    //güvenlikten kayıp olmadan degistenlere ulasabiliyoruz.

    public String getName() {//name alırız
        return name;
    }

    public void setName(String name) {//name degistirebiliriz
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
