package com.pekey.framework.factory_method.sendMassege.impl;

import com.pekey.framework.factory_method.sendMassege.Sender;

/**
 * 通过微信发送信息
 */
public class WeChatSender implements Sender {
    @Override
    public void send() {
        System.out.println("通过微信发送信息");
    }
}
