package pillihuaman.com.model.request;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;



import lombok.Getter;
import lombok.Setter;

/**
 * Clase plantila para request
 * 
 * @author ttorres
 *
 * @param <T>
 *            Clase del payload
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class ReqBase<T> {

	private Trace trace;
	@NotNull(message = "Campo payload es obligatorio")
	@Valid
	private T data;

	public ReqBase() {//NOSONAR
		super();

	}

	@Getter
	@Setter
	public static class Trace {

		@NotNull(message = "Campo traceId ")
		private String traceId;
	}
}
