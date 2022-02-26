package pillihuaman.com.Service.Implement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import pillihuaman.com.BusinessEntity.model.Color;
import pillihuaman.com.BusinessEntity.model.User;
import pillihuaman.com.Help.RegisterStatus;
import pillihuaman.com.Repository.ColorRepository;
import pillihuaman.com.Repository.UserRepository;
import pillihuaman.com.Service.ColorService;
import pillihuaman.com.Service.UserService;
import pillihuaman.com.model.response.RespBase;
import pillihuaman.com.model.response.RespColor;
import pillihuaman.com.model.response.RespUser;


@Component
public class ColorServiceImpl implements ColorService {
	@Autowired
	private ColorRepository colorRepository;
	@SuppressWarnings("unused")
	@Override
	public RespBase<RespColor> getColorbyName(String name) {
		RespBase<RespColor>  respo= new RespBase<RespColor>();
		try {
			Color filtro = new Color();
		
		filtro.setName(name);
		Example<Color> example = Example.of(filtro);
		List<Color> lista= new ArrayList<>();
	lista = colorRepository.findAll(example);
	Optional<Color> clor=	colorRepository.findById(new BigInteger(1+""));
		if(lista !=null) {
			
		}
		}
		catch (Exception e) {
		throw e;
		}
		return respo;
	}






}
