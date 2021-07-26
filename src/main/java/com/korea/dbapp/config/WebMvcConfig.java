package com.korea.dbapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// implements를 뭘할지를 모를때는 문서를 참고
@Configuration // WebMvcConfig 메모리에 띄우기
public class WebMvcConfig implements WebMvcConfigurer {

    // 인터 셉터가 동작하도록
    // 특정 주소일떄 동작
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SessionInterceptor());

        // 메모리에 뜰떄 자동 실행
        // 프로그래머가 실행하는거 아님

    }

}
