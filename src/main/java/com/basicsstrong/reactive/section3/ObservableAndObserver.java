package com.basicsstrong.reactive.section3;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate;

public class ObservableAndObserver {
	
	public static void main(String[] args) {
		Observable<Integer> source = new ObservableCreate<Integer>(new ObservableOnSubscribe<Integer>() {

			public void subscribe(@NonNull ObservableEmitter<Integer> emitter) throws Throwable {
				// TODO Auto-generated method stub
				try {
				emitter.onNext(10);
				emitter.onNext(11);
				emitter.onComplete();
				} catch (Throwable t) {
					// TODO: handle exception
					emitter.onError(t);
				}
			}
		});
		
		Observer<Integer> observer = new Observer<Integer>() {

			@Override
			public void onSubscribe(@NonNull Disposable d) {
				// TODO Auto-generated method stub
				System.out.println("subscribed");
			}

			@Override
			public void onNext(@NonNull Integer t) {
				// TODO Auto-generated method stub
				System.out.println("On next " + t);
			}

			@Override
			public void onError(@NonNull Throwable e) {
				// TODO Auto-generated method stub
				e.printStackTrace();
			}

			@Override
			public void onComplete() {
				// TODO Auto-generated method stub
				System.out.println("Completed");
			}
		};
		
		source.subscribe(observer);
		
	}

}
