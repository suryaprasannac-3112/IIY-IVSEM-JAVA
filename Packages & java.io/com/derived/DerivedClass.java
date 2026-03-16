package com.derived;

import com.base.BaseClass;

public class DerivedClass extends BaseClass {
    public void accessProtectedMembers() {
        // Accessing protected member and method from superclass in different package
        System.out.println("Accessing protected variable: " + protectedMessage);
        protectedMethod();
    }
}
