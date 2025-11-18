package cm.aptoide.p092pt.dataprovider.cache;

/* loaded from: classes.dex */
abstract class StringBaseCache<K, V> extends BaseCache<K, V, String> {
    StringBaseCache(KeyAlgorithm<K, String> keyAlgorithm) {
        super(keyAlgorithm);
    }

    @Override // cm.aptoide.p092pt.dataprovider.cache.Cache
    public boolean contains(K k2) {
        KeyAlgorithm<K, Tout> keyAlgorithm = this.keyAlgorithm;
        if (keyAlgorithm != 0) {
            return contains((String) keyAlgorithm.getKeyFrom(k2));
        }
        throw new UnsupportedOperationException("Initialize cache using init() first");
    }

    abstract boolean contains(String str);

    @Override // cm.aptoide.p092pt.dataprovider.cache.Cache
    public V get(K k2) {
        if (this.keyAlgorithm == null) {
            throw new UnsupportedOperationException("Initialize cache using init() first");
        }
        if (isValid((StringBaseCache<K, V>) k2)) {
            return get((String) this.keyAlgorithm.getKeyFrom(k2), k2);
        }
        return null;
    }

    abstract V get(String str, K k2);

    @Override // cm.aptoide.p092pt.dataprovider.cache.Cache
    public boolean isValid(K k2) {
        KeyAlgorithm<K, Tout> keyAlgorithm = this.keyAlgorithm;
        if (keyAlgorithm == 0) {
            throw new UnsupportedOperationException("Initialize cache using init() first");
        }
        String str = (String) keyAlgorithm.getKeyFrom(k2);
        return contains(str) && isValid(str);
    }

    abstract boolean isValid(String str);

    @Override // cm.aptoide.p092pt.dataprovider.cache.Cache
    public void put(K k2, V v) {
        KeyAlgorithm<K, Tout> keyAlgorithm = this.keyAlgorithm;
        if (keyAlgorithm == 0) {
            throw new UnsupportedOperationException("Initialize cache using init() first");
        }
        put((String) keyAlgorithm.getKeyFrom(k2), (String) v);
    }

    abstract void put(String str, V v);

    @Override // cm.aptoide.p092pt.dataprovider.cache.Cache
    public void remove(K k2) {
        KeyAlgorithm<K, Tout> keyAlgorithm = this.keyAlgorithm;
        if (keyAlgorithm == 0) {
            throw new UnsupportedOperationException("Initialize cache using init() first");
        }
        remove((String) keyAlgorithm.getKeyFrom(k2));
    }

    abstract void remove(String str);
}
