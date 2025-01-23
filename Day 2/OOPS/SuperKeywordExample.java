package com.OOPS;
class Ab {
    int x = 10;
}


class Bc extends Ab {
    int x = 200;

    public void display() {
       
        System.out.println(super.x);//parent class

        System.out.println( x); //child class
    }
}
public class SuperKeywordExample {
    public static void main(String[] args) {
        Bc obj = new Bc();
        obj.display();
    }
}
