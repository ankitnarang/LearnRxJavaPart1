package com.basicsstrong.reactive.section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Supplier;

public class CreateObservable {
	
	public static void main(String[] args) throws InterruptedException {
		//create
		Observable<Integer> source = Observable.create(
					e -> {
						e.onNext(10);
						e.onNext(11);
						e.onNext(12);
						e.onComplete();
					}
				);
		
		source.subscribe(System.out::println);
		
		//just()
		
		Observable<Integer> just = Observable.just(1,2,3);
		
		just.subscribe(System.out::println);
		
		// fromIterable
		
		List<String> list = new ArrayList<String>(Arrays.asList("Ram","Shyam","Mike"));
		
		Observable<String> fromIterable = Observable.fromIterable(list);
		
		fromIterable.subscribe(System.out::println);
		/*
		Observable.range(3, 10).subscribe(System.out::println);
		
		Observable.interval(1, TimeUnit.SECONDS).subscribe(System.out::println);
		Thread.sleep(5000);
		
		Observable.fromFuture(future);
		Observable.empty();
		Observable.never();
		Observable.error(supplier);
		
		System.out.println("-------------");
		
		Observable<String> source1 = Observable.defer(
			() -> Observable.fromIterable(list)
		);
		
		source1.subscribe(System.out::println);
		
		list.add("Ankit");
		
		source1.subscribe(System.out::println);
		*/
		
		//Observable.fromCallable(callable);
		
	}

}
