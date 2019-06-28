package cn.com.zxrj.oo.thread.sleep;

public class TestSleep {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Thread low = new Thread(new ThreadOne(false, "low"));
    Thread high = new Thread(new ThreadOne(true, "high"));
    low.setPriority(1);
    high.setPriority(10);
    low.start();
    high.start();
  }

}

class ThreadOne implements Runnable {
  private boolean flag;
  
  private int i = 100;
  
  private String name;
  
  public ThreadOne(boolean flag, String name) {
    this.flag = flag;
    this.name = name;
  }
  
  public void run() {
    while(true) {
      System.out.println(name + " : " + i);
      if(flag) {
        if(i == 50) {
          try {
            Thread.sleep(5);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      }
      if(--i == 0) break;
    }
  }
}