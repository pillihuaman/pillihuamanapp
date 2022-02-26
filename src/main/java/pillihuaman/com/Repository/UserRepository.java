package pillihuaman.com.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pillihuaman.com.BusinessEntity.model.User;
import pillihuaman.com.model.response.RespBase;
import pillihuaman.com.model.response.RespUser;





@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long>{
	@Query(value = "SELECT * FROM gamachicas.users ", nativeQuery = true)
	List<User> ListAllUser();
	@Query(value = "SELECT * FROM gamachicas.users where id_user =?1", nativeQuery = true)
User ListUserByIdUser(Long idUser);
}
