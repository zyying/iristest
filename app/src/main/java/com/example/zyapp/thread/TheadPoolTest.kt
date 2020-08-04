package com.example.zyapp.thread

import android.util.Log
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class TheadPoolTest{
    public fun test(){
        val pool:Executor = Executors.newCachedThreadPool()
        val pool1:Executor = Executors.newSingleThreadExecutor()
        val pool2:Executor = Executors.newFixedThreadPool(2)
        val pool3:Executor = Executors.newScheduledThreadPool(2)
        pool.execute(Runnable {
            Log.d("xxx","runnable execute")
        })
    }
}