package pojo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TraineeComments")
public class TraineeComments {

	int traineeId;
	int mentorAceNo;
	int taskId;
	int rating;
	String comments;
	
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public TraineeComments(int traineeId, int mentorAceNo, int taskId, int rating, String comments) {
		super();
		this.traineeId = traineeId;
		this.mentorAceNo = mentorAceNo;
		this.taskId = taskId;
		this.rating = rating;
		this.comments = comments;
	}
	public TraineeComments() {
		super();
	}
	
}
