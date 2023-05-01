package pak1;

public class Main {
    public static void main(String[] args) {
        Autor cat = new Autor("Vasiliy", "Pupkin");
        Autor dog = new Autor("Ivan", "Kurov");
        Book catLive = new Book("Caat live", cat, 2021);
        Book dogLive = new Book("Dog Live", dog, 2022);

        catLive.setPublishingYear(2020);

        System.out.println(catLive.getTitle() + " " + catLive.getAutor() + " " + catLive.getPublishingYear());
    }
}
