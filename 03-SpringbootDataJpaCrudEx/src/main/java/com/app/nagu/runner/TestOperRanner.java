package com.app.nagu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.nagu.entity.Product;
import com.app.nagu.repo.ProductRepository;

@Component
public class TestOperRanner implements CommandLineRunner 
{
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());

		Product p1 = new Product(11,"P1",300.0);
		Product p2 = new Product(12,"P2",200.0);
		Product p3 = new Product(13,"P3",700.0);

		//1.save(object) method
		/*
		 * repo.save(p1); repo.save(p2); repo.save(p3);
		 */

		//2. saveAll(array of objects)
		repo.saveAll(Arrays.asList(p1,p2,p3));

		//3. findAll()
		Iterable<Product> data = repo.findAll();

		//JDK 1.5 forEach Loop
		for(Product pob:data) { System.out.println(pob); }


		System.out.println("-----------------");
		//JDK 1.8 Default method + Lambda Expression
		data.forEach(pob -> System.out.println(pob));//Lamda exression

		System.out.println("*****************");
		//JDK 1.8 Default method + Method References
		data.forEach(System.out::println);// method reference
		
		//4. existsById(id) method
		System.out.println(repo.existsById(11));
		System.out.println(repo.existsById(22));

		//5. count() method
		System.out.println(repo.count());

	}

}
