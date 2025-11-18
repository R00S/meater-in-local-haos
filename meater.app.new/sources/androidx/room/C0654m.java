package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p024c.p082u.p083a.InterfaceC1010d;
import p024c.p082u.p083a.InterfaceC1011e;

/* compiled from: RoomSQLiteQuery.java */
/* renamed from: androidx.room.m */
/* loaded from: classes.dex */
public class C0654m implements InterfaceC1011e, InterfaceC1010d {

    /* renamed from: f */
    static final TreeMap<Integer, C0654m> f4328f = new TreeMap<>();

    /* renamed from: g */
    private volatile String f4329g;

    /* renamed from: h */
    final long[] f4330h;

    /* renamed from: i */
    final double[] f4331i;

    /* renamed from: j */
    final String[] f4332j;

    /* renamed from: k */
    final byte[][] f4333k;

    /* renamed from: l */
    private final int[] f4334l;

    /* renamed from: m */
    final int f4335m;

    /* renamed from: n */
    int f4336n;

    private C0654m(int i2) {
        this.f4335m = i2;
        int i3 = i2 + 1;
        this.f4334l = new int[i3];
        this.f4330h = new long[i3];
        this.f4331i = new double[i3];
        this.f4332j = new String[i3];
        this.f4333k = new byte[i3][];
    }

    /* renamed from: c */
    public static C0654m m4644c(String str, int i2) {
        TreeMap<Integer, C0654m> treeMap = f4328f;
        synchronized (treeMap) {
            Map.Entry<Integer, C0654m> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (entryCeilingEntry == null) {
                C0654m c0654m = new C0654m(i2);
                c0654m.m4650d(str, i2);
                return c0654m;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            C0654m value = entryCeilingEntry.getValue();
            value.m4650d(str, i2);
            return value;
        }
    }

    /* renamed from: e */
    private static void m4645e() {
        TreeMap<Integer, C0654m> treeMap = f4328f;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i2 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i2;
        }
    }

    @Override // p024c.p082u.p083a.InterfaceC1010d
    /* renamed from: I0 */
    public void mo4646I0(int i2) {
        this.f4334l[i2] = 1;
    }

    @Override // p024c.p082u.p083a.InterfaceC1010d
    /* renamed from: L */
    public void mo4647L(int i2, double d2) {
        this.f4334l[i2] = 3;
        this.f4331i[i2] = d2;
    }

    @Override // p024c.p082u.p083a.InterfaceC1011e
    /* renamed from: a */
    public String mo4648a() {
        return this.f4329g;
    }

    @Override // p024c.p082u.p083a.InterfaceC1011e
    /* renamed from: b */
    public void mo4649b(InterfaceC1010d interfaceC1010d) {
        for (int i2 = 1; i2 <= this.f4336n; i2++) {
            int i3 = this.f4334l[i2];
            if (i3 == 1) {
                interfaceC1010d.mo4646I0(i2);
            } else if (i3 == 2) {
                interfaceC1010d.mo4652h0(i2, this.f4330h[i2]);
            } else if (i3 == 3) {
                interfaceC1010d.mo4647L(i2, this.f4331i[i2]);
            } else if (i3 == 4) {
                interfaceC1010d.mo4654w(i2, this.f4332j[i2]);
            } else if (i3 == 5) {
                interfaceC1010d.mo4653o0(i2, this.f4333k[i2]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: d */
    void m4650d(String str, int i2) {
        this.f4329g = str;
        this.f4336n = i2;
    }

    /* renamed from: f */
    public void m4651f() {
        TreeMap<Integer, C0654m> treeMap = f4328f;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f4335m), this);
            m4645e();
        }
    }

    @Override // p024c.p082u.p083a.InterfaceC1010d
    /* renamed from: h0 */
    public void mo4652h0(int i2, long j2) {
        this.f4334l[i2] = 2;
        this.f4330h[i2] = j2;
    }

    @Override // p024c.p082u.p083a.InterfaceC1010d
    /* renamed from: o0 */
    public void mo4653o0(int i2, byte[] bArr) {
        this.f4334l[i2] = 5;
        this.f4333k[i2] = bArr;
    }

    @Override // p024c.p082u.p083a.InterfaceC1010d
    /* renamed from: w */
    public void mo4654w(int i2, String str) {
        this.f4334l[i2] = 4;
        this.f4332j[i2] = str;
    }
}
