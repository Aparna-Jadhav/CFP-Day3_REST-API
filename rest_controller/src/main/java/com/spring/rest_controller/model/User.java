package com.spring.rest_controller.model;

/**
 * this is the user model class
 */
public class User 
{
    /**
     * user properties
     */
    public String firstName;
    public String lastName;

    /**
     * getter setter methods
     * @return
     */
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
