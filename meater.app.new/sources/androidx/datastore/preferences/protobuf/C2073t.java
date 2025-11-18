package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.B;
import androidx.datastore.preferences.protobuf.C2073t.b;
import androidx.datastore.preferences.protobuf.C2079z;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FieldSet.java */
/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2073t<T extends b<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final C2073t f25086d = new C2073t(true);

    /* renamed from: a, reason: collision with root package name */
    private final i0<T, Object> f25087a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25088b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25089c;

    /* compiled from: FieldSet.java */
    /* renamed from: androidx.datastore.preferences.protobuf.t$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25090a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f25091b;

        static {
            int[] iArr = new int[r0.b.values().length];
            f25091b = iArr;
            try {
                iArr[r0.b.f25051D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25091b[r0.b.f25052E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25091b[r0.b.f25053F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25091b[r0.b.f25054G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25091b[r0.b.f25055H.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25091b[r0.b.f25056I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25091b[r0.b.f25057J.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25091b[r0.b.f25058K.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25091b[r0.b.f25060M.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25091b[r0.b.f25061N.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f25091b[r0.b.f25059L.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f25091b[r0.b.f25062O.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f25091b[r0.b.f25063P.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f25091b[r0.b.f25065R.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f25091b[r0.b.f25066S.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f25091b[r0.b.f25067T.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f25091b[r0.b.f25068U.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f25091b[r0.b.f25064Q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r0.c.values().length];
            f25090a = iArr2;
            try {
                iArr2[r0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f25090a[r0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f25090a[r0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f25090a[r0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f25090a[r0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f25090a[r0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f25090a[r0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f25090a[r0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f25090a[r0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* renamed from: androidx.datastore.preferences.protobuf.t$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        int e();

        r0.b g();

        r0.c i();

        boolean isPacked();

        boolean isRepeated();

        P.a r(P.a aVar, P p10);
    }

    private C2073t() {
        this.f25087a = i0.u(16);
    }

    static void A(CodedOutputStream codedOutputStream, r0.b bVar, Object obj) {
        switch (a.f25091b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.r0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.z0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.H0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.a1(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.F0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.x0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.v0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.l0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.C0((P) obj);
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                codedOutputStream.J0((P) obj);
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof AbstractC2062h)) {
                    codedOutputStream.V0((String) obj);
                    break;
                } else {
                    codedOutputStream.p0((AbstractC2062h) obj);
                    break;
                }
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (!(obj instanceof AbstractC2062h)) {
                    codedOutputStream.m0((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.p0((AbstractC2062h) obj);
                    break;
                }
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                codedOutputStream.Y0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.N0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.P0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.R0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.T0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof C2079z.c)) {
                    codedOutputStream.t0(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.t0(((C2079z.c) obj).e());
                    break;
                }
        }
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
        int iV = CodedOutputStream.V(i10);
        if (bVar == r0.b.f25060M) {
            iV *= 2;
        }
        return iV + e(bVar, obj);
    }

    static int e(r0.b bVar, Object obj) {
        switch (a.f25091b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Z(((Long) obj).longValue());
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
                return obj instanceof AbstractC2062h ? CodedOutputStream.h((AbstractC2062h) obj) : CodedOutputStream.U((String) obj);
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return obj instanceof AbstractC2062h ? CodedOutputStream.h((AbstractC2062h) obj) : CodedOutputStream.f((byte[]) obj);
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return CodedOutputStream.X(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.M(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.O(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.Q(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.S(((Long) obj).longValue());
            case 18:
                return obj instanceof C2079z.c ? CodedOutputStream.l(((C2079z.c) obj).e()) : CodedOutputStream.l(((Integer) obj).intValue());
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
            return CodedOutputStream.V(iE) + iD + CodedOutputStream.K(iD);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iD += d(bVarG, iE, it2.next());
        }
        return iD;
    }

    public static <T extends b<T>> C2073t<T> h() {
        return f25086d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.i() != r0.c.MESSAGE || key.isRepeated() || key.isPacked()) ? f(key, value) : value instanceof B ? CodedOutputStream.z(entry.getKey().e(), (B) value) : CodedOutputStream.D(entry.getKey().e(), (P) value);
    }

    static int m(r0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.j();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.i() == r0.c.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((P) it.next()).b()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof P)) {
                    if (value instanceof B) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((P) value).b()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean r(r0.b bVar, Object obj) {
        C2079z.a(obj);
        switch (a.f25090a[bVar.c().ordinal()]) {
            case 7:
                if (!(obj instanceof AbstractC2062h) && !(obj instanceof byte[])) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof C2079z.c)) {
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
            this.f25087a.put(key, objI);
            return;
        }
        if (key.i() != r0.c.MESSAGE) {
            this.f25087a.put(key, c(value));
            return;
        }
        Object objI2 = i(key);
        if (objI2 == null) {
            this.f25087a.put(key, c(value));
        } else {
            this.f25087a.put(key, key.r(((P) objI2).d(), (P) value).e());
        }
    }

    public static <T extends b<T>> C2073t<T> w() {
        return new C2073t<>();
    }

    private void y(r0.b bVar, Object obj) {
        if (!r(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void z(CodedOutputStream codedOutputStream, r0.b bVar, int i10, Object obj) {
        if (bVar == r0.b.f25060M) {
            codedOutputStream.A0(i10, (P) obj);
        } else {
            codedOutputStream.W0(i10, m(bVar, false));
            A(codedOutputStream, bVar, obj);
        }
    }

    public void a(T t10, Object obj) {
        List arrayList;
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        y(t10.g(), obj);
        Object objI = i(t10);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f25087a.put(t10, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2073t<T> clone() {
        C2073t<T> c2073tW = w();
        for (int i10 = 0; i10 < this.f25087a.m(); i10++) {
            Map.Entry<K, Object> entryL = this.f25087a.l(i10);
            c2073tW.x((b) entryL.getKey(), entryL.getValue());
        }
        Iterator it = this.f25087a.o().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c2073tW.x((b) entry.getKey(), entry.getValue());
        }
        c2073tW.f25089c = this.f25089c;
        return c2073tW;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2073t) {
            return this.f25087a.equals(((C2073t) obj).f25087a);
        }
        return false;
    }

    Iterator<Map.Entry<T, Object>> g() {
        return this.f25089c ? new B.c(this.f25087a.j().iterator()) : this.f25087a.j().iterator();
    }

    public int hashCode() {
        return this.f25087a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f25087a.get(t10);
        return obj instanceof B ? ((B) obj).f() : obj;
    }

    public int j() {
        int iK = 0;
        for (int i10 = 0; i10 < this.f25087a.m(); i10++) {
            iK += k(this.f25087a.l(i10));
        }
        Iterator it = this.f25087a.o().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public int l() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f25087a.m(); i10++) {
            Map.Entry<K, Object> entryL = this.f25087a.l(i10);
            iF += f((b) entryL.getKey(), entryL.getValue());
        }
        Iterator it = this.f25087a.o().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    boolean n() {
        return this.f25087a.isEmpty();
    }

    public boolean o() {
        return this.f25088b;
    }

    public boolean p() {
        for (int i10 = 0; i10 < this.f25087a.m(); i10++) {
            if (!q(this.f25087a.l(i10))) {
                return false;
            }
        }
        Iterator it = this.f25087a.o().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        return this.f25089c ? new B.c(this.f25087a.entrySet().iterator()) : this.f25087a.entrySet().iterator();
    }

    public void t() {
        if (this.f25088b) {
            return;
        }
        this.f25087a.s();
        this.f25088b = true;
    }

    public void u(C2073t<T> c2073t) {
        for (int i10 = 0; i10 < c2073t.f25087a.m(); i10++) {
            v(c2073t.f25087a.l(i10));
        }
        Iterator it = c2073t.f25087a.o().iterator();
        while (it.hasNext()) {
            v((Map.Entry) it.next());
        }
    }

    public void x(T t10, Object obj) {
        if (!t10.isRepeated()) {
            y(t10.g(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y(t10.g(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof B) {
            this.f25089c = true;
        }
        this.f25087a.put(t10, obj);
    }

    private C2073t(boolean z10) {
        this(i0.u(0));
        t();
    }

    private C2073t(i0<T, Object> i0Var) {
        this.f25087a = i0Var;
        t();
    }
}
