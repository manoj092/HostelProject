package adminService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostelModel.HostelInfo;

import adminRepo.AdminRepo;

@Service
public class AdminSave {

	@Autowired
	private  AdminRepo adminRepo;
	
	public Integer hostelSeve(HostelInfo hostelInfo) {
	    return adminRepo.saveHostels(hostelInfo);
		
	}

	public List findHostels() {
		   return adminRepo.findHostels();
		
	}

	

	public List getHostelById(Integer hostelInfoId) {
		      return adminRepo.getByHostelId(hostelInfoId);
		
	}

	public void saveUpdate(HostelInfo hostelInfo) {
		// TODO Auto-generated method stub
		adminRepo.saveUpdates(hostelInfo);
	}

	

}
