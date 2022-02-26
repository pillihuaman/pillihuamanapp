
package pillihuaman.com.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import pillihuaman.com.Help.Constantes;
import pillihuaman.com.Service.UserService;
import pillihuaman.com.model.request.ReqUser;
import pillihuaman.com.model.response.RespBase;

@RestController
@CrossOrigin
@Tag(name = "User", description = "")
public class UserController {

	@Autowired
	private UserService userService;
    @Operation(summary = "Create user", description = "Create user", tags = {""})
    @ApiResponses(value = {
            @ApiResponse(responseCode = Constantes.SERVER_200, description = Constantes.OPERACION_EXITOSA),
            @ApiResponse(responseCode = Constantes.SERVER_400, description = Constantes.ERROR_VALIDACION, content = {
                    @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = RespBase.class))}),
            @ApiResponse(responseCode = Constantes.SERVER_500, description = Constantes.ERROR_INTERNO, content = {
                    @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = RespBase.class))})})
    @PostMapping(path = {Constantes.BASE_ENDPOINT+ "/user/register"}, consumes = {
            MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
   
	public ResponseEntity<?> createAuthenticationToken( @RequestBody ReqUser reqUser) throws Exception {
		return ResponseEntity.ok(userService.registerUser(reqUser));
	}

}