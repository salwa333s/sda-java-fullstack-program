package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<String, String> simpleMap = new HashMap<String, String>();
		simpleMap.put("username", "user1234");
		simpleMap.put("password", "pa$$w0rd");
		
		System.out.println("Username: "+simpleMap.get("username"));
		System.out.println("Password: "+simpleMap.get("password"));
		
		Map<String, List<Employee>> complexMap = new HashMap<String, List<Employee>>();
		
		List<Employee> accountsList = new ArrayList<Employee>();
		// add some employees to accounts
		accountsList.add(new Employee(1, "Alex", 35200));
		List<Employee> salesList = new ArrayList<Employee>();
		salesList.add(new Employee(2, "Bruce", 35200));
		salesList.add(new Employee(3, "Charles", 45200));
		// add some employees to sales
		// add these lists to the map
		
		complexMap.put("account", accountsList);
		complexMap.put("sales", salesList);
		
		List<Employee> list = complexMap.get("account");;
		System.out.println(list.size());
		
		
	}
}
