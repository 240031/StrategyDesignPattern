//troll inherits character class
public class Troll extends Character {
	//calls new weapon knife and calls name from character
		public Troll(String name) {
				super(name);
				weaponBehavior=new WeaponAxe();
		}
		//display method to print out name of troll
		public void display() {
				System.out.println(name+" is a funny troll");
		}
}
