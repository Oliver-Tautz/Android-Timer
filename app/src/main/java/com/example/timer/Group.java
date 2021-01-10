package com.example.timer;

public class Group extends Object {
    private String[] nodes;
    private int counter;


    public Group(int counter, String[] nodes) {
        this.counter = counter;
        this.nodes = nodes;
    }

    public Group() {
        super();
    }

    public String[] getNodes() {
        return nodes;
    }

    public String get_start_Node(){
        return this.nodes[0];
    }

    public int getCounter() {
        return counter;
    }

    public int getGroupSize() {
        return this.nodes.length;
    }

    public int is_subgroup (Group bigger_group){
        //reject smaller groups
        if (this.getGroupSize()<bigger_group.getGroupSize()){
            return -1;
        }

        String start_node = this.get_start_Node();
        int start_index= 0;

        // find starting symbol
        boolean start_found = false;
        for (int i=0; i< bigger_group.getGroupSize();i++){
            String current = bigger_group.getNodes()[i];
            if (current.equals(start_node)){
                start_found = true;
                // Where to start comparison
                start_index = i+1;
            }
        }

        if (!start_found){return -1;}

        for (int j = 1; j< this.getGroupSize(); j++){
            if (!this.getNodes()[j].equals(bigger_group.getNodes()[start_index])){
                return -1;
            };
            start_index++;
        }

        return start_index;


    }


    // Equal only in the nodes because we don't want duplicates with different counters.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        Group g = (Group)obj;
        return g.getNodes()==this.getNodes();
    }


}
