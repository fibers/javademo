package com.fibers.demo.spring.config;

import com.fibers.demo.spring.pojo.aop.AudienceNamedPointcut;
import com.fibers.demo.spring.pojo.aop.AudienceParameterPointcut;
import com.fibers.demo.spring.pojo.aop.AudiencePointcut;
import com.fibers.demo.spring.pojo.aop.ExtensionIntroducer;
import com.fibers.demo.spring.pojo.aop.CleanExtension;
import com.fibers.demo.spring.pojo.aop.Singing;
import com.fibers.demo.spring.pojo.aop.Extension;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {

    @Bean
    public AudiencePointcut audiencePointcut() {
        return new AudiencePointcut();
    }

    @Bean
    public AudienceNamedPointcut audienceNamedPointcut() {
        return new AudienceNamedPointcut();
    }

    @Bean
    public AudienceParameterPointcut audienceParameterPointcut() {
        return new AudienceParameterPointcut();
    }

    @Bean
    public ExtensionIntroducer extensionIntroducer() {
        return new ExtensionIntroducer();
    }

    @Bean
    public Extension extension() {
        return new CleanExtension();
    }

    @Bean
    public Singing performance() {
        return new Singing();
    }
}
