Anonymous array:

    Syntax:
// anonymous int arrays 

    new char[] {'a', 'b', 'c'); 

    new int[] { 99, 98, 97, 96};  
                      
    new int[][] { {10, 20}, {30, 40, 50} };

     String[] {"Print", "Hello", "World"}; 


1) An array without name is known as anonymous array in java. 
2) As the array do not have any name so it can be used only once. 
3) Anonymous array is passed as an argument of method. 
4) Anonymous array is created and initialized in the same line.


                 
CODE:
                   
             class Array
              {
               static void print(int a[])
              {
               for(int i=0;i<a.length;++i)
               System.out.print(a[i]+" ");
              }
 
               static void print(int a[][])
              {
               for(int i=0;i<a.length;++i)
              {
               for(int j=0;j<a[i].length;++j)
               System.out.print(a[i][j]+" ");
 
               System.out.println("");
              }
              }
  
               public static void main(String...s)
             {
  
               print(new int[]{10,20,30,40});
 
              System.out.println("n");
  
 
              print(new int[][]{{10,20},{30,40},{50,60}});  
             }
             }

 
