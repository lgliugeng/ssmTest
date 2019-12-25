package com.springDemo.beans;

/**
* @Description:    DI:依赖注入bean
* @Author:         liugeng
* @CreateDate:     2019/10/28 15:22
* @UpdateUser:     liugeng
* @UpdateDate:     2019/10/28 15:22
* @UpdateRemark:   修改内容
*/
public class DrinkMaker {

    // 使用配置文件注入
    private Source source = null;

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String makeDrink(){
        return "用户:spring需要一杯糖分为" + source.getSugar() + "，尺码为" + source.getSize() + "的" + source.getType() + "饮料";
    }
}
