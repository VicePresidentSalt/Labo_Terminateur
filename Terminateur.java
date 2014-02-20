import java.io.*;
public class Terminateur implements Runnable
{
	public void run() // Compile . À tester
	{
		BufferedReader reader;
		String ligne = null;
		System.out.print("Terminateur pret :");
		boolean boucle = true;
		try
		{
			while(boucle)
			{
				reader = new BufferedReader(
						    new InputStreamReader( System.in ) );
				ligne = reader.readLine();

            if(ligne.equals("Q") ||ligne.equals(" Q")||ligne.equals("Q ")||ligne.equals("q")||ligne .equals(" q")||ligne.equals("q "))
				{
					boucle = false;
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