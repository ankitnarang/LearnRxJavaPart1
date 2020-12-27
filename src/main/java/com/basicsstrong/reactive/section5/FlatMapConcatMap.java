package com.basicsstrong.reactive.section5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.rxjava3.core.Observable;

public class FlatMapConcatMap {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Hello","Reactive","Programming"));
		
		Observable.fromIterable(list)
			.flatMap(e -> Observable.fromArray(e.split("")))
			.subscribe(System.out::println);
		
		System.out.println("Following is example of Concat Map : ");
		
		Observable.fromIterable(list)
		.concatMap(e -> Observable.fromArray(e.split("")))
		.subscribe(System.out::println);
		
		
	}

}
