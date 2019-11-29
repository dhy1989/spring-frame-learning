package com.dhy.demo.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author dinghy
 * @date 2019/11/29 18:00
 */
public class MyImportSelector implements ImportSelector{
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.dhy.demo.entity.Blue","com.dhy.demo.entity.Yellow"};
    }
}
