public class RangeInputRun {
    public static void main(String[] args) {
        RangeInput rangeInput=new RangeInput(20, 70);
        rangeInput.up();
        rangeInput.up();
        rangeInput.down();
        rangeInput.up();
        rangeInput.down();
        System.out.println("Temperature of rangeInput:" + rangeInput.getCurrentTemperature());

        RangeInput rangeInput1=new RangeInput();
        rangeInput1.up();
        rangeInput1.up();
        rangeInput1.down();
        rangeInput1.down();
        System.out.println("Current Temperature:" + rangeInput1.getCurrentTemperature());

    }
}
