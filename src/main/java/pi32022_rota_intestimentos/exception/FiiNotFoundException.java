package pi32022_rota_intestimentos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class FiiNotFoundException extends Exception{
    public FiiNotFoundException(String fiiName){
        super(String.format("Fii with hashName %s not found in the system", fiiName));
    }

    public FiiNotFoundException(Long id){
        super(String.format("Fii with ID %s not found in the system", id));
    }
}
