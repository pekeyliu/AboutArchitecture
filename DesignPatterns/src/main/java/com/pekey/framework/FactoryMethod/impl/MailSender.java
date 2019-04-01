package com.pekey.framework.FactoryMethod.impl;

import com.pekey.framework.FactoryMethod.Sender;

/**
 * 通过邮件发送信息
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("通过邮件发送信息!");
    }
}
