package com.heima;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
    @Test
    public void test() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.class.getResourceAsStream("/sqlmap.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作 参数；namespace+id
        List <user> userList = sqlSession.selectList("usrname.findall");
        //打印数据
        System.out.println(userList);
        //释放资源
        sqlSession.close();

    }
}
