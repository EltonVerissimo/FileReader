package DTOs;

public class person_dto {
    private int id;
    private String name;
    private int value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString(){
        return "CsvPessoa{ID='" + id + "\', name=" + name + ", Value='" + value + "\'}";
    }
}
