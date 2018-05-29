import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class KmasPequenios {
	
	private int cantEnteros;
	private int cantPequenios;
	private TreeSet<Integer> enteros = new TreeSet<Integer>();

	String t="enterosPequenios.in";
	
	public KmasPequenios(String t) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(t));
		this.cantEnteros=sc.nextInt();
		this.cantPequenios=sc.nextInt();
		
		for(int i=0;i<cantEnteros;i++)
			this.enteros.add(sc.nextInt());		

		sc.close();

	}
	
	public void resolver(String t) throws IOException{
		PrintWriter s = new PrintWriter(new FileWriter(t)); 
		s.println(cantPequenios);
		for(int i=0;i<cantPequenios;i++){
			s.println(enteros.first());	
			enteros.remove(enteros.first());
		}
		s.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		KmasPequenios kmp = new KmasPequenios("enterosPequenios.in");
		kmp.resolver("pequenios.out");
			
			
			

			
			
			
	}
	
}
