package mktpackage1;

import java.util.Scanner;
class G{
	G(){
		System.out.println("G Const");
	}
	G(int a){
		System.out.println(a);
	}
}
public class F {
	public static void main(String[] args) {
		G g1 = new G();
		G g2 = new G(77);
	}
}