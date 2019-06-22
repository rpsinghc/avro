package com.example.avro.service;

public interface OrderProcessingService {

	Confirmation submitOrder(Order order) throws OrderFailure;

}
