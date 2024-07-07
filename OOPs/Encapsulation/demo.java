public class demo{
    private int pages;
    public void setData(int x){
        if(x>0){
            pages = x;

        }
    }
    public int getData(){
        return pages;

    }

    public static void main(String[] args){
        demo d = new demo();
        d.setData(10);
        System.out.println(d.getData());
    }

}