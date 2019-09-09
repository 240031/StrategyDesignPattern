
public abstract class Character {
		protected String name;//variables
		protected WeaponBehavior weaponBehavior;
		//set string name
		public Character(String name) {
				this.name=name;
		}
		
		public void attack() {
				weaponBehavior.attack();
		}
		//method to print out weapon attack
		public void setWeaponBehavior(WeaponBehavior wb) {
			wb.attack();
		}
		//method to switch out weapon
		public abstract void display();
}
		//display method