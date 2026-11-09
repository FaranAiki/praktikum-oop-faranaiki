import java.util.List;

public class SampleMain {
    public static void main(String[] args) {
        CreatureArchive dipper = new CreatureArchive();
        CreatureArchive mabel = new CreatureArchive();
        System.out.println(dipper.addCreature("Gnome"));
        System.out.println(dipper.addCreature("Gnome"));
        dipper.addCreature("Gobblewonker");
        dipper.addCreature("Manotaur");
        mabel.addCreature("Manotaur");
        mabel.addCreature("Gnome");
        System.out.println(dipper.getUniqueCount());
        System.out.println(dipper.getCreatures());
        System.out.println(dipper.getCommonCreatures(mabel));
        System.out.println(dipper.removeCreature("Gnome"));
        System.out.println(dipper.containsCreature("Gnome"));
        List<String> copy = mabel.getCreatures();
        copy.clear();
        System.out.println(mabel.getCreatures());
    }
}
