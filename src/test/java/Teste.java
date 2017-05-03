/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.dojo.happynumbers.HappyNumbers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GustavoSantos
 */
public class Teste {
    
    public Teste() {
    }
    
    HappyNumbers hn = new HappyNumbers();
    
    @Test
    
    public void teste(int numero){
        assertEquals("feliz",hn.consultaNumero(numero));
    }
}
