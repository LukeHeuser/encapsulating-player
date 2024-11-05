public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }
    public EnhancedPlayer(String fullName, int Percentage, String weapon) {
        this.fullName = fullName;
        if(Percentage <= 0) {
            this.healthPercentage = 1;
        } else if (Percentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = Percentage;
        }

        this.weapon = weapon;
    }

    public String getFullName() {
        return fullName;
    }

    public void loseHealth(int damage)  {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player has lost.");
        }
    }

    public int healthRemaining() {
        // System.out.println(fullName + " has " + healthPercentage + " health points remaining");
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if(healthPercentage > 100 ) {
            System.out.println("Player healed to full heath");
            healthPercentage = 100;
        }
    }

}
