package com.liao.hw.common.utils;

/**
 * @author LiaoBaoCai
 * @description: TODO
 * @date 2019/11/27 8:57
 */
public class MyFileUtil {

    /**
     * 生成新的文件名
     */
    public static String generNewName(String extName){
        String newFileName = String.valueOf(System.currentTimeMillis()) + String.valueOf(Math.random() * 100) + extName;
        return newFileName;
    }
}
