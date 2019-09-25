package domain;

public class Goods {
    /*
  `g_id` int(255) NOT NULL AUTO_INCREMENT,
  `g_goods_name` varchar(255) DEFAULT NULL,
  `g_goods_pic` varchar(255) DEFAULT NULL,
  `g_goods_price` decimal(10,2) DEFAULT NULL,
  `g_goods_description` varchar(255) DEFAULT NULL,
  `g_goods_stock` int(255) DEFAULT NULL,
  `is_delete` int(1) DEFAULT NULL,
     */

    private int g_id;
    private String g_goods_name;
    private String g_goods_pic;
    private float g_goods_price;
    private String g_goods_description;
    private int g_goods_stock;//库存
    private int is_delete;

    public Goods() {
    }

    public Goods(int g_id, String g_goods_name, String g_goods_pic, float g_goods_price, String g_goods_description, int g_goods_stock, int is_delete) {
        this.g_id = g_id;
        this.g_goods_name = g_goods_name;
        this.g_goods_pic = g_goods_pic;
        this.g_goods_price = g_goods_price;
        this.g_goods_description = g_goods_description;
        this.g_goods_stock = g_goods_stock;
        this.is_delete = is_delete;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "g_id=" + g_id +
                ", g_goods_name='" + g_goods_name + '\'' +
                ", g_goods_pic='" + g_goods_pic + '\'' +
                ", g_goods_price=" + g_goods_price +
                ", g_goods_description='" + g_goods_description + '\'' +
                ", g_goods_stock=" + g_goods_stock +
                ", is_delete=" + is_delete +
                '}';
    }

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }

    public String getG_goods_name() {
        return g_goods_name;
    }

    public void setG_goods_name(String g_goods_name) {
        this.g_goods_name = g_goods_name;
    }

    public String getG_goods_pic() {
        return g_goods_pic;
    }

    public void setG_goods_pic(String g_goods_pic) {
        this.g_goods_pic = g_goods_pic;
    }

    public float getG_goods_price() {
        return g_goods_price;
    }

    public void setG_goods_price(float g_goods_price) {
        this.g_goods_price = g_goods_price;
    }

    public String getG_goods_description() {
        return g_goods_description;
    }

    public void setG_goods_description(String g_goods_description) {
        this.g_goods_description = g_goods_description;
    }

    public int getG_goods_stock() {
        return g_goods_stock;
    }

    public void setG_goods_stock(int g_goods_stock) {
        this.g_goods_stock = g_goods_stock;
    }

    public int getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }
}
