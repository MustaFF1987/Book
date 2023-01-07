public class Dog {

    String DogsName;
    Integer DogsAge;
    String DogsColor;

    Dog (String DogsName, int DogsAge, String DogsColor) {

        this.DogsName = DogsName;
        this.DogsAge = DogsAge;
        this.DogsColor = DogsColor;
    }

    String getDogsName() {
        return this.DogsName;
    }
    Integer getDogsAge() {
        return this.DogsAge;
    }
    String getDogsColor() {
        return this.DogsColor;
    }

}
