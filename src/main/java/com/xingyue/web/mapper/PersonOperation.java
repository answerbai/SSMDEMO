package com.xingyue.web.mapper;

import com.xingyue.web.mapping.Person;

import java.util.List;

/**
 * Created by Administrator on 2017/3/3.
 */
public interface PersonOperation {

    Person selectUserByID(int id);

    List<Person> selectUsers(String userName);

    void addPerson(Person person);
}
