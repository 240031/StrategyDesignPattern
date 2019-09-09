//king inherits character
public class King extends Character {
	//calls new weapon sword and calls name from character
		public King(String name) {
				super(name);
				weaponBehavior=new WeaponSword();
		}
		//display method to print out name of king
		public void display() {
				System.out.println(name+" is a Noble King");
		}
}
