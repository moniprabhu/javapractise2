package com.stackroute.p2;
import java.lang.String;
 class EmployeeInfo {


    String name;
    double salary;
    int age;

    /* declare the methods */
    void setData(String member_name,double member_value, int member_age) { // stores the input data
        name = member_name;
        salary= member_value;
        age=member_age;
    }
    void getData() { // displays the stored data
        System.out.println("Student Info :- ");
        System.out.println("name : " + name + "  salary : " + salary+"age:"+age);
    }
}

public class Employee {
    public static void main(String args[]) {
        EmployeeInfo  emp = new EmployeeInfo();//create an object to store a student's info
        // call setData() to store student's roll and percentage
        emp.setData("harrypotter",2500, 30);
        emp.getData();

    }
}
