package com.example.timer;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

public class MyTimer implements java.io.Serializable{


    private static final String ROOTNODE = "ROOT";


    private static final String[] EMPTY_ARRAY = new String[0];

    // List of nodes. Node is a <String,String[]> pair key=id and value[0]=name value[1]=time.

    private HashMap<String,MyNode> nodes;

    // List of groupings. Groups are a subset of nodes (only id).
    // Groups are ordered. They define a loop in the graph.
    // Groups have a counter. This defines how often it should be looped.
    private HashSet<Group> groups;

    // Hashmap of edges <source,taget>. <
    private HashMap<String,String> edges;


    // Currently active Node.
    private String curent_id;

    // Time Left on current node.
    private int    current_seconds_left;

    // Time left total for timer.
    private int    total_time_left;

    private String timer_id;
    private String timer_name;
    private Date created_on;

    public MyTimer(String name){
        this.nodes=new HashMap<String,MyNode>();
        this.groups=new HashSet<Group>();
        this.timer_name = name;
        this.timer_id = createId();
        this.created_on= new Date();
    }

    public void start_timer(){

    }

    private void time(HashSet<Group> groups){

        Group big_g = getBiggestGroup(groups);

        // Loop counter of big_g times
        for (int i = 0 ; i < big_g.getCounter();i++){

        }


    }



    private String createId(){
        return UUID.randomUUID().toString();
    }

    private Group getBiggestGroup(HashSet<Group> groups){

        Group empty_group = new Group(0,this.EMPTY_ARRAY);
        Group current = empty_group;
        for (Group g : groups){
            if (g.getGroupSize() > current.getGroupSize()) {
                current =g;
            }
        }
        return current;

    }

}
