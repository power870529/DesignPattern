package com.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-04-02 08:34:05
 */
public class MailUtil {

    public static void sendMail(Mail mail) {
        String outputContent = "向{0}同学，邮件地址:{1}，邮件内容:{2}发送邮件";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originMail记录，originMail：" + mail.getContent());
    }
}
