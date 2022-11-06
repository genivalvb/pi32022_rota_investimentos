package pi32022_rota_intestimentos.mapper;

import pi32022_rota_intestimentos.dto.FiiDTO;
import pi32022_rota_intestimentos.entity.Fii;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FiiMapper {

    FiiMapper INSTANCE = Mappers.getMapper(FiiMapper.class);

    Fii toModel(FiiDTO fiiDTO);

    FiiDTO toDTO(Fii fii);
}
