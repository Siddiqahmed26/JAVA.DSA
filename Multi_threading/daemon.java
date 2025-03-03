class Msword extends Thread{
    Msword(String name){
    super(name);
    }

    public void run(){
        if(getName().equals("Typing")){
            typing();
        }
        else if(getName().equals("Check Spell")){
            checkSpell();
        }
        else if(getName().equals("Auto Save")){
            autoSave();
        }
    }


    public void typing(){
        try{
            for(int i=0; i<=5; i++){
                System.out.println("Typing in progress");
                Thread.sleep(2000);
            }
    }
    catch(Exception e){
        System.out.println("Exception occurred: "+e);
    }
    }

    public void checkSpell(){
    
        try{
            for(; ;){
                System.out.println("Checking spell");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println("Exception occurred: "+e);
        }
    }

public void autoSave(){
    
        try{
            for(; ;){
                System.out.println("Auto save in progress");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println("Exception occurred: "+e);
        }
    }
}


public class daemon {
    public static void main(String[] args) {
        Msword m = new Msword("Typing");
        Msword m1 = new Msword("Check Spell");
        Msword m2 = new Msword("Auto Save");

        m1.setDaemon(true);
        m2.setDaemon(true);
        m1.setPriority(10);
        m2.setPriority(10);
        m.start();
        m1.start();
        m2.start();
    }

    
}
