package com.example.watchstoreDatabase.Service;






import com.example.watchstoreDatabase.Entity.watchstore;

public interface watchstoreService {
	
	watchstore addProduct(watchstore watchstore);
	
	watchstore updateProduct(String productname, watchstore watchstore);
	
	void deleteproduct(String productname);

}
