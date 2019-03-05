package com.ant.training;

import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.collections4.CollectionUtils;
public class HelloWorld {



    public static Boolean myContains(Collection col1 , Collection col2){

        return CollectionUtils.containsAll(col1,col2);
    }
    public static void main(String[] args){

        Collection col1 = Arrays.asList("A","B" ,"C","D");
        Collection col2 = Arrays.asList("A","D");

        System.out.println(myContains(col1,col2));
        System.out.println(" Hellow world ant training ");


    }
}
