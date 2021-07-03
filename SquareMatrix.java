class SquareMatrix {
public static void main(String arg[]){
SquareMatrix matrix=new SquareMatrix();
matrix.sqMatrix();
}
void sqMatrix(){
for(int r=1;r<=5;r++){
	for(int c=1;c<=5;c++){
	if(r==1||r==5||c==1||c==5){
	System.out.print(r+""+c+"\t");
	}
	else{
	System.out.print("\t");
	}
}
	System.out.println();
}
}


}