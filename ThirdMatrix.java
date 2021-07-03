class ThirdMatrix {
public static void main(String arg[]){
ThirdMatrix matrix=new ThirdMatrix();
matrix.tillThirdRowMatrix();
}
void tillThirdRowMatrix(){
for(int r=1;r<=5;r++){
	for(int c=1;c<=5;c++){
	
	if((r==3 && c==3)||(r==3 && c==1)||(r==3 && c==2)||(r==2 && c==3)||(r==1 && c==3) ){
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