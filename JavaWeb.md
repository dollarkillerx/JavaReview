JavaWeb 入门
===

### JavaWeb基础

#### XML
- XML 介绍与用途
- XML 语法和规则
- XML 语意约束
- Java解析XML
- XPath路径表达式
- 文档结构
    - 每一行必须是XML声明
    `<?xml version="1.0" encoding="utf-8">`
    - 有且只有一个根节点
    - XML标签的书写规范与HTML相同
- 书写规范
    - 合法的标签名
        - 建议使用英文，小写字母，单词之间使用“-”分割
        - 语义化
    - 合理使用属性
    - 适当的注释与缩进
    - 特殊字符实体引用与CDATA标签
        ``` 
             <![CDATA[
                内容
                    ]]>
        ```
    - 有序的子元素
    ![](./README/styy.png)
- DTD 简单易用语义约束方式
    ``` 
    hr.dtd
    <!ELEMENT hr(employee+)>
    <!ELEMENT employee (name,age,salary,department)>
    <!ATTLIST employee no CDATA"">
    <!ELEMENT name (#PCDATA)>
    ```
    - 利用<!ELEMENT>标签，定义XML文档中允许出现节点及其数量,hr.xml
    ``` 
    <!ELEMENT hr(employee)> hr节点下只允许出现一个employee子节点
    <!ELEMENT employee(name,age,salary,department)> eleployee下必须包含四个节点，且按顺序出现
    
    #PCDATA 标示文本元素
    <!ELEMENT name (#PCDATA)>
    ```
    - 节点数量描述符
    ``` 
    <!ELEMENT hr (employee+)> hr节点下最少出现一个employee子节点
    <!ELEMENT hr (employee*)> hr节点下可能出现0-n个employee子节点
    <!ELEMENT hr (employee?)> hr节点下可能出现0-1个employee子节点
    ```
    - XML引用DTD文件
    ```
    <!DOCTYPE 根节点 SYSTEM "dtd文件路径">
    <!DOCTYPE hr SYSTEM "hr.dtd">
    ```
    ``` 
    <?xml version="1.0" encoding="UTF-8" ?>
    <!ELEMENT hr (employee+)>
    <!ELEMENT employee (name,age,salary,department)>
    <!--<!ATTLIST employee 属性字段 属性属性 属性默认>-->
    <!ATTLIST employee no CDATA "">
    <!--<!ELEMENT name (#PCDATA纯文本)>-->
    <!ELEMENT name (#PCDATA)>
    <!ELEMENT age (#PCDATA)>
    <!ELEMENT salary (#PCDATA)>
    <!ELEMENT department (dname,address)>
    <!ELEMENT dname (#PCDATA)>
    <!ELEMENT address (#PCDATA)>
    ```
- XML Schema
> 提供了数据类型，格式限定，数据规范
#### Servlet
``` 
<!--    声明Servlet-->
    <servlet>
        <!--  servlet的别名-->
        <servlet-name>first</servlet-name>
        <servlet-class>com.imooc.servlet.FirstServlet</servlet-class>
    </servlet>
<!--    将servlet与url绑定-->
    <servlet-mapping>
        <servlet-name>first</servlet-name>
        <url-pattern>/hi</url-pattern>
    </servlet-mapping>
```
1. 声明名称与使用一致 命名要有意义
![](./README/servlet.png)
![](./README/javaweb.png)
- 开发标准步骤
    - 创建Servlet类，继承HttpServlet
    - 重写service方法，编写程序代码
    - 配置web.xml 绑定URL
- Servlet 访问方法
    - `http://ip:port/content-path/url-mapping`
    - `content-path` 上下文路径 默认工程名称
- 请求参数
    - request.getParameter() 接收单个参数
    - request.getParameterValues() 接收多个同名参数
    
    