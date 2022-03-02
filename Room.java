package model;

public class Room implements IROOM{
    private String roomNumber;
    private Double price;
    private RoomType enumeration;
    public Room(String roomNumber, Double price, RoomType enumeration){
        super();
        this.roomNumber = roomNumber;
        this.price = price;
        this.enumeration = enumeration;
    }
    @Override
    public String getRoomNumber() {
        return roomNumber;
    }
    @Override
    public Double getRoomPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    @Override
    public RoomType getRoomType() {
        return enumeration;
    }

    @Override
    public boolean isFree() {
        return true;
    }

    @Override
    public String toString() {
        return "Room  :"+roomNumber+
                "Price  :"+price+
                "RoomType  :"+enumeration+
                "Is free?   :"+isFree();
    }
}
