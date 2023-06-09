package org.example.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConductorTest {

    private Conductor conductor;

    @Before
    public void setUp(){
        conductor = new Conductor("Cristian", "Gadea", true);
    }

    @Test
    public void testGetNombreDelConductor(){
        Assert.assertEquals("Cristian", conductor.getNombre());
    }

    @Test
    public void testSetNuevoNombreAUnConductor(){
        conductor.setNombre("Carlos");
        Assert.assertEquals("Carlos", conductor.getNombre());
    }

    @Test
    public void testQuePruebaQueUnConductorEsSeguro() {
        Boolean conductorSeguro = conductor.esSeguro();
        Assert.assertTrue(conductorSeguro);
    }
}
