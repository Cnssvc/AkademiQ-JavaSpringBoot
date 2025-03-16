package Presentation;
import Repositories.ProgrammingLanguageRepository;
import Repositories.TechnologyRepository;
import Service.ProgrammingLanguageService;
import Service.TechnologyService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Repository ve Service katmanlarını oluşturuyoruz.
        ProgrammingLanguageRepository programmingLanguageRepository = new ProgrammingLanguageRepository();
        TechnologyRepository technologyRepository = new TechnologyRepository();
        ProgrammingLanguageService programmingLanguageService = new ProgrammingLanguageService(programmingLanguageRepository);
        TechnologyService technologyService = new TechnologyService(technologyRepository, programmingLanguageRepository);

        while (true) {
            System.out.println("\n--- PROGRAMLAMA DİLLERİ VE TEKNOLOJİLER YÖNETİMİ ---");
            System.out.println("1 - Programlama Dili Ekle");
            System.out.println("2 - Programlama Dillerini Listele");
            System.out.println("3 - Programlama Dili Güncelle");
            System.out.println("4 - Programlama Dili Sil");
            System.out.println("5 - Teknoloji Ekle");
            System.out.println("6 - Teknolojileri Listele");
            System.out.println("7 - Teknoloji Güncelle");
            System.out.println("8 - Teknoloji Sil");
            System.out.println("9 - Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Enter karakterini temizle

            switch (choice) {
                case 1:
                    System.out.print("Programlama Dili ID: ");
                    int langId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Programlama Dili Adı: ");
                    String langName = scanner.nextLine();
                    programmingLanguageService.addProgrammingLanguage(langId, langName);
                    break;

                case 2:
                    programmingLanguageService.listAllProgrammingLanguages();
                    break;

                case 3:
                    System.out.print("Güncellenecek Programlama Dili ID: ");
                    int updateLangId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Yeni Adı: ");
                    String newLangName = scanner.nextLine();
                    programmingLanguageService.updateProgrammingLanguage(updateLangId, newLangName);
                    break;

                case 4:
                    System.out.print("Silinecek Programlama Dili ID: ");
                    int deleteLangId = scanner.nextInt();
                    programmingLanguageService.deleteProgrammingLanguage(deleteLangId);
                    break;

                case 5:
                    System.out.print("Teknoloji ID: ");
                    int techId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Teknoloji Adı: ");
                    String techName = scanner.nextLine();
                    System.out.print("Bağlı Olduğu Programlama Dili ID: ");
                    int langForTech = scanner.nextInt();
                    technologyService.addTechnology(techId, techName, langForTech);
                    break;

                case 6:
                    technologyService.listAllTechnologies();
                    break;

                case 7:
                    System.out.print("Güncellenecek Teknoloji ID: ");
                    int updateTechId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Yeni Adı: ");
                    String newTechName = scanner.nextLine();
                    technologyService.updateTechnology(updateTechId, newTechName);
                    break;

                case 8:
                    System.out.print("Silinecek Teknoloji ID: ");
                    int deleteTechId = scanner.nextInt();
                    technologyService.deleteTechnology(deleteTechId);
                    break;

                case 9:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }

    }
}