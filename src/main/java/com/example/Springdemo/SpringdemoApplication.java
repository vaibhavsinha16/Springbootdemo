package com.example.Springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new Bubblesort());
		int result = binarySearch.BinarySearch(new ArrayList<>(Arrays.asList(1,2,3,4)), 3);
		System.out.println("result is"+ result);

//		SpringApplication.run(SpringdemoApplication.class, args);
	}

}
