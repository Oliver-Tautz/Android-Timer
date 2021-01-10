package com.example.timer;


import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

public class MyTimer implements java.io.Serializable{


    // List of nodes. Node is a <String,String[]> pair key=id and value[0]=name value[1]=time.

    private HashMap<String,String[]> nodes;

    // List of groupings. Groups are a subset of nodes (only id).
    // Groups are ordered. They define a loop in the graph.
    private HashSet<MyPair> groups;


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
        this.nodes=new HashMap<String,String[]>();
        this.groups=new HashSet<MyPair>();
        this.timer_name = name;
        this.timer_id = createId();
        this.created_on= new Date();
    }

    public void start_timer(){

    }

    private void time(String[] group){

        // Loop for the count
        for (int i = 0;i<Integer.parseInt(group[GraphModel.GROUP_COUNTER_INDEX]);i++) {
            for    (int j = 1 ; j< group.length;j++) {
                for (String[] g : this.groups){
                    if g.length <
                }
            }
        }
    }



    private String createId(){
        return UUID.randomUUID().toString();
    }


}
