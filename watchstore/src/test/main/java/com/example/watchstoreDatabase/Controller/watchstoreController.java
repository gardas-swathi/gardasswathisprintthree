package com.example.watchstoreDatabase.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.example.watchstoreDatabase.Entity.watchstore;
import com.example.watchstoreDatabase.Service.watchstoreService;

@RestController
public class watchstoreController {

	
	@Autowired
	WatchstoreService watchstoreservice;

	
	@PostMapping("/post")
	public watchstore addProducts(@RequestBody WatchStore watchstore) {
		
		return watchstoreservice.addProduct(watchstore);
	}
		
	
	@PutMapping("/update")
	public watchstore update(@RequestHeader String productname, @RequestBody watchstore watchstore) {

		return watchstoreservice.updateProduct(productname, watchstore);
	}
	
	@DeleteMapping("delete")
	public String delete(@RequestHeader String productname) {
		watchstoreservice.deleteproduct(productname);
		return "data deleted";
	}
}
