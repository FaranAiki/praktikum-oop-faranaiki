public class PortalDoor {
    private boolean open;

    public PortalDoor() {
        open = false;
    }

    public void open() { open = true; }
    public void close() { open = false; }
    public boolean isOpen() { return open; }
}
