package com.xingyue.web.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by Administrator on 2017/3/3.
 */
public class BaseOperation {

    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    static{
        try{
            reader = Resources.getResourceAsReader("Configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
