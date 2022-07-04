package web.model;

public class Car {
    private String company;

    private String model;

    private int series;

    public Car() {
    }

    public Car(String company, String model, int series) {
        this.company = company;
        this.model = model;
        this.series = series;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
