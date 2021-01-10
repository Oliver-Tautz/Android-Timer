package com.example.test1;

import java.util.ArrayList;
import java.util.HashMap;

/*
A model for my flowchart timer.

@author Oliver Tautz
@since 01.2021
 */
public interface Model {
    /*

     */
    public ArrayList<String> get_timer_ids();
    /*

     */
    public HashMap<String,HashMap<String,String>> get_current_timers();
    /*

     */
    public HashMap<String,String> get_timer(String id);

    /*

     */
    public int start_timer(String id);
    /*

     */
    public int stop_timer(String id);

    /*

     */
    public int create_timer(String id);

    /*

     */
    public int delete_timer(String id);

    /**/


}
