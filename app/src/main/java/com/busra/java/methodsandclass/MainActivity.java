package com.busra.java.methodsandclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //extends demek bir şeye uzanıyor demek. mainactivity , AppCompatActivity nin tüm özelliklerin alabiliyor.
    //global degisten//String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        System.out.println ("Application started" );
        test ();
        System.out.println (math(4,5));
        //userName = "busra";
        makeSimpson ();
    }

    public void test(){
        int x = 4+4;
        System.out.println ("value of x "+ x);
        //userName ="nur";
    }

    public int math(int a, int b){
        //userName = "sezer";
        return a+b;
    }

    public void makeMusicians(){
        //constructorsuz
      /*  Musician musician = new Musician ();
        musician.name = "Sezer";
        musician.instrument = "saz";
        musician.age = 27;*/
      Musician musician = new Musician ( "sezer", "saz",27 );
    }

    public  void makeSimpson(){
        Simpsons homer = new Simpsons ( "homer simpson" ,50,"nuclear reactor chief");
        // homer.age = 15; private tanımlanınca hata veriyor.cünkü class dışında cağrıldı
        System.out.println (homer.getName ());
        homer.setName ( "Homer Sezer" );
        System.out.println (homer.getName ());
    }
}
