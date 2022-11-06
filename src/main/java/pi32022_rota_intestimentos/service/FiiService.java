package pi32022_rota_intestimentos.service;
import pi32022_rota_intestimentos.dto.FiiDTO;
import pi32022_rota_intestimentos.entity.Fii;
import pi32022_rota_intestimentos.exception.FiiAlreadyRegisteredException;
import pi32022_rota_intestimentos.exception.FiiNotFoundException;
import pi32022_rota_intestimentos.mapper.FiiMapper;
import pi32022_rota_intestimentos.repository.FiiRepository;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class FiiService {

    private final FiiRepository fiiRepository;
    private final FiiMapper fiiMapper = FiiMapper.INSTANCE;


    public FiiDTO createFii(FiiDTO fiiDTO) throws FiiAlreadyRegisteredException {
        verifyIfIsAlreadyRegistered(fiiDTO.getName());
        Fii fii = fiiMapper.toModel(fiiDTO);
        Fii savedFii = fiiRepository.save(fii);
        return fiiMapper.toDTO(savedFii);
    }

    public FiiDTO findByName(String name) throws FiiNotFoundException{
        Fii foundFii = fiiRepository.findByName(name)
                .orElseThrow(() -> new FiiNotFoundException(name));
        return fiiMapper.toDTO(foundFii);
    }

    //Retorna a lista completa dos pacientes
    public List<FiiDTO> listAll(){
        return fiiRepository.findAll()
                .stream()
                .map(fiiMapper::toDTO)
                .collect(Collectors.toList());
    }

    public FiiDTO findById(Long id) throws FiiNotFoundException{
        Fii foundFii = fiiRepository.findById(id)
                .orElseThrow(() -> new FiiNotFoundException(id));
        return fiiMapper.toDTO(foundFii);
    }

    public void deleteById(Long id) throws FiiNotFoundException{
        verifyIfExists(id);
        fiiRepository.deleteById(id);
    }


    //Verificadores se existe e se não foi encontrado
    private void verifyIfIsAlreadyRegistered(String name) throws FiiAlreadyRegisteredException {
        Optional<Fii> optSavedFii = fiiRepository.findByName(name);
        if (optSavedFii.isPresent()) {
            throw new FiiAlreadyRegisteredException(name);
        }
    }

    private Fii verifyIfExists(Long id) throws FiiNotFoundException {
        return fiiRepository.findById(id)
                .orElseThrow(() -> new FiiNotFoundException(id));
    }
}
