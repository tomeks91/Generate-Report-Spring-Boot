package com.example.demo.interactor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialDataGateway extends CrudRepository<Finance, Long> {
}
