package pi32022_rota_intestimentos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguracao {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Rota Investimento";
    }
}
