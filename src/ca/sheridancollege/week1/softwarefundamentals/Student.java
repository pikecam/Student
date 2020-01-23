/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author sidhu376 - date is 1/23/2020
 */
public class Student {
    
    private String name, program;
    private int id;
    private String status;
    
    /**
     * Get the value of ID
     * 
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Set the Value of ID
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the value Program
     * 
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * Set the value Program
     * 
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }

}
 
   
