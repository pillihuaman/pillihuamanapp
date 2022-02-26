package pillihuaman.com.model.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RespGetList<T> {

	private Integer count;
	private Long total;
	private List<T> items;


	public RespGetList(List<T> items) {
		this.items = items;
		this.count = items.size();
	}
	
	public RespGetList() {
		
	}
}
