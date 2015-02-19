/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrixmultiplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author bilal
 */
public class Tests {
    
   
   public static void main(String[ ] args) throws IOException {
       
        String file_name = "test.txt";
        MatrixComputation matrixCompute = new MatrixComputation();
        try {
            ArrayList<String[][]> matricesOfString=new ArrayList<String[][]>();
            ReadFile file = new ReadFile( file_name );
            String[] aryLines = file.OpenFile( );
            int numOfLines = file.readLines();
            //System.out.println("total lines in a file : "+numOfLines);
            
            /*
            int i;
            for ( i=0; i < aryLines.length; i++ ) {
                 
                 System.out.println( aryLines[i] ) ;
             }
            System.out.println();
            */
            
          
            
            int i;
            for ( i=0; i < numOfLines; i++ ) {
                
                String[] rows = aryLines[i].split(";");
                String[] elements;
                
                System.out.println("Matrix "+(i+1));
                for (int j=0 ; j<rows.length;j++){
                    //System.out.println( rows[j] ) ;
                    elements = rows[j].split(",");
                    System.out.println() ;
                    int Matrix [][]=new int[rows.length][elements.length] ;
                    //int[][] matrix = new int[rows.length][elements.length] ;
                    
                    for(j=0 ; j<rows.length;j++){
                        
                        elements = rows[j].split(",");
                        for(int k=0 ; k<elements.length;k++){                       
                            System.out.print( elements[k]+"  " ) ;
                            Matrix[j][k]= Integer.parseInt(elements[k]);
                            //matrix[j][k]=Integer.parseInt(elements[k]);
                            
                        }
                        System.out.println();
                    }    
                    //matricesOfString[j] = rows[j].split(",");
                    matrixCompute.matrices.add(i, Matrix);
                    break;
                    
                }
                
                System.out.println("");

            }
            
            
           // String choice;
            Scanner in = new Scanner(System.in);
            while(true){
                System.out.println("press\n1: Automated testing\n2: Manual Testing\n3: Exit");
                int choice = in.nextInt();
            
                
            
                if(choice==1){
                    System.out.println("Test # 1: Matrix 1 * Matrix 2");
                    int result[][]=matrixCompute.multiplication(matrixCompute.matrices.get(0),matrixCompute.matrices.get(1));
                    
                    System.out.println();
                    
                    System.out.println("Test # 2: Matrix 1 + Matrix 2 + Matrix 3\n");
                    System.out.println("1st Step: Matrix 1 + Matrix 2");
                    int result1[][]= matrixCompute.addition(matrixCompute.matrices.get(0),matrixCompute.matrices.get(1));
                    System.out.println("2nd Step : Matrix 1 + Matrix 2 + Matrix 3");
                    matrixCompute.addition(matrixCompute.matrices.get(2),result1);
                    
                    System.out.println();
                    
                    System.out.println("Test # 3: Multiply 2 matrices and then add a 3rd one to the result\n");
                    System.out.println("1st Step: Matrix 1 * Matrix 2");
                    int result2[][] =  matrixCompute.multiplication(matrixCompute.matrices.get(0),matrixCompute.matrices.get(1));
                    System.out.println("2nd Step: Matrix 1 * Matrix 2 + Matrix 3");
                    matrixCompute.addition(matrixCompute.matrices.get(2),result2);
                
                }
                
                else if(choice==2){
                    System.out.println("Press: \n 1:Multiplication \n 2:Addition \n 3:Subtraction");
                    int manualChoice = in.nextInt();
                    if(manualChoice==1){
                        System.out.println("Matrix 1 * Matrix 2");
                        matrixCompute.multiplication(matrixCompute.matrices.get(0),matrixCompute.matrices.get(1));
                    }
                    if(manualChoice==2){
                        System.out.println("Matrix 1 + Matrix 2");
                        matrixCompute.addition(matrixCompute.matrices.get(0),matrixCompute.matrices.get(1));
                    }
                    if(manualChoice==3){
                        System.out.println("Matrix 1 - Matrix 2");
                        matrixCompute.addition(matrixCompute.matrices.get(0),matrixCompute.matrices.get(1));
                    }
                    
                    
                    
                    
                }
                else if(choice==3){
                    break;
                }
                else{
                    System.out.print("Enter Correct choice");                   
                }
                
            }
            //matrixCompute.multiplication(matrixCompute.matrices.get(0),matrixCompute.matrices.get(1));
            
            

        }
        catch ( IOException e ) {
            System.out.println( e.getMessage() );
        }
    }
}
