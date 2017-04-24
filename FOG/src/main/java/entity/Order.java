package entity;

/**
 *
 * @author Anders
 */
public class Order {
    private int idOrder;
    private String roofType;
    private double width;
    private double length;
    private double heigth;
    private int User_idUser;

    public Order(int idOrder, String roofType, double width, double length, double heigth) {
        this.idOrder = idOrder;
        this.roofType = roofType;
        this.width = width;
        this.length = length;
        this.heigth = heigth;
    }

    public Order(String roofType, double width, double length, double heigth) {
        this.roofType = roofType;
        this.width = width;
        this.length = length;
        this.heigth = heigth;
    }

    public Order(int idOrder, String roofType, double width, double length, double heigth, int User_idUser) {
        this.idOrder = idOrder;
        this.roofType = roofType;
        this.width = width;
        this.length = length;
        this.heigth = heigth;
        this.User_idUser = User_idUser;
    }
    
    public int getUser_idUser() {
        return User_idUser;
    }

    public void setUser_idUser(int User_idUser) {
        this.User_idUser = User_idUser;
    }
    
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Order{" + "idOrder=" + idOrder + ", roofType=" + roofType + ", width=" + width + ", length=" + length + ", heigth=" + heigth + ", User_idUser=" + User_idUser + '}';
    }
}
