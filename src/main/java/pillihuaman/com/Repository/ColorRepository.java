package pillihuaman.com.Repository;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pillihuaman.com.BusinessEntity.model.Color;





@Repository
@Transactional
public interface ColorRepository extends JpaRepository<Color, BigInteger>{
}
