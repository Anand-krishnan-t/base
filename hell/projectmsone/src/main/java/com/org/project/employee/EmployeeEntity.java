package com.org.project.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class EmployeeEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "EMPLOYEE_SYSID")
		private Long empSysId;
		
		@Column(name = "EMPLOYEE_NAME")
		private String empName;
		
		@Column(name = "EMPLOYEE_AGE")
		private Integer empAge;
		@Column(name = "EMPLOYEE_SALARY")
		private Float empSal;
		public Long getEmpSysId() {
			return empSysId;
		}
		public void setEmpSysId(Long empSysId) {
			this.empSysId = empSysId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public Integer getEmpAge() {
			return empAge;
		}
		public void setEmpAge(Integer empAge) {
			this.empAge = empAge;
		}
		public Float getEmpSal() {
			return empSal;
		}
		public void setEmpSal(Float empSal) {
			this.empSal = empSal;
		}
		
	
	
}
