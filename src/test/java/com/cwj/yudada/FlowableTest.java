package com.cwj.yudada;

import io.reactivex.Flowable;

import java.util.concurrent.TimeUnit;

public class FlowableTest {
    public static void main(String[] args) {
        Flowable<Long> flowable = Flowable.interval(1, TimeUnit.SECONDS);
        flowable.subscribe(System.out::println);
    }
}
