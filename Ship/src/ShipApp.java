
	public class ShipApp {
			public static void main(String[] args) {
				Ship myShip= new Ship();
				System.out.println( myShip.getPropulsion() );//1
				myShip.setPropulsion(15);
				System.out.println(myShip.getPropulsion() );//15
				
				myShip.setName("Portobello");
				System.out.println(myShip.getName() );
				
				myShip.setManufactory("James&Sons");
				System.out.println(myShip.getManufactory() );
			}
		}