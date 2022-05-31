package Messages;

public interface GradesAnnouncement {
    public boolean verifyGrades();
    public String prepareMessage(String[] placeHolders);
}
