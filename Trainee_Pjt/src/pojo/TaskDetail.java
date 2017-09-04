package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TASKDETAIL")
public class TaskDetail {

    @Id
    @Column(name = "Task_ID")
	int taskId;
	String taskName;
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public TaskDetail(int taskId, String taskName) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
	}
	public TaskDetail() {
		super();
	}
	
	
}
