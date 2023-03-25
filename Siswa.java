public class Siswa {
    public String name;
    public String birthplace;
    public String birthdate;
    public String phoneNumber;
    public String city;

    public Siswa(String name, String birthplace, String birthdate, String phoneNumber, String city) {
        this.name = name;
        this.birthplace = birthplace;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    public int getBirthYear() {
        return Integer.parseInt(this.birthdate.substring(0,4));
    }

    public int getAge() {
        return 2023 - this.getBirthYear();
    }

}
