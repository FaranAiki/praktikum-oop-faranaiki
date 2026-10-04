public class Alarm {
    private boolean active;

    public Alarm() {
        active = false;
    }

    public void activate() { active = true; }
    public void deactivate() { active = false; }
    public boolean isActive() { return active; }
}
