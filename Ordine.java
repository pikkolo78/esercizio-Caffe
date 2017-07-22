public class Ordine
{
  public static void stampaOrdine(int grammi)
  {
  	int scatolaGrande=0;//dichiariamo variabili a 0
  	int scatolaMedia=0;
    int scatolaPiccola=0;
    int sacchi=grammi/1000;//creiamo una variabili sacchi che e' uguale alla divisione dei grammi per un chilo e ci da il numero dei sacchi di caffe
    if (grammi %1000 != 0) //facciamo un if per vedere se ce caffe in piu e quindi anche se non è' un chilo creare un nuovo sacco,quindi se il modulo restituisce "0" i sacchi sono interi se da resto significa che il caffe in piu viene messo in un nuovo sacco anche se non è un chilo
    {
       	sacchi++;//e quindi aumentiamo i sacchi di uno. esempio 1200 grammi di caffe,dovremmo usare u sacco da un chilo e un altro per mettere 200 grammi
    }
    System.out.println(sacchi+ " Sacchi di caffe'");
    int costoSacchi=sacchi*6;//avendo il numero dei sacchi possiamo sapere il costo
    
       scatolaGrande=sacchi/20;//avendo il numero dei sacchi passiamo ai cartoni,il numero delle grandi si sa dividendo i sacchi per 20 ossia il numero di sacchi che entra in un cartone grande
    if(sacchi%20 !=0)//se i sacchi sono piu di 20 facendo un if con il modulo riusciamo a sapere se abbiamo bisogno di un cartone in piu
    {
    	sacchi=sacchi-(20*scatolaGrande);//i sacchi didi caffe diventeranno di meno facendo sottrazione dai sacchi che sono entrati nelle scatole grandi
    	scatolaMedia=sacchi/10;//ripetiamo operazione come per i sacchi grandi anche sui medi. 
    	if(sacchi%10 !=0)
    	{
    		sacchi=sacchi-(10*scatolaMedia);
    		if (sacchi >0 && sacchi<=5)//arrivando alle piccole con un if diciamo che se i sacchi sono maggiori di zero e minori di 5 usiamo una scatola picola in quanto la piccola puo contenere 5 sacchi
            {
    			scatolaPiccola=1;
    		}
    		else if(sacchi>0 && sacchi>5)//se sono maggiori di 0 e di 5 ne usiamo 2 scatole piccole ,ovviamente fino a 9,per a 10 sacchi sarebbe intervenuto l' if prima sulla scatola media e avrebbe messo i sacchi nella media
    		{
    			scatolaPiccola=2;
    		}

    	}
    }
    
    

    double costoImaballaggio=costoSacchi + (scatolaGrande*2)+(scatolaMedia*1)+(scatolaPiccola*0.5);creiamo variabile per saper il costo di tutte le spese e stampiamo
    System.out.println(scatolaGrande + " Scatole grandi");
    System.out.println(scatolaMedia+ " Scatole medie");
    System.out.println(scatolaPiccola+ " scatole piccole");
    System.out.println("Costo totale imballaggio: "+ costoImaballaggio);
    System.out.println();





  }

}