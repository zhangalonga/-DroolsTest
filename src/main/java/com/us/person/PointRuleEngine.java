package com.us.person;

/**
 * created by zhangalong on 2018/11/29
 */
public interface PointRuleEngine {
    /**
     * 初始化规则引擎
     */
    public void initEngine();

    /**
     * 刷新规则引擎中的规则
     */
    public void refreshEnginRule();

    /**
     * 执行规则引擎
     * @param pointDomain 积分Fact
     */
    public void executeRuleEngine(final PointDomain pointDomain);
}
