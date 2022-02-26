package pillihuaman.com.model.request;
import com.googlecode.jmapper.annotations.JGlobalMap;

import lombok.Getter;
import lombok.Setter;


@JGlobalMap
@Getter
@Setter
public class ReqUser {
	
	private int idUser;
	private String alias;
	private String apiPassword;
	private int id_System;
	private String mail;
	private String mobilPhone;
	private String password;
	private String salPassword;
	private String user;
	private String username;
	private String  typeDocument;
	private String   numTypeDocument;
}


