package com.xiaozhisha.vv;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import jdk.internal.org.objectweb.asm.commons.TryCatchBlockSorter;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import jdk.nashorn.internal.ir.TryNode;
import lombok.extern.java.Log;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
/**
 * mybatisplus code generator 代码生成器
 * @author lx
 * @date 2019/4/26 22:17
 */
public class MyBatisPlusGenerator {
    public static void main(String[] args) throws SQLException {

        //1. 全局配置
        GlobalConfig config = new GlobalConfig();
                // 是否支持AR模式
        config.setActiveRecord(true)
                // 作者
                .setAuthor("lixiao")
                // 生成路径
                .setOutputDir("F:\\workspace")
                // 文件覆盖
                .setFileOverride(false)
                // 主键策略
                .setIdType(IdType.AUTO)
                // 设置生成的service接口的名字的首字母是否为I
                .setServiceName("%sService")
                //生成基本的resultMap
                .setBaseResultMap(true)
                //生成基本的SQL片
                .setBaseColumnList(true);

        //2. 数据源配置
        DataSourceConfig dsConfig  = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL)
                // 设置数据库类型
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8")
                .setUsername("root")
                .setPassword("root");

        //3. 策略配置globalConfiguration中
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true)
                //全局大写命名
                .setDbColumnUnderline(true)
                // 指定表名 字段名是否使用下划线
                .setNaming(NamingStrategy.underline_to_camel)
                // 数据库表映射到实体的命名策略
                .setTablePrefix("")
                // 生成的表 include 跟exclude不能同时存在
                .setInclude("tb_areas","tb_address");
//                .setExclude("");  //排出的表

        //4. 包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.xiaozhisha.vv")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("entity")
                .setXml("mapper");

        //5. 整合配置
        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);

        //6. 执行
        ag.execute();

        //打印错误
        try {
            System.err.println(ag.getCfg().getMap().get("abc"));
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
