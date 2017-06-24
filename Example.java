public class Example {

  public static void main(String[] args) {

  System.out.println("Let's add a new cookie jar!");
  CookieJar jar = new CookieJar ("Chocolate Chip");
  System.out.println("The cookies are %s. %n", jar.getCookieType());

  if (jar.isEmpty()) {
    System.out.println("Bad news... the cookie jar is empty!");
  }

  System.out.println("Filling up the cookie jar...");
  jar.fill();

  if(!jar.isEmpty()) {
    System.out.println("The cookie jar is FULL of cookies!");
  }

  }
}
