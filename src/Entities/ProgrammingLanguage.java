package Entities;
import java.util.ArrayList;
import java.util.List;


public class ProgrammingLanguage {
    private int id;
    private String name;
    private List<Technology> technologies;


    public ProgrammingLanguage(int id, String name) {
        this.id = id;
        this.name = name;
        this.technologies=new ArrayList<>();
    }

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
    public List<Technology>getTechnologies(){
        return technologies;
    }
    public void addTechnology(Technology technology){
        this.technologies.add(technology);
    }
}
