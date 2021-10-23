## Spring ws

### spring-ws-server
- xsd 定义
- jaxb2-maven-plugin 插件配置
```xml
        <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>jaxb2-maven-plugin</artifactId>
                <version>2.5.0</version>
                <executions>
                    <execution>
                        <id>xjc</id>
                        <goals>
                            <goal>xjc</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <outputDirectory>${project.basedir}/src/main/java</outputDirectory>
<!--                    如果不配置，默认将按照xsd文件中定义的namespace进行 例如：http://happycoding.cool/ws/server/schema 默认为：cool.happycoding.ws.server.schema -->
<!--                    <packageName>cool.happycoding.ws.server.schema</packageName>-->
<!--                    是否删除已生成的代码，注意是删除，而不是覆盖，即会删除原有的包目录，需要非常小心如果里面有别的子包也会被删除，因此需要配置成false-->
                    <clearOutputDir>false</clearOutputDir>
                   <sources>
                       <source>
                           ${project.basedir}/src/main/resources/xsd
                       </source>
                   </sources>
                </configuration>
            </plugin>
```
- jaxb2:xjc 代码生成

### wsdl

http://localhost:8080/ws/countries.wsdl

### 配置文档说明
- [jaxb2-maven-plugin](https://www.mojohaus.org/jaxb2-maven-plugin/Documentation/v2.5.0/example_xjc_basic.html)


### spring-ws-client
- wsdl 文件
- maven-jaxb2-plugin 插件配置
```xml
    <!--可以使用在线或离线两种方式进行配置-->
    <plugin>
        <groupId>org.jvnet.jaxb2.maven2</groupId>
        <artifactId>maven-jaxb2-plugin</artifactId>
        <version>0.14.0</version>
        <executions>
            <execution>
                <goals>
                    <goal>generate</goal>
                </goals>
            </execution>
        </executions>
        <configuration>
            <schemaLanguage>WSDL</schemaLanguage>
            <schemaDirectory>${basedir}/src/main/resources/wsdl</schemaDirectory>
            <schemaIncludes>*.wsdl</schemaIncludes>
            <generatePackage>cool.happycoding.ws.client.wsdl</generatePackage>
            <generateDirectory>${basedir}/src/main/java</generateDirectory>
            <!--                    <schemas>-->
            <!--                        <schema>-->
            <!--                            <url>http://localhost:8080/ws/countries.wsdl</url>-->
            <!--                        </schema>-->
            <!--                    </schemas>-->
        </configuration>
    </plugin>
```


