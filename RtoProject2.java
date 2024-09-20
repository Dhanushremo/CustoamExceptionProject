import java.util.Scanner;
class UnderAgeException extends Throwable{
    @Override
    public String getMessage() {
        Driving d1=new Driving();
        return "Sorry Your "+d1.name+" Age is not sufficent! its an UnderAgeException!!";
    }
}
class OverAgeException extends Exception{
    @Override
    public String getMessage() {
        Driving d2=new Driving();
        return "Sorry Your "+d2.name+" Age is not sufficent! its an OverAgeException!!";
    }
}
class Driving{
    private final int age=18;
    private int a;
    private final int lastAge=60;
    public String name;
    public void acceptINput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        name=sc.nextLine();
        System.out.println("Enter Your Age");
        a=sc.nextInt();
    }
    public void verify() throws UnderAgeException,OverAgeException{
        if(a>=age && a<=60){
            System.out.println("OK Now You Can Take Your Driving Licenses ");
        }
        else if (a<age) {
            UnderAgeException ua=new UnderAgeException();
            System.out.println(ua.getMessage());
            throw ua;
        }
        else {
            OverAgeException oe=new OverAgeException();
            System.out.println(oe.getMessage());
            throw oe;
        }
    }
}
class Rto{
    public void init() {
        Driving d = new Driving();
        try{
            d.acceptINput();
            d.verify();
        }
        catch (UnderAgeException e){
            try{
                d.acceptINput();
                d.verify();
            }
            catch (UnderAgeException f){
                try{
                    d.acceptINput();
                    d.verify();
                }
                catch (UnderAgeException h){
                    System.out.println("Sorry "+d.name+" we are unable to provide your driving lisencess coz your age is Below 18");
                }
                catch (OverAgeException h){
                    System.out.println("Sorry "+d.name+" we are unable to provide your driving lisencess coz your age is Above 60");
                }
            }
            catch (OverAgeException g){
                try{
                    d.acceptINput();
                    d.verify();
                }
                catch (UnderAgeException h){
                    System.out.println("Sorry "+d.name+" we are unable to provide your driving lisencess coz your age is Below 18");
                }
                catch (OverAgeException h){
                    System.out.println("Sorry "+d.name+" we are unable to provide your driving lisencess coz your age is Above 60");
                }
            }
        }
        catch (OverAgeException e){
            try{
                d.acceptINput();
                d.verify();
            }
            catch (UnderAgeException f){
                try{
                    d.acceptINput();
                    d.verify();
                }
                catch (UnderAgeException h){
                    System.out.println("Sorry "+d.name+" we are unable to provide your driving lisencess coz your age is Below 18");
                }
                catch (OverAgeException h){
                    System.out.println("Sorry "+d.name+" we are unable to provide your driving lisencess coz your age is Above 60");
                }
            }
            catch (OverAgeException g){
                try{
                    d.acceptINput();
                    d.verify();
                }
                catch (UnderAgeException h){
                    System.out.println("Sorry "+d.name+" we are unable to provide your driving lisencess coz your age is Below 18");
                }
                catch (OverAgeException h){
                    System.out.println("Sorry "+d.name+" we are unable to provide your driving lisencess coz your age is Above 60");
                }
            }
        }
    }
}

public class RtoProject2 {
    public static void main(String[] args) {
        Rto r=new Rto();
        r.init();
    }
}
