package com.pekey.framework.factory_method.factory;

import com.pekey.framework.factory_method.sendMassege.Sender;
import com.pekey.framework.factory_method.sendMassege.impl.MailSender;
import com.pekey.framework.factory_method.sendMassege.impl.WeChatSender;

/**
 * 创建发送信息工厂
 */
public class SendFactory {
    /**
     * 通过发送类型判断生产相应的发送类实例
     * @param mesType
     * @return
     */
    public static Sender produce(String mesType){
        if ("mail".equals(mesType)){
            return new MailSender();
        }else if ("wechat".equals(mesType)){
            return new WeChatSender();
        }else {
            System.out.println("请输入正确的类型");
            return null;
        }
    }


    /**
     * 生产邮件实例
     * @return
     */
    public static Sender produceMail(){
        return new MailSender();
    }

    /**
     * 生产微信实例
     * @return
     */
    public static Sender produceWeChat(){
        return new WeChatSender();
    }
}
