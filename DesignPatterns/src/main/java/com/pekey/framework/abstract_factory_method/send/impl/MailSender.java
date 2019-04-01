package com.pekey.framework.abstract_factory_method.send.impl;

import com.pekey.framework.abstract_factory_method.send.Sender;

/**
 * 通过邮箱发送信息
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("通过邮箱发送信息");
    }
}
