

public class Box <T> {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Box(String name) {
    this.name = name;

  }

  @Override
  public String toString() {
    return "Box{" +
            "name='" + name + '\'' +
            '}';
  }
  public <T> void  method(T a){
    System.out.println("Hello " + a + "!");
  }
}

