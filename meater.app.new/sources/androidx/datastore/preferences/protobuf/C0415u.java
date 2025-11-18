package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0357a0;
import androidx.datastore.preferences.protobuf.C0363c0;
import androidx.datastore.preferences.protobuf.C0409r1;
import androidx.datastore.preferences.protobuf.C0415u.b;
import androidx.datastore.preferences.protobuf.InterfaceC0405q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FieldSet.java */
/* renamed from: androidx.datastore.preferences.protobuf.u */
/* loaded from: classes.dex */
final class C0415u<T extends b<T>> {

    /* renamed from: a */
    private static final C0415u f2934a = new C0415u(true);

    /* renamed from: b */
    private final C0382i1<T, Object> f2935b;

    /* renamed from: c */
    private boolean f2936c;

    /* renamed from: d */
    private boolean f2937d;

    /* compiled from: FieldSet.java */
    /* renamed from: androidx.datastore.preferences.protobuf.u$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2938a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2939b;

        static {
            int[] iArr = new int[C0409r1.b.values().length];
            f2939b = iArr;
            try {
                iArr[C0409r1.b.f2878f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2939b[C0409r1.b.f2879g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2939b[C0409r1.b.f2880h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2939b[C0409r1.b.f2881i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2939b[C0409r1.b.f2882j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2939b[C0409r1.b.f2883k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2939b[C0409r1.b.f2884l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2939b[C0409r1.b.f2885m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2939b[C0409r1.b.f2887o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2939b[C0409r1.b.f2888p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2939b[C0409r1.b.f2886n.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2939b[C0409r1.b.f2889q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2939b[C0409r1.b.f2890r.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2939b[C0409r1.b.f2892t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2939b[C0409r1.b.f2893u.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2939b[C0409r1.b.f2894v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2939b[C0409r1.b.f2895w.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2939b[C0409r1.b.f2891s.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C0409r1.c.values().length];
            f2938a = iArr2;
            try {
                iArr2[C0409r1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f2938a[C0409r1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f2938a[C0409r1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f2938a[C0409r1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f2938a[C0409r1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f2938a[C0409r1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f2938a[C0409r1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f2938a[C0409r1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f2938a[C0409r1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* renamed from: androidx.datastore.preferences.protobuf.u$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        /* renamed from: B */
        InterfaceC0405q0.a mo3300B(InterfaceC0405q0.a aVar, InterfaceC0405q0 interfaceC0405q0);

        /* renamed from: f */
        int mo3301f();

        /* renamed from: h */
        boolean mo3302h();

        /* renamed from: j */
        C0409r1.b mo3303j();

        /* renamed from: l */
        C0409r1.c mo3304l();

        /* renamed from: m */
        boolean mo3305m();
    }

    private C0415u() {
        this.f2935b = C0382i1.m2827r(16);
    }

    /* renamed from: A */
    static void m3273A(CodedOutputStream codedOutputStream, C0409r1.b bVar, Object obj) throws IOException {
        switch (a.f2939b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.m2506r0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.m2514z0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.m2473H0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.mo2492a1(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.mo2471F0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.mo2512x0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.mo2510v0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.m2500l0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.m2468C0((InterfaceC0405q0) obj);
                break;
            case 10:
                codedOutputStream.mo2475J0((InterfaceC0405q0) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC0377h)) {
                    codedOutputStream.mo2487V0((String) obj);
                    break;
                } else {
                    codedOutputStream.mo2504p0((AbstractC0377h) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC0377h)) {
                    codedOutputStream.m2501m0((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.mo2504p0((AbstractC0377h) obj);
                    break;
                }
            case 13:
                codedOutputStream.mo2490Y0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.m2479N0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.m2481P0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.m2483R0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.m2485T0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof C0357a0.c)) {
                    codedOutputStream.m2508t0(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.m2508t0(((C0357a0.c) obj).m2566f());
                    break;
                }
        }
    }

    /* renamed from: c */
    private static Object m3274c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: d */
    static int m3275d(C0409r1.b bVar, int i2, Object obj) {
        int iM2432V = CodedOutputStream.m2432V(i2);
        if (bVar == C0409r1.b.f2887o) {
            iM2432V *= 2;
        }
        return iM2432V + m3276e(bVar, obj);
    }

    /* renamed from: e */
    static int m3276e(C0409r1.b bVar, Object obj) {
        switch (a.f2939b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.m2449j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m2457r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m2464y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m2436Z(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m2462w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m2455p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m2453n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m2441e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m2459t((InterfaceC0405q0) obj);
            case 10:
                return obj instanceof C0363c0 ? CodedOutputStream.m2412B((C0363c0) obj) : CodedOutputStream.m2417G((InterfaceC0405q0) obj);
            case 11:
                return obj instanceof AbstractC0377h ? CodedOutputStream.m2446h((AbstractC0377h) obj) : CodedOutputStream.m2431U((String) obj);
            case 12:
                return obj instanceof AbstractC0377h ? CodedOutputStream.m2446h((AbstractC0377h) obj) : CodedOutputStream.m2442f((byte[]) obj);
            case 13:
                return CodedOutputStream.m2434X(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m2423M(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m2425O(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m2427Q(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m2429S(((Long) obj).longValue());
            case 18:
                return obj instanceof C0357a0.c ? CodedOutputStream.m2451l(((C0357a0.c) obj).m2566f()) : CodedOutputStream.m2451l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m3277f(b<?> bVar, Object obj) {
        C0409r1.b bVarMo3303j = bVar.mo3303j();
        int iMo3301f = bVar.mo3301f();
        if (!bVar.mo3302h()) {
            return m3275d(bVarMo3303j, iMo3301f, obj);
        }
        int iM3275d = 0;
        if (bVar.mo3305m()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM3275d += m3276e(bVarMo3303j, it.next());
            }
            return CodedOutputStream.m2432V(iMo3301f) + iM3275d + CodedOutputStream.m2421K(iM3275d);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM3275d += m3275d(bVarMo3303j, iMo3301f, it2.next());
        }
        return iM3275d;
    }

    /* renamed from: h */
    public static <T extends b<T>> C0415u<T> m3278h() {
        return f2934a;
    }

    /* renamed from: k */
    private int m3279k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.mo3304l() != C0409r1.c.MESSAGE || key.mo3302h() || key.mo3305m()) ? m3277f(key, value) : value instanceof C0363c0 ? CodedOutputStream.m2465z(entry.getKey().mo3301f(), (C0363c0) value) : CodedOutputStream.m2414D(entry.getKey().mo3301f(), (InterfaceC0405q0) value);
    }

    /* renamed from: m */
    static int m3280m(C0409r1.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.m3206k();
    }

    /* renamed from: q */
    private static <T extends b<T>> boolean m3281q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo3304l() == C0409r1.c.MESSAGE) {
            if (key.mo3302h()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC0405q0) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof InterfaceC0405q0)) {
                    if (value instanceof C0363c0) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((InterfaceC0405q0) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: r */
    private static boolean m3282r(C0409r1.b bVar, Object obj) {
        C0357a0.m2556a(obj);
        switch (a.f2938a[bVar.m3205g().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC0377h) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof C0357a0.c);
            case 9:
                return (obj instanceof InterfaceC0405q0) || (obj instanceof C0363c0);
            default:
                return false;
        }
    }

    /* renamed from: v */
    private void m3283v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C0363c0) {
            value = ((C0363c0) value).m2584f();
        }
        if (key.mo3302h()) {
            Object objM3290i = m3290i(key);
            if (objM3290i == null) {
                objM3290i = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM3290i).add(m3274c(it.next()));
            }
            this.f2935b.put(key, objM3290i);
            return;
        }
        if (key.mo3304l() != C0409r1.c.MESSAGE) {
            this.f2935b.put(key, m3274c(value));
            return;
        }
        Object objM3290i2 = m3290i(key);
        if (objM3290i2 == null) {
            this.f2935b.put(key, m3274c(value));
        } else {
            this.f2935b.put(key, key.mo3300B(((InterfaceC0405q0) objM3290i2).mo3152d(), (InterfaceC0405q0) value).mo3158c());
        }
    }

    /* renamed from: w */
    public static <T extends b<T>> C0415u<T> m3284w() {
        return new C0415u<>();
    }

    /* renamed from: y */
    private void m3285y(C0409r1.b bVar, Object obj) {
        if (!m3282r(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* renamed from: z */
    static void m3286z(CodedOutputStream codedOutputStream, C0409r1.b bVar, int i2, Object obj) throws IOException {
        if (bVar == C0409r1.b.f2887o) {
            codedOutputStream.m2466A0(i2, (InterfaceC0405q0) obj);
        } else {
            codedOutputStream.mo2488W0(i2, m3280m(bVar, false));
            m3273A(codedOutputStream, bVar, obj);
        }
    }

    /* renamed from: a */
    public void m3287a(T t, Object obj) {
        List arrayList;
        if (!t.mo3302h()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m3285y(t.mo3303j(), obj);
        Object objM3290i = m3290i(t);
        if (objM3290i == null) {
            arrayList = new ArrayList();
            this.f2935b.put(t, arrayList);
        } else {
            arrayList = (List) objM3290i;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0415u<T> clone() {
        C0415u<T> c0415uM3284w = m3284w();
        for (int i2 = 0; i2 < this.f2935b.m2831l(); i2++) {
            Map.Entry<K, Object> entryM2830k = this.f2935b.m2830k(i2);
            c0415uM3284w.m3299x((b) entryM2830k.getKey(), entryM2830k.getValue());
        }
        Iterator it = this.f2935b.m2833n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c0415uM3284w.m3299x((b) entry.getKey(), entry.getValue());
        }
        c0415uM3284w.f2937d = this.f2937d;
        return c0415uM3284w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0415u) {
            return this.f2935b.equals(((C0415u) obj).f2935b);
        }
        return false;
    }

    /* renamed from: g */
    Iterator<Map.Entry<T, Object>> m3289g() {
        return this.f2937d ? new C0363c0.c(this.f2935b.m2829i().iterator()) : this.f2935b.m2829i().iterator();
    }

    public int hashCode() {
        return this.f2935b.hashCode();
    }

    /* renamed from: i */
    public Object m3290i(T t) {
        Object obj = this.f2935b.get(t);
        return obj instanceof C0363c0 ? ((C0363c0) obj).m2584f() : obj;
    }

    /* renamed from: j */
    public int m3291j() {
        int iM3279k = 0;
        for (int i2 = 0; i2 < this.f2935b.m2831l(); i2++) {
            iM3279k += m3279k(this.f2935b.m2830k(i2));
        }
        Iterator it = this.f2935b.m2833n().iterator();
        while (it.hasNext()) {
            iM3279k += m3279k((Map.Entry) it.next());
        }
        return iM3279k;
    }

    /* renamed from: l */
    public int m3292l() {
        int iM3277f = 0;
        for (int i2 = 0; i2 < this.f2935b.m2831l(); i2++) {
            Map.Entry<K, Object> entryM2830k = this.f2935b.m2830k(i2);
            iM3277f += m3277f((b) entryM2830k.getKey(), entryM2830k.getValue());
        }
        Iterator it = this.f2935b.m2833n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM3277f += m3277f((b) entry.getKey(), entry.getValue());
        }
        return iM3277f;
    }

    /* renamed from: n */
    boolean m3293n() {
        return this.f2935b.isEmpty();
    }

    /* renamed from: o */
    public boolean m3294o() {
        return this.f2936c;
    }

    /* renamed from: p */
    public boolean m3295p() {
        for (int i2 = 0; i2 < this.f2935b.m2831l(); i2++) {
            if (!m3281q(this.f2935b.m2830k(i2))) {
                return false;
            }
        }
        Iterator it = this.f2935b.m2833n().iterator();
        while (it.hasNext()) {
            if (!m3281q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public Iterator<Map.Entry<T, Object>> m3296s() {
        return this.f2937d ? new C0363c0.c(this.f2935b.entrySet().iterator()) : this.f2935b.entrySet().iterator();
    }

    /* renamed from: t */
    public void m3297t() {
        if (this.f2936c) {
            return;
        }
        this.f2935b.mo2835q();
        this.f2936c = true;
    }

    /* renamed from: u */
    public void m3298u(C0415u<T> c0415u) {
        for (int i2 = 0; i2 < c0415u.f2935b.m2831l(); i2++) {
            m3283v(c0415u.f2935b.m2830k(i2));
        }
        Iterator it = c0415u.f2935b.m2833n().iterator();
        while (it.hasNext()) {
            m3283v((Map.Entry) it.next());
        }
    }

    /* renamed from: x */
    public void m3299x(T t, Object obj) {
        if (!t.mo3302h()) {
            m3285y(t.mo3303j(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m3285y(t.mo3303j(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C0363c0) {
            this.f2937d = true;
        }
        this.f2935b.put(t, obj);
    }

    private C0415u(boolean z) {
        this(C0382i1.m2827r(0));
        m3297t();
    }

    private C0415u(C0382i1<T, Object> c0382i1) {
        this.f2935b = c0382i1;
        m3297t();
    }
}
