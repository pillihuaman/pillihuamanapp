package pillihuaman.com.model.response;
import com.googlecode.jmapper.annotations.JGlobalMap;

import lombok.Getter;
import lombok.Setter;


@JGlobalMap
@Getter
@Setter
public class RespUser {
	
	private  int id_user;
	private String alias;
	private  int id_system;
	private String mail;
	private String mobil_Phone;
	private String user;
	private String username;
	private String api_Password;
	private String password;
	private String sal_Password;
	private   int enabled;
	private int id_rol;

}


