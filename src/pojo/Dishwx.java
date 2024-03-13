package pojo;

public class Dishwx {
    private Integer id;
    private String fooddesc;

    public Dishwx() {
    }

    public Dishwx(Integer id, String fooddesc) {
        this.id = id;
        this.fooddesc = fooddesc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFooddesc() {
        return fooddesc;
    }

    public void setFooddesc(String fooddesc) {
        this.fooddesc = fooddesc;
    }

    @Override
    public String toString() {
        return "dishwx{" +
                "id=" + id +
                ", fooddesc='" + fooddesc + '\'' +
                '}';
    }
}
