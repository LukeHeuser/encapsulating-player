public class Player { // This class is an example of very bad programming
                      // that does not utilize encapsulation

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage)  {
        health = health - damage;
        if (health <= 0) {
            System.out.println("Player has lost.");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health = health + extraHealth;
        if(health > 100 ) {
            System.out.println("Player healed to full heath");
            health = 100;
        }
    }



}
