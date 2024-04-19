 class Product {
    //attribute field
    public Product() {
        System.out.println("Yapıcı Blok Çalıştı");
        this.id = id;
        this.renk = renk;
        this.price = price;
        this.kod = kod;
        this.stockAmount = stockAmount;
        this.description = description;
    }


     int id;
    private String name;
    private String description;
    private Double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //getter
    public int getId() {
        return id;
    }

    //setter
    public int SetId(int id) {
        this.id = id;
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }


}