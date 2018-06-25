package com.mountainframework.config.spring;
/// **
// * Copyright (C) 2016 Newland Group Holding Limited
// * <p>
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// * <p>
// * http://www.apache.org/licenses/LICENSE-2.0
// * <p>
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
// package com.mountainframework.rpc.spring;
//
// import org.springframework.beans.factory.config.BeanDefinition;
// import org.springframework.beans.factory.support.RootBeanDefinition;
// import org.springframework.beans.factory.xml.BeanDefinitionParser;
// import org.springframework.beans.factory.xml.ParserContext;
// import org.w3c.dom.Element;
//
/// **
// * @author tangjie<https://github.com/tang-jie>
// * @filename:NettyRpcReferenceParser.java
// * @description:NettyRpcReferenceParser功能模块
// * @blogs http://www.cnblogs.com/jietang/
// * @since 2016/10/7
// */
// public class RpcReferenceParser implements BeanDefinitionParser {
// @Override
// public BeanDefinition parse(Element element, ParserContext parserContext) {
// String interfaceName = element.getAttribute("interfaceName");
// String id = element.getAttribute("id");
// String ipAddr = element.getAttribute("ipAddr");
// String protocolType = element.getAttribute("protocol");
//
// RootBeanDefinition beanDefinition = new RootBeanDefinition();
// beanDefinition.setBeanClass(RpcReference.class);
// beanDefinition.setLazyInit(false);
//
// beanDefinition.getPropertyValues().addPropertyValue("interfaceName",
/// interfaceName);
// beanDefinition.getPropertyValues().addPropertyValue("ip", ipAddr);
// beanDefinition.getPropertyValues().addPropertyValue("protocol",
/// protocolType);
//
// parserContext.getRegistry().registerBeanDefinition(id, beanDefinition);
// return beanDefinition;
// }
// }