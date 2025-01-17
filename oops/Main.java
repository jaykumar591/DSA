
class Car {
    int model;
    String name;

    Car(int model, String name) {
        this.name = name;
        this.model = model;
    }

    void setNameAndModel(int model, String name) {
        this.model = model;
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    void setModel(int model) {
        this.model = model;
    }

    int getModel() {
        return model;
    }

    String getName() {
        return name;
    }
}

public class Main {

}
