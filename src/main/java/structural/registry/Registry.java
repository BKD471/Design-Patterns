package structural.registry;

import java.util.HashMap;
import java.util.Map;

//class for registering all services in the application
public class Registry<K,V> {
    private static Registry instance=null;
    Map<K,V> services=null;

    //private logic, dont allow outsiders to invoke
    private Registry(){
       services=new HashMap<K,V>();
    }

    //there must be one and only instance of registry
    // available
    //throughout the application

    //there are possiblity that mutiple threads will access it
    //so thread safety is must
    public  static Registry getInstance(){
        if(null==instance){
            synchronized (Registry.class){
                if(null==instance) instance=new Registry();
            }
        }
        return instance;
    }

    public V get(K key){
        return services.get(key);
    }

    public void set(K key,V value){
        services.put(key,value);
    }
}
