package com.example.timer;


import java.util.ArrayList;
import java.util.HashMap;
/*
A model for my flowchart timer. It uses graphs as internal representation of the Timers.

@author Oliver Tautz
@since 01.2021
 */

public class GraphModel implements Model {

    public static final int GROUP_COUNTER_INDEX = 0;
    public static final int NAME_INDEX = 0;
    public static final int TIME_INDEX = 1;

    //list of loaded timers
    private HashMap<String, MyTimer> timers;

    private String save_loadpath;


    public GraphModel(String filepath) {
        this.save_loadpath = filepath;
        this.timers = new HashMap();

    }

    /*

     */


    @Override
    public ArrayList<String> get_timer_ids() {
        return new ArrayList<String>(this.timers.keySet());
    }

    @Override
    public HashMap<String, HashMap<String, String>> get_current_timers() {
        return null;
    }


    /*

     */
    @Override
    public HashMap<String, String> get_timer(String id) {
        return null;
    }

    /*

     */
    @Override
    public int start_timer(String id) {
        return 1;
    }

    /*

     */
    @Override
    public int stop_timer(String id) {
        return 1;
    }

    /*

     */

    /*

     */
    @Override
    public int create_timer(String id) {
        return 1;
    }

    public int add_timer_group(String timer_id, String time, String[] group) {
        return 1;
    }

    public int delete_timer_group(String timer_id, String time, String[] group) {
        return 1;
    }


    /*

     */
    public int delete_timer(String id) {
        return 1;
    }

    private void load_timer(String id) {

    }

    private void save_timer(String id){

    }


}
