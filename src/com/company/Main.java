package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//       here  all the variables can access through the methods
        employee e = new employee();
//        
        e.setID(6);
        e.setName("jawad");
        e.setSalary(50000);

        System.out.println("name:" +e.getName());
        System.out.println("id:" +e.getID());
        System.out.println("salary:" +e.getSalary());

    }
}
