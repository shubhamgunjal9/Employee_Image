package com.task.controller;

import java.io.Serializable;
import java.util.*;

public class test {
    public static void main(String[] args) {
        TreeSet<emp> emps= new TreeSet<>();
        emps.addAll(Arrays.asList(
                new emp("shubham","It",7),
                new emp("tejas","It",5),
                new emp("harish","It",4),
                new emp("tushar","It",3)
                ));
        System.out.println(emps);
//        Collections.sort(emps,);
//        for (emp e:emps
//             ) {
//            System.out.println(e);
//
//        }

//
//        TreeSet sorted = new TreeSet<>();
//        sorted.addAll(Arrays.asList(new StringBuilder("hello"),
//                new StringBuilder("shubham"),
//                new StringBuilder("tushar"),
//                10
//                ));
      //  System.out.println(sorted);
    }

}
class emp implements Serializable,Comparable<emp>{

    String name;

    String dept_name;
    Integer id;

    public emp(String name, String dept_name, Integer id) {
        this.name = name;
        this.dept_name = dept_name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "emp{" +
                "name='" + name + '\'' +
                ", dept_name='" + dept_name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(emp emp) {
        return -1;
    }

//    class sortemp implements Comparator<emp>{
//
//
//    }
}
