package com.chency.spring.ioc.injection.setter;

import com.chency.spring.ioc.injection.UserHolder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * autowiring setter方法注入示例
 *
 * @author chency
 * @date 2022/05/03 22:43
 */
public class AutoWiringSetterInjectionDemo {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);

        // 加载XML资源，解析生成BeanDefinitions
        beanDefinitionReader.loadBeanDefinitions("classpath:autowiring-dependent-setter-injection.xml");
        // 依赖查找并且创建bean
        UserHolder userHolder = beanFactory.getBean(UserHolder.class);
        System.out.println(userHolder);
    }
}
