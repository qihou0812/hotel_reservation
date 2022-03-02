package model;

public class FreeRoom extends Room {
    private boolean isFree;

    public FreeRoom(String roomNumber, Double price, RoomType enumeration, boolean isFree) {
        super(roomNumber, price, enumeration);
        price=0.0;
        setPrice(price);
        this.isFree = isFree;
    }

}
