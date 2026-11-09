import java.util.List;

public class SampleMain {
    public static void main(String[] args) {
        ExpeditionLog log = new ExpeditionLog();
        log.addDestination("Hutan");
        log.addDestination("Danau");
        log.addDestination("Hutan");
        System.out.println(log.getDestinations());
        System.out.println(log.countVisits("Hutan"));
        System.out.println(log.removeDestination("Hutan"));
        System.out.println(log.getDestinations());
        System.out.println(log.getDestination(1));
        System.out.println(log.getDestination(5));
        List<String> copy = log.getDestinations();
        copy.clear();
        System.out.println(log.size());
    }
}
