package com.springDemo.beans;

/**
* @Description:    IOC:控制反转bean
* @Author:         liugeng
* @CreateDate:     2019/10/28 15:23
* @UpdateUser:     liugeng
* @UpdateDate:     2019/10/28 15:23
* @UpdateRemark:   修改内容
*/
public class Source {
    /**
    * 将bean的属性放入配置文件中由spring管理bean
    */
    // 类型
    private String type;

    // 糖分
    private String sugar;

    // 尺码
    private String size;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
