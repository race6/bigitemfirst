package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBConfig {
    static Properties pro=null;
    //静态代码块
    static {

        pro = new Properties();
        InputStream is = DBConfig.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 根据配置文件的key,获取value
     * @param key
     * @return
     */
    public static String getValue(String key){

        String value = pro.getProperty(key);
        return value;
    }

    public static void main(String[] args) {
        String url = getValue("url");
        System.out.println("url:"+url);
    }


}
