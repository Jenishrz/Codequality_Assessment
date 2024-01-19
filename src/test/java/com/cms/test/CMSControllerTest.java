/*package com.cms.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cms.bean.Customer;
import com.cms.dao.CustomerDAO;

public class CMSControllerTest {
	@Autowired
    CustomerDAO dao;

    private Customer customer;

    @Before
    public void setUp() throws Exception {
        // Code executed before each test method
        customer = new Customer();
        customer.setId(125);
        customer.setName("Raj");
        customer.setEmail("raj@gmail.com");
        customer.setContact("7896543210");
        customer.setLocation("TVL");
    }

    @Test
    public void testPerformInsert() {
        // Test if the customer object is saved to the database
        dao.save(customer);
        assertNotNull(customer.getId());
    }

    @Test
    public void testGetAll() {
        // Test if the getAll() method returns a list of customer
        List<Customer> customers = (List<Customer>) dao.findAll();
        assertNotNull(customers);
    }

    @Test
    public void testPerformUpdate() {
        // Test if the customer object is updated in the database
        dao.save(customer);
        customer.setLocation("TVL");
        dao.save(customer);
        Customer updatedCustomer = dao.findById(customer.getId()).orElse(null);
        assertEquals(updatedCustomer.getLocation(), "TVL");
    }

    @Test
    public void testPerformDelete() {
        // Test if the customer object is deleted from the database
        dao.save(customer);
        dao.deleteById(customer.getId());
        Customer deletedCustomer = dao.findById(customer.getId()).orElse(null);
        assertEquals(deletedCustomer, null);
    }
}*/