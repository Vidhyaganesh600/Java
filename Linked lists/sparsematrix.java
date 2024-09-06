import java.util.*;
public class sparsematrix{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("2D array format");
        System.out.println("Enter num of rows");
        int rw=read.nextInt();
        System.out.println("Enter num of cols");
        int cl=read.nextInt();
        int sparmat[][]=new int[rw][cl];

        System.out.println("Enter the values of matrix:");
        for(int row=0; row<rw; row++){
            for(int column=0; column<cl; column++){
                sparmat[row][column]=read.nextInt();
            }
        }

        int size=0;
        for(int row=0; row<rw; row++){
            for(int column=0; column<cl; column++){
                if(sparmat[row][column]!=0)
                    size++;
            }
        }

        int resultmat[][]=new int[3][size];

        int k=0;
        for(int row=0; row<rw; row++){
            for(int column=0; column<cl; column++){
                if(sparmat[row][column]!=0){
                    resultmat[0][k]=row;
                    resultmat[1][k]=column;
                    resultmat[2][k]=sparmat[row][column];
                    k++;
                    }    
            }
        }

        System.out.println("Triplet Representation");
        for(int row=0; row<3; row++){
            if(row==0){System.out.println("Row:");}
            if(row==1){System.out.println("Column:");}
            if(row==2){System.out.println("Value:");}
            for(int column=0; column<size; column++){
                System.out.println();
            }
        }
        read.close();
    }
}
