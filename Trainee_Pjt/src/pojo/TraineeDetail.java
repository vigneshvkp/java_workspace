package pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRAINEEDETAIL")
public class TraineeDetail {

	@Id
	@Column(name = "Trainee_Id")
	int traineeId;
	int mentorAceNo;
	
	// Planned Start Date, Planned End Date, Actual Start Date, Actual End Date.
	int taskId;
	Date PSD,PED,ASD,AED;
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public int getMentorAceNo() {
		return mentorAceNo;
	}
	public void setMentorAceNo(int mentorAceNo) {
		this.mentorAceNo = mentorAceNo;
	}

	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public Date getPSD() {
		return PSD;
	}
	public void setPSD(Date pSD) {
		PSD = pSD;
	}
	public Date getPED() {
		return PED;
	}
	public void setPED(Date pED) {
		PED = pED;
	}
	public Date getASD() {
		return ASD;
	}
	public void setASD(Date aSD) {
		ASD = aSD;
	}
	public Date getAED() {
		return AED;
	}
	public void setAED(Date aED) {
		AED = aED;
	}
	public TraineeDetail(int traineeId, int mentorAceNo, int taskId, Date pSD, Date pED, Date aSD, Date aED) {
		super();
		this.traineeId = traineeId;
		this.mentorAceNo = mentorAceNo;
		this.taskId = taskId;
		PSD = pSD;
		PED = pED;
		ASD = aSD;
		AED = aED;
	}
	public TraineeDetail() {
		super();
	}


	
	
}
