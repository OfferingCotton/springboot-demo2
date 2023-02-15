package org.example.config;


import org.example.Interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @className: WebMvcConfig
 * @description:webMvc配置
 * @author: sh.Liu
 * @date: 2022-01-13 09:51
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截
        registry.addInterceptor(new TokenInterceptor())
                // 对所有请求进行拦截
                .addPathPatterns("/**")
                // 排除 login请求
                .excludePathPatterns("/login");
    }
}

