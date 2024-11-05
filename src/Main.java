public class Main {
    public static void main(String[] args) {

//        Player player = new Player();
//        player.fullName = "Luke";
//        player.health = 85;
//        player.weapon = "Mace";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        // This statement breaks the code as we do not want to add health
        // outside of the method designed to do so
//        player.health = 5000;
//        player.loseHealth(75);
//        System.out.println("Remaining health = " + player.healthRemaining());


        EnhancedPlayer luke = new EnhancedPlayer("Luke");
        System.out.println("Initial health is " + luke.healthRemaining());

        EnhancedPlayer rachel = new EnhancedPlayer("Rachel", 200, "Dagger");
        System.out.println("Initial health is " + rachel.healthRemaining());

        rachel.loseHealth(45);
        System.out.println(rachel.getFullName() +" took damage!" + "\n" +
                rachel.getFullName()+ " Suffered 45 points of Damage");
        System.out.println(rachel.getFullName() +" has "+ rachel.healthRemaining() + " health points left");


    }

}
