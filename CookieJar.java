class CookieJar {

  final private String cookieType;
  public static final int MAX_COOKIES = 20;
  private int cookieCount;

  public CookieJar(String type) {
    this.cookieType = type;
    cookieCount = 0;
  }

  public void fill(){
     fill(MAX_COOKIES);
  }

  public void fill(int cookies) {
    int newAmount = cookieCount + cookies;
    if (newAmount > MAX_COOKIES) {
      throw new IllegalArgumentException("Too many cookies for the cookie jar!");
    }
    cookieCount = newAmount;
  }

  public boolean isEmpty(){
    return cookieCount == 0;
  }

  public String getCookieType() {
    return cookieType;
  }

  public boolean dispense() {
    boolean wasDispensed = false;
    if (!isEmpty()) {
      cookieCount--;
      wasDispensed = true;
    }
    return wasDispensed;
  }
}
