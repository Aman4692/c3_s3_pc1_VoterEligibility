package com.election;


import java.util.Scanner;

public class VoterImpl {
    public static void main(String[] args) {
        Voter voter = new Voter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        voter.setName(scanner.nextLine());
        System.out.println("Enter age ");
        voter.setAge(scanner.nextInt());
       /////// voter.getAgeCriteria();
        System.out.println(voter.getAgeCriteria());
    }

}
