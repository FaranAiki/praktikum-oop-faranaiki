public class SampleMain {
    public static void main(String[] args) {
        Griffin griffin = new Griffin("G", 8);
        RescueDrone drone = new RescueDrone("D", 9);
        EvacuationTeam team = new EvacuationTeam(2);
        team.addRescuer(griffin);
        team.addRescuer(drone);
        System.out.println(team.evacuate(4));
        System.out.println(griffin.getStamina() + " " + drone.getBattery());
        System.out.println(team.evacuate(4));
        System.out.println(griffin.getStamina() + " " + drone.getBattery());
    }
}
