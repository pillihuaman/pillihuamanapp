package pillihuaman.com.BusinessEntity.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class AuditEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codUsuRegis;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSXXX")
	private Date fecRegis;

	private String codUsuModif;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSXXX")
	private Date fecModif;

	public String getCodUsuRegis() {
		return codUsuRegis;
	}

	public void setCodUsuRegis(String codUsuRegis) {
		this.codUsuRegis = codUsuRegis;
	}

	public Date getFecRegis() {
		return fecRegis;
	}

	public void setFecRegis(Date fecRegis) {
		this.fecRegis = fecRegis;
	}

	public String getCodUsuModif() {
		return codUsuModif;
	}

	public void setCodUsuModif(String codUsuModif) {
		this.codUsuModif = codUsuModif;
	}

	public Date getFecModif() {
		return fecModif;
	}

	public void setFecModif(Date fecModif) {
		this.fecModif = fecModif;
	}

}
