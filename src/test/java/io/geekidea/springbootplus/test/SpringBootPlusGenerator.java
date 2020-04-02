/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.geekidea.springbootplus.test;

/**
 * spring-boot-plus代码生成器入口类
 *
 * @author geekidea
 * @date 2019-10-22
 **/
public class SpringBootPlusGenerator {

    public static void main(String[] args) {
        CodeGenerator codeGenerator = new CodeGenerator();
        // 公共配置
        // 数据库配置
        codeGenerator
                /**
                 * 开发环境
                 */
                .setUserName("xp_seagull")
                .setPassword("eWJw5zUkXa3Gz1lR")
                .setDriverName("com.mysql.jdbc.Driver")
                .setDriverUrl("jdbc:mysql://rm-bp147e2wdp58kh6i3wo.mysql.rds.aliyuncs.com:3306/xp_seagull?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT%2B8");
                /**
                 * 本地
                 */
//                .setUserName("root")
//                .setPassword("root")
//                .setDriverUrl("jdbc:mysql://localhost:3306/xp_lark_goods?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT%2B8");
//                .setDriverUrl("jdbc:mysql://localhost:3306/xp_lark_trade?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT%2B8");
//                .setDriverUrl("jdbc:mysql://localhost:3306/xp_lark_order?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT%2B8");
        /**
         * yunzhe
         */
//                .setUserName("root")
//                .setPassword("Abcd1234")
//                .setDriverName("com.mysql.jdbc.Driver")
//                .setDriverUrl("jdbc:mysql://47.92.203.100:3306/tensquare_base?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT%2B8");


        // 包信息
        codeGenerator
                .setProjectPackagePath("io/geekidea/springbootplus")
                .setParentPackage("io.geekidea.springbootplus");

        // 组件作者等配置
        codeGenerator
                .setModuleName("your_module")
                .setAuthor("fangx")
                .setPkIdColumnName("id");

        // 生成策略
        codeGenerator
                .setGeneratorStrategy(CodeGenerator.GeneratorStrategy.NORMAL)
                .setPageListOrder(false)
                .setParamValidation(true);

        // 生成实体映射相关代码,可用于数据库字段更新
        // 当数据库字段更新时，可自定义自动生成哪些那文件
        codeGenerator
                .setGeneratorEntity(true)
                .setGeneratorQueryParam(true)
                .setGeneratorQueryVo(true);

        // 生成业务相关代码
        codeGenerator
                .setGeneratorController(true)
                .setGeneratorService(true)
                .setGeneratorServiceImpl(true)
                .setGeneratorMapper(true)
                .setGeneratorMapperXml(true);

        // 是否生成Shiro RequiresPermissions注解
        codeGenerator.setRequiresPermissions(false);

        // 是否覆盖已有文件
        codeGenerator.setFileOverride(true);

        // 初始化公共变量
        codeGenerator.init();

        // 需要生成的表数组
        // xxx,yyy,zzz为需要生成代码的表名称
        String[] tables = {
                // goods
//                "category",
//                "spu"

                // trade
//                "buyer_info",
//                "pay_info",
//                "pre_pay_order",
//                "pre_trade",
//                "trade"

                // seagull
                "message_record"
        };

        // 循环生成
        for (String table : tables) {
            // 设置需要生成的表名称
            codeGenerator.setTableName(table);
            // 生成代码
            codeGenerator.generator();
        }

    }

}
