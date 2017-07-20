package adminRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hostelModel.AdminLogin;


@Repository
public class AdminLoginRepo {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public List findAdminRepo(AdminLogin login) {
		return hibernateTemplate.find("from AdminLogin A where A.emailId=? and A.passwords=?", login.getEmailId(),
				login.getPasswords());

	}

}
