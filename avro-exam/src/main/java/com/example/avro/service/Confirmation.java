package com.example.avro.service;

public interface Confirmation {

	static Confirmation newBuilder() {
		// TODO Auto-generated method stub
		return null;
	}

	Confirmation setCustomerId(int customerId);

	Confirmation setEstimatedCompletion(long estimatedCompletion);
	
	Confirmation setOrderId(int orderId) ;
	
	Confirmation build();

	int getOrderId();

	int getEstimatedCompletion();


}
