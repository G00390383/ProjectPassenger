package ie.atu.project;

public class Passenger {
    String title;
    String name;
    long id;
    long phone;
    int age;

    public Passenger(String title, String name, long id, long phone, int age) {
        setTitle(title);
        setName(name);
        setId(id);
        setPhone(phone);
        setAge(age);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String thisTitle) {
        if("Mr".equalsIgnoreCase(thisTitle) || "Mrs".equalsIgnoreCase(thisTitle) || "Ms".equalsIgnoreCase(thisTitle)){
            this.title = thisTitle;
        }
        else {
            throw new IllegalArgumentException("This is not a valid title");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("This is not a valid name");
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
