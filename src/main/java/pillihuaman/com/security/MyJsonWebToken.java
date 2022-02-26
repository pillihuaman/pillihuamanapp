package pillihuaman.com.security;

import java.io.Serializable;

import org.jboss.resteasy.jwt.JsonWebToken;

import lombok.Getter;

@SuppressWarnings("serial")
@Getter
public class MyJsonWebToken extends JsonWebToken implements Serializable{
	
	private static long serialVersionUID = 1L;

	
	private User user;
	private Aplication aplication;


	public MyJsonWebToken() {
		super();
		user = new User();
		aplication = new Aplication();

	
	
	}



	@Getter
	public static class User {

		private Long idUser;
		private String user;
		private String changePassword;
		private String mail;
	}


	@Getter
	public static class Aplication {

		private Long aplicationID;
		private String name;
		private String multiSession;
	}



	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/**
	 * @param serialversionuid the serialversionuid to set
	 */
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}


	/**
	 * @param idUser the idUser to set
	 */
	public void setIdUser(Long idUser) {
		this.user.idUser = idUser;
	}


	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user.user = user;
	}


	/**
	 * @param changePassword the changePassword to set
	 */
	public void setChangePassword(String changePassword) {
		this.user.changePassword = changePassword;
	}


	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.user.mail = mail;
	}


	/**
	 * @param aplicationID the aplicationID to set
	 */
	public void setAplicationID(Long aplicationID) {
		this.aplication.aplicationID = aplicationID;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.aplication.name = name;
	}


	/**
	 * @param multiSession the multiSession to set
	 */
	public void setMultiSession(String multiSession) {
		this.aplication.multiSession = multiSession;
	}


}
