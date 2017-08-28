import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class generadorPequenios {

	public static void main(String[] args) throws IOException{
		
			PrintWriter s = new PrintWriter(new FileWriter("enterosPequenios.in")); 
			s.println(1000000+" "+100);
			for(int i=0;i<1000000;i++){
				int desde=-100;
				int hasta=100;
				s.println((int)(Math.random()*(hasta-desde+1)+desde)); 	
			}
			s.close();
			
		}
	}

