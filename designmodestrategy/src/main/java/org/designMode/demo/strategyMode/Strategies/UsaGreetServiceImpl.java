package org.designMode.demo.strategyMode.Strategies;

import com.local.mytest.disgnModle.StrategyModel2.GreetService;

/**
 * <p>Title: ChinaGreetServiceImpl</p>
 * <p>Description:</p>
 *
 * @author: Raoyu
 * @date: 2020-07-24
 */
//@Service( value = "greetServices")
public class UsaGreetServiceImpl implements GreetService {

    public String sayHello(String name) {
        return "Hello ！" + name;
    }
}
