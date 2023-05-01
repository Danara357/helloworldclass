package pak1;

import java.util.Objects;

public class Autor {
    private String firstName;
    private String secondName;

    public Autor(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autor)) return false;
        Autor autor = (Autor) o;
        return Objects.equals(getFirstName(), autor.getFirstName()) && Objects.equals(getSecondName(), autor.getSecondName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getSecondName());
    }
}
