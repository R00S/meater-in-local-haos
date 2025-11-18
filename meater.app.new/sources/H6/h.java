package H6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes2.dex */
public class h<T, Y> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<T, a<Y>> f5591a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f5592b;

    /* renamed from: c, reason: collision with root package name */
    private long f5593c;

    /* renamed from: d, reason: collision with root package name */
    private long f5594d;

    /* compiled from: LruCache.java */
    static final class a<Y> {

        /* renamed from: a, reason: collision with root package name */
        final Y f5595a;

        /* renamed from: b, reason: collision with root package name */
        final int f5596b;

        a(Y y10, int i10) {
            this.f5595a = y10;
            this.f5596b = i10;
        }
    }

    public h(long j10) {
        this.f5592b = j10;
        this.f5593c = j10;
    }

    private void f() {
        m(this.f5593c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Y g(T t10) {
        a<Y> aVar;
        aVar = this.f5591a.get(t10);
        return aVar != null ? aVar.f5595a : null;
    }

    public synchronized long h() {
        return this.f5593c;
    }

    protected int i(Y y10) {
        return 1;
    }

    public synchronized Y k(T t10, Y y10) {
        int i10 = i(y10);
        long j10 = i10;
        if (j10 >= this.f5593c) {
            j(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f5594d += j10;
        }
        a<Y> aVarPut = this.f5591a.put(t10, y10 == null ? null : new a<>(y10, i10));
        if (aVarPut != null) {
            this.f5594d -= aVarPut.f5596b;
            if (!aVarPut.f5595a.equals(y10)) {
                j(t10, aVarPut.f5595a);
            }
        }
        f();
        return aVarPut != null ? aVarPut.f5595a : null;
    }

    public synchronized Y l(T t10) {
        a<Y> aVarRemove = this.f5591a.remove(t10);
        if (aVarRemove == null) {
            return null;
        }
        this.f5594d -= aVarRemove.f5596b;
        return aVarRemove.f5595a;
    }

    protected synchronized void m(long j10) {
        while (this.f5594d > j10) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f5591a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f5594d -= value.f5596b;
            T key = next.getKey();
            it.remove();
            j(key, value.f5595a);
        }
    }

    protected void j(T t10, Y y10) {
    }
}
