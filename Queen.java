//queen inherits character
public class Queen extends Character {
		//calls new weapon knife and calls name from character
		public Queen(String name) {
				super(name);
				weaponBehavior=new WeaponKnife();
		}
		//display method to print out name of Queen
		public void display() {
			System.out.println(name+" is a beautiful Queen");
		}
}
