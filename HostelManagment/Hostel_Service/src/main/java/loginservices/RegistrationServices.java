package loginservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.repository.RegistrationRepository;
import com.hostelModel.Login;

@Service
public class RegistrationServices {

@Autowired
private RegistrationRepository loginRepository;
	
	public Integer saveRegistrationform(Login login) {
		   return loginRepository.saveRegistration(login);
	}
	
	
	

}
