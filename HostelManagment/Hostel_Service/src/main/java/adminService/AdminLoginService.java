package adminService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostelModel.AdminLogin;

import adminRepo.AdminLoginRepo;


@Service
public class AdminLoginService {

	@Autowired
	AdminLoginRepo adminLoginRepo;

	public List findAdmin(AdminLogin login) {
		return adminLoginRepo.findAdminRepo(login);

	}

	

}
