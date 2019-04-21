MyBatis
===
Object对象  Mapping隐身   Relation字段
对象在数据库中的映射关系

### Mybatis配置
- mybatis.xml 主配置文件
- ***Mapper.xml映射配置文件
  ```
    <?xml version="1.0" encoding="UTF-8" ?>
        <!DOCTYPE configuration
                PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
                "http://mybatis.org/dtd/mybatis-3-config.dtd">
        <configuration>
            <environments default="development">
                <environment id="development">
                    <transactionManager type="JDBC"/>
                    <dataSource type="POOLED">
                        <property name="driver" value="com.mysql.jdbc.Driver"/>
                        <property name="url" value="jdbc:mysql://127.0.0.1:3306/javaJDBC"/>
                        <property name="username" value="root"/>
                        <property name="password" value="root"/>
                    </dataSource>
                </environment>
            </environments>
        <!--    映射配置文件-->
            <mappers>
                <mapper resource="mapper/userMapper.xml"/>
            </mappers>
        </configuration>
    ```
    ```
        <?xml version="1.0" encoding="UTF-8" ?>
        <!DOCTYPE mapper
                PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
                "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
        <!--
            namespace 命名空间
            通常情况,命名空间的值,就是当前操作实体类的全名称
        -->
        <mapper namespace="com.dollarkiller.entity.Users">
            <select id="userList" resultType="com.dollarkiller.entity.Users">
                select * from users
            </select>
        </mapper>
    ```
    ```
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
    ```
#### Small Demo
  - 所有用户数据查询
  - 单个用户数据查询
  - 用户数据修改(完善资料)
  - 锁定用户账户
  - 删除用户账户  
  - 彻底删除用户账户

### 主配置解析
- properties 配置加载
- environments 环境配置 
- settings 参数设置配置
- typeAliases别名设置
- mapper映射加载
```
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>

    <!--
        properties配置,用于加载外部的properties配置文件
    -->
    <properties resource="db.properties"></properties>

    <!--
        environments 主要用于进行数据源的配置
        可以配置多个数据源通过default属性自定当前项目运行过程中使用的是那个数据源
    -->
    <environments default="development">
        <!--
            environment 用于配置具体的数据源
            id属性用于给当前数据源定义一个名称,方便我们项目指定
        -->
        <environment id="development">
            <!--
                transactionManager 用于配置事务管理,默认情况下使用JDBC事务管理
             -->
            <transactionManager type="JDBC"/>
            <!--
                dataSource 用于配置具体数据源的链接信息 type属性:是否使用连接池
             -->
            <dataSource type="POOLED">
                <property name="driver" value="${driver}"/>
                <property name="url" value="${url}"/>
                <property name="username" value="${username}"/>
                <property name="password" value="${password}"/>
            </dataSource>
        </environment>
        <environment id="master">
            <transactionManager type="JDBC"/>
            <dataSource type="POOLED">
                <property name="driver" value="${driver}"/>
                <property name="url" value="${url}"/>
                <property name="username" value="${username}"/>
                <property name="password" value="${password}"/>
            </dataSource>
        </environment>
    </environments>

    <!--
        mappers 用于配置外部的映射配置文件
        在主配置中需要引入架子啊映射配置文件
    -->
    <mappers>
        <!--
            mapper 配置具体的映射配置文件 resource进行路径引入
        -->
<!--        <mapper resource="org/mybatis/example/BlogMapper.xml"/>-->
    </mappers>
</configuration>
```
#### 查询数据
- 映射配置:sql片段
- 映射配置:select配置
  - 特殊配置:字段和属性不一致时resultMap配置
```
 * resource:mybatis-config.xml
 * InputStream
 * SqlSessionFactory
 * SqlSession
 * 执行配置好的sql语句
```
