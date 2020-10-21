package com.company;

public final class  Tayota extends Car{
    private String model;
    private  Collor svet;

    public Tayota(String model, Collor svet,int year,double obem){
        super(obem, year
        );
        this.model = model;
        this.svet = svet;
    }

    public String getModel() {
        return model;
    }

    public Collor getSvet() {
        return svet;
    }

    @Override
    public void zvuk(String zvuchanie, int kol) {
        System.out.println(" ГРом" + zvuchanie + kol);

    }

    @Override
    public String PrintInfo() {
        return super.PrintInfo()+ " Модель "+ getModel()+ " свет "+ getSvet();
    }
}
