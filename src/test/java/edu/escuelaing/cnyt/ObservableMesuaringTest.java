package edu.escuelaing.cnyt;

import java.io.IOException;

import edu.escuelaing.cnyt.MathComplexNumber.ComplexNumber;
import edu.escuelaing.cnyt.MathComplexNumber.MathComplex;
import edu.escuelaing.cnyt.exceptions.MathComplexException;
import edu.escuelaing.cnyt.quantum.QuantumExperiments;
import edu.escuelaing.cnyt.quantum.QuantumSystem;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ObservableMesuaringTest  extends TestCase {
	private final QuantumExperiments quantumExperiments = new QuantumExperiments();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ObservableMesuaringTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ObservableMesuaringTest.class);
    }
    
    public void testExercise431() throws IOException {
    	System.out.println("Exercise 4.3.1");
    	ComplexNumber[][] m1 = {
                {new ComplexNumber(0, 0), new ComplexNumber(1, 0)},
                {new ComplexNumber(1, 0), new ComplexNumber(0, 0)}
            };
    	ComplexNumber[] eigenVectors =QuantumSystem.valoresPropiosDeUnObservable(m1);
    	
    }
    
    public void testExercise441() throws IOException, MathComplexException {
    	System.out.println("Exercise 4.4.1");
    	ComplexNumber[][] m1 = {
                {new ComplexNumber(0, 0), new ComplexNumber(1, 0)},
                {new ComplexNumber(1, 0), new ComplexNumber(0, 0)}
            };
    	ComplexNumber[][] m2 = {
                {new ComplexNumber(Math.sqrt(2)/2, 0), new ComplexNumber(Math.sqrt(2)/2, 0)},
                {new ComplexNumber(Math.sqrt(2)/2, 0), new ComplexNumber(-Math.sqrt(2)/2, 0)}
            };
    	boolean m1Unitary=MathComplex.esUnitaria(m1);
    	boolean m2Unitary=MathComplex.esUnitaria(m2);
    	System.out.println("matrix 1 is unitary: "+ m1Unitary + " and matrix 2 : "+ m2Unitary);
    	ComplexNumber [][] m1m2= MathComplex.multiplicarMatrices(m1, m2);
    	boolean resultUnitary= MathComplex.esUnitaria(m1m2);
    	System.out.println("The product is unitary: "+ resultUnitary);
    	
    }
    
    public void testExercise442() throws IOException, MathComplexException {
    	System.out.println("Exercise 4.4.2");
    	ComplexNumber[][] matrizAdyacencia = {
                {new ComplexNumber(0, 0), new ComplexNumber(1.0 / Math.sqrt(2), 0), new ComplexNumber(1.0 / Math.sqrt(2), 0), new ComplexNumber(0,0)},
                {new ComplexNumber(0, 1.0 / Math.sqrt(2)), new ComplexNumber(0,0), new ComplexNumber(0, 0), new ComplexNumber(1.0 / Math.sqrt(2),0)},
                {new ComplexNumber(1.0 / Math.sqrt(2), 0), new ComplexNumber(0, 0), new ComplexNumber(0, 0), new ComplexNumber(0, 1.0 / Math.sqrt(2))},
                {new ComplexNumber(0, 0), new ComplexNumber(1.0 / Math.sqrt(2), 0), new ComplexNumber(-1.0 / Math.sqrt(2), 0), new ComplexNumber(0,0)}
    		};
            ComplexNumber[] estadoInicial = {
                new ComplexNumber(1, 0),
                new ComplexNumber(0,0),
                new ComplexNumber(0, 0),
                new ComplexNumber(0, 0)
            };
            ComplexNumber[] estadoFinalResult1 = quantumExperiments.experimentoConFotonesComplejos(matrizAdyacencia, estadoInicial, 3);
            for(int i=0; i<estadoFinalResult1.length;i++) {
            	System.out.println(estadoFinalResult1[i].prettyPrintFormaNormalNumeroComplejo());
            }
            Double probability =QuantumSystem.probabilidadEnUnaPosicionParticular(estadoFinalResult1.length, estadoFinalResult1,3);
            System.out.println("The probability is: "+probability);
    	}
    
    

}
