public class 2d{

     public static void main(String []args){
         int [][] mat = new int [4][3];
            for (int row = 0; row < mat.length; row++) {
                 for (int col = 0; col < mat[0].length; col++) { 
                if(row < col){
                mat[row][col] = 1; 
                }
                else if (row == col){
                mat[row][col] = 2; 
                }
                else{
                mat[row][col] = 3; } 
                
            }
            }
            System.out.println(mat.length+"\n");
            System.out.println(mat[0].length+"\n");
            for (int row =0; row < 4; row++) {
                 for (int col = 0; col < 3; col++){
                     System.out.println(mat[row][col]);
     }
}
}
}
