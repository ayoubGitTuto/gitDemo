package com.ant.training;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;


public class HelloWorldTest {

    @Test
    public void myContains(){

        HelloWorld helloWorld = new HelloWorld();
        Boolean bool = helloWorld.myContains(Arrays.asList("A","B" ,"C","D"),Arrays.asList("A","D"));
        assertEquals(true, bool);

    }
}
