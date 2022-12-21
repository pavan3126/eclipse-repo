package assign;

public class CityProcessor {  //for(String fr : fruits) {//Applicable only for arrays and collections
	                          //System.out.println(fr.toUpperCase());


	

		public static float getAvgPopulation(City []num ) {
			int size=num.length;
		    float sum=0,average=0;
		    for(City c:num) {
			  int i=c.getPopulation();
			sum=sum+i;
			average=sum/size;	
			}
            return average;
		
	}
		
		public static String[] getBigCityNames(City []n) {
			
		int size=n.length;
		String names[]=new String [size];
		int index=0;
		for(City c:n) {
			int p=c.getPopulation();
			if(p>200000)
			{
				names[index]=c.getName();
			}
			index++;
		}
			
		return names;
		
			
		}
}

