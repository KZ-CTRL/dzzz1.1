package com.company;

public  class  Car extends Transport {
    private double  obem;

    public Car(double obem,int year) {
        super(year);
        this.obem = obem;


    }


    public double getObem() {
        return obem;
    }
    public  void zvuk(String zvuchanie,int kol){
        System.out.println("Звук выхлопа" + zvuchanie);
        System.out.println("Количество"+ kol);
    }
        public final   void zvuk(String zvuchanie){
        System.out.println("Звук выхлопа" + zvuchanie);

    }
   public  String PrintInfo(){
        return "Обьем "+ getObem()+" Год " +getYear() ;

   }
}
