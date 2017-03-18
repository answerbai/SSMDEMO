package com.xingyue.web.controller;

import com.xingyue.web.mapper.PersonOperation;
import com.xingyue.web.mapping.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/18.
 */

@Controller
@RequestMapping("/article")
public class UserController {
    @Autowired
    PersonOperation  userMapper;

    @RequestMapping("/list")
    public ModelAndView listall(HttpServletRequest request, HttpServletResponse response){
        List<Person> persons=userMapper.selectUsers("%t%");
        ModelAndView mav=new ModelAndView("list");
        mav.addObject("articles",persons);
        return mav;
    }
}
