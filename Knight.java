//knight inherits character
public class Knight extends Character {
		//calls new weapon bow and calls name from character
		public Knight(String name) {
				super(name);
				weaponBehavior=new WeaponBow();
		}
		//display method to print out name of knight
		public void display() {
				System.out.println(name+" is a valiant Knight");
		}
}
