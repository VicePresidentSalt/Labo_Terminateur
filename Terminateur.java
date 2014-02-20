import java.io.*;
public class Terminateur extends Thread
{
	public void run() // Compile . À tester
	{
		BufferedReader reader;
		String ligne = null;
		System.out.print("Terminateur pret :");
		try
		{
			while(currentThread().isAlive())
			{
				reader = new BufferedReader(
						    new InputStreamReader( System.in ) );
				ligne = reader.readLine();
	
				if(ligne =="Q" ||ligne ==" Q"||ligne =="Q "||ligne =="q"||ligne ==" q"||ligne =="q ")
				{
					currentThread().interrupt();
					reader.close();
				}
			
			}
		
		}
		catch(IOException ioe)
		{
			System.err.println(ioe);
			System.exit(1);
		}
		
		
	} 
}