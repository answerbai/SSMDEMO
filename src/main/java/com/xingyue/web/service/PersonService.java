package com.xingyue.web.service;

import com.xingyue.web.mapper.PersonOperation;
import com.xingyue.web.mapping.Person;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2017/3/3.
 */
public class PersonService extends BaseOperation{

    public Person getUserinfo(int id) {
        SqlSession session = PersonService.getSession();
        Person person = null;
        try {
            person = (Person) session.selectOne("com.xingyue.web.mapper.PersonOperation.selectUserByID", id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return person;
    }

    public Person getPersonByInterFace(int id) {
        Person person = null;
        SqlSession session = PersonService.getSession();
        PersonOperation operation = session.getMapper(PersonOperation.class);
        try {
            person = operation.selectUserByID(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return person;
    }


    public List<Person> getPersonList(String name){
        SqlSession session = PersonService.getSession();
        PersonOperation operation = session.getMapper(PersonOperation.class);
        List<Person> personList = null;
        try {
            personList = operation.selectUsers(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personList;
    }


    public void addPerson(Person person){
        SqlSession session = PersonService.getSession();
        PersonOperation operation = session.getMapper(PersonOperation.class);
        try {
            operation.addPerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
