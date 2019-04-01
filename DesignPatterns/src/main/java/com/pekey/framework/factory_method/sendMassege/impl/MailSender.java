package com.pekey.framework.factory_method.sendMassege.impl;

import com.pekey.framework.factory_method.sendMassege.Sender;

/**
 * 通过邮件发送信息
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("通过邮件发送信息!");
    }
}
