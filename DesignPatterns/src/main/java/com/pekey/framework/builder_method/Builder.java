package com.pekey.framework.builder_method;

import com.pekey.framework.abstract_factory_method.send.impl.MailSender;
import com.pekey.framework.abstract_factory_method.send.impl.WeChatSender;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式就是工厂模式的多实例化
 *
 */
public class Builder {
    private List list = new ArrayList();

    public void produceMailSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceWechatSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new WeChatSender());
        }
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
