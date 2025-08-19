public class classEx {
   public String name ;
   public float salary;

    public classEx(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }


   public String getName (){
       return name;
   }
   public float getSalary () {
       return salary;
   }
   public void setName (String name ){
       this.name=name;

   }
   public void setSalary(float salary ){
        this.salary = salary ;
   }
   public  void  print (){
       System.out.println("Employee name :"+name);
       System.out.println("Employee salary:"+salary);
   }
   public static void main (String[]args ){
       classEx emp = new classEx ("harsh",100000.0f);
       emp.print();
   }



}


    

