package com.basicsstrong.reactive.section4;

import io.reactivex.rxjava3.core.Observable;

public class Operators {
	
	public static void main(String[] args) {
		Observable.just(60, 57, 89, 90, 23,100,98)
			.filter(e -> e > 75)
			.sorted()
			.subscribe(elem -> System.out.println("Grade A with " + elem));
		
		// Suppressing Operators - filter, take,skip, distinct
		// Transforming operators - map(), cast(), delay(), delaySubscription(), scan(), sorted(), repeat()
		// Reducing operators - works with finite observables - count(), reduce(), contains(), all(), any()
		// Collection Operators - toList(), toSortedList(), toMap(), collect()
		// Error-recovery operators - onErrorReturnItem(), onErrorReturn(), onErrorResumeNext(), retry()
		// Action operators - doOnNext(), doOnError(), doOnSubscribe(), doOnComplete()
		
	}

}
