package pillihuaman.com.model.response;
import java.math.BigInteger;

import com.googlecode.jmapper.annotations.JGlobalMap;

import lombok.Getter;
import lombok.Setter;


@JGlobalMap
@Getter
@Setter
public class RespColor {
	
	private BigInteger idColor;
	private String name;

	
}


