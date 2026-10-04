public class SampleMain {
    public static void main(String[] args) {
        PortalDoor door = new PortalDoor();
        Alarm alarm = new Alarm();
        SecurityConsole console = new SecurityConsole(new DoorCommand(door));
        console.pressButton();
        System.out.println(door.isOpen());
        console.setCommand(new AlarmCommand(alarm));
        console.pressButton();
        System.out.println(alarm.isActive());
        console.setCommand(new DoorCommand(door));
        console.pressUndo();
        System.out.println(alarm.isActive());
        console.pressUndo();
        System.out.println(door.isOpen());
    }
}
