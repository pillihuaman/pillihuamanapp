package pillihuaman.com.Service.Implement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import pillihuaman.com.BusinessEntity.model.AuditEntity;
import pillihuaman.com.BusinessEntity.model.User;
import pillihuaman.com.Help.ConvertClass;
import pillihuaman.com.Repository.UserRepository;
import pillihuaman.com.Service.UserService;
import pillihuaman.com.basebd.user.domain.dao.UserProcessRepository;
import pillihuaman.com.model.request.ReqUser;
import pillihuaman.com.model.response.RespBase;
import pillihuaman.com.model.response.RespUser;
import pillihuaman.com.security.PasswordUtils;



@Component
public class UserServiceImpl implements UserService {
	@Autowired(required = false)
	private UserRepository userRepository;

	@Autowired(required = false)
	private UserProcessRepository userProcessRepository;



	@Override
	public RespBase<RespUser> getUserByMail(String mail) {


		RespBase<RespUser> respo = new RespBase<RespUser>();

		try {
			List<pillihuaman.com.basebd.user.domain.User> lis = userProcessRepository.findUserByMail(mail);
			RespUser obj = new RespUser();
			for (pillihuaman.com.basebd.user.domain.User user : lis) {
				obj.setAlias(user.getAlias());
				obj.setApi_Password(user.getApiPassword());
				obj.setId_system(user.getIdSystem());
				obj.setMail(user.getMail());
				obj.setPassword(user.getPassword());
				obj.setSal_Password(user.getSalPassword());
				obj.setUsername(user.getUsername());
			}
			respo.setPayload(obj);

		} catch (Exception e) {
			respo.getStatus().setSuccess(Boolean.FALSE);
			respo.getStatus().getError().getMessages().add(e.getMessage());
		}
		
		return respo;
	}

	@Override
	public RespBase<RespUser> getUserByUserName(String username) {


		// RespBase<RespColor> listacolor= colorService.getColorbyName("rojo");

		// List<User> lstUser = userRepository.ListAllUser();
		// User use = userRepository.ListUserByIdUser(2L);

		RespBase<RespUser> respo = new RespBase<RespUser>();

		try {
			User filtro = new User();

			filtro.setUsername(username);
			// filtro.setStatus(RegisterStatus.ACTIVE.getCode());
			Example<User> example = Example.of(filtro);
			List<User> lista = new ArrayList<>();
			lista = userRepository.findAll(example);
			if (lista != null && lista.size() > 0) {
				respo.setPayload(ConvertClass.UserTblToUserDTO(lista.get(0)));

			}

		} catch (Exception e) {
			respo.getStatus().setSuccess(Boolean.FALSE);
			respo.getStatus().getError().getMessages().add(e.getMessage());
		}
		return respo;
	}

	@Override
	public RespBase<RespUser> registerUser(ReqUser request) {
		MongoClient clin = MongoClients.create("mongodb://localhost:27017");
		MongoTemplate template = new MongoTemplate(clin, "gamachicas");
		try {
			RespBase<RespUser> respo = new RespBase<RespUser>();
			pillihuaman.com.basebd.user.domain.User filtro = new pillihuaman.com.basebd.user.domain.User();
			String salt = PasswordUtils.getSalt(30);
			String apiPasword = PasswordUtils.generateSecurePassword(request.getPassword(), salt);
			BCryptPasswordEncoder en = new BCryptPasswordEncoder() ;
			
			String Password = en.encode(request.getPassword());
			filtro.setId(new ObjectId());
			filtro.setAlias("");
			filtro.setApiPassword(apiPasword);
			filtro.setIdSystem(1);
			int idUser = getLastIdUser();
			filtro.setIdUser(idUser == 0 ? 1 : idUser + 1);
			filtro.setMail(request.getMail());
			filtro.setMobilPhone(request.getMobilPhone());
			filtro.setPassword(Password);
			filtro.setSalPassword(salt);
			filtro.setUsername(request.getUsername());
			filtro.setNumTypeDocument(request.getNumTypeDocument());
			filtro.setTypeDocument(request.getTypeDocument());
			AuditEntity auditEntity = new AuditEntity();
			auditEntity.setCodUsuModif("o1Zarmir");
			auditEntity.setCodUsuRegis("o1Zarmir");
			auditEntity.setFecModif(new Date());
			auditEntity.setFecRegis(new Date());
			filtro.setAuditEntity(auditEntity);
			userProcessRepository.insert(filtro);

			List<pillihuaman.com.basebd.user.domain.User> lis = userProcessRepository
					.findUserByMail("pillihuamanhz@gmail.com");
			pillihuaman.com.basebd.user.domain.User filtroM = new pillihuaman.com.basebd.user.domain.User();
			Query query = new Query();
			Document fd = new Document();
			Example<pillihuaman.com.basebd.user.domain.User> example = Example.of(filtroM);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public int getLastIdUser() {
		int id = 0;
		try {
			MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
			MongoDatabase database = mongoClient.getDatabase("gamachicas");
			MongoCollection<Document> collection = database.getCollection("user");
			Document sort = new Document().append("_id", -1);
			Document lis = collection.find().sort(sort).first();
			if (Objects.nonNull(lis)) {
				id = (int) lis.get("idUser");
			}
			mongoClient.close();
		} catch (MongoException e) {
			id = 0;
		}
		return id;
	}


}
