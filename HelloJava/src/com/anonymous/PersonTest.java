package com.anonymous;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-5
 * Time: 下午10:22
 * Description: No Description
 */
public class PersonTest {
    // 更具传入不同类型 调用对应的read方法
    public static void main(String[] args) {
        PersonTest test = new PersonTest();
//        Man one = new Man();
//        Woman two = new Woman();
//        test.getRead(one);
//        test.getRead(two);
        test.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("匿名内部类");
            }
        });
    }
    // 方案1
//    public void getRead(Man man) {
//        man.read();
//    }
//
//    public void getRead(Woman woman) {
//        woman.read();
//    }
    // 方案2
    public void getRead(Person person) {
        person.read();
    }
    // 方案3
}
