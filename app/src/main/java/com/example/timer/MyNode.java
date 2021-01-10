package com.example.timer;

public class MyNode {


    private String name;
    private int time;

    public MyNode(String name, int time){
        this.name=name;
        this.time = time;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        MyNode n = (MyNode)obj;
        return n.getName()==this.getName() && n.getTime() == this.getTime();
    }


}
