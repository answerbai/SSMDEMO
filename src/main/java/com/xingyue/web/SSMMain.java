package com.xingyue.web;


import com.xingyue.web.mapping.Person;
import com.xingyue.web.service.PersonService;

import java.util.List;

/**
 * Created by Administrator on 2017/1/18.
 */
public class SSMMain {


    public static PersonService personService = new PersonService();

    public static void main(String []args){
        getUserInfo();
        getPersonByInterFace();
        getPersonList();

    }

    private static void getPersonByInterFace() {
        Person person = personService.getPersonByInterFace(1);
        System.out.println("getPersonByInterFace:");
        System.out.println(person.getUserName());
        System.out.println(person.getAge());
        System.out.println();
    }

    private static void getUserInfo() {
        System.out.println("getUserInfo:");
        Person person = personService.getUserinfo(1);
        System.out.println(person.getUserName());
        System.out.println(person.getAge());
        System.out.println();

    }

    private static void getPersonList(){
        System.out.println("getPersonList:");
        List<Person> personList = personService.getPersonList("%t%");
        for (Person p:personList) {
            System.out.println(p.getUserName());
        }
        System.out.println();
    }

    private static void addPerson(){
        System.out.println("addPerson:");
        personService.getUserinfo(1);
        System.out.println();
    }
}
