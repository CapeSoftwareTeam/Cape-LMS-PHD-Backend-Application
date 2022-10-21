package com.capeelectric.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capeelectric.model.LeaveDetails;
import com.capeelectric.model.PublicHolidays;
import com.capeelectric.repository.LeaveDetailsRepo;
import com.capeelectric.service.LeaveDetailsService;

@RestController
public class LeaveDetailsController {
   @Autowired
   private LeaveDetailsService leaveDetailsService;
   
   @PostMapping("/addLeaveDetails")
   public ResponseEntity<String> addLeaveDetails( @RequestBody List<LeaveDetails> leaveDetails) {
	   leaveDetailsService.addLeaveDetails(leaveDetails);
	   return new ResponseEntity<String> ("Leave added Successfully!",HttpStatus.OK);
   }

	@PutMapping("/update")
	public ResponseEntity<String> updateLeaves( @RequestBody LeaveDetails leaveDetails) {
		leaveDetailsService.updateLeaves(leaveDetails);
		return new ResponseEntity<String>("Table updated!",HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteLeaveDetails/{leaveId}")
	public ResponseEntity<String> deleteLeaveDetails( @PathVariable Integer leaveId) {
		leaveDetailsService.deleteLeaveDetails(leaveId);
		return new ResponseEntity<String>("Table deleted!",HttpStatus.OK);
	}
	
	   @GetMapping("/getLeaveDetails")
	    public ResponseEntity< List<LeaveDetails> > getLeaveDetails(){
	     List<LeaveDetails> leaveDetails = leaveDetailsService.getLeaveDetails();
	    	return new ResponseEntity< List<LeaveDetails> >(leaveDetails,HttpStatus.OK);
	    }
	
}
	
	
