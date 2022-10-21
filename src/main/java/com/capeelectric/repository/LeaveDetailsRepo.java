package com.capeelectric.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capeelectric.model.LeaveDetails;

@Repository
public interface LeaveDetailsRepo extends CrudRepository<LeaveDetails, Integer> {


	

}
