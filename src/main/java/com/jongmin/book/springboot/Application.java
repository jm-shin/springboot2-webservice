package com.jongmin.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing가 삭제됨
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); //SpringApplication.run로 내장 WAS를 실행.
        //항상 서버에 톰캣을 설치할 필요가 없게 되고, 스프링 부트로 만들어진 Jar파일(실행가능한 java패키징 파일)로 실행하면 된다.
        //내장 WAS를 사용하면 언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있다.
    }
}
