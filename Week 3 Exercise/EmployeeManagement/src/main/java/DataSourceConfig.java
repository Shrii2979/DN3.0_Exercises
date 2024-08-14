import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create()
            .url("jdbc:h2:mem:primarydb")
            .username("sa")
            .password("password")
            .driverClassName("org.h2.Driver")
            .build();
    }

    @Bean
    public DataSource secondaryDataSource() {
        return DataSourceBuilder.create()
            .url("jdbc:h2:mem:secondarydb")
            .username("sa")
            .password("password")
            .driverClassName("org.h2.Driver")
            .build();
    }
}
