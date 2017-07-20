public class Ordine
{
  public static void stampaOrdine(int grammi)
  {
  	int scatolaGrande=0;
  	int scatolaMedia=0;
    int scatolaPiccola=0;
    int sacchi=grammi/1000;
    if (grammi %1000 != 0) 
    {
       	sacchi++;
    }
    System.out.println(sacchi);
    int costoSacchi=sacchi*6;
    
       scatolaGrande=sacchi/20;
    if(sacchi%20 !=0)
    {
    	sacchi=sacchi-(20*scatolaGrande);
    	scatolaMedia=sacchi/10;
    	if(sacchi%10 !=0)
    	{
    		sacchi=sacchi-(10*scatolaMedia);
    		if (sacchi >0 && sacchi<=5)
            {
    			scatolaPiccola=1;
    		}
    		else if(sacchi>0 && sacchi>5)
    		{
    			scatolaPiccola=2;
    		}

    	}
    }
    
    

    
    System.out.println(scatolaGrande);
    System.out.println(scatolaMedia);
    System.out.println(scatolaPiccola);
    System.out.println();





  }

}