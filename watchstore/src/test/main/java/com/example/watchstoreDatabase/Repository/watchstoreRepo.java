package com.example.watchstoreDatabase.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.shoeProductDatabase.Entity.Shoeproduct;

public interface watchstoreRepo extends JpaRepository<watchstore, Integer> {

	@Query(value =  "select * from watchstore  where productname =?" , nativeQuery = true)
	watchstore findByProductname(String Productname);
}
