package hw39.spring_mvc.config;

import hw39.spring_mvc.model.PlayerCRUD;
import org.postgresql.ds.common.BaseDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

@ComponentScan("hw39.spring_mvc") //c какой папки начинать вычитывать все классы
@EnableAspectJAutoProxy//активирует AOP
@Configuration //которые будут использоваться для настройки, где мы будем создавать свои бины
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Value("${spring.datasource.password}")
    private String dbPassword;

    @Value("${spring.datasource.driver-class-name}")
    private String dbDriverClassName;

    //настройка ViewResolver
    @Bean
    public InternalResourceViewResolver viewResolverInit() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");//путь до названия страницы
        viewResolver.setSuffix(".jsp");//расширение файла страницы(.jsp)
        return viewResolver;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUsername);
        dataSource.setPassword(dbPassword);
        dataSource.setDriverClassName(dbDriverClassName);
        return dataSource;
    }
    @Bean
    public Connection connection(DataSource dataSource) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/football_app", "postgres", "4864");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return dataSource.getConnection();
    }
}