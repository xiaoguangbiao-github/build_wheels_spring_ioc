package com.xiaoguangbiao.framework.beans.factory.support;

/**
 * @version v1.0
 * @ClassName: BeanDefinitionReader
 * @Description:
 *      用来解析配置文件的，而该接口只是定义了规范
 * @Author: xiaoguangbiao
 */
public interface BeanDefinitionReader {
    //获取注册表对象
    BeanDefinitionRegistry getRegistry();
    //加载配置文件并在注册表中进行注册
    void loadBeanDefinitions(String configLocation) throws Exception;
}
