package com.org.project.employee;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.project.utils.JwtUtils;

@RestController
@RequestMapping(value = "/one/employee/")
public class EmployeeController {
	@Autowired
	EmployeeRepository repo;
	@Autowired
	JwtUtils jwtu;
	
	@GetMapping("/getEmp/{eid}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> getEmp(@PathVariable Long eid){
		
		Optional<EmployeeEntity> edao = repo.findById(eid);
		return new ResponseEntity<Object>(edao, HttpStatus.OK);
	}
	@GetMapping("/getSamp")
//	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> getSamp(){
		
		
		String token = jwtu.genJWT();
		
		return new ResponseEntity<String>(token, HttpStatus.OK);
	}
	
	
	@PostMapping("/createEmp")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<String> createEmployee(@RequestBody EmployeeDto input){
		
		ModelMapper mm = new ModelMapper();
		EmployeeEntity edao = mm.map(input, EmployeeEntity.class);
		
		repo.save(edao);
		
		
		
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}
	
	
	
	
	
	

}
