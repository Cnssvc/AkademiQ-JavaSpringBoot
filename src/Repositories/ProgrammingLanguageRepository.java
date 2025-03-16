package Repositories;
import Entities.ProgrammingLanguage;
import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageRepository {
    private List<ProgrammingLanguage> programmingLanguages=new ArrayList<>();

    public void add(ProgrammingLanguage language){
        programmingLanguages.add(language);
        System.out.println(language.getName()+"eklendi.");

    }
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    public ProgrammingLanguage getById(int id){
        for(ProgrammingLanguage language: programmingLanguages){
            if (language.getId()==id){
                return language;
            }

        }
        return null;
    }
    public void update(int id,String newName){
        ProgrammingLanguage language=getById(id);
        if(language!=null){
            language.setName(newName);
            System.out.println("ID : "+id+"olan programlama dili güncellendi"+newName);

        }
        else {
            System.out.println("güncellenecek programlama dili bulunamadı!");
        }
    }
    public void delete(int id){
        ProgrammingLanguage language=getById(id);
        if(language!= null){
            programmingLanguages.remove(language);
            System.out.println("Id: "+id+"olan programlama dili silindi.");
        }
        else{
            System.out.println("silinizek programlama dili bulunamadı");
        }
    }
}
