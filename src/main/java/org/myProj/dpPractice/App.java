package org.myProj.dpPractice;

import org.myProj.dpPractice.StrategyDesignPattern.StrategyOperation;
import org.myProj.dpPractice.domain.OperationAddV2;
import org.myProj.dpPractice.domain.OperationFather;
import org.myProj.dpPractice.domain.OperationSubV2;
import org.myProj.dpPractice.domain.SimpleOperation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "SIMPLE FACTORY:" );
        simpleFactory();
        System.out.println( "Stregy Pattern:" );
        strategyPattern();
    }
    
    public static void simpleFactory(){
        OperationFather op = SimpleOperation.getInstance("+");
        op.setNumA(1);
        op.setNumB(2);
        System.out.println(op.getResult());
    }
    
    public static void strategyPattern(){
    	StrategyOperation strategyOperation = new StrategyOperation(new OperationAddV2());
    	System.out.println("execute straegy(ADD) : "+strategyOperation.execStrategy(10, 5));
    	strategyOperation = new StrategyOperation(new OperationSubV2());
    	System.out.println("execute straegy(SUB) : "+strategyOperation.execStrategy(10, 5));
    	
    }
}
