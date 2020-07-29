package org.designMode.demo.strategyMode;

/**
 * <p>Title: GreetServiceRepository</p>
 * <p>Description:</p>
 *
 * @author: Raoyu
 * @date: 2020-07-24
 */
//@Component
public class GreetStrategyContext {

    // 记录策略
    private GreetService greetService;

    // 选用的语言
    private String language;

    public void selectGreetStrategy(GreetService greetService){
        this.greetService = greetService;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String handel(String name){
        return this.greetService.sayHello(name);
    }

}
