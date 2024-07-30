public class Main {
    public static void main(String[] args) {
//        Player player =new Player();
//        player.name="Kip";
//        player.health=20;
//        player.weapon="sword";
//
//        int damage =10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health="+player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("remaining health="+player.healthRemaining());

        EnhancedPlayer Kev =new EnhancedPlayer("kev",200,"Sword");
        System.out.println("Initial health="+Kev.healthRemaining());
    }
}