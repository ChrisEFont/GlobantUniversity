package entityTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entity.TemperatureConverter;
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
public class TemperatureConverterTest {
    
    public TemperatureConverterTest() {
    }
    
    TemperatureConverter tC;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tC = new TemperatureConverter();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void celciusToFarenheitTest(){
        assertEquals(68,tC.celciusToFarenheit(20), 0); 
    }
    
    @Test
    public void farenheitToCelciusTest(){
        assertEquals(20,tC.farenheitToCelcius(68), 0);
    }


}
