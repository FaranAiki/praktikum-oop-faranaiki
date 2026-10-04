public class EvacuationTeam {
  private Rescuer[] members;
  private int count;

  public EvacuationTeam(int capacity) {
    count = 0;
    members = new Rescuer[capacity];
  }

  public boolean addRescuer(Rescuer rescuer) {
    if (members.length <= count) return false;
    members[count] = rescuer;
    count++;
    return true;
  }

  public int evacuate(int people) {
    if (count == 0) return 0;
    int sisa_ga_ke_rescue = people;
    for (int i = 0; i < count; i++) {
      sisa_ga_ke_rescue -= members[i].rescue(sisa_ga_ke_rescue);
      if (sisa_ga_ke_rescue == 0) break;
    }
    return people - sisa_ga_ke_rescue;
  }
}
