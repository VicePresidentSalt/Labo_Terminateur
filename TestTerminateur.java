public class TestTerminateur extends Terminateur {

   public TestTerminateur()
   {
   		TestTerminateur test = new Terminateur(); // ermm aller chercher le thread de lautre fichier ?? a revoir
   		test.start();
   }
   
    public static void main(String args[])
    {
    	TestTerminateur app = TestTerminateur(); // Trouve pas le scope ... what?
    	app.EcrirePoint();
    }
    
    public void EcrirePoint()
    {
    	while(true)
    	{
    		try
    		{
    		   System.out.print(".");
    		   currentThread().sleep(500);	
    		}
    		catch(InterruptedException e)
    		{
    			System.err.println(e);
    			System.exit(1);
    		}

    	}
    	
    }
    
}