public class Room
{
    int x;
    int y;
    int z;
    String text;
    public Room(int roomx, int roomy, int roomz, String roomtext)
    {
        x = roomx;
        y = roomy;
        z = roomz;
        text = roomtext;
    }
    public void enterRoom(String additionalText){
        System.out.println(text);
    }
}
