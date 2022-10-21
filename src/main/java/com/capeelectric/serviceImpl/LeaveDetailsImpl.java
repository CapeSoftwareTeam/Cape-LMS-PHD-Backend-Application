package com.capeelectric.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capeelectric.model.LeaveDetails;
import com.capeelectric.model.PublicHolidays;
import com.capeelectric.repository.LeaveDetailsRepo;
import com.capeelectric.service.LeaveDetailsService;

@Service
public class LeaveDetailsImpl implements LeaveDetailsService {

	@Autowired
	private LeaveDetailsRepo leaveDetailsRepo;
	
	@Override
	public void updateLeaves(LeaveDetails leaveDetails) {
		// TODO Auto-generated method stub
		leaveDetailsRepo.save(leaveDetails);
	}

	

	@Override
	public void deleteLeaveDetails(Integer leaveId) {
		// TODO Auto-generated method stub
		leaveDetailsRepo.deleteById(leaveId);
	}



	@Override
	public void addLeaveDetails(List<LeaveDetails> leaveDetails) {
		// TODO Auto-generated method stub
		leaveDetailsRepo.saveAll(leaveDetails);
		
	}



	@Override
	public List<LeaveDetails> getLeaveDetails() {
		// TODO Auto-generated method stub
		return (List<LeaveDetails>) leaveDetailsRepo.findAll();
	}



	




	






	


}
