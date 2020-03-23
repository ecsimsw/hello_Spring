package com.ecsimsw.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    /*
    // Required = false

    //1. 생성자에서 필수 객체 Bean 주입
    @Autowired
    public Person(Body body){
        this.body = body;
    }
    // 인스턴스를 필요로 하니까 생성자의 Autowired는 필수적이다.


    //2. Setter에서 필드 객체 주입
    @Autowired(required = false)
    public void setBody(Body body) {
        this.body = body;
    }
    //Parameter 0 of method setBody in com.ecsimsw.a.Person required a bean of type
    // 'com.ecsimsw.a.Body' that could not be found.
    //
    // 생성자에 Body 빈을 구현할 때는 명확히 Body Bean의 필요가 바로 보이지만.
    // 세터일때 역시, Person 빈을 등록할 때, Autowired 때문에 Body빈의 주입을 필요로 한다.
    // Optional인 의존성 주입을 Autowired로 처리할 때는 required=false로 한다.
    // Person의 인스턴스는 Bean으로 등록이 되고, Body 빈의 주입은 안된다.

    //3. Field에 빈 주입
    @Autowired
    Body body;

     */

    Body body;

    @Autowired
    public Person(Body body){
        this.body = body;

        body.gender();
    }


    void say(){
        System.out.println("hi");
        System.out.println(body != null);
    }
}
