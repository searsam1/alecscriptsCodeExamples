//
class Main{
    // public constructor
    public Main(){
        ;
    }

    // Private Method
    private void privMethod(){
        System.out.println("Private Method");
    }

    // Protected Method
    protected void procMethod(){
        System.out.println("Protected Method");
    }
    
    // Default Method
    void defaultMethod(){
        System.out.println("Default Method");
    }
    public static void main(String[] args){
        Main mainObj = new Main();
        mainObj.privMethod();
        mainObj.procMethod();
        mainObj.defaultMethod();
        // Private Method
        // Protected Method
        // Default Method
    }
}
