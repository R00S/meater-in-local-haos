package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C2909t.b;
import com.google.crypto.tink.shaded.protobuf.C2915z;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FieldSet.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2909t<T extends b<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final C2909t f37962d = new C2909t(true);

    /* renamed from: a, reason: collision with root package name */
    private final i0<T, Object> f37963a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37964b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37965c;

    /* compiled from: FieldSet.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37966a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f37967b;

        static {
            int[] iArr = new int[r0.b.values().length];
            f37967b = iArr;
            try {
                iArr[r0.b.f37927D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37967b[r0.b.f37928E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37967b[r0.b.f37929F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37967b[r0.b.f37930G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37967b[r0.b.f37931H.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37967b[r0.b.f37932I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37967b[r0.b.f37933J.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37967b[r0.b.f37934K.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37967b[r0.b.f37936M.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37967b[r0.b.f37937N.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37967b[r0.b.f37935L.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37967b[r0.b.f37938O.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37967b[r0.b.f37939P.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37967b[r0.b.f37941R.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f37967b[r0.b.f37942S.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f37967b[r0.b.f37943T.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f37967b[r0.b.f37944U.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f37967b[r0.b.f37940Q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r0.c.values().length];
            f37966a = iArr2;
            try {
                iArr2[r0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f37966a[r0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f37966a[r0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f37966a[r0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f37966a[r0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f37966a[r0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f37966a[r0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f37966a[r0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f37966a[r0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.t$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        int e();

        r0.b g();

        r0.c i();

        boolean isPacked();

        boolean isRepeated();

        P.a o(P.a aVar, P p10);
    }

    private C2909t() {
        this.f37963a = i0.u(16);
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(r0.b bVar, int i10, Object obj) {
        int iT = CodedOutputStream.T(i10);
        if (bVar == r0.b.f37936M) {
            iT *= 2;
        }
        return iT + e(bVar, obj);
    }

    static int e(r0.b bVar, Object obj) {
        switch (a.f37967b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.X(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.t((P) obj);
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return obj instanceof B ? CodedOutputStream.B((B) obj) : CodedOutputStream.G((P) obj);
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return obj instanceof AbstractC2898h ? CodedOutputStream.h((AbstractC2898h) obj) : CodedOutputStream.S((String) obj);
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return obj instanceof AbstractC2898h ? CodedOutputStream.h((AbstractC2898h) obj) : CodedOutputStream.f((byte[]) obj);
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return CodedOutputStream.V(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.K(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.M(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.O(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.Q(((Long) obj).longValue());
            case 18:
                return obj instanceof C2915z.c ? CodedOutputStream.l(((C2915z.c) obj).e()) : CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        r0.b bVarG = bVar.g();
        int iE = bVar.e();
        if (!bVar.isRepeated()) {
            return d(bVarG, iE, obj);
        }
        int iD = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iD += e(bVarG, it.next());
            }
            return CodedOutputStream.T(iE) + iD + CodedOutputStream.V(iD);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iD += d(bVarG, iE, it2.next());
        }
        return iD;
    }

    public static <T extends b<T>> C2909t<T> h() {
        return f37962d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.i() != r0.c.MESSAGE || key.isRepeated() || key.isPacked()) ? f(key, value) : value instanceof B ? CodedOutputStream.z(entry.getKey().e(), (B) value) : CodedOutputStream.D(entry.getKey().e(), (P) value);
    }

    private static <T extends b<T>> boolean p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.i() != r0.c.MESSAGE) {
            return true;
        }
        if (!key.isRepeated()) {
            return q(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!q(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean q(Object obj) {
        if (obj instanceof Q) {
            return ((Q) obj).b();
        }
        if (obj instanceof B) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean r(r0.b bVar, Object obj) {
        C2915z.a(obj);
        switch (a.f37966a[bVar.c().ordinal()]) {
            case 7:
                if (!(obj instanceof AbstractC2898h) && !(obj instanceof byte[])) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof C2915z.c)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof P) && !(obj instanceof B)) {
                    break;
                }
                break;
        }
        return false;
    }

    private void v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof B) {
            value = ((B) value).f();
        }
        if (key.isRepeated()) {
            Object objI = i(key);
            if (objI == null) {
                objI = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI).add(c(it.next()));
            }
            this.f37963a.put(key, objI);
            return;
        }
        if (key.i() != r0.c.MESSAGE) {
            this.f37963a.put(key, c(value));
            return;
        }
        Object objI2 = i(key);
        if (objI2 == null) {
            this.f37963a.put(key, c(value));
        } else {
            this.f37963a.put(key, key.o(((P) objI2).d(), (P) value).e());
        }
    }

    public static <T extends b<T>> C2909t<T> w() {
        return new C2909t<>();
    }

    private void y(T t10, Object obj) {
        if (!r(t10.g(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.e()), t10.g().c(), obj.getClass().getName()));
        }
    }

    public void a(T t10, Object obj) {
        List arrayList;
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        y(t10, obj);
        Object objI = i(t10);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f37963a.put(t10, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2909t<T> clone() {
        C2909t<T> c2909tW = w();
        for (int i10 = 0; i10 < this.f37963a.m(); i10++) {
            Map.Entry<K, Object> entryL = this.f37963a.l(i10);
            c2909tW.x((b) entryL.getKey(), entryL.getValue());
        }
        Iterator it = this.f37963a.o().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c2909tW.x((b) entry.getKey(), entry.getValue());
        }
        c2909tW.f37965c = this.f37965c;
        return c2909tW;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2909t) {
            return this.f37963a.equals(((C2909t) obj).f37963a);
        }
        return false;
    }

    Iterator<Map.Entry<T, Object>> g() {
        return this.f37965c ? new B.c(this.f37963a.j().iterator()) : this.f37963a.j().iterator();
    }

    public int hashCode() {
        return this.f37963a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f37963a.get(t10);
        return obj instanceof B ? ((B) obj).f() : obj;
    }

    public int j() {
        int iK = 0;
        for (int i10 = 0; i10 < this.f37963a.m(); i10++) {
            iK += k(this.f37963a.l(i10));
        }
        Iterator it = this.f37963a.o().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public int l() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f37963a.m(); i10++) {
            Map.Entry<K, Object> entryL = this.f37963a.l(i10);
            iF += f((b) entryL.getKey(), entryL.getValue());
        }
        Iterator it = this.f37963a.o().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    boolean m() {
        return this.f37963a.isEmpty();
    }

    public boolean n() {
        return this.f37964b;
    }

    public boolean o() {
        for (int i10 = 0; i10 < this.f37963a.m(); i10++) {
            if (!p(this.f37963a.l(i10))) {
                return false;
            }
        }
        Iterator it = this.f37963a.o().iterator();
        while (it.hasNext()) {
            if (!p((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        return this.f37965c ? new B.c(this.f37963a.entrySet().iterator()) : this.f37963a.entrySet().iterator();
    }

    public void t() {
        if (this.f37964b) {
            return;
        }
        for (int i10 = 0; i10 < this.f37963a.m(); i10++) {
            Map.Entry<K, Object> entryL = this.f37963a.l(i10);
            if (entryL.getValue() instanceof AbstractC2913x) {
                ((AbstractC2913x) entryL.getValue()).I();
            }
        }
        this.f37963a.s();
        this.f37964b = true;
    }

    public void u(C2909t<T> c2909t) {
        for (int i10 = 0; i10 < c2909t.f37963a.m(); i10++) {
            v(c2909t.f37963a.l(i10));
        }
        Iterator it = c2909t.f37963a.o().iterator();
        while (it.hasNext()) {
            v((Map.Entry) it.next());
        }
    }

    public void x(T t10, Object obj) {
        if (!t10.isRepeated()) {
            y(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y(t10, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof B) {
            this.f37965c = true;
        }
        this.f37963a.put(t10, obj);
    }

    private C2909t(boolean z10) {
        this(i0.u(0));
        t();
    }

    private C2909t(i0<T, Object> i0Var) {
        this.f37963a = i0Var;
        t();
    }
}
