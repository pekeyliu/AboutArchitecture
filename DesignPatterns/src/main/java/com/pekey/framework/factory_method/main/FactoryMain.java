package com.pekey.framework.factory_method.main;

import com.pekey.framework.factory_method.factory.SendFactory;
import com.pekey.framework.factory_method.sendMassege.Sender;

/**
 * 工厂模式测试方法<br />
 * 优势为
 *
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
