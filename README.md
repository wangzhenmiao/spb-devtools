# spb-devtools

一、热部署的实现

1、pom中添加依赖

    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<optional>true</optional>
			<!--<scope>true</scope>-->
		</dependency>
    
 2、pom中添加插件
 
     <!-- 添加spring-boot-maven-plugin -->
	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<!-- 如果没有该项配置，devtools不会起作用，即应用不会restart -->
					<fork>true</fork>
				</configuration>
			</plugin>
		</plugins>
	</build>
  
  一定要加上<fork>true</fork>
  
  3、properties中增加thy
  
      spring.thymeleaf.cache=false
      
 4、自动编译
 
 command+,Compiler---勾选Build project automaticlly
 
 5、勾选自动编译选项
 
 command+shift+a,查找registry,compiler.automake.allow.when.app.running 勾选上
