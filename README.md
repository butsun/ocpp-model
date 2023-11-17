# ocpp-model

基于OCPP1.6协议的数据模型创建的Java类映射，
供项目引入，减少数据类创建的成本。

参考: [ocpp-jaxb](https://github.com/steve-community/ocpp-jaxb)


# 如何使用？
通过 jitpack.io 在私有项目中引用
``` 
<repositories>
   ...
   <repository>
       <id>JitPack</id>
       <url>https://jitpack.io</url>
   </repository>
   ...
</repositories>
```

然后将以下内容添加到pom.xml
```
<dependency>
    <groupId>com.github.butsun</groupId>
    <artifactId>ocpp-model</artifactId>
    <version>${ocpp-model.version}</version>
</dependency>
```
