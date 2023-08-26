package com.vijayjangir.spring6di;

import com.vijayjangir.spring6di.controllers.MyController;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBeanAdditional implements  BeanNameAware, BeanFactoryAware,
    InitializingBean, ApplicationContextAware,
    BeanPostProcessor, DisposableBean {
    public LifeCycleDemoBeanAdditional() {
        System.out.println("## 1. I'm lifecycle constructor!");
    }

    private String javaVer;
    @Value("${java.specification.version}")
    public void setJavaVer(String javaVer){
        this.javaVer = javaVer;
        System.out.println("## 2. I'm setting Property! javaVer:" + this.javaVer);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## 3. I'm name aware bean method:" + name);
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## 4. BeanFactoryAware:" + beanFactory.toString());
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## 2.b I'm done settings properties, afterPropertiesSet!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## 5. ApplicationContextAware!:"+applicationContext.toString());
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("## 6. PostProcessBeforeInitialization:" + beanName + " -- :" + bean.toString());

        if (bean instanceof MyController) {
            System.out.println("#### calling before init");
//            ((LifeCycleDemoBean) bean).beforeInit();
        }

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("## 7. PostProcessAfterInitialization:" + beanName + " -- :" + bean.toString());

        if (bean instanceof MyController) {
            System.out.println("#### calling after init");
//            ((LifeCycleDemoBean) bean).afterInit();
        }

        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    public void beforeInit() {
        System.out.println("### Before Init");
    }

    public void afterInit() {
        System.out.println("### After Init");
    }

    @PreDestroy
    public void destructionMachine(){
        System.out.println("## Last.a @PreDestory annotation method called!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## Last.Last destroy method called from DisposableBean");
    }
}
