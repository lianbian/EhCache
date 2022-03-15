package EhCache.listener;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;

public class CacheEventLogger implements CacheEventListener<Object, Object> {
    @Override
    public void onEvent(CacheEvent<?, ?> cacheEvent) {
        System.out.println("监听类型：" + cacheEvent.getType());
        System.out.println("监听KEY::" + cacheEvent.getKey());
        System.out.println("监听OLD-VALUE::" + cacheEvent.getOldValue());
        System.out.println("监听NEW-VALUE::" + cacheEvent.getNewValue());
    }
}
