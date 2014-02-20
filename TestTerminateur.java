public class TestTerminateur{

   Thread t;

   public TestTerminateur()
   {
   		Terminateur test = new Terminateur(); // ermm aller chercher le thread de lautre fichier ?? a revoir
         t =  new Thread(test);
   		t.start();
   }

    public static void main(String args[])
    {
    	TestTerminateur app = new TestTerminateur(); // Trouve pas le scope ... what?
    	app.EcrirePoint();
    }

    public void EcrirePoint()
    {
    	while(t.isAlive())
    	{
    		try
    		{
    		   System.out.print(".");
    		   Thread.sleep(500);
    		}
    		catch(InterruptedException e)
    		{
    			System.err.println(e);
    			System.exit(1);
    		}

    	}

    }

}