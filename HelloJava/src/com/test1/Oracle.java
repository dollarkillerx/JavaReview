package com.test1;

public class Oracle implements IDatabase {
    @Override
    public void connect() {
        System.out.println(this.getClass().toString() + "链接...");
    }

    @Override
    public void close() {
        System.out.println(this.getClass().toString() + "关闭...");
    }
}
