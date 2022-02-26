package pillihuaman.com.BusinessEntity.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import pillihuaman.com.Help.Constants;

import java.sql.Timestamp;
import java.time.Instant;
import java.math.BigInteger;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Getter
@Setter
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")

public class User extends AuditEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_user")
	private BigInteger idUser;
	@Column(name="alias")
	private String alias;
	
	@Column(name="api_Password")
	private String apiPassword;

	@Column(name="id_system")
	private BigInteger idSystem;

	@Column(name="mail")
	private String mail;
	
	@Column(name="mobil_Phone")
	private String mobilPhone;

	@Column(name="password")
	private String password;

	@Column(name="sal_Password")
	private String salPassword;
	

	
	@Column(name="username")
	private String username;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="id_rol")
	private Role role;

	@Column(nullable = false, name = "enabled")
	protected String enabled;
	
	public User() {super(); 
	}

}