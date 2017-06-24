class CookieJar {

  final private String cookieType;
  public static final int MAX_COOKIES = 20;
  private int cookieCount;

  public CookieJar(String type) {
    this.cookieType = type;
    cookieCount = 0;
  }

  public void fill (){
    cookieCount = MAX_COOKIES;
  }

  public boolean isEmpty(){
    return cookieCount == 0;
  }

}
