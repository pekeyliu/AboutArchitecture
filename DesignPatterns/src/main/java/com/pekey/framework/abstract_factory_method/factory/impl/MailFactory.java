package com.pekey.framework.abstract_factory_method.factory.impl;

import com.pekey.framework.abstract_factory_method.factory.Provider;
import com.pekey.framework.abstract_factory_method.send.Sender;
import com.pekey.framework.abstract_factory_method.send.impl.MailSender;

public class MailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
