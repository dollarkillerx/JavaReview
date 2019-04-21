import com.dollarkiller.entity.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-21
 * Time: 下午3:10
 * Description: No Description
 */
public class TestDemo {
    @Test
    public void testDemo1() throws IOException {
        // 初始化MyBatis配置环境
        String resource = "mybatis.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory =
                new SqlSessionFactoryBuilder().build(is);
        // 打开和数据库之间的回话
        SqlSession session = factory.openSession();
        List<Users> userList = session.selectList("userList");
        for (Users users:userList) {
            System.out.println(users);
        }
        session.close();
    }
}
