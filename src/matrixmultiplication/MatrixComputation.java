/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrixmultiplication;

/**
 *
 * @author bilal
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class MatrixComputation {
    
    
    
    ArrayList<int[][]> matrices ; //Arraylist of Matrices
    
    //Default Constructor
    public MatrixComputation(){       
        matrices = new ArrayList<int[][]>();
     }
        
 
    //Additon Operation
    public int[][] addition(int matrix1[][],int matrix2[][]){

        System.out.println("Addition:");
        //int result[][]=matrix1;
        int [][]result=new int[matrix1.length][matrix1[0].length];
        if(matrix1.length == matrix2.length){
            
            for(int row =0 ; row < matrix1.length; row++){
                
                for(int column =0; column<matrix1[row].length; column++){  
                    result[row][column]=matrix1[row][column]+matrix2[row][column];
                    System.out.print(result[row][column]+" ");
                }
                
                System.out.println();
            }
        }
        else {
            System.out.println("wrong format for addition enter same dimensions for both matrices");
        }
        return result;
    }
    
   //Subtraction module 
   
    public int[][] subtraction(int matrix1[][],int matrix2[][]){
        
        System.out.println("Subtraction:");
        int [][]result=new int[matrix1.length][matrix1[0].length];
        if(matrix1.length == matrix2.length){
            for(int row =0 ; row < matrix1.length; row++){
                for(int column =0; column<matrix1[row].length; column++){
                    result[row][column]=matrix1[row][column]-matrix2[row][column];
                    System.out.print(result[row][column]+" ");
                                     
                }
                System.out.println("");
            }
        }
        else {
            System.out.println("wrong format for subtraction enter same dimensions for both matrices");
        }
        return result;
    } 
    
    public int[][] multiplication(int matrix1[][],int matrix2[][]){
        
        
        int result[][] = new int[matrix1.length][matrix2[0].length];
        if(matrix1[0].length==matrix2.length){            
            int c,d,k;
            int sum=0;
            
            for ( c = 0 ; c < matrix1.length ; c++ ){
                for ( d = 0 ; d < matrix2[0].length ; d++ ){   
                    for ( k = 0 ; k < matrix2.length ; k++ ){
                        sum = sum + matrix1[c][k]*matrix2[k][d];
                    }
                    result[c][d] = sum;
                    sum = 0;
                }
            }
            System.out.println("Multiplication:");
            for ( c = 0 ; c < result.length ; c++ ){
                for ( d = 0 ; d < result[0].length ; d++ )
                    System.out.print(result[c][d]+" ");
 
                System.out.print("\n");
            }
            
        }
        else{
            System.out.println("Columns of 1st matrix should be equal to rows of 2nd matrix");                        
        }
        return result;
        
   
    }
}
