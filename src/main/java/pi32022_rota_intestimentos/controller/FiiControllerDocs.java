package pi32022_rota_intestimentos.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

import pi32022_rota_intestimentos.dto.FiiDTO;
import pi32022_rota_intestimentos.exception.FiiAlreadyRegisteredException;
import pi32022_rota_intestimentos.exception.FiiNotFoundException;

@Api("Manages fii content")
public interface FiiControllerDocs {
    @ApiOperation(value = "Fii creation operation")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success fii creation"),
            @ApiResponse(code = 400, message = "Missing required fields or wrong field range value.")
    })
    FiiDTO createFii(FiiDTO fiiDTO) throws FiiAlreadyRegisteredException;

    @ApiOperation(value = "Returns fii found by a given code")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success fii found in the system"),
            @ApiResponse(code = 404, message = "Fii with given name not found.")
    })
    FiiDTO findByName(@PathVariable String name) throws FiiNotFoundException;

    @ApiOperation(value = "Returns a list of all fiis registered in the system")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "List of all fiis registered in the system"),
    })
    List<FiiDTO> listFiis();

    @ApiOperation(value = "Delete a fii found by a given valid Id")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Success fii deleted in the system"),
            @ApiResponse(code = 404, message = "Fii with given id not found.")
    })
    void deleteById(@PathVariable Long id) throws FiiNotFoundException;
}
