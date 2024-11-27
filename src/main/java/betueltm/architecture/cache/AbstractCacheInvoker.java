package betueltm.architecture.cache;

public abstract class AbstractCacheInvoker {

	protected Object doGet(Cache cache, Object key) {
		try {
			return cache.get(key);
		} catch (RuntimeException runtimeException) {
			// TODO: If the exception is handled, return a cache miss
			return null;
		}
	}
	
	protected void doPut(Cache cache, Object key, Object value) {
		try {
			cache.put(key, value);
		}
		catch (RuntimeException runtimeException) {
			// TODO: hendle exception?
			runtimeException.printStackTrace();
		}
	}
}