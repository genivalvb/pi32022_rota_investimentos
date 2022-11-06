package pi32022_rota_intestimentos.mapper;

import javax.annotation.processing.Generated;
import pi32022_rota_intestimentos.dto.FiiDTO;
import pi32022_rota_intestimentos.dto.FiiDTO.FiiDTOBuilder;
import pi32022_rota_intestimentos.entity.Fii;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-06T16:37:55-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.15.1 (Oracle Corporation)"
)
public class FiiMapperImpl implements FiiMapper {

    @Override
    public Fii toModel(FiiDTO fiiDTO) {
        if ( fiiDTO == null ) {
            return null;
        }

        Fii fii = new Fii();

        if ( fiiDTO.getId() != null ) {
            fii.setId( fiiDTO.getId().longValue() );
        }
        fii.setData_registro( fiiDTO.getData_registro() );
        fii.setRenda( fiiDTO.getRenda() );
        fii.setTipo( fiiDTO.getTipo() );
        fii.setValor_investido( fiiDTO.getValor_investido() );

        return fii;
    }

    @Override
    public FiiDTO toDTO(Fii fii) {
        if ( fii == null ) {
            return null;
        }

        FiiDTOBuilder fiiDTO = FiiDTO.builder();

        if ( fii.getId() != null ) {
            fiiDTO.id( fii.getId().intValue() );
        }
        fiiDTO.data_registro( fii.getData_registro() );
        fiiDTO.renda( fii.getRenda() );
        fiiDTO.tipo( fii.getTipo() );
        fiiDTO.valor_investido( fii.getValor_investido() );

        return fiiDTO.build();
    }
}
