package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String favColor;
    private String birthMonth;
    private String githubHandle;
    private boolean hasPets;

    public Person(String fname, String lname) {
        this.firstname = fname;
        this.lastname = lname;

    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getfavColor(){
      return favColor;
    }
    public void setfavColor(String favColor){
      this.favColor = favColor;
    }
    public String getbirthMonth(){
      return birthMonth;
    }
    public void setbirthMonth(String birthMonth){
      this.birthMonth = birthMonth;
    }
    public String getgithubHandle(){
      return githubHandle;
    }
    public void setgithubHandle(String githubHandle){
      this.githubHandle = githubHandle;
    }
    public boolean gethasPets(){
      return hasPets;
    }
    public void sethasPets(boolean hasPets){
      this.hasPets = hasPets;
    }
    public String toString() {
        return this.lastname + ", " + this.firstname + ", " + this.birthMonth + ", " + this.favColor + ", " + this.githubHandle + ", " + this.hasPets;
  }
}