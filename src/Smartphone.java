class Smartphone extends Phone implements Camera, Clock{

    Smartphone(String brand, String model){

        IO.println("A new Smartphone has been created.");
        super.setBrand(brand);
        super.setModel(model);

    }

    @Override
    public void takePicture(){

        IO.println("Taking a picture");

    }

    @Override
    public void ringAlarm() {

        IO.println("Alarm is ringing");

    }
}
