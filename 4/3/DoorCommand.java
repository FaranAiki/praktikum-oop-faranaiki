public class DoorCommand implements ICommand {
    private PortalDoor door;

    public DoorCommand(PortalDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }

    @Override
    public void undo() {
        door.close();
    }
}
