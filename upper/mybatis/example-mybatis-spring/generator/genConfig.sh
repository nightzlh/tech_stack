#!/bin/sh

java -classpath ~/.m2/repository/mysql/mysql-connector-java/8.0.22/mysql-connector-java-8.0.22.jar  -jar ~/.m2/repository/org/mybatis/generator/mybatis-generator-core/1.4.0/mybatis-generator-core-1.4.0.jar -configfile ./generatorConfig.xml -overwrite
