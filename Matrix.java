class Matrix {
public static void main(String arg[]){
Matrix matrix=new Matrix();
matrix.printMatrix();
}
void printMatrix(){
for(int r=1;r<=5;r++){
	for(int c=1;c<=5;c++){
	System.out.print(r+""+c+"\t");
}
	System.out.println();
}
}


}