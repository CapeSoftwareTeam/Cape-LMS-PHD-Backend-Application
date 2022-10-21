package com.capeelectric.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leave_details")
public class LeaveDetails {

	@Id
	@Column(name="L_ID")
    private Integer leaveId;	
	
	@Column(name="EXPERIENCE")
	private Integer experience;
	
	@Column(name="CASUAL_LEAVE")
	private Integer casual_Leave;
	
	@Column(name="SICK_LEAVE")
	private Integer  sick_Leave;
	
	@Column(name="PRIVILAGE_LEAVE")
	private Integer privilage_Leave;
	
	@Column(name="MATERNITY_LEAVE")
	private Integer special_Leave;
	
	@Column(name="BEREAVEMENT_LEAVE")
	private Integer bereavement_Leave;

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Integer getCasual_Leave() {
		return casual_Leave;
	}

	public void setCasual_Leave(Integer casual_Leave) {
		this.casual_Leave = casual_Leave;
	}

	public Integer getSick_Leave() {
		return sick_Leave;
	}

	public void setSick_Leave(Integer sick_Leave) {
		this.sick_Leave = sick_Leave;
	}

	public Integer getPrivilage_Leave() {
		return privilage_Leave;
	}

	public void setPrivilage_Leave(Integer privilage_Leave) {
		this.privilage_Leave = privilage_Leave;
	}

	public Integer getSpecial_Leave() {
		return special_Leave;
	}

	public void setSpecial_Leave(Integer special_Leave) {
		this.special_Leave = special_Leave;
	}

	public Integer getBereavement_Leave() {
		return bereavement_Leave;
	}

	public void setBereavement_Leave(Integer bereavement_Leave) {
		this.bereavement_Leave = bereavement_Leave;
	}

	public Integer getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}


	
}
