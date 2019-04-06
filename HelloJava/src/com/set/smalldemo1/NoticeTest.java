package com.set.smalldemo1;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 下午1:27
 * Description: No Description
 */
public class NoticeTest {

    public static void main(String[] args) {
        Notice notice1 = new Notice(1,"欢迎","admin",new Date());
        Notice notice2 = new Notice(2,"考勤通知","admin",new Date());
        Notice notice3 = new Notice(3,"运动会通知","admin",new Date());

        // 添加公告
        ArrayList noticeList = new ArrayList();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);

        // 显示公告
        System.out.println("公告的内容为: ");
        for (int i=0;i<noticeList.size();i++) {
            System.out.println(i + 1 + " : "+((Notice)(noticeList.get(i))).getTitle());
        }

        Notice notice4 = new Notice(4,"在线编辑器可以使用了","admin",new Date());
        noticeList.add(1,notice4);

        // 显示公告
        System.out.println("公告的内容为: ");
        for (int i=0;i<noticeList.size();i++) {
            System.out.println(i + 1 + " : "+((Notice)(noticeList.get(i))).getTitle());
        }
    }
}
