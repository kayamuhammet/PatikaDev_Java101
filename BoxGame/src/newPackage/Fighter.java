package newPackage;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    int crit;

    public Fighter(String name, int damage, int health, int weight, double dodge, int crit) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.crit = crit;
    }

    public int hit(Fighter foe) {
        System.out.println("------------");
        double critValue = Math.random();

        if (foe.dodge()) {
            System.out.println(foe.name + " dodges the incoming damage.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;


        if(critValue < 0.5){
            System.out.println(this.name + " deals " + this.damage + " damage to "+ foe.name);
            return foe.health - this.damage;
        }
        else{
            System.out.println("Boom! Critic!");
            System.out.println(this.name + " deals " + this.damage + " critical damage to " +  this.damage*crit);
            return foe.health - this.damage*this.crit;
        }

    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
}
