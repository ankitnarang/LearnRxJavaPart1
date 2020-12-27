package com.basicsstrong.reactive.section5;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class Ambigous {
	
	public static void main(String[] args) throws InterruptedException {
		Observable<String> obs1 = Observable
										.interval(1, TimeUnit.SECONDS)
										.take(10)
										.map(e -> "Obs 1 " + e);
		
		Observable<String> obs2 = Observable
				.interval(10, TimeUnit.MILLISECONDS)
				.take(10)
				.map(e -> "Obs 2 " + e);
		
		Observable.amb(Arrays.asList(obs1,obs2)).subscribe(System.out::println);
		
		Thread.sleep(11000);
		
	}

}
