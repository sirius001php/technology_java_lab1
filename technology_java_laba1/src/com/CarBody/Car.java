package com.CarBody;

import java.util.ArrayList;
//    клас вякий ми записуємо марку машини, а також створюємо ArrayList обєктів класу Boody
public class Car {
    private String mark;
    private ArrayList<Boody> bodies;

    public Car (String mark, Body b){
        this.mark = mark;
        bodies = new ArrayList<Boody>();
        bodies.add(b);
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public String getMark(){
        return this.mark;
    }

    public Boody getBoody(int i){
        return bodies.get(i);
    }

    public void addBody(Boody b){
        bodies.add(b);
    }

    public int getSize(){
        return bodies.size();
    }

    public ArrayList<Boody> getBodies(){
        return bodies;
    }

}

