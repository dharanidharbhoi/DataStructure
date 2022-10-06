package com.dharani.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class MainExecutor {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
   
		
		Future<String> future =   executorService.submit(()->"hello Executor");
		
		System.out.println(future.get());
		executorService.shutdown();
		
		CompletableFuture<String> compl = CompletableFuture.supplyAsync(() -> "hello Future");
		
		CompletableFuture<String> compl1 = compl.thenApply((s) ->  s + "hello Future");
		
		System.out.println(compl1.get());

		

		
	}

}
