package com.basicsstrong.reactive.section5;

import io.reactivex.rxjava3.core.Observable;

public class Grouping {
	
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
		
		obs.groupBy(e -> e.getRating())
			.flatMapSingle(e -> e.toMultimap(key -> e.getKey(),emp -> emp.getName()))
			.subscribe(System.out::println);
		
	}

}
