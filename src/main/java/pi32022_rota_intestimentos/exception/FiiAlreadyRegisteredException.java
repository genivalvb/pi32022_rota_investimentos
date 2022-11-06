package pi32022_rota_intestimentos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FiiAlreadyRegisteredException extends Exception{
    public FiiAlreadyRegisteredException(String fiiName){
        super(String.format("Fii with Name %s already registered in the system", fiiName));
    }
}
