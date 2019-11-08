package com.liao.hw.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LiaoBaoCai
 * @description: 逆向工程生成实体类和mapper
 * @date 2019/11/8 9:25
 */
public class Generator {

    public static void main(String[] args) throws Exception {
        //mbg 执行过程中的警告信息
        List<String> warings = new ArrayList<String>();
        //当生成的代码重复时，覆盖源代码
        boolean overwrite = true;
        //读取我们的 mbg 配置文件
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warings);
        Configuration config = cp.parseConfiguration(is);
        is.close();

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        //创建 mbg
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warings);
        //执行生成代码
        myBatisGenerator.generate(null);
        //输出警告信息
        for (String waring : warings){
            System.out.println(waring);
        }
    }
}
