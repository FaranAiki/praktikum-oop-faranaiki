public interface Dimension {
    String getDimensionName();
    int getBaseThreatLevel();
    int calculateThreat(int portalInstability);
}
