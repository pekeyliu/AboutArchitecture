package com.pekey.framework.FactoryMethod;

/**
 * 工厂模式测试方法
 */
public class FactoryMain {
    public static void main(String[] args) {
        //通过工程生产邮件实体类
        Sender sender = SendFactory.produce("mail");
        sender.send();

        //通过多工厂方式生产微信实例
        Sender weChatSender = SendFactory.produceWeChat();
        weChatSender.send();
    }
}
