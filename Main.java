

public class Main {

    public static void main(String[] args) {
       

    }
    
    //an image represented by an N*N matrix, where each pixel is 4 bytes
    //rotate the image by 90 degrees
    //draw a matrix, rotate it manually, find the relationship between i,j (it is easier using the outside layer)
    
    public static void rotate(int[][] matrix){
    	int n=matrix[0].length;
    	for(int i=0;i<n/2;i++){//from outside layers to insides
    		for(int j=i;j<n-1-i;j++){
    			int temp=matrix[i][j];
    			matrix[i][j]=matrix[n-1-j][i];
    			matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
    			matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
    			matrix[j][n-1-i]=temp;
    		}
    	}


    }



}