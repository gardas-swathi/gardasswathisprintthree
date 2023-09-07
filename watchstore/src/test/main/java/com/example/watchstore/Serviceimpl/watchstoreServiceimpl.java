package com.example.watchstore.Serviceimpl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shoeProductDatabase.Entity.Shoeproduct;
import com.example.shoeProductDatabase.Exception.ResourceNotFoundException;
import com.example.shoeProductDatabase.Repository.ShoeproductRepo;
import com.example.shoeProductDatabase.Service.ShoeproductService;

@Service
public class watchstoreServiceimpl implements watchstoreService {

	@Autowired
	watchstoreRepo watchstorerepo;
	@Override
	public watchstore addProduct(watchstore watchstore) {
		// TODO Auto-generated method stub
		return watchstorerepo.save(watchstore);
	}
	
	@Override
	public watchstore updateProduct(String productname, watchstore watchstore) {
		// TODO Auto-generated method stub
      watchstore w1 = watchstorerepo.findByProductname(productname);
		
		if(w1!=null) {
			   
			w1.setProductdesc(watchstore.getProductdesc());// old to new set
			w1.setProductlink(watchstore.getProductlink());
		return watchstorerepo.save(w1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
		
	}

	@Override
	public void deleteproduct(String productname) {
		// TODO Auto-generated method stub
		watchstore w2 = watchstorerepo.findByProductname(productname);
		
		if(w2!=null) {
			watchstorerepo.delete(w2);
		}
		else {
			throw new ResourceNotFoundException();
		}		
	}
	

}
