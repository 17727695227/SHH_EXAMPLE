package service.impl;

import org.springframework.transaction.annotation.Transactional;

import dao.ProductDao;
import model.Product;
import service.ProductService;

@Transactional
public class ProductServiceImpl implements ProductService {
	// 业务层注入Dao的类
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	// 业务层保存商品的方法
	@Override
	public void save(Product product) {
		System.out.println("Service中的save方法执行了");
		productDao.save(product);
		
	}

}
