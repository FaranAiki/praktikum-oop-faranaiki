public class EvacuationTeam {
    private Rescuer[] members;
    private int count;

    public EvacuationTeam(int capacity) {
        members = new Rescuer[capacity];
        count = 0;
    }

    public boolean addRescuer(Rescuer rescuer) {
        if (count == members.length) return false;
        members[count++] = rescuer;
        return true;
    }

    public int evacuate(int people) {
        // TODO
        return 0;
    }
}
