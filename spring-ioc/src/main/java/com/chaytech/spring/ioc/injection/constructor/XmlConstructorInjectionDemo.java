package com.chaytech.spring.ioc.injection.constructor;

import com.chaytech.spring.ioc.injection.UserHolder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * 基于xml的constructor方法注入示例
 *
 * @author chency
 * @email chaytech@163.com
 * @date 2022/05/03 22:19
 */
public class XmlConstructorInjectionDemo {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);

        // 加载XML资源，解析生成BeanDefinitions
        beanDefinitionReader.loadBeanDefinitions("classpath:dependent-constructor-injection.xml");
        // 依赖查找并且创建bean
        UserHolder userHolder = beanFactory.getBean(UserHolder.class);
        System.out.println(userHolder);
    }
}
