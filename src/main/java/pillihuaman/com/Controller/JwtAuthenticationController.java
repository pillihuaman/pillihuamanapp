
package pillihuaman.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pillihuaman.com.JwtTokenUtil;
import pillihuaman.com.JwtUserDetailsService;
import pillihuaman.com.Help.MaestrosUtilidades;
import pillihuaman.com.RequestResponse.AuthenticationResponse;
import pillihuaman.com.RequestResponse.JwtRequest;
import pillihuaman.com.Service.UserService;
import pillihuaman.com.model.request.ReqUser;
import pillihuaman.com.model.response.RespBase;
import pillihuaman.com.model.response.RespUser;
import pillihuaman.com.security.BcryptManager;
import pillihuaman.com.security.PasswordUtils;

@RestController
@CrossOrigin
public class JwtAuthenticationController {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	private JwtUserDetailsService userDetailsService;

	@Autowired
	private UserService userService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestHeader String username, @RequestHeader String password,  @RequestBody JwtRequest authenticationRequest) throws Exception {
		authenticate(username, password,
				authenticationRequest.getMail());
		final UserDetails userDetails = userDetailsService.loadUserByUsername(username);
		final String token = jwtTokenUtil.generateToken(userDetails);
		AuthenticationResponse auth = new AuthenticationResponse();
		auth.setToken(token);
		auth.setId(1);
		// return ResponseEntity.ok().headers(responseHeaders).body(user);
		return ResponseEntity.ok(auth);
	}

	@SuppressWarnings("null")
	private void authenticate(String username, String password, String mail) throws Exception {
		boolean valida = false;
		try {

			ReqUser user = new ReqUser();
			user.setUsername(username);
			user.setPassword(password);
			user.setMail(mail);

			//String salt = PasswordUtils.getSalt(500);
			//String mySecurePassword = PasswordUtils.generateSecurePassword(password, salt);

			//String codeString = bCryptPasswordEncoder.encode(password);

			RespBase<RespUser> userResponse = userService.getUserByUserName(username);
					
			if (userResponse != null && userResponse.getPayload() != null) {
				if (!MaestrosUtilidades.isEmpty(userResponse.getPayload().getUsername())) {
					if (!MaestrosUtilidades.isEmpty(userResponse.getPayload().getMail())
							|| !MaestrosUtilidades.isEmpty(password)) {
						if (!MaestrosUtilidades.isEmpty(userResponse.getPayload().getPassword())
								|| !MaestrosUtilidades.isEmpty(userResponse.getPayload().getSal_Password())) {

							valida = PasswordUtils.verifyUserPassword(password, userResponse.getPayload().getApi_Password(),
									userResponse.getPayload().getSal_Password());
							if (valida == false) {
								throw new UsernameNotFoundException("Users not found with username: " + username);
							}
						} else {
							throw new UsernameNotFoundException("Users not found with username: " + username);

						}
					} else {
						throw new UsernameNotFoundException("Users not found with username: " + username);
					}
				} else {
					throw new UsernameNotFoundException("Users not found with username: " + username);
				}
			} else {
				throw new UsernameNotFoundException("Users not found with username: " + username);
			}
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));


		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}