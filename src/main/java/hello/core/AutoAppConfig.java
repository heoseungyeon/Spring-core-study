package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        basePackages = "hello.core.member",
//        basePackageClasses = AutoAppConfig.class, //해당 클래스 패키지가 베이스가 됨.
//        지정하지 않으면 @ComponentScan 이 붙은 설정 클래스의 패키지가 베이스 패키지가 됨.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) //기존의 AppConfig가 컴포넌트스캔 되지 않도록 필터링함.
)
public class AutoAppConfig {


}

