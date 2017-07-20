package loginservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.repository.FindByCatagoryId;


@Service
public class HostelFindByCatagory {
	 
	@Autowired
    private FindByCatagoryId byCatagoryId;

	public List findByCatagory() {
		      
		return byCatagoryId.findCatagory();
	}

	public List findByBoys() {
		// TODO Auto-generated method stub
		return byCatagoryId.boyFind();
	}

	public List findByGirls() {
		// TODO Auto-generated method stub
		return byCatagoryId.findGirls();
	}
	

}
