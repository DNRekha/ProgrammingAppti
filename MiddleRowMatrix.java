class MiddleRowMatrix {
public static void main(String arg[]){
MiddleRowMatrix  matrix=new MiddleRowMatrix();
matrix.midMatrix();
}
void midMatrix(){
for(int r=1;r<=5;r++){
	for(int c=1;c<=5;c++){
	if(r==3 ||c==3){
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