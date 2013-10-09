public class RoomWithItem extends Room
{
    String text;
    Boolean hasitem;
    public RoomWithItem(/*int roomx, int roomy, int roomz, String roomtext*/) {
        this.x = roomx;
        this.y = roomy;
        this.z = roomz;
        this.text = roomtext;
        this.hasitem = true;
    }
    public void removeItem() {
        hasitem = false;
    }
}
