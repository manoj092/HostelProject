package loginservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.repository.LoginRepository;
import com.hostelModel.Login;

@Service
public class LoginServices {
 
  @Autowired
  private LoginRepository loginRepository;
	
	public List findByUserNameAndEmailId(Login login) {
		// TODO Auto-generated method stub
		return loginRepository.findByUserNameAndEmailIdR(login);
	}

}
