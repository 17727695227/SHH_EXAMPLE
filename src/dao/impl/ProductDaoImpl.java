package dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import dao.ProductDao;
import model.Product;

public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao {

	// Dao中的保存商品的方法
	@Override
	public void save(Product product) {
		System.out.println("Dao中的save方法执行了");
		this.getHibernateTemplate().save(product);
		
	}
	

}
