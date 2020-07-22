package main.java.com.volkova;

public class AppDead {
    public void killMemory(){
        int [] array;
        array = new int[1000000000];
        for (int i =0; i<array.length; i++){
            array [i]= ((int)(Math.random()*100000000));

            System.out.println(array[i]);
        }
    }
}