package firstJavaProgram;

public class MultiplicationTable {

		void print() {
		print(6);
}

void print(int table) {
		print(table, 1, 10);

}
void print(int table, int from, int to) {
for(int x=from; x<=to; x++) {
	System.out.printf("%d * %d = %d",table,x,table*x).println();
}

}
}



