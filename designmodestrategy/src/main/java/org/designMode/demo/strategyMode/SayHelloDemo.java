package org.designMode.demo.strategyMode;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;

/**
 * <p>Title: SayHelloDemo</p>
 * <p>Description:</p>
 *
 * @author: Raoyu
 * @date: 2020-07-29
 */
public class SayHelloDemo {

    @Resource
    private GreetStrategyFactory greetStrategyFactory;


    public static void main(String[] args) {

        // 创建上下文
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 注册
//        applicationContext.register(SayHelloDemo.class);
//        applicationContext.refresh();

        // 创建一个 definitionReader 对象
        XmlBeanDefinitionReader definitionReader = new XmlBeanDefinitionReader(applicationContext);
        // 定义 xml 配置文件相对路径
        String xmlResourcePath = "META-INFO/strategy-mode-context.xml";
        // 加载
        definitionReader.loadBeanDefinitions(xmlResourcePath);
        // 启动上下文
        applicationContext.refresh();

        // 获取策略context
        GreetStrategyContext greetStrategyContext = (GreetStrategyContext)applicationContext.getBean("greetStrategyContext");

        // 获取一个工厂类
        GreetStrategyFactory greetStrategyFactory = (GreetStrategyFactory)applicationContext.getBean("greetStrategyFactory");

        // 设置策略使用的是英语 English
//        greetStrategyContext.setLanguage("english");
        greetStrategyContext.setLanguage("japanese");
//        greetStrategyContext.setLanguage("chinese");
        // 工厂方法获取策略实例
        GreetService greetService = greetStrategyFactory.getGreetStrategyByLanguage(greetStrategyContext);
        // 注入策略实例
        greetStrategyContext.selectGreetStrategy(greetService);

        // 执行策略方法
        String helloWord = greetStrategyContext.handel("jeff");

        // 打印结果
        System.out.println(helloWord);

        // 关闭上下文
        applicationContext.close();

    }
}
