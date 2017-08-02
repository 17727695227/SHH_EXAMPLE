package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.Product;
import service.ProductService;

public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	// Struts2和Spring整合过程中手动注入的业务层类
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	// 模型驱动使用的类
	private Product product = new Product();
	@Override
	public Product getModel() {
		return product;
	}
	
	// 保存商品的执行方法：save
	public String save() {
		System.out.println("Action中的save方法执行了");
		productService.save(product);
		return NONE;
	}

}
