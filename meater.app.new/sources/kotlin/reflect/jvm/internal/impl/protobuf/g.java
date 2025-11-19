package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.g.b;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.j;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.jvm.internal.impl.protobuf.w;

/* compiled from: FieldSet.java */
/* loaded from: classes3.dex */
final class g<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* renamed from: d, reason: collision with root package name */
    private static final g f44050d = new g(true);

    /* renamed from: b, reason: collision with root package name */
    private boolean f44052b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f44053c = false;

    /* renamed from: a, reason: collision with root package name */
    private final t<FieldDescriptorType, Object> f44051a = t.p(16);

    /* compiled from: FieldSet.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44054a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f44055b;

        static {
            int[] iArr = new int[w.b.values().length];
            f44055b = iArr;
            try {
                iArr[w.b.f44138D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44055b[w.b.f44139E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44055b[w.b.f44140F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44055b[w.b.f44141G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44055b[w.b.f44142H.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44055b[w.b.f44143I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44055b[w.b.f44144J.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44055b[w.b.f44145K.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44055b[w.b.f44146L.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44055b[w.b.f44149O.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44055b[w.b.f44150P.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f44055b[w.b.f44152R.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f44055b[w.b.f44153S.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f44055b[w.b.f44154T.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f44055b[w.b.f44155U.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f44055b[w.b.f44147M.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f44055b[w.b.f44148N.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f44055b[w.b.f44151Q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[w.c.values().length];
            f44054a = iArr2;
            try {
                iArr2[w.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f44054a[w.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f44054a[w.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f44054a[w.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f44054a[w.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f44054a[w.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f44054a[w.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f44054a[w.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f44054a[w.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    public interface b<T extends b<T>> extends Comparable<T> {
        int e();

        w.b g();

        w.c i();

        boolean isPacked();

        boolean isRepeated();

        o.a k(o.a aVar, o oVar);
    }

    private g() {
    }

    private Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int d(w.b bVar, int i10, Object obj) {
        int iD = CodedOutputStream.D(i10);
        if (bVar == w.b.f44147M) {
            iD *= 2;
        }
        return iD + e(bVar, obj);
    }

    private static int e(w.b bVar, Object obj) {
        switch (a.f44055b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.g(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.q(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.F(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.p(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.k(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.j(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.b(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.C((String) obj);
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return obj instanceof d ? CodedOutputStream.e((d) obj) : CodedOutputStream.c((byte[]) obj);
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return CodedOutputStream.E(((Integer) obj).intValue());
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return CodedOutputStream.x(((Integer) obj).intValue());
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.z(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.B(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.n((o) obj);
            case 17:
                return obj instanceof j ? CodedOutputStream.r((j) obj) : CodedOutputStream.t((o) obj);
            case 18:
                return obj instanceof i.a ? CodedOutputStream.i(((i.a) obj).e()) : CodedOutputStream.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        w.b bVarG = bVar.g();
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
            return CodedOutputStream.D(iE) + iD + CodedOutputStream.v(iD);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iD += d(bVarG, iE, it2.next());
        }
        return iD;
    }

    public static <T extends b<T>> g<T> g() {
        return f44050d;
    }

    static int l(w.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.j();
    }

    private boolean o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.i() == w.c.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((o) it.next()).b()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof o)) {
                    if (value instanceof j) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((o) value).b()) {
                    return false;
                }
            }
        }
        return true;
    }

    private void s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof j) {
            value = ((j) value).e();
        }
        if (key.isRepeated()) {
            Object objH = h(key);
            if (objH == null) {
                objH = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objH).add(c(it.next()));
            }
            this.f44051a.q(key, objH);
            return;
        }
        if (key.i() != w.c.MESSAGE) {
            this.f44051a.q(key, c(value));
            return;
        }
        Object objH2 = h(key);
        if (objH2 == null) {
            this.f44051a.q(key, c(value));
        } else {
            this.f44051a.q(key, key.k(((o) objH2).d(), (o) value).e());
        }
    }

    public static <T extends b<T>> g<T> t() {
        return new g<>();
    }

    public static Object u(e eVar, w.b bVar, boolean z10) {
        switch (a.f44055b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.m());
            case 2:
                return Float.valueOf(eVar.q());
            case 3:
                return Long.valueOf(eVar.t());
            case 4:
                return Long.valueOf(eVar.M());
            case 5:
                return Integer.valueOf(eVar.s());
            case 6:
                return Long.valueOf(eVar.p());
            case 7:
                return Integer.valueOf(eVar.o());
            case 8:
                return Boolean.valueOf(eVar.k());
            case 9:
                return z10 ? eVar.J() : eVar.I();
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return eVar.l();
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return Integer.valueOf(eVar.L());
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return Integer.valueOf(eVar.E());
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return Long.valueOf(eVar.F());
            case 14:
                return Integer.valueOf(eVar.G());
            case 15:
                return Long.valueOf(eVar.H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void w(kotlin.reflect.jvm.internal.impl.protobuf.w.b r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.f44054a
            kotlin.reflect.jvm.internal.impl.protobuf.w$c r2 = r2.c()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L2a;
                case 8: goto L21;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.o
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.j
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            r1 = r0
            goto L44
        L21:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i.a
            if (r2 == 0) goto L1e
            goto L1f
        L2a:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d
            if (r2 != 0) goto L1f
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L1f
        L33:
            boolean r1 = r3 instanceof java.lang.String
            goto L44
        L36:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r1 = r3 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L44
        L42:
            boolean r1 = r3 instanceof java.lang.Integer
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.g.w(kotlin.reflect.jvm.internal.impl.protobuf.w$b, java.lang.Object):void");
    }

    private static void x(CodedOutputStream codedOutputStream, w.b bVar, int i10, Object obj) throws IOException {
        if (bVar == w.b.f44147M) {
            codedOutputStream.Y(i10, (o) obj);
        } else {
            codedOutputStream.w0(i10, l(bVar, false));
            y(codedOutputStream, bVar, obj);
        }
    }

    private static void y(CodedOutputStream codedOutputStream, w.b bVar, Object obj) throws IOException {
        switch (a.f44055b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.R(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.X(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.c0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.z0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.b0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.V(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.U(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.M(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.v0((String) obj);
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                if (!(obj instanceof d)) {
                    codedOutputStream.N((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.P((d) obj);
                    break;
                }
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                codedOutputStream.y0(((Integer) obj).intValue());
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                codedOutputStream.q0(((Integer) obj).intValue());
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                codedOutputStream.r0(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.s0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.u0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.Z((o) obj);
                break;
            case 17:
                codedOutputStream.e0((o) obj);
                break;
            case 18:
                if (!(obj instanceof i.a)) {
                    codedOutputStream.T(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.T(((i.a) obj).e());
                    break;
                }
        }
    }

    public static void z(b<?> bVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        w.b bVarG = bVar.g();
        int iE = bVar.e();
        if (!bVar.isRepeated()) {
            if (obj instanceof j) {
                x(codedOutputStream, bVarG, iE, ((j) obj).e());
                return;
            } else {
                x(codedOutputStream, bVarG, iE, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!bVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x(codedOutputStream, bVarG, iE, it.next());
            }
            return;
        }
        codedOutputStream.w0(iE, 2);
        Iterator it2 = list.iterator();
        int iE2 = 0;
        while (it2.hasNext()) {
            iE2 += e(bVarG, it2.next());
        }
        codedOutputStream.o0(iE2);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            y(codedOutputStream, bVarG, it3.next());
        }
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        w(fielddescriptortype.g(), obj);
        Object objH = h(fielddescriptortype);
        if (objH == null) {
            arrayList = new ArrayList();
            this.f44051a.q(fielddescriptortype, arrayList);
        } else {
            arrayList = (List) objH;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g<FieldDescriptorType> clone() {
        g<FieldDescriptorType> gVarT = t();
        for (int i10 = 0; i10 < this.f44051a.k(); i10++) {
            Map.Entry<K, Object> entryJ = this.f44051a.j(i10);
            gVarT.v((b) entryJ.getKey(), entryJ.getValue());
        }
        Iterator it = this.f44051a.l().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            gVarT.v((b) entry.getKey(), entry.getValue());
        }
        gVarT.f44053c = this.f44053c;
        return gVarT;
    }

    public Object h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f44051a.get(fielddescriptortype);
        return obj instanceof j ? ((j) obj).e() : obj;
    }

    public Object i(FieldDescriptorType fielddescriptortype, int i10) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(fielddescriptortype);
        if (objH != null) {
            return ((List) objH).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int j(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(fielddescriptortype);
        if (objH == null) {
            return 0;
        }
        return ((List) objH).size();
    }

    public int k() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f44051a.k(); i10++) {
            Map.Entry<K, Object> entryJ = this.f44051a.j(i10);
            iF += f((b) entryJ.getKey(), entryJ.getValue());
        }
        Iterator it = this.f44051a.l().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean m(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f44051a.get(fielddescriptortype) != null;
    }

    public boolean n() {
        for (int i10 = 0; i10 < this.f44051a.k(); i10++) {
            if (!o(this.f44051a.j(i10))) {
                return false;
            }
        }
        Iterator it = this.f44051a.l().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> p() {
        return this.f44053c ? new j.c(this.f44051a.entrySet().iterator()) : this.f44051a.entrySet().iterator();
    }

    public void q() {
        if (this.f44052b) {
            return;
        }
        this.f44051a.o();
        this.f44052b = true;
    }

    public void r(g<FieldDescriptorType> gVar) {
        for (int i10 = 0; i10 < gVar.f44051a.k(); i10++) {
            s(gVar.f44051a.j(i10));
        }
        Iterator it = gVar.f44051a.l().iterator();
        while (it.hasNext()) {
            s((Map.Entry) it.next());
        }
    }

    public void v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            w(fielddescriptortype.g(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w(fielddescriptortype.g(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof j) {
            this.f44053c = true;
        }
        this.f44051a.q(fielddescriptortype, obj);
    }

    private g(boolean z10) {
        q();
    }
}
