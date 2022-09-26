package subject;

public class Phone2 {
    private String name;
    private  String tel;

    public Phone2(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return this.name;
    }
    public String getTel() {
        return tel; // this.tel 해도되고 그냥 tel 해도되고
    }
}
