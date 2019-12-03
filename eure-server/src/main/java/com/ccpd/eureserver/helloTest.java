package com.ccpd.eureserver;

import java.util.HashMap;

/**
 * @Author:
 * @Date:2019/12/3 0003 - 下午 9:38
 * @Description:com.ccpd.eureserver
 * @version:1.0
 */
public class helloTest {
    public static void main(String[] args) {
        HashMap<String, String> ooc = new HashMap<>();
        ooc.put("name","12");
        ooc.put("age","12");
        ooc.put("nam","12");
        ooc.put("ne","12");

        String s = ooc.get("age");
        System.out.println(s);

        ooc.remove("name");
    }
}
