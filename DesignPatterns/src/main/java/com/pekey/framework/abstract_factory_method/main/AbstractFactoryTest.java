package com.pekey.framework.abstract_factory_method.main;

import com.pekey.framework.abstract_factory_method.factory.Provider;
import com.pekey.framework.abstract_factory_method.send.Sender;
import com.pekey.framework.abstract_factory_method.factory.impl.WeChatFactory;

/**
 * 抽象工厂的优势在于可以任意扩展工厂，不影响之前的逻辑功能
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        //通过微信发送信息，
        Provider provider = new WeChatFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
