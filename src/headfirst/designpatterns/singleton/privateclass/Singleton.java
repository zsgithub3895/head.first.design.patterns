package headfirst.designpatterns.singleton.privateclass;


/**
 * 	@author zhangsai
 *	利用了classloader的机制来保证初始化instance时只有一个线程 
 */
public class Singleton {
	  private static class LazyHolder {
	       private static final Singleton INSTANCE = new Singleton();    
	    }    
	    private Singleton (){}    
	    public static final Singleton getInstance() {    
	       return LazyHolder.INSTANCE;    
	    }    
}
