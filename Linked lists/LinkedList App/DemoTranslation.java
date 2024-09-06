import java.util.*;
public class DemoTranslation {
    //public static n;
    public static void convert(float[][] a, int n)
    {
        float ratio;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j!=i)
                {
                    ratio=a[j][i]/a[i][i];
                    for(int k=0;k<n+1;k++)
                    {
                        a[j][k]=a[j][k]-ratio*a[i][k];
                    }
                    System.out.println("INtermeddiate");
                    for(int x=0;x<n;x++)
                    {
                        for(int y=0; y<n+1;y++)
                        {
                            System.out.printf("%f",a[x][y]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void print(float[][] a, int n)
    {
        System.out.println("values are");
        for(int i=0;i<n;i++)
        {
            System.out.printf("Value of variable %d=%f",i,a[i][n]/a[i][i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int i,j,k,x,y;
        //float ratio;
        System.out.println("Enter number of unknowns"); 
        int n=sc.nextInt();
        System.out.println("enter the values");
        float[][] a=new float[n][n+1];
        for(int i2=0;i2<n;i2++)
        {
            for(int j2=0;j2<n+1;j2++)
            {
                a[i2][j2]=sc.nextFloat();
            }
        }
        convert(a,n);
        print(a,n);
        sc.close();
    }
    
}

