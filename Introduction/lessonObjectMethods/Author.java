package Introduction.lessonObjectMethods;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Author author_to_equal = (Author) obj;
        return name.equals(author_to_equal.name) && surname.equals(author_to_equal.surname);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
    
}
