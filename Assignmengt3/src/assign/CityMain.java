package assign;

public class CityMain {

	public static void main(String[] args) {
		City arr[]= {new City("mumbai",100000),new City("mumbai1",200000),new City("kop",300000),new  City("ichi",400000)};
		
		float popu=CityProcessor.getAvgPopulation(arr);
	    System.out.println("the average population is"+popu);
	    
	    
	    String names[]=new String [arr.length];
	    names=CityProcessor.getBigCityNames(arr);
	    System.out.println("the big cities are");
	    for(String n:names)
	    {
	    	System.out.println(n);
	    }
	    
			
	}

}
