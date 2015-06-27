package com.workforce.hr.domains;

/**
 * Created by siddique on 6/19/15.
 */
public class Department {

    private String name;

    private Employee employee[] = null;
    private Manager managers[] = null;

    public Department(String name) {
       this.name = name;
        //lets start gossiping
        Gossip gossip = new Gossip();
        gossip.gossipWhatGoesOn();
    }

    public void calculateBonuses() {
        //calculate bonuses of all the individuals(Employee & Manager) working for this department

    }

    public void calculateVacationDays() {
        //calculate total vacation days of all the individuals(Employee & Manager) working for this department
    }


    private class Gossip {
        public void gossipWhatGoesOn() {

        }
    }
}
