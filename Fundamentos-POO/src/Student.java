public class Student {
    public static void main(String[] args) throws Exception {
       String name;
       int age;
       Color color;
       Sex sex;

       void eating (Food food){
        //CÓDIGO AQUI
       }

       void drinking (Eat eat){
        //CÓDIGO AQUI
       }

       void running (){
        //CÓDIGO AQUI
       }
    }
}

public class School {
    public static void main(String[] args) throws Exception {
            Student student1 = new Student();
            student1.name= "Arthur";
            student1.age= 20;
            student1.color= Color.FAIR;
            student1.sex= Sex.MALE;

            Student student2 = new Student();
            student2.name= "Ana";
            student2.age= 15;
            student2.color= Color.FAIR;
            student2.sex= Sex.FEMALE;
    }
    //NÃO FOI ESTRUTURADO COM O PADRÃO JAVA BEANS GETTERS E SETTERS
}