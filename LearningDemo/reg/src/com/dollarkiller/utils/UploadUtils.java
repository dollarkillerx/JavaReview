package com.dollarkiller.utils;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * 上传工具类
 * User: dollarkiller
 * Date: 19-4-10
 * Time: 下午9:02
 * Description: No Description
 */
public class UploadUtils {
    public static String getUUIDFileName(String fileName) {
        String file = fileName.substring(fileName.lastIndexOf("."));
        file = UUID.randomUUID().toString().replace("-","") + file;
        return file;
    }

}
