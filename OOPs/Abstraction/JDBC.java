interface Connection{
void connect();
void query();
void close();
}

class oracle implements Connection{
    @Override
    public void connect(){
        System.out.println("Oracle connected");
    }
    @Override
    public void query(){
        System.out.println("Oracle query");
    }
    @Override
    public void close(){
        System.out.println("Oracle closed");
    }
}
class sybase implements Connection{
    @Override
    public void connect(){
        System.out.println("Sybase connected");
    }
    @Override
    public void query(){
        System.out.println("Sybase query");
    }
    @Override
    public void close(){
        System.out.println("Sybase closed");
    }
}
 class Allowconnection{
    void connects(Connection ref){
        ref.connect();
        ref.query();
        ref.close();

    }
 }
 
 class JDBC{
    public static void main(String[] args) {
        oracle o = new oracle();
        sybase s = new sybase();
        Allowconnection ac = new Allowconnection();

        ac.connects(o);
        System.out.println();
        ac.connects(s);

    }
 }




















