class User{
    int id;
    String email;
    String password;
    float progress;
    User(int id,String email,String password,float progress){
        this.id= id;
        this.email=email;
        this.password=password;
        this.progress = progress;
    }
}

public class Oops {
    public static  void main(String[]args){
        User userOne =new User(1,"nihal208@gmail.com","123445",80.0f);
        System.out.println("user email is:" +userOne.email);
    }

}
