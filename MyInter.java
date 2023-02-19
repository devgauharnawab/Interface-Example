package JavaPractice;
//write a program to create an interface MyInter that connects to a database and retrieves the database from
//the database:

public interface MyInter {
    abstract void connect();
    abstract void disconnect();
}
class Oracledb implements MyInter{
    public void connect(){
        System.out.println("Connecting to oracle database");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnecting to oracle database.....");
        
    }
}
class SyBase implements MyInter{

    @Override
    public void connect() {
        System.out.println("Connection to Sybase database....");
        
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting to oracle database.....");
        
    }
    
}
class MyMain{
    public static void main(String[] args) {
        Oracledb od = new Oracledb();
        od.connect();
        od.disconnect();

        System.out.println("*******************************");

        System.out.println(" SYBASE DATABASE ");

        SyBase sb = new SyBase();
        sb.connect();
        sb.disconnect();
    }
}
