package pillihuaman.com.BusinessEntity.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the color database table.
 * 
 */

@Getter
@Setter
@Entity
@NamedQuery(name="Color.findAll", query="SELECT c FROM Color c")
public class Color implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="id_color")
	private BigInteger idColor;

	private String name;

	public Color() {
		super();
	}
	


}