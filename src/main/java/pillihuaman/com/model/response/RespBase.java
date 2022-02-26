package pillihuaman.com.model.response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
	@Setter
	@ToString
	public class RespBase<T> {

		private Trace trace;
		private Status status;
		@JsonInclude(Include.NON_NULL)
		private T payload;

		public RespBase() {
			super();
			trace = new Trace();
			status = new Status();
		}

		@SuppressWarnings("unchecked")
		public RespBase<RespGetList<T>> okLista(List<T> lista) {
			RespGetList<T> respObtieneLista = new RespGetList<>(lista);
		    @SuppressWarnings("rawtypes")
			RespBase<RespGetList<T>> respBase = new RespBase().ok(respObtieneLista);
		    return respBase;
		}
		  
		public RespBase<T> ok(T payload) {
			RespBase<T> response = new RespBase<>();
			response.setPayload(payload);
			response.getStatus().setSuccess(Boolean.TRUE);
			return response;
		}

		/**
		 * Subclase plantilla para trazabilidad
		 *
		 * @author ttorres
		 */
		@Getter
		@Setter
		@ToString
		public static class Trace {

			private String traceId;
		}

		/**
		 * Subclase plantilla para status
		 *
		 * @author ttorres
		 */
		@Getter
		@Setter
		@ToString
		public static class Status {

			private Boolean success;
			private Error error;

			public Status() {
				super();
				error = new Error();
			}

			/**
			 * Subclase plantilla para error
			 *
			 * @author ttorres
			 */
			@Getter
			@Setter
			@ToString
			public static class Error {

				private String code;
				private String httpCode;
				private List<String> messages;

				public Error() {
					super();
					messages = new ArrayList<>();
				}
			}
		}
	}
