package org.myProj.dpPractice;

import org.myProj.dpPractice.DecoratorDesignPattern.Circle;
import org.myProj.dpPractice.DecoratorDesignPattern.ColorShapeDecorator;
import org.myProj.dpPractice.DecoratorDesignPattern.Shape;
import org.myProj.dpPractice.FactoryMethodDesignPattern.Ifactory;
import org.myProj.dpPractice.FactoryMethodDesignPattern.OperationFactory;
import org.myProj.dpPractice.ProxyDesignPattern.copy.FtpFile;
import org.myProj.dpPractice.ProxyDesignPattern.copy.ProxyFtpFile;
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
        System.out.println( "Decorator Pattern:" );
        decoratorPattern();
        System.out.println( "Proxy Pattern:" );
        proxyPattern();
        System.out.println( "Factory Method Pattern:" );
        proxyPattern();
        
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
    
    public static void decoratorPattern(){
    	Shape circle = new Circle();
    	System.out.println("normal circle :");
    	circle.draw();
    	Shape coloredCircle = new ColorShapeDecorator(new Circle());
    	System.out.println("circle with color:");
    	coloredCircle.draw();
    }
    
    public static void proxyPattern(){
    	FtpFile file = new ProxyFtpFile("test.txt");
    	file.unzip();
    	System.out.println("....");
    	file.unzip();
    }
    
    public static void factoryMethodPattern(){
    	OperationFactory factory = new OperationFactory();
    	Ifactory f1 = factory.getOperation("ADD");
    	f1.createOperaion();
       	Ifactory f2 = factory.getOperation("SUB");
       	f2.createOperaion();
    }
}
