package com.fibers.demo.rxjava;

import io.reactivex.Observable;

public class Demo {
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.create(emitter -> {
            emitter.onNext(1);
            emitter.onNext(2);
            emitter.onNext(3);
            emitter.onComplete();
        });
        observable.subscribe(System.out::println);

    }
}
