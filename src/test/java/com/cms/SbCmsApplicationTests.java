/*package com.cms;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cms.bean.Customer;
import com.cms.controller.CMSController;
import com.cms.dao.CustomerDAO;

@SpringBootTest
class SbCmsApplicationTests {
    @Autowired

    CMSController controller;
    CustomerDAO dao;
    Customer customer;
     String insert;
        String update;
        String delete;
        String result;
        String result1;
    List<Customer> list = new ArrayList<Customer>();
    List<Customer> list1 = new ArrayList<Customer>();
    Customer c = new Customer(11, "Jeyandhan","jey@gmail.com", "98765862", "Rajapalayam");
    Customer c1 = new Customer(12, "Sara","sara@gmail.com", "98645862", "Chennai");
    Customer c2;
    Customer c3;

    @Test
    @Order(1)
    void contextLoads() {

    }

    @Test
    @Order(2)
    public void testPerformInsert() {
        insert = "Inserted";
        result = controller.performInsert(c);
        assertEquals(insert, result);
    }

    @Test
    @Order(3)
    public void testPerformUpdate() {
        update = "Updated";
        result = controller.PerformUpdate(c1);
        assertEquals(update, result);
    }
    @Test
    @Order(4)
    public void testPerformDelete() {
        delete="Deleted";
        result=controller.performDelete(11);
        result1=controller.performDelete(12);
        assertEquals(delete,result);
    }
    
    @Test
    @Order(5)
    public void testGetAllCustomerDetails() {
        list=controller.viewAllCustomer();
        c2 = new Customer(122, "Dom", "Dom@gmail.com", "98763345", "madurai");
        c3 = new Customer(123,"Mahesh", "mahesh@gmail.com", "98764345", "sivakasi");
        list1.add(c2);
        list1.add(c3);
        list.equals(list1);
    }

}*/