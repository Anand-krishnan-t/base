package com.org.project.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class EmployeeDto {

		private Long empSysId;
		
		private String empName;
		
		private Integer empAge;
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
