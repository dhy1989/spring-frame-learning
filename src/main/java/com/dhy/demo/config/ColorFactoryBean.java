package com.dhy.demo.config;

import com.dhy.demo.entity.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author dinghy
 * @date 2019/12/1
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    @Override
    public Color getObject() throws Exception {
        System.out.println("color被创建了");
        return new Color();
    }

    @Override
    public Class<Color> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
