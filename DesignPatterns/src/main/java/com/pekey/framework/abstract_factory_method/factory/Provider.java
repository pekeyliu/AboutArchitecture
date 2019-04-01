package com.pekey.framework.abstract_factory_method.factory;

import com.pekey.framework.abstract_factory_method.send.Sender;

/**
 * 实例化对象接口
 */
public interface Provider {
    Sender produce();
}
