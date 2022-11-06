package pi32022_rota_intestimentos.controller;
import pi32022_rota_intestimentos.dto.FiiDTO;
import pi32022_rota_intestimentos.exception.FiiAlreadyRegisteredException;
import pi32022_rota_intestimentos.exception.FiiNotFoundException;
import pi32022_rota_intestimentos.service.FiiService;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600,allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/fiis")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class FiiController implements FiiControllerDocs{

    private final FiiService fiiService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FiiDTO createFii(@RequestBody @Valid FiiDTO fiiDTO) throws FiiAlreadyRegisteredException {
        return fiiService.createFii(fiiDTO);
    }

    @GetMapping("/name/{name}")
    public FiiDTO findByName(@PathVariable String name) throws FiiNotFoundException {
        return fiiService.findByName(name);
    }

    @GetMapping("/{id}")
    public FiiDTO findById(@PathVariable Long id) throws FiiNotFoundException {
        return fiiService.findById(id);
    }


    @GetMapping
    public List<FiiDTO> listFiis() {
        return fiiService.listAll();
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws FiiNotFoundException {
        fiiService.deleteById(id);
    }
}
