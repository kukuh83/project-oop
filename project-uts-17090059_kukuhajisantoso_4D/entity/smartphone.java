package entity;

public class smartphone  {

    private String id;
    private String nama;
    private String merk;
    private String model;

    public boolean equals(Object obj) {
        smartphone smr = (smartphone) obj;
        return id.equals(smr.getid());
    }

    public smartphone(String id, String nama, String merk, String model) {
        this.id = id;
        this.nama = nama;
        this.merk = merk;
        this.model = model;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getmerk() {
        return merk;
    }

    public void setmerk(String merk) {
        this.merk = merk;
    }
    public String getmodel() {
        return model;
    }
    public void setmodel(String model) {
        this.model = model;
    }
}