package pillihuaman.com.security;

public class VerifyProvidedPassword {
	public static boolean PasswordVerify(String providedPassword, String securePassword, String salt) {
		boolean validate = false;
     // User provided password to validate
       providedPassword = "myPassword123";
              
      //Encrypted and Base64 encoded password read from database
       securePassword = "HhaNvzTsVYwS/x/zbYXlLOE3ETMXQgllqrDaJY9PD/U=";
      
//      Salt value stored in database 
       salt = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
		validate = PasswordUtils.verifyUserPassword(providedPassword, securePassword, salt);
		if (validate) {
			System.out.println("Provided user password " + providedPassword + " is correct.");
			return true;
		} else {
			validate = false;
			System.out.println("Provided password is incorrect");
		}
		return validate;
	}
}