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

            if(ligne.equals("Q") ||ligne.equals(" Q")||ligne.equals("Q ")||ligne.equals("q")||ligne .equals(" q")||ligne.equals("q "))
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