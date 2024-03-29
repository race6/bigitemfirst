package domain;

public class Account {
    /*
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_username` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `u_hobbies` varchar(255) DEFAULT NULL,
  `u_phone` varchar(11) DEFAULT NULL,
  `u_mail` varchar(255) DEFAULT NULL,
  `u_address` varchar(255) DEFAULT NULL,
  `is_delete` int(1) NOT NULL,
     */
    private int u_id;
    private String u_username;
    private String u_password;
    private String u_sex;
    private String u_hobbies;
    private String u_phone;
    private String u_name;
    private String u_mail;
    private String u_address;
    private int is_delete;

    @Override
    public String toString() {
        return "Account{" +
                "u_id=" + u_id +
                ", u_username='" + u_username + '\'' +
                ", u_password='" + u_password + '\'' +
                ", u_sex='" + u_sex + '\'' +
                ", u_hobbies='" + u_hobbies + '\'' +
                ", u_phone='" + u_phone + '\'' +
                ", u_name='" + u_name + '\'' +
                ", u_mail='" + u_mail + '\'' +
                ", u_address='" + u_address + '\'' +
                ", is_delete=" + is_delete +
                '}';
    }

    public Account(int u_id, String u_username, String u_password, String u_sex, String u_hobbies, String u_phone, String u_name, String u_mail, String u_address, int is_delete) {
        this.u_id = u_id;
        this.u_username = u_username;
        this.u_password = u_password;
        this.u_sex = u_sex;
        this.u_hobbies = u_hobbies;
        this.u_phone = u_phone;
        this.u_name = u_name;
        this.u_mail = u_mail;
        this.u_address = u_address;
        this.is_delete = is_delete;
    }

    public Account() {
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_username() {
        return u_username;
    }

    public void setU_username(String u_username) {
        this.u_username = u_username;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex;
    }

    public String getU_hobbies() {
        return u_hobbies;
    }

    public void setU_hobbies(String u_hobbies) {
        this.u_hobbies = u_hobbies;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_mail() {
        return u_mail;
    }

    public void setU_mail(String u_mail) {
        this.u_mail = u_mail;
    }

    public String getU_address() {
        return u_address;
    }

    public void setU_address(String u_address) {
        this.u_address = u_address;
    }

    public int getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }
}
