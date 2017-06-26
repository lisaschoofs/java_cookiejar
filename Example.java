public class Example {

  public static void main(String[] args) {

  System.out.println("Let's add a new cookie jar!");
  CookieJar jar = new CookieJar ("Chocolate Chip");
  // System.out.println("The cookies are %s. %n", jar.getCookieType());

  if (jar.isEmpty()) {
    System.out.println("Bad news... the cookie jar is empty!");
  }

  System.out.println("Filling up the cookie jar...");
  jar.fill();

  if(!jar.isEmpty()) {
    System.out.println("The cookie jar is FULL of cookies!");
  }

  if (!jar.isEmpty()) {
  System.out.println("Dispenser is full");
  }
  while (jar.dispense()) {
    System.out.println("Chomp!");
  }
  if (jar.isEmpty()){
   System.out.println("The cookies are gone!");
  }

  jar.fill(6);
  while (jar.dispense()) {
    System.out.println("Chomp!");
  }
  if (jar.isEmpty()){
   System.out.println("The cookies are gone!");
  }

  try{
    jar.fill(132);
  } catch (IllegalArgumentException iae) {
    System.out.printf("The error was %s. %n", iae.getMessage());
  }

  }
}
