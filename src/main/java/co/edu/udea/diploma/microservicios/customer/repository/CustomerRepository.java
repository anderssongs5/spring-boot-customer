package co.edu.udea.diploma.microservicios.customer.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import co.edu.udea.diploma.microservicios.customer.model.Customer;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, String> {

}
