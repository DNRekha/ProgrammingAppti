class LastThreeMatrix {
public static void main(String arg[]){
LastThreeMatrix matrix=new LastThreeMatrix();
matrix.lastMatrix();
}
void lastMatrix(){
for(int r=1;r<=5;r++){
	for(int c=1;c<=5;c++){
	if((r>=3 && c>=3)){
	System.out.print(r+""+c+"\t");
	}
	else{
	System.out.println("\t");
	}
}
	System.out.println();
}
}


}