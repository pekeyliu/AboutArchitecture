package com.pekey.framework.abstract_factory_method.send.impl;

import com.pekey.framework.abstract_factory_method.send.Sender;

/**
 * 通过微信发送信息
 */
public class WeChatSender implements Sender {
    @Override
    public void send() {
        System.out.println("通过微信发送信息");
    }
}
