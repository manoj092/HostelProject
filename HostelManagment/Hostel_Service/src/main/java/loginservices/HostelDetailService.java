package loginservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.repository.HostelDetailRepository;
import com.hostelModel.HostelInfo;


@Service
public class HostelDetailService {

	@Autowired
	private HostelDetailRepository detailRepository;
	
	public HostelInfo findHosteldetails(Integer hostelInfoId) {
		// TODO Auto-generated method stub
		return  detailRepository.findDetail(hostelInfoId);
	}

}
