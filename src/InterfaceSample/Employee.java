package InterfaceSample;

public class Employee {
/*1)	Employee (Çalışan) adında bir sınıf oluşturun.
    Bu sınıftan türeyen (inheritance) Manager (Yönetici) ve Developer (Geliştirici) sınıflarını oluşturun.
    Employee sınıfında şu özellikler bulunmalıdır:

    Id,Name,Salary,Department

    Manager sınıfında şu ek özellikler bulunmalıdır:

    TeamSize

    Developer sınıfında şu ek özellikler bulunmalıdır:

    About

    Her bir alt sınıf kendi maaş hesaplama metodunu (CalculateBonus()) içermelidir(Bu metod Employee sınıfında olmalıdır onu kalıtım alan sınıflar tarafından override edilmelidir.):
            •	Yöneticiler maaşlarının %20’sini prim olarak almalıdır.
            •	Geliştiriciler maaşlarının %10’unu prim olarak almalıdır.*/
    private int id;
    private String name;
    double salary;
    private String department;
    public Employee(int id,String name,double salary,String department){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;
    }
    public double calculateBonus(){
        return 0;
    }



}
