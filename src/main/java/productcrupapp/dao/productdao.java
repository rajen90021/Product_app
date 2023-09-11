package productcrupapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class productdao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	///create 
	@Transactional
	public void createproduct(Product product) {
		
		
		hibernateTemplate.save(product);
	}
	//get all product
	public List<Product> getproduct(){
		
		
	List<Product> loadall= hibernateTemplate.loadAll(Product.class);
	return loadall;
	}
	
	// delete the single product
		@Transactional
		public void deleteProduct(int pid) {
			Product p = this.hibernateTemplate.load(Product.class, pid);
			this.hibernateTemplate.delete(p);
		}

		// get the single product
		public Product getProduct(int pid) {
			return this.hibernateTemplate.get(Product.class, pid);
		}
}
