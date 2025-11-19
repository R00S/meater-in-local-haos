package s;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import t.C4533b;
import t.C4534c;
import t.C4535d;

/* compiled from: LruCache.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\rJ1\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\rJ\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u001a\u0010\u000bJ\u0019\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!¨\u0006."}, d2 = {"Ls/x;", "", "K", "V", "", "maxSize", "<init>", "(I)V", "key", "value", "f", "(Ljava/lang/Object;Ljava/lang/Object;)I", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Loa/F;", "i", "e", "", "evicted", "oldValue", "newValue", "b", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "a", "g", "", "h", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "I", "Lt/c;", "Lt/c;", "map", "Lt/b;", "Lt/b;", "lock", "size", "putCount", "createCount", "evictionCount", "hitCount", "missCount", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4413x<K, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int maxSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C4534c<K, V> map;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C4533b lock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int putCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int createCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int evictionCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int hitCount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int missCount;

    public C4413x(int i10) {
        this.maxSize = i10;
        if (!(i10 > 0)) {
            C4535d.a("maxSize <= 0");
        }
        this.map = new C4534c<>(0, 0.75f);
        this.lock = new C4533b();
    }

    private final int f(K key, V value) {
        int iG = g(key, value);
        if (!(iG >= 0)) {
            C4535d.b("Negative size: " + key + '=' + value);
        }
        return iG;
    }

    protected V a(K key) {
        C3862t.g(key, "key");
        return null;
    }

    protected void b(boolean evicted, K key, V oldValue, V newValue) {
        C3862t.g(key, "key");
        C3862t.g(oldValue, "oldValue");
    }

    public final V c(K key) {
        V v10;
        C3862t.g(key, "key");
        synchronized (this.lock) {
            V vA = this.map.a(key);
            if (vA != null) {
                this.hitCount++;
                return vA;
            }
            this.missCount++;
            V vA2 = a(key);
            if (vA2 == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v10 = (V) this.map.d(key, vA2);
                    if (v10 != null) {
                        this.map.d(key, v10);
                    } else {
                        this.size += f(key, vA2);
                        C4153F c4153f = C4153F.f46609a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v10 != null) {
                b(false, key, vA2, v10);
                return v10;
            }
            i(this.maxSize);
            return vA2;
        }
    }

    public final V d(K key, V value) {
        V vD;
        C3862t.g(key, "key");
        C3862t.g(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += f(key, value);
                vD = this.map.d(key, value);
                if (vD != null) {
                    this.size -= f(key, vD);
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vD != null) {
            b(false, key, vD, value);
        }
        i(this.maxSize);
        return vD;
    }

    public final V e(K key) {
        V vE;
        C3862t.g(key, "key");
        synchronized (this.lock) {
            try {
                vE = this.map.e(key);
                if (vE != null) {
                    this.size -= f(key, vE);
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vE != null) {
            b(false, key, vE, null);
        }
        return vE;
    }

    protected int g(K key, V value) {
        C3862t.g(key, "key");
        C3862t.g(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> h() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.b().size());
            Iterator<T> it = this.map.b().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(int r7) {
        /*
            r6 = this;
        L0:
            t.b r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch: java.lang.Throwable -> L15
            r2 = 1
            if (r1 < 0) goto L19
            t.c<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            int r1 = r6.size     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L19
            goto L17
        L15:
            r7 = move-exception
            goto L63
        L17:
            r1 = r2
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 != 0) goto L21
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            t.C4535d.b(r1)     // Catch: java.lang.Throwable -> L15
        L21:
            int r1 = r6.size     // Catch: java.lang.Throwable -> L15
            if (r1 <= r7) goto L61
            t.c<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L2e
            goto L61
        L2e:
            t.c<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L15
            java.util.Set r1 = r1.b()     // Catch: java.lang.Throwable -> L15
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = kotlin.collections.r.k0(r1)     // Catch: java.lang.Throwable -> L15
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L40
            monitor-exit(r0)
            return
        L40:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L15
            t.c<K, V> r4 = r6.map     // Catch: java.lang.Throwable -> L15
            r4.e(r3)     // Catch: java.lang.Throwable -> L15
            int r4 = r6.size     // Catch: java.lang.Throwable -> L15
            int r5 = r6.f(r3, r1)     // Catch: java.lang.Throwable -> L15
            int r4 = r4 - r5
            r6.size = r4     // Catch: java.lang.Throwable -> L15
            int r4 = r6.evictionCount     // Catch: java.lang.Throwable -> L15
            int r4 = r4 + r2
            r6.evictionCount = r4     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            r0 = 0
            r6.b(r2, r3, r1, r0)
            goto L0
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C4413x.i(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i10 = this.hitCount;
                int i11 = this.missCount + i10;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
