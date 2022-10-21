package com.capeelectric.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capeelectric.model.PublicHolidays;
import com.capeelectric.repository.PublicHolidaysRepo;
import com.capeelectric.service.PublicHolidaysService;

@Service
public class PublicHolidaysImpl implements PublicHolidaysService  {
	
	@Autowired
	private PublicHolidaysRepo publicHolidaysRepo;

	@Override
	public String addPublicHolidays(List<PublicHolidays> publicHoliday) {
		
		publicHolidaysRepo.saveAll(publicHoliday);
		return "Table updated!";
	}

	@Override
	public void updatePublicHolidays(List<PublicHolidays> publicHolidays) {
		// TODO Auto-generated method stub
		
		publicHolidaysRepo.saveAll(publicHolidays);
	}

	@Override
	public List<PublicHolidays> getPublicHolidays() {
		// TODO Auto-generated method stub
		return (List<PublicHolidays>) publicHolidaysRepo.findAll();
	}

	@Override
	public void deletePublicHolidays(Integer publicLeaveId) {
		// TODO Auto-generated method stub
		publicHolidaysRepo.deleteById(publicLeaveId);
		
	}
}
