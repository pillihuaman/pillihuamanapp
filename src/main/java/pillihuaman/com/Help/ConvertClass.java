package pillihuaman.com.Help;

import pillihuaman.com.BusinessEntity.model.User;
import pillihuaman.com.model.response.RespUser;


public class ConvertClass {

	

public static  RespUser	UserTblToUserDTO(User request){
	RespUser resp= new RespUser();
	resp.setMail(request.getMail());
	resp.setUsername(request.getUsername());
	resp.setAlias(request.getAlias());
	resp.setApi_Password(request.getApiPassword());
	resp.setSal_Password(request.getSalPassword());
	resp.setPassword(request.getPassword());
	return resp;
	
}


}
