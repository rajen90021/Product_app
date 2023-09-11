package productcrupapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrupapp.dao.productdao;
import productcrupapp.model.Product;

@Controller
public class maincontroller {

	@Autowired
	private productdao productdao;
	
	@RequestMapping("/")
	public String opehnhome(Model m) {
		
	List<Product> product=	  productdao.getproduct();
		
		m.addAttribute("product", product);
		
		
		return "index";
	}
	
	
	//show add product form
	@RequestMapping("/add-product")
	public String addproduct(Model m) {
		m.addAttribute("title","add product");
		return "add_product_form";
	}
	
//	@RequestMapping( value="/handle-product",method = RequestMethod.POST)
//	public RedirectView handleform(@ModelAttribute Product product,HttpServletRequest req) {
//		
//		System.out.println(product);
//		productdao.createproduct(product);
//		RedirectView redirectview =  new RedirectView();
//		redirectview.setUrl(req.getContextPath()+"/");
//		return redirectview;
//	}
	@RequestMapping( value="/handle-product",method = RequestMethod.POST)
	public String handleform(@ModelAttribute Product product,HttpServletRequest req) {
		
		System.out.println(product);
		productdao.createproduct(product);
	
		return "redirect:/";
	}
	
//	@RequestMapping("/delete/{productid}")
//	public RedirectView deleteproduct(@PathVariable("productid")int productid, HttpServletRequest req) 
//	{
//		productdao.deleteProduct(productid);
//		RedirectView redirectview =  new RedirectView();
//		redirectview.setUrl(req.getContextPath()+"/");
//		return redirectview;
//		
//	}
	
	@RequestMapping("/delete/{productid}")
	public String deleteproduct(@PathVariable("productid")int productid, HttpServletRequest req) 
	{
		productdao.deleteProduct(productid);
		return "redirect:/";
		
	}
	
	@RequestMapping("/update/{productid}")
	public String update(@PathVariable("productid") int productid) {
		
	 Product product = 	productdao.getProduct(productid);
		
		return "update_form";
	}
}
