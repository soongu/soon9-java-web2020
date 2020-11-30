package kr.co.kokono.java_web.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import kr.co.kokono.java_web.config.mybatis.MybatisConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;

@Import({
        MybatisConfig.class
})
@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan("kr.co.kokono.java_web")
@EnableTransactionManagement
public class MvcConfiguration {

    /* 데이터 소스 등록 */
    @Bean
    public DataSource dataSource(
            @Value("${jdbc.username}") String uid,
            @Value("${jdbc.password}") String upw,
            @Value("${jdbc.url}") String url,
            @Value("${jdbc.driver-class}") String driver) {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(driver);
        config.setJdbcUrl(url);
        config.setUsername(uid);
        config.setPassword(upw);

        return new HikariDataSource(config);
    }

    /* jdbc template */
    @Bean
    public JdbcTemplate template(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
