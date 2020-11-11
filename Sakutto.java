import java.util.*;
public class Sakutto{
	public static void main(String[] args){
		char[] hello={'H','E','L','L','O'};
		for(int i=0;i<hello.length/2;i++){
			char temp = 0;
			temp=hello[i];
			hello[i]=hello[hello.length-1-i];
			hello[hello.length-1-i]=temp;
			//System.out.print(hello[hello.length-i-1]);
		}
		System.out.println(Arrays.toString(hello));
	}
}
