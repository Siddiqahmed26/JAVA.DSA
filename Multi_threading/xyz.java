class MsWord extends Thread {
    MsWord(String name){
    super(name);

   }
    public void run(){
        if(getName().equals("Typing")){
            typing();
        }
        else if(getName().equals("Message")){
            message();
        }
        else if(getName().equals("Format")){
            format();
        }


}
public void typing(){
    try{
        for(int i=0; i<=5; i++){
System.out.println(" typing in progress");
Thread.sleep(2000);
    }
}
    catch(Exception e){
        System.out.println("Exception occurred: "+e);
    }

}
public void message(){
    try{
        for(int i=0; i<=5; i++){
    System.out.println("Message from MsWord");
    Thread.sleep(3000);
    }
}
    catch(Exception e){
        System.out.println("Exception occurred: "+e);
    }

}


public void format(){
    try{
        for(int i=0; i<=5; i++){
    System.out.println("Formatting in progress");
    Thread.sleep(1000);
    }
}
    catch(Exception e){
        System.out.println("Exception occurred: "+e);
    }

}



}


public class xyz {
    public static void main(String args[]){
        MsWord ms = new MsWord("Typing");
        MsWord ms1 = new MsWord("Message");
        MsWord ms2 = new MsWord("Format");

ms.start();
ms1.start();
ms2.start();

    }
    
}
