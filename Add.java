import java.util.Scanner;
public class Add
{
public static void main(String[] args)
{
int m, n; //Declare matrix size
Scanner scan = new Scanner(System.in);
System.out.print("Enter the number of rows in the matrix:");
m = scan.nextInt(); //Initialize first matrix size
System.out.print("Enter the number of columns in the matrix:");
n = scan.nextInt(); //Initialize second matrix size
int a[][] = new int[m][n]; //Declare first matrix
int b[][] = new int[m][n]; //Declare second matrix
int c[][] = new int[m][n]; //Declare third matrix
//Initialize the first matrix
System.out.println("Enter all the elements of first matrix:");
for (int i = 0; i < m; i++)
{
for (int j = 0; j < n; j++)
{
a[i][j] = scan.nextInt();
}
}
System.out.println("");
  //Initialize the second matrix
System.out.println("Enter all the elements of second matrix:");
for (int i = 0; i < m; i++)
{
for (int j = 0; j < n; j++)
{
b[i][j] = scan.nextInt();
}
}

//Loop to add matrix elements
for (int i = 0; i < m; i++)
{
for (int j = 0; j < n; j++)
{
c[i][j] = a[i][j] + b[i][j];
}
}
//Print the resultant matrix
System.out.println("Matrix after addition:");
for (int i = 0; i < m; i++)
{
for (int j = 0; j < n; j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println("");
}
scan.close();
}
}
