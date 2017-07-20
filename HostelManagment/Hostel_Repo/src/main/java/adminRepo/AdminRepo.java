package adminRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.hostelModel.HostelInfo;

@Repository
public class AdminRepo {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public Integer saveHostels(HostelInfo hostelInfo) {
         Integer i=(Integer) hibernateTemplate.save(hostelInfo)	;
		return i;
	
			
	
	}

	public List findHostels() {
		   return hibernateTemplate.find("from HostelInfo");
		
	}

	public List getByHostelId(Integer hostelInfoId) {
          return hibernateTemplate.find("from HostelInfo H where H.hostelInfoId=? ", hostelInfoId);		
		
	}

	public void saveUpdates(HostelInfo hostelInfo) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(hostelInfo);
	}
	

}
