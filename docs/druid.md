#  使用druid链接池

## 前言

本文讲解如何使用druid链接池，大致步骤如下：


* 添加pom依赖
* 修改配置文件


## 操作

* 添加pom依赖   

```xml
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
		<!-- 添加druid依赖 -->
		<dependency>
			<groupId>com.alibaba</groupId>
			<artifactId>druid-spring-boot-starter</artifactId>
			<version>1.1.1</version>
		</dependency>
	</dependencies>
```


* 修改配置文件
 
```yaml

```
