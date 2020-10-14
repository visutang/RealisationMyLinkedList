package linked_list;

/*
 author Bohdan Hnatusiv
 14.10.2020
 */
public class Sports {
    private String name;

    public Sports(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "name='" + name + '\'' +
                '}';
    }
}
