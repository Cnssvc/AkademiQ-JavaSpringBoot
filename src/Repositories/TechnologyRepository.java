package Repositories;

import Entities.Technology;
import java.util.ArrayList;
import  java.util.List;

public class TechnologyRepository {
    private List<Technology> technologies=new ArrayList<>();

    public void add(Technology technology){
        technologies.add(technology);
        System.out.println(technology.getName()+"eklendi.");
    }
    public List<Technology> getAll(){
        return technologies;
    }
    public Technology getById(int id){
        for(Technology tech: technologies){
            if(tech.getId()==id){
                return tech;
            }
        }
        return null;
    }
    public void update(int id,String newName){
        Technology tech=getById(id);
        if(tech!=null){
            tech.setName(newName);
            System.out.println("ID: "+id+"olan teknoloji güncellendi:"+newName);
        }
        else {
            System.out.println("güncellenecek teknoloji bulunamadı!");
        }
    }
    public void delete(int id){
        Technology tech =getById(id);
        if(tech!= null){
            technologies.remove(tech);
            System.out.println("ID: "+id+"olan teknoloji  silindi .");
        }
        else {
            System.out.println("silinicek teknoloji bulunamadı");
        }
    }
}
