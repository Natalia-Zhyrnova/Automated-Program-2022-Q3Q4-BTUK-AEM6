package task.basic.part2;

public class Computer {
    //2. Design such Java class with name java.basic.part2.Computer and such properties as:
//-	Brand
//-	Screen size
//-	Number of cores
//-	Type (laptop,desktop,etc.)
//•	Make `Brand` and `Screen size` properties required in order to create an object(instance).
//•	Create two auxiliary object of java.basic.part2.Computer class.
    final String Brand;
    final float Screen_size;
    int Number_of_cores;
    String Type;

    public Computer(String computerBrand,
                    float computerScreen_size,
                    int computerNumber_of_cores,
                    String computerType) {
        this.Brand = computerBrand;
        this.Screen_size = computerScreen_size;
        this.Number_of_cores = computerNumber_of_cores;
        this.Type = computerType;
    }

    @Override
    public String toString() {
        return "{" +
                "computerBrand='" + Brand + '\'' +
                ", computerScreen_size=" + Screen_size +
                ", computerNumber_of_cores=" + Number_of_cores +
                ", computerType='" + Type + '\'' +
                '}';
    }

}
