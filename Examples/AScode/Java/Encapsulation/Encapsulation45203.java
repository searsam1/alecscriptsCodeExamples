class Person {
    // restricted access
    private String name; 
  
    // get
    public String getName() {
      return name;
    }
  
    // set
    public void setName(String newName) {
      this.name = newName;
    }
    public static void main(String args[]){
        Person newPerson = new Person();
        newPerson.setName("Matt");
        System.out.println(newPerson.getName());
        // Matt
    }
  }
