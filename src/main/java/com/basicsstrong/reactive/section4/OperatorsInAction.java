package com.basicsstrong.reactive.section4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.rxjava3.core.Observable;

public class OperatorsInAction {
	
	public static void main(String[] args) {
		Observable<Employee> obs = Observable.just(
				new Employee(101,"Alexa",60000,4.0),
				new Employee(123,"Dhwanit",94000,4.7),
				new Employee(236,"Mike",65000,4.0),
				new Employee(343,"Ella",85000,4.4),
				new Employee(353,"George",50000,3.6),
				new Employee(454,"Sheerja",85000,4.5),
				new Employee(786,"Daniel",60000,4.0),
				new Employee(787,"Lucy",94000,4.7),
				new Employee(231,"Harry",75000,4.3),
				new Employee(344,"Emma",55000,3.7)
				);
		
		obs
			.filter(e -> e.getRating() > 4.0)
			.sorted((e1,e2) -> Double.compare(e2.getRating(),e1.getRating()))
			.map( e -> e.getName())
			.take(4)
			.subscribe(System.out::println);
		
		List<Integer> expenses = new ArrayList<>(Arrays.asList(200,500,300,340,129,234,999,1030,3400,890,996,789));
		
		Observable.fromIterable(expenses)
		.scan((a,b) -> a + b)
		.subscribe(System.out::println);
		
		System.out.println("----------------------------");
		
		Observable.fromIterable(expenses)
		.reduce((a,b) -> a + b)
		.subscribe(System.out::println);
		
	}
}
