package pillihuaman.com.Service;

import pillihuaman.com.model.response.RespBase;
import pillihuaman.com.model.response.RespColor;
import pillihuaman.com.model.response.RespUser;

public interface ColorService {
	RespBase<RespColor> getColorbyName(String name);



}
