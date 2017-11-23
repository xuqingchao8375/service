package com.service.service.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestService {

    ServiceDelegate serviceDelegate = new ServiceDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello,xuqingchao,welcome to ServiceStage"; // You should put the expect String type value here.

        String returnValue = serviceDelegate.helloworld("hello,xuqingchao");

        assertEquals(expactReturnValue, returnValue);
    }
    
    @Test
    public void testSayHi(){

        String expactReturnValue = "hi,xuqingchao,welcome to ServiceStage~"; // You should put the expect String type value here.

        String returnValue = serviceDelegate.sayHi("hi,xuqingchao~");

        assertEquals(expactReturnValue, returnValue);
    }

}
