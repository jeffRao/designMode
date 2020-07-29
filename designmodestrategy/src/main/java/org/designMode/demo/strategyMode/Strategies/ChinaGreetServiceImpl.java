package org.designMode.demo.strategyMode.Strategies;


import org.designMode.demo.strategyMode.GreetService;

/**
 * <p>Title: ChinaGreetServiceImpl</p>
 * <p>Description:</p>
 *
 * @author: Raoyu
 * @date: 2020-07-24
 */
//@Service(value = "greetServices")
public class ChinaGreetServiceImpl implements GreetService {

    public String sayHello(String name) {
        return "你好！" + name;
    }
}
