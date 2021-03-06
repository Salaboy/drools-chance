package org.drools.chance.constraints.core.connectives.impl.product;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.drools.chance.constraints.core.connectives.IConnectiveCore;
import org.drools.chance.constraints.core.connectives.impl.LOGICCONNECTIVES;
import org.drools.chance.degree.IDegree;
import org.drools.chance.degree.interval.IntervalDegree;
import org.drools.chance.degree.simple.SimpleDegree;


public class OrTest extends TestCase {

    IConnectiveCore or = org.drools.chance.constraints.core.connectives.impl.product.Or.getInstance();

    public OrTest(String name) {
        super(name);
    }


    public void tearDown() throws Exception {
        super.tearDown();
    }


    public void testGetInstance() throws Exception {
        Or or2 = org.drools.chance.constraints.core.connectives.impl.product.Or.getInstance();

        assertNotNull(or2);
        assertEquals(or,or2);
    }

    public void testType() throws Exception {
        assertEquals(LOGICCONNECTIVES.OR,or.getType());
    }





    public void testEvalBinarySimple() throws Exception {
        IDegree s1 = new SimpleDegree(0.2);
        IDegree s2 = new SimpleDegree(0.6);

        IDegree s0 = or.eval(s1, s2);

        assertNotNull(s0);
        assertTrue(s0 instanceof SimpleDegree);
        assertEquals(new SimpleDegree(0.8-0.12),s0);
    }


    public void testEvalBinaryInterval() throws Exception {
        IDegree s1 = new IntervalDegree(0.3,0.7);
        IDegree s2 = new IntervalDegree(0.4, 0.5);

        IDegree s0 = or.eval(s1,s2);

        assertNotNull(s0);
        assertTrue(s0 instanceof IntervalDegree);
        assertEquals(new IntervalDegree(0.58,0.85),s0);
    }



    public void testEvalUnary() throws Exception {
        IDegree s1 = new SimpleDegree(0.3);
        IDegree s0 = or.eval(s1);

        assertNotNull(s0);
        assertEquals(s0.getClass(),s1.getClass());
        assertEquals(s0,s1);
    }



    public void testEvalNarySimple() throws Exception {
        IDegree s1 = new SimpleDegree(0.2);
        IDegree s2 = new SimpleDegree(0.6);
        IDegree s3 = new SimpleDegree(0.1);

        IDegree s0 = or.eval(s1, s2, s3);

        assertNotNull(s0);
        assertTrue(s0 instanceof SimpleDegree);
        assertEquals(new SimpleDegree(0.712),s0);
    }




    public void testEvalNaryInterval() throws Exception {
        IDegree s1 = new IntervalDegree(0.3,0.7);
        IDegree s2 = new IntervalDegree(0.4, 0.5);
        IDegree s3 = new IntervalDegree(0.1, 0.9);

        IDegree s0 = or.eval(s1,s2,s3);

        assertNotNull(s0);
        assertTrue(s0 instanceof IntervalDegree);
        assertEquals(new IntervalDegree(0.622,0.985),s0);
    }



    public void testNeutralInterval() throws Exception {
        IDegree s1 = new IntervalDegree(0.3,0.7);
        IDegree s2 = IntervalDegree.FALSE;

        IDegree s0 = or.eval(s1,s2);

        assertNotNull(s0);
        assertTrue(s0 instanceof IntervalDegree);
        assertEquals(s0,s1);
    }

    public void testNeutralSimple() throws Exception {
        IDegree s1 = new SimpleDegree(0.4);
        IDegree s2 = SimpleDegree.FALSE;

        IDegree s0 = or.eval(s1,s2);

        assertNotNull(s0);
        assertTrue(s0 instanceof SimpleDegree);
        assertEquals(s0,s1);
    }



    public void testIsUnary() throws Exception {
        assertFalse(or.isUnary());
    }


    public void testIsBinary() throws Exception {
        assertTrue(or.isBinary());
    }


    public void testIsNary() throws Exception {
        assertTrue(or.isNary());
    }



    public static Test suite() {
        return new TestSuite(OrTest.class);
    }
}
