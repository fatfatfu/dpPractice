package org.myProj.dpPractice;

import org.myProj.dpPractice.domain.OperationFather;
import org.myProj.dpPractice.domain.SimpleOperation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        OperationFather op = SimpleOperation.getInstance("+");
        op.setNumA(1);
        op.setNumB(2);
        System.out.println(op.getResult());
        
    }
}
