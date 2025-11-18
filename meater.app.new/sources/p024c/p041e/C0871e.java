package p024c.p041e;

import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: LruCache.java */
/* renamed from: c.e.e */
/* loaded from: classes.dex */
public class C0871e<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f5729a;

    /* renamed from: b */
    private int f5730b;

    /* renamed from: c */
    private int f5731c;

    /* renamed from: d */
    private int f5732d;

    /* renamed from: e */
    private int f5733e;

    /* renamed from: f */
    private int f5734f;

    /* renamed from: g */
    private int f5735g;

    /* renamed from: h */
    private int f5736h;

    public C0871e(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f5731c = i2;
        this.f5729a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: e */
    private int m5447e(K k2, V v) {
        int iM5452f = m5452f(k2, v);
        if (iM5452f >= 0) {
            return iM5452f;
        }
        throw new IllegalStateException("Negative size: " + k2 + "=" + v);
    }

    /* renamed from: a */
    protected V m5448a(K k2) {
        return null;
    }

    /* renamed from: b */
    protected void m5449b(boolean z, K k2, V v, V v2) {
    }

    /* renamed from: c */
    public final V m5450c(K k2) {
        V v;
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v2 = this.f5729a.get(k2);
            if (v2 != null) {
                this.f5735g++;
                return v2;
            }
            this.f5736h++;
            V vM5448a = m5448a(k2);
            if (vM5448a == null) {
                return null;
            }
            synchronized (this) {
                this.f5733e++;
                v = (V) this.f5729a.put(k2, vM5448a);
                if (v != null) {
                    this.f5729a.put(k2, v);
                } else {
                    this.f5730b += m5447e(k2, vM5448a);
                }
            }
            if (v != null) {
                m5449b(false, k2, vM5448a, v);
                return v;
            }
            m5453g(this.f5731c);
            return vM5448a;
        }
    }

    /* renamed from: d */
    public final V m5451d(K k2, V v) {
        V vPut;
        if (k2 == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f5732d++;
            this.f5730b += m5447e(k2, v);
            vPut = this.f5729a.put(k2, v);
            if (vPut != null) {
                this.f5730b -= m5447e(k2, vPut);
            }
        }
        if (vPut != null) {
            m5449b(false, k2, vPut, v);
        }
        m5453g(this.f5731c);
        return vPut;
    }

    /* renamed from: f */
    protected int m5452f(K k2, V v) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m5453g(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f5730b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f5729a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f5730b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f5730b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f5729a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f5729a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f5729a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f5730b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.m5447e(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f5730b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f5734f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f5734f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.m5449b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            goto L75
        L74:
            throw r5
        L75:
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p041e.C0871e.m5453g(int):void");
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f5735g;
        i3 = this.f5736h + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f5731c), Integer.valueOf(this.f5735g), Integer.valueOf(this.f5736h), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }
}
