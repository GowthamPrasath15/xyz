package com.ammacollege.details.model;
	import javax.persistence.*;

	@Entity
	@Table(name = "student_details")
	public class StudentDetails {

		@Id
		@Column(name = "reg_no")
		public int regNo;

		@Column(name = "student_name")
		public String studentName;

		@Column(name = "dob")
		public String dob;

		@Column(name = "email_address")
		public String emailId;

		@ManyToOne
		@JoinColumn(name = "course_id")
		public CourseDetails courseId;

		@Column(name = "active_status")
		public boolean activeStatus;

		public int getRegNo() {
			return regNo;
		}

		public void setRegNo(int regNo) {
			this.regNo = regNo;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public CourseDetails getCourseId() {
			return courseId;
		}

		public void setCourseId(CourseDetails courseId) {
			this.courseId = courseId;
		}

		public boolean isActiveStatus() {
			return activeStatus;
		}

		public void setActiveStatus(boolean activeStatus) {
			this.activeStatus = activeStatus;
		}
}
