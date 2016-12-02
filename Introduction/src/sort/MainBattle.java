package sort;

public class MainBattle {
	 
	 	public static void main(String[] args) {
	 		pokemon raticate = new pokemon("Raticate",26);
	 		pokemon bulbasaur = new pokemon("Bulbasaur",26);
	 		raticate.iChooseYou();
	 		bulbasaur.iChooseYou();
	 		System.out.println("Raticate is preparing "
	 				+ "to attack with super fang");
	 		
	 		//create a way for raticate and bulbasaur to attack
	 		raticate.lapse();
	 		bulbasaur.lapse();
	 		System.out.println("Raticate is preparing "+ "to attack with super fang");
	 		raticate.attack(bulbasaur,  new Attack());
	 	}
	 	public void attack(pokemon target)
	 	{
	 		System.out.println("Poison power is used!");
	 		target.setPoisoned(true);
	 	}
	 
	 }
