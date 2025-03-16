package Service;
import Entities.ProgrammingLanguage;
import Repositories.ProgrammingLanguageRepository;
import java.util.List;
import java.util.ArrayList;

public class ProgrammingLanguageService {
    private ProgrammingLanguageRepository repository;
    public ProgrammingLanguageService(ProgrammingLanguageRepository repository){
        this.repository=repository;
    }
    public  void addProgrammingLanguage(int id,String name){
        if(name==null ||name.trim().isEmpty()){
            System.out.println("Programlama dili ismi boş olamaz!");
            return;
        }
        ProgrammingLanguage language=new ProgrammingLanguage(id,name);
        repository.add(language);
    }
    public void listAllProgrammingLanguages(){
        List<ProgrammingLanguage> languages=repository.getAll();
        if(languages.isEmpty()){
            System.out.println("henüz programlama dili eklenmedi");
            for(ProgrammingLanguage language:languages){
                System.out.println("-"+language.getId()+":"+ language.getName());
            }
        }
    }
    public void updateProgrammingLanguage(int id,String newName){
        repository.update(id,newName);
    }
    public void deleteProgrammingLanguage(int id){
        repository.delete(id);
    }
}
