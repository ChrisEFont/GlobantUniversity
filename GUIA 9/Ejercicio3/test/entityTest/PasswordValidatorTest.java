package entityTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entity.PasswordValidator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class PasswordValidatorTest {
    
    PasswordValidator pV;
    
    public PasswordValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pV = new PasswordValidator();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void longValidatorT(){
        assertTrue(pV.longValidation("12345678"));
    }
    
    @Test
    public void longValidatorF(){
        assertFalse(pV.longValidation("1234"));
    }
    
    @Test
    public void numValidatorTestT(){
        assertTrue(pV.numValidation("casa1"));
    }
    
    @Test
    public void numValidatorTestF(){
        assertFalse(pV.numValidation("casa"));
    }
    
    @Test
    public void specialCharValidationT(){
        assertTrue(pV.specialCharValidation("@"));
    }
    
    @Test
    public void specialCharValidationF() {
        assertFalse(pV.specialCharValidation("hola"));
    }

}
