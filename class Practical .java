class Practical {
   public void displayInfo() {
      System.out.println("This is Practical3");
   }
}

class Assignment extends Practical {
   @Override
   public void displayInfo() {
      System.out.println("Java Assignment3");
   }
}

class Main {
   public static void main(String[] args) {
      Assignment a = new Assignment();
      a.displayInfo();
   }
}