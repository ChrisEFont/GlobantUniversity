/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entity.DiscountCalculator;
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
public class DicountCalculatorTest {
    
    DiscountCalculator dc;
    
    
    public DicountCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dc = new DiscountCalculator(50f);
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void verificaDescuento(){               
        assertEquals(70, dc.discount(100, 30), 0);
    }
    
    @Test
    public void verificaDescuentoMaximo(){       
        assertEquals(50, dc.maxDiscount(100), 0);
    }

}
