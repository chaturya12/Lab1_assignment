/**
 * 
 * @author chaturya
 * Desc: creating the person class
 
 */
 public class Person {
   private String name;
   private float age;
 /**
  * parameterized constructor
  * @param name
  * @param age
  */
 public Person(String name, float age) {
	
	this.name = name;
	this.age = age;
  }
  /**
   * to get name
   * @return name
   */
  public String getName() {
	return name;
  }
  /**
   * to set name
   * @param name
   */
  public void setName(String name) { 
	this.name = name;
  }
  /**
   * to get age
   * @return age
   */
  public float getAge() {
	return age;
  }
  /** 
   * to set age
   * @param age
   */
  public void setAge(float age) {
	this.age = age;
  }
}
