package com.service.service.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestService {

    ServiceDelegate serviceDelegate = new ServiceDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = serviceDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }
    
    @Test
    public void testsayHi(){

        String expactReturnValue = "hi"; // You should put the expect String type value here.

        String returnValue = serviceDelegate.sayHi("hi");

        assertEquals(expactReturnValue, returnValue);
    }

}
