package entityTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entity.Task;
import entity.TaskManager;
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
public class NewEmptyJUnitTest {
    
    TaskManager tM;
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tM = new TaskManager();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void verificaCrearTarea(){
        tM.crearTarea("tarea 1", "Comprobar tareas");
        assertSame("tarea 1", tM.getTarea(0).getNombre());
    }

}
