package com.springDemo.common.customtag;

import com.springDemo.beans.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder bean){
        String userName = element.getAttribute("name");
        String email = element.getAttribute("email");
        if (StringUtils.hasText(userName)){
            bean.addPropertyValue("name",userName);
        }
        if (StringUtils.hasText(email)){
            bean.addPropertyValue("email",email);
        }
    }


}
