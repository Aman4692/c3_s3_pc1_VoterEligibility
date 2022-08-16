package com.election;

public class Voter {

    private String name;
    private int age;
    static final int VOTER_ELIGIBLE_AGE = 18;
    Voter(){

    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAgeCriteria(){
        String message = null;
        if (getAge() > VOTER_ELIGIBLE_AGE){
            message = getName() + " is eligible to vote";
            return message;
        } else if (getAge() > 0 && getAge() < 18) {
            message = getName() + " is not eligible to vote";
            return message;
        }
        else
            return message = "Age can't be negative or zero";

    }


}
