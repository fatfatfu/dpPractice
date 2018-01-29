package org.myProj.dpPractice.dpPractice;

import org.myProj.dpPractice.StrategyDesignPattern.StrategyOperation;
import org.myProj.dpPractice.domain.OperationAddV2;
import org.myProj.dpPractice.domain.OperationFather;
import org.myProj.dpPractice.domain.OperationSubV2;
import org.myProj.dpPractice.domain.SimpleOperation;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        OperationFather op = SimpleOperation.getInstance("+");
        op.setNumA(1);
        op.setNumB(2);
        assertEquals(op.getResult(), 3, 0);
//        assertTrue( true );
    }
    
    public void testApp2()
    {
    	StrategyOperation strategyOperation = new StrategyOperation(new OperationAddV2());
    	assertEquals(strategyOperation.execStrategy(10, 5), 15, 0);
    	strategyOperation = new StrategyOperation(new OperationSubV2());
     	assertEquals(strategyOperation.execStrategy(10, 5), 5, 0);
    }
    
}
