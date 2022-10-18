package com.app.nagu.runner;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.nagu.entity.Product;
import com.app.nagu.repo.ProductRepository;

@Component
public class TestProductRunner implements CommandLineRunner 
{
	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception 
	{
		Product p = new Product();
		p.setProdId(10);
		p.setProdCode("PEN");
		
		p.setColors(Arrays.asList("RE","GR","BL"));
		
		Set<String> set = new LinkedHashSet<>();
		set.add("M1");
		set.add("LA");
		set.add("SF");
		p.setModels(set);
		
		Map<String, String> map = new LinkedHashMap<>();
		map.put("D1", "ABC");
		map.put("D2", "XYZ");
		map.put("D3", "MNO");
		p.setDetails(map);
		
		repo.save(p);
		

	}

}
