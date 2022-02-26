package pillihuaman.com.Service;

import pillihuaman.com.model.request.ReqUser;
import pillihuaman.com.model.response.RespBase;
import pillihuaman.com.model.response.RespUser;

public interface UserService {
	RespBase<RespUser> getUserByMail(String mail);
	RespBase<RespUser> getUserByUserName(String mail);
	RespBase<RespUser>  registerUser ( ReqUser request);

}
