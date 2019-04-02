package com.design.pattern.creational.prototype;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-04-02 08:38:37
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
//
//        for (int i = 0; i < 10; i++) {
//            mail.setName("姓名" + i);
//            mail.setEmailAddress("姓名" + i + "@qq.com");
//            mail.setContent("gongxinin, zhongjiang");
//            MailUtil.sendMail(mail);
//        }


        for (int i = 0; i < 10; i++) {
            Mail temp = (Mail) mail.clone();
            temp.setName("姓名" + i);
            temp.setEmailAddress("姓名" + i + "@qq.com");
            temp.setContent("gongxinin, zhongjiang");
            MailUtil.sendMail(temp);
        }

        MailUtil.saveOriginMailRecord(mail);
    }
}
