package Service;
import Entities.ProgrammingLanguage;
import Entities.Technology;
import Repositories.TechnologyRepository;
import Repositories.ProgrammingLanguageRepository;
import java.util.List;
import java.util.ArrayList;

import java.util.List;
public class TechnologyService {
    private TechnologyRepository technologyRepository;
    private ProgrammingLanguageRepository programmingLanguageRepository;

    public TechnologyService(TechnologyRepository technologyRepository,ProgrammingLanguageRepository programmingLanguageRepository){
        this.technologyRepository=technologyRepository;
        this.programmingLanguageRepository=programmingLanguageRepository;
    }
    public void addTechnology(int id,String name,int programmingLanguageId){
        ProgrammingLanguage language=programmingLanguageRepository.getById(programmingLanguageId);
        if (language==null){
            System.out.println("geçersiz programlama dili ID si");
            return;
        }
        Technology technology=new Technology(id,name,language);
        technologyRepository.add(technology);
        language.addTechnology(technology);
    }
    public void listAllTechnologies(){
        List<Technology>technologies=technologyRepository.getAll();
        if(technologies.isEmpty()){
            System.out.println("henüz proje eklenmedi");
        }
        else{
            System.out.println("teknolojiler:");
            for (Technology tech:technologies){
                System.out.println("-"+tech.getId()+":"+tech.getName()+"(dili:"+tech.getProgrammingLanguage().getName()+")");
            }
        }
    }
    public void updateTechnology(int id,String newName){
        technologyRepository.update(id,newName);
    }
    public void deleteTechnology(int id){
        technologyRepository.delete(id);
    }

}
