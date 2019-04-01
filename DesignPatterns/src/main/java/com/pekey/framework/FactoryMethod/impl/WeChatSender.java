package com.pekey.framework.FactoryMethod.impl;

import com.pekey.framework.FactoryMethod.Sender;

/**
 * 通过微信发送信息
 */
public class WeChatSender implements Sender {
    @Override
    public void send() {
        System.out.println("通过微信发送信息");
    }
}
