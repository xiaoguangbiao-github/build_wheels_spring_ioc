package com.xiaoguangbiao.framework.context;

import com.xiaoguangbiao.framework.beans.factory.BeanFactory;

/**
 * @version v1.0
 * @ClassName: ApplicationContext
 * @Description: 定义非延时加载功能
 * @Author: xiaoguangbiao
 */
public interface ApplicationContext extends BeanFactory {

    void refresh() throws Exception;
}
