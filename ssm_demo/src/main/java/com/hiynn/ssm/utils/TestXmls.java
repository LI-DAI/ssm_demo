/*
 * Copyright (C), 2013-2019, 天津大海云科技有限公司
 */
package com.hiynn.ssm.utils;

import org.w3c.dom.Element;

import java.io.File;

/**
 * @author lidai
 * @date 2019/4/23 10:41
 */
public class TestXmls {

    public static void main(String[] args) {
        Element note = XmlUtils.createRootElement("note");
        XmlUtils.appendElement(note, "to", "George1");
        XmlUtils.appendElement(note, "from", "John2");
        XmlUtils.appendElement(note, "heading", "Reminder1");
        XmlUtils.appendElement(note, "body", "Don't forget the meeting!");

        XmlUtils.saveToXml(note, new File("E:/test/temp.xml"));

        //使用xml生成工具生成java代码(控制台输出)
        File file = new File("E:/test/temp.xml");
        XmlUtils.createJavaCode(file);
    }
}

