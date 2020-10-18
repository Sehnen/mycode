package tk.sehnen;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import tk.sehnen.dao.IUserDao;
import tk.sehnen.domain.User;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    @Test
    public  void test () throws  Exception{
//        读取配置文件
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
//        创建sqlSessionFactory构建者对象
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        SqlSession session=factory.openSession();

        IUserDao userDao=session.getMapper(IUserDao.class);
        List<User> users=userDao.findAll();

        for (User user:users){

            System.out.println(user);
        }
        session.close();
        in.close();
    }



}
