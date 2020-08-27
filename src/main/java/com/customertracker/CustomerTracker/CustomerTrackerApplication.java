package com.customertracker.CustomerTracker;

import com.customertracker.CustomerTracker.Models.Account;
import com.customertracker.CustomerTracker.Models.Customer;
import com.customertracker.CustomerTracker.Services.AccountService;
import com.customertracker.CustomerTracker.Services.CustomerService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


@SpringBootApplication
public class CustomerTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerTrackerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(CustomerService customerService, AccountService accountService) {
		return args -> {
			ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
							;
			TypeReference<List<Customer>> typeReferenceCustomer = new TypeReference<List<Customer>>() {
			};
			TypeReference<List<Account>> typeReferenceAccount = new TypeReference<List<Account>>() {
			};
			InputStream inputStreamCustomer = TypeReference.class.getResourceAsStream("/json/CustomerExport.json");
			InputStream inputStreamAccount= TypeReference.class.getResourceAsStream("/json/AccountExport.json");

			try {
				List<Customer> customers = mapper.readValue(inputStreamCustomer, typeReferenceCustomer);
				customerService.save(customers);
				System.out.println("Customers Saved!");

			} catch (IOException e){
				System.out.println("Unable to save customers: " + e.getMessage());
			}

			try {
				List<Account> accounts = mapper.readValue(inputStreamAccount, typeReferenceAccount);
				accountService.save(accounts);
				System.out.println("Accounts Saved!");

			} catch (IOException e){
				System.out.println("Unable to save accounts: " + e.getMessage());
			}

		};
	}

}
