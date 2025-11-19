package com.google.protobuf;

import com.google.protobuf.B;
import com.google.protobuf.C2958s.b;
import com.google.protobuf.C2964y;
import com.google.protobuf.P;
import com.google.protobuf.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FieldSet.java */
/* renamed from: com.google.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2958s<T extends b<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final C2958s f39389d = new C2958s(true);

    /* renamed from: a, reason: collision with root package name */
    private final i0<T, Object> f39390a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39391b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39392c;

    /* compiled from: FieldSet.java */
    /* renamed from: com.google.protobuf.s$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39393a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f39394b;

        static {
            int[] iArr = new int[r0.b.values().length];
            f39394b = iArr;
            try {
                iArr[r0.b.f39357D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39394b[r0.b.f39358E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39394b[r0.b.f39359F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39394b[r0.b.f39360G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39394b[r0.b.f39361H.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39394b[r0.b.f39362I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39394b[r0.b.f39363J.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39394b[r0.b.f39364K.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39394b[r0.b.f39366M.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39394b[r0.b.f39367N.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39394b[r0.b.f39365L.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f39394b[r0.b.f39368O.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f39394b[r0.b.f39369P.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f39394b[r0.b.f39371R.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f39394b[r0.b.f39372S.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f39394b[r0.b.f39373T.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f39394b[r0.b.f39374U.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f39394b[r0.b.f39370Q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r0.c.values().length];
            f39393a = iArr2;
            try {
                iArr2[r0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f39393a[r0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f39393a[r0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f39393a[r0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f39393a[r0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f39393a[r0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f39393a[r0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f39393a[r0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f39393a[r0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* renamed from: com.google.protobuf.s$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        int e();

        r0.b g();

        r0.c i();

        boolean isPacked();

        boolean isRepeated();

        P.a m(P.a aVar, P p10);
    }

    private C2958s() {
        this.f39390a = i0.u(16);
    }

    static void A(CodedOutputStream codedOutputStream, r0.b bVar, int i10, Object obj) {
        if (bVar == r0.b.f39366M) {
            codedOutputStream.w0(i10, (P) obj);
        } else {
            codedOutputStream.S0(i10, m(bVar, false));
            B(codedOutputStream, bVar, obj);
        }
    }

    static void B(CodedOutputStream codedOutputStream, r0.b bVar, Object obj) {
        switch (a.f39394b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.n0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.v0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.D0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.W0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.B0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.t0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.r0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.h0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.y0((P) obj);
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                codedOutputStream.F0((P) obj);
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof AbstractC2947g)) {
                    codedOutputStream.R0((String) obj);
                    break;
                } else {
                    codedOutputStream.l0((AbstractC2947g) obj);
                    break;
                }
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (!(obj instanceof AbstractC2947g)) {
                    codedOutputStream.i0((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.l0((AbstractC2947g) obj);
                    break;
                }
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                codedOutputStream.U0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.J0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.L0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.N0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.P0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof C2964y.c)) {
                    codedOutputStream.p0(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.p0(((C2964y.c) obj).e());
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
        int iT = CodedOutputStream.T(i10);
        if (bVar == r0.b.f39366M) {
            iT *= 2;
        }
        return iT + e(bVar, obj);
    }

    static int e(r0.b bVar, Object obj) {
        switch (a.f39394b[bVar.ordinal()]) {
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
                return obj instanceof AbstractC2947g ? CodedOutputStream.h((AbstractC2947g) obj) : CodedOutputStream.S((String) obj);
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return obj instanceof AbstractC2947g ? CodedOutputStream.h((AbstractC2947g) obj) : CodedOutputStream.f((byte[]) obj);
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
                return obj instanceof C2964y.c ? CodedOutputStream.l(((C2964y.c) obj).e()) : CodedOutputStream.l(((Integer) obj).intValue());
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
        List list = (List) obj;
        int iD = 0;
        if (!bVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iD += d(bVarG, iE, it.next());
            }
            return iD;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iD += e(bVarG, it2.next());
        }
        return CodedOutputStream.T(iE) + iD + CodedOutputStream.V(iD);
    }

    public static <T extends b<T>> C2958s<T> h() {
        return f39389d;
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
        if (key.i() != r0.c.MESSAGE) {
            return true;
        }
        if (!key.isRepeated()) {
            return r(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!r(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean r(Object obj) {
        if (obj instanceof Q) {
            return ((Q) obj).b();
        }
        if (obj instanceof B) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean s(r0.b bVar, Object obj) {
        C2964y.a(obj);
        switch (a.f39393a[bVar.c().ordinal()]) {
            case 7:
                if (!(obj instanceof AbstractC2947g) && !(obj instanceof byte[])) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof C2964y.c)) {
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

    private void w(Map.Entry<T, Object> entry) {
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
            this.f39390a.put(key, objI);
            return;
        }
        if (key.i() != r0.c.MESSAGE) {
            this.f39390a.put(key, c(value));
            return;
        }
        Object objI2 = i(key);
        if (objI2 == null) {
            this.f39390a.put(key, c(value));
        } else {
            this.f39390a.put(key, key.m(((P) objI2).d(), (P) value).e());
        }
    }

    public static <T extends b<T>> C2958s<T> x() {
        return new C2958s<>();
    }

    private void z(T t10, Object obj) {
        if (!s(t10.g(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.e()), t10.g().c(), obj.getClass().getName()));
        }
    }

    public void a(T t10, Object obj) {
        List arrayList;
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        z(t10, obj);
        Object objI = i(t10);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f39390a.put(t10, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2958s<T> clone() {
        C2958s<T> c2958sX = x();
        for (int i10 = 0; i10 < this.f39390a.m(); i10++) {
            Map.Entry<K, Object> entryL = this.f39390a.l(i10);
            c2958sX.y((b) entryL.getKey(), entryL.getValue());
        }
        Iterator it = this.f39390a.o().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c2958sX.y((b) entry.getKey(), entry.getValue());
        }
        c2958sX.f39392c = this.f39392c;
        return c2958sX;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2958s) {
            return this.f39390a.equals(((C2958s) obj).f39390a);
        }
        return false;
    }

    Iterator<Map.Entry<T, Object>> g() {
        return this.f39392c ? new B.c(this.f39390a.j().iterator()) : this.f39390a.j().iterator();
    }

    public int hashCode() {
        return this.f39390a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f39390a.get(t10);
        return obj instanceof B ? ((B) obj).f() : obj;
    }

    public int j() {
        int iK = 0;
        for (int i10 = 0; i10 < this.f39390a.m(); i10++) {
            iK += k(this.f39390a.l(i10));
        }
        Iterator it = this.f39390a.o().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public int l() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f39390a.m(); i10++) {
            Map.Entry<K, Object> entryL = this.f39390a.l(i10);
            iF += f((b) entryL.getKey(), entryL.getValue());
        }
        Iterator it = this.f39390a.o().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    boolean n() {
        return this.f39390a.isEmpty();
    }

    public boolean o() {
        return this.f39391b;
    }

    public boolean p() {
        for (int i10 = 0; i10 < this.f39390a.m(); i10++) {
            if (!q(this.f39390a.l(i10))) {
                return false;
            }
        }
        Iterator it = this.f39390a.o().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> t() {
        return this.f39392c ? new B.c(this.f39390a.entrySet().iterator()) : this.f39390a.entrySet().iterator();
    }

    public void u() {
        if (this.f39391b) {
            return;
        }
        for (int i10 = 0; i10 < this.f39390a.m(); i10++) {
            Map.Entry<K, Object> entryL = this.f39390a.l(i10);
            if (entryL.getValue() instanceof AbstractC2962w) {
                ((AbstractC2962w) entryL.getValue()).P();
            }
        }
        this.f39390a.s();
        this.f39391b = true;
    }

    public void v(C2958s<T> c2958s) {
        for (int i10 = 0; i10 < c2958s.f39390a.m(); i10++) {
            w(c2958s.f39390a.l(i10));
        }
        Iterator it = c2958s.f39390a.o().iterator();
        while (it.hasNext()) {
            w((Map.Entry) it.next());
        }
    }

    public void y(T t10, Object obj) {
        if (!t10.isRepeated()) {
            z(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z(t10, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof B) {
            this.f39392c = true;
        }
        this.f39390a.put(t10, obj);
    }

    private C2958s(boolean z10) {
        this(i0.u(0));
        u();
    }

    private C2958s(i0<T, Object> i0Var) {
        this.f39390a = i0Var;
        u();
    }
}
