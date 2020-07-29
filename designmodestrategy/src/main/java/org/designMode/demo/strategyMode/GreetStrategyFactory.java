package org.designMode.demo.strategyMode;

import java.util.Map;

/**
 * <p>Title: GreetStrategyFactory</p>
 * <p>Description:</p>
 *
 * @author: Raoyu
 * @date: 2020-07-29
 */
public class GreetStrategyFactory {

    /**
     * 自动注入所有的策略实例
     */
//    @Autowired
    private Map<String, GreetService> greetServiceMap;

    /**
     * 根据语言返回对应的策略实例
     *
     * @param context
     * @return
     */
    public GreetService getGreetStrategyByLanguage(GreetStrategyContext context){

        return greetServiceMap.get(context.getLanguage());
    }

    public Map<String, GreetService> getGreetServiceMap() {
        return greetServiceMap;
    }

    public void setGreetServiceMap(Map<String, GreetService> greetServiceMap) {
        this.greetServiceMap = greetServiceMap;
    }
}
