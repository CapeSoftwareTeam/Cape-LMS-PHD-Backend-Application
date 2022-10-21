package com.capeelectric.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capeelectric.model.LeaveDetails;

@Service
public interface LeaveDetailsService {

	void updateLeaves(LeaveDetails leaveDetails);

	void addLeaveDetails(List<LeaveDetails> leaveDetails);

	void deleteLeaveDetails(Integer leaveId);


	List<LeaveDetails> getLeaveDetails();




}
