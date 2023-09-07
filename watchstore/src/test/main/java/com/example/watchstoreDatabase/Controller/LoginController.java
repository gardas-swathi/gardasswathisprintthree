package com.example.watchstoreDatabase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.watchstoreDatabase.Entity.Login;
import com.example.watchstoreDatabase.Service.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService loginservice;

	@GetMapping("login")
	public Login login(@RequestHeader String email, @RequestHeader String password) {

		return loginservice.login(email, password);
	}

//	@PostMapping("post")
//	public Login addUser(@RequestBody Login login) {
//
//		return loginservice.addUser(login);
//	}
//
//	@PutMapping("update")
//	public Login update(@RequestHeader String email, @RequestBody Login login) {
//
//		return loginservice.update(email,login);
//	}
//	
//	@DeleteMapping("delete")
//	public String delete(@RequestHeader String email) {
//		loginservice.Delete(email);
//		return "data deleted";
//	}
}


