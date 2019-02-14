/**
 * 软件著作权：长安新生（深圳）金融投资有限公司
 * 系统名称：马达贷
 */
package com.example.demo1.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by wangqi on 2016/4/24.
 */

public class ReadProperties {
    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(ReadProperties.class);
    /**
     * @param propertiesFilename
     * @param property
     * @param vm
     * @return
     */
    public static String readPropertiesFromfiles(String propertiesFilename,String property,String vm){
        //系统属性
        Properties props=System.getProperties();
        String confHome = props.getProperty(vm);
        logger.info("*****************************"+confHome);
        Properties prop = new Properties();
        InputStream in = null;
        try {
            in = new FileInputStream( confHome+propertiesFilename );
            logger.info(confHome+propertiesFilename);
            if ("/api.properties".equals(propertiesFilename)) {
                prop.load(new InputStreamReader(in, "UTF-8"));
            } else {
                prop.load(in);
            }
            String value = prop.getProperty(property);
            logger.info(value);
            in.close();
            return value;
        } catch (Exception e) {
            logger.error("========================获取文件异常："+e);
        }

        return null;
    }
}
