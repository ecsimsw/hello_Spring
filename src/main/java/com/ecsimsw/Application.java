package com.ecsimsw;

import java.io.IOException;
import java.util.Arrays;

import com.sun.org.apache.xml.internal.utils.res.XResourceBundle;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws IOException {

ApplicationContext ctx = new ClassPathXmlApplicationContext();

Resource resourceClassPath = ctx.getResource("testFile.txt");
System.out.println(resourceClassPath.getClass());
System.out.println(resourceClassPath.getURI().getPath());
System.out.println(resourceClassPath.exists());

System.out.println();

Resource resourceFilePath = ctx.getResource("file:///C:/Users/luraw/git/hello_Spring/build/resources/main/testFile.txt");
System.out.println(resourceFilePath.getClass());
System.out.println(resourceFilePath.getURI().getPath());
System.out.println(resourceFilePath.exists());


        // resource의 타입은 location 문자열과 ApplicationContext의 타입에 따라 결정된다.
        // ClassPathXmlApplicationContext -> ClassPathResource
        // FileSystemXmlApplicationContext -> FileSystemResource
        // WebApplicationContext -> ServletContextResource
        // 대부분의 경우 WebApplicationContext를 사용하기때문에 ServletContextResource를 사용한다.

        // 또는 prefix를 사용해서 강제할 수 도 있다.
        // classpath: 와 file:
    }
}