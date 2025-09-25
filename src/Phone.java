abstract class Phone {

    private String brand;
    private String model;

    protected void setBrand(String brand){

        this.brand = brand;
        IO.println("Variable brand has been set to: " + this.brand);

    }

    protected void setModel(String model){

        this.model = model;
        IO.println("Variable model has been set to: " + this.model);

    }

    protected void getBrand(){

        IO.println("The brand is: "+ brand);

    }

    protected void getModel(){

        IO.println("The model is: " + model);

    }

    protected void makePhoneCall(int phoneNumber){

        IO.println("Calling to : " + phoneNumber);

    }


}
