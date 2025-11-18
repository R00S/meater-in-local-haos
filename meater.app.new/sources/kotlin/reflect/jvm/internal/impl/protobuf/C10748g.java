package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C10748g.b;
import kotlin.reflect.jvm.internal.impl.protobuf.C10750i;
import kotlin.reflect.jvm.internal.impl.protobuf.C10751j;
import kotlin.reflect.jvm.internal.impl.protobuf.C10764w;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o;

/* compiled from: FieldSet.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g */
/* loaded from: classes3.dex */
final class C10748g<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* renamed from: a */
    private static final C10748g f41288a = new C10748g(true);

    /* renamed from: c */
    private boolean f41290c;

    /* renamed from: d */
    private boolean f41291d = false;

    /* renamed from: b */
    private final C10761t<FieldDescriptorType, Object> f41289b = C10761t.m38462o(16);

    /* compiled from: FieldSet.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f41292a;

        /* renamed from: b */
        static final /* synthetic */ int[] f41293b;

        static {
            int[] iArr = new int[C10764w.b.values().length];
            f41293b = iArr;
            try {
                iArr[C10764w.b.f41376f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41293b[C10764w.b.f41377g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41293b[C10764w.b.f41378h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41293b[C10764w.b.f41379i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41293b[C10764w.b.f41380j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41293b[C10764w.b.f41381k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41293b[C10764w.b.f41382l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41293b[C10764w.b.f41383m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41293b[C10764w.b.f41384n.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41293b[C10764w.b.f41387q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41293b[C10764w.b.f41388r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41293b[C10764w.b.f41390t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f41293b[C10764w.b.f41391u.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f41293b[C10764w.b.f41392v.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f41293b[C10764w.b.f41393w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f41293b[C10764w.b.f41385o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f41293b[C10764w.b.f41386p.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f41293b[C10764w.b.f41389s.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C10764w.c.values().length];
            f41292a = iArr2;
            try {
                iArr2[C10764w.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f41292a[C10764w.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f41292a[C10764w.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f41292a[C10764w.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f41292a[C10764w.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f41292a[C10764w.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f41292a[C10764w.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f41292a[C10764w.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f41292a[C10764w.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        /* renamed from: f */
        int mo38377f();

        /* renamed from: h */
        boolean mo38378h();

        /* renamed from: j */
        C10764w.b mo38379j();

        /* renamed from: l */
        C10764w.c mo38380l();

        /* renamed from: m */
        boolean mo38381m();

        /* renamed from: n */
        InterfaceC10756o.a mo38382n(InterfaceC10756o.a aVar, InterfaceC10756o interfaceC10756o);
    }

    private C10748g() {
    }

    /* renamed from: c */
    private Object m38351c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: d */
    private static int m38352d(C10764w.b bVar, int i2, Object obj) {
        int iM38168D = CodedOutputStream.m38168D(i2);
        if (bVar == C10764w.b.f41385o) {
            iM38168D *= 2;
        }
        return iM38168D + m38353e(bVar, obj);
    }

    /* renamed from: e */
    private static int m38353e(C10764w.b bVar, Object obj) {
        switch (a.f41293b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.m38181g(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m38187m(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m38191q(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m38170F(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m38190p(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m38185k(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m38184j(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m38176b(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m38167C((String) obj);
            case 10:
                return obj instanceof AbstractC10745d ? CodedOutputStream.m38179e((AbstractC10745d) obj) : CodedOutputStream.m38177c((byte[]) obj);
            case 11:
                return CodedOutputStream.m38169E(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.m38198x(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.m38199y(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.m38200z(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m38166B(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m38188n((InterfaceC10756o) obj);
            case 17:
                return obj instanceof C10751j ? CodedOutputStream.m38192r((C10751j) obj) : CodedOutputStream.m38194t((InterfaceC10756o) obj);
            case 18:
                return obj instanceof C10750i.a ? CodedOutputStream.m38183i(((C10750i.a) obj).mo34235f()) : CodedOutputStream.m38183i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m38354f(b<?> bVar, Object obj) {
        C10764w.b bVarMo38379j = bVar.mo38379j();
        int iMo38377f = bVar.mo38377f();
        if (!bVar.mo38378h()) {
            return m38352d(bVarMo38379j, iMo38377f, obj);
        }
        int iM38352d = 0;
        if (bVar.mo38381m()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM38352d += m38353e(bVarMo38379j, it.next());
            }
            return CodedOutputStream.m38168D(iMo38377f) + iM38352d + CodedOutputStream.m38196v(iM38352d);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM38352d += m38352d(bVarMo38379j, iMo38377f, it2.next());
        }
        return iM38352d;
    }

    /* renamed from: g */
    public static <T extends b<T>> C10748g<T> m38355g() {
        return f41288a;
    }

    /* renamed from: l */
    static int m38356l(C10764w.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.m38498k();
    }

    /* renamed from: o */
    private boolean m38357o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.mo38380l() == C10764w.c.MESSAGE) {
            if (key.mo38378h()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC10756o) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof InterfaceC10756o)) {
                    if (value instanceof C10751j) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((InterfaceC10756o) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: s */
    private void m38358s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C10751j) {
            value = ((C10751j) value).m38417e();
        }
        if (key.mo38378h()) {
            Object objM38367h = m38367h(key);
            if (objM38367h == null) {
                objM38367h = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM38367h).add(m38351c(it.next()));
            }
            this.f41289b.m38469p(key, objM38367h);
            return;
        }
        if (key.mo38380l() != C10764w.c.MESSAGE) {
            this.f41289b.m38469p(key, m38351c(value));
            return;
        }
        Object objM38367h2 = m38367h(key);
        if (objM38367h2 == null) {
            this.f41289b.m38469p(key, m38351c(value));
        } else {
            this.f41289b.m38469p(key, key.mo38382n(((InterfaceC10756o) objM38367h2).mo34077d(), (InterfaceC10756o) value).mo34093c());
        }
    }

    /* renamed from: t */
    public static <T extends b<T>> C10748g<T> m38359t() {
        return new C10748g<>();
    }

    /* renamed from: u */
    public static Object m38360u(C10746e c10746e, C10764w.b bVar, boolean z) throws IOException {
        switch (a.f41293b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(c10746e.m38333m());
            case 2:
                return Float.valueOf(c10746e.m38337q());
            case 3:
                return Long.valueOf(c10746e.m38340t());
            case 4:
                return Long.valueOf(c10746e.m38322M());
            case 5:
                return Integer.valueOf(c10746e.m38339s());
            case 6:
                return Long.valueOf(c10746e.m38336p());
            case 7:
                return Integer.valueOf(c10746e.m38335o());
            case 8:
                return Boolean.valueOf(c10746e.m38331k());
            case 9:
                return z ? c10746e.m38319J() : c10746e.m38318I();
            case 10:
                return c10746e.m38332l();
            case 11:
                return Integer.valueOf(c10746e.m38321L());
            case 12:
                return Integer.valueOf(c10746e.m38314E());
            case 13:
                return Long.valueOf(c10746e.m38315F());
            case 14:
                return Integer.valueOf(c10746e.m38316G());
            case 15:
                return Long.valueOf(c10746e.m38317H());
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m38361w(kotlin.reflect.jvm.internal.impl.protobuf.C10764w.b r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.C10748g.a.f41292a
            kotlin.reflect.jvm.internal.impl.protobuf.w$c r2 = r2.m38497g()
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
                case 7: goto L27;
                case 8: goto L1e;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C10751j
            if (r2 == 0) goto L30
            goto L31
        L1e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C10750i.a
            if (r2 == 0) goto L30
            goto L31
        L27:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10745d
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L30
            goto L31
        L30:
            r0 = 0
        L31:
            r1 = r0
            goto L44
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C10748g.m38361w(kotlin.reflect.jvm.internal.impl.protobuf.w$b, java.lang.Object):void");
    }

    /* renamed from: x */
    private static void m38362x(CodedOutputStream codedOutputStream, C10764w.b bVar, int i2, Object obj) throws IOException {
        if (bVar == C10764w.b.f41385o) {
            codedOutputStream.m38215Y(i2, (InterfaceC10756o) obj);
        } else {
            codedOutputStream.m38239w0(i2, m38356l(bVar, false));
            m38363y(codedOutputStream, bVar, obj);
        }
    }

    /* renamed from: y */
    private static void m38363y(CodedOutputStream codedOutputStream, C10764w.b bVar, Object obj) throws IOException {
        switch (a.f41293b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.m38208R(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.m38214X(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.m38219c0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.m38242z0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.m38218b0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.m38212V(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.m38211U(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.m38203M(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.m38238v0((String) obj);
                break;
            case 10:
                if (!(obj instanceof AbstractC10745d)) {
                    codedOutputStream.m38204N((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.m38206P((AbstractC10745d) obj);
                    break;
                }
            case 11:
                codedOutputStream.m38241y0(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.m38233q0(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.m38234r0(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.m38235s0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.m38237u0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.m38216Z((InterfaceC10756o) obj);
                break;
            case 17:
                codedOutputStream.m38221e0((InterfaceC10756o) obj);
                break;
            case 18:
                if (!(obj instanceof C10750i.a)) {
                    codedOutputStream.m38210T(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.m38210T(((C10750i.a) obj).mo34235f());
                    break;
                }
        }
    }

    /* renamed from: z */
    public static void m38364z(b<?> bVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        C10764w.b bVarMo38379j = bVar.mo38379j();
        int iMo38377f = bVar.mo38377f();
        if (!bVar.mo38378h()) {
            if (obj instanceof C10751j) {
                m38362x(codedOutputStream, bVarMo38379j, iMo38377f, ((C10751j) obj).m38417e());
                return;
            } else {
                m38362x(codedOutputStream, bVarMo38379j, iMo38377f, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!bVar.mo38381m()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m38362x(codedOutputStream, bVarMo38379j, iMo38377f, it.next());
            }
            return;
        }
        codedOutputStream.m38239w0(iMo38377f, 2);
        int iM38353e = 0;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iM38353e += m38353e(bVarMo38379j, it2.next());
        }
        codedOutputStream.m38231o0(iM38353e);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            m38363y(codedOutputStream, bVarMo38379j, it3.next());
        }
    }

    /* renamed from: a */
    public void m38365a(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (!fielddescriptortype.mo38378h()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m38361w(fielddescriptortype.mo38379j(), obj);
        Object objM38367h = m38367h(fielddescriptortype);
        if (objM38367h == null) {
            arrayList = new ArrayList();
            this.f41289b.m38469p(fielddescriptortype, arrayList);
        } else {
            arrayList = (List) objM38367h;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10748g<FieldDescriptorType> clone() {
        C10748g<FieldDescriptorType> c10748gM38359t = m38359t();
        for (int i2 = 0; i2 < this.f41289b.m38465j(); i2++) {
            Map.Entry<K, Object> entryM38464i = this.f41289b.m38464i(i2);
            c10748gM38359t.m38376v((b) entryM38464i.getKey(), entryM38464i.getValue());
        }
        Iterator it = this.f41289b.m38466k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c10748gM38359t.m38376v((b) entry.getKey(), entry.getValue());
        }
        c10748gM38359t.f41291d = this.f41291d;
        return c10748gM38359t;
    }

    /* renamed from: h */
    public Object m38367h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f41289b.get(fielddescriptortype);
        return obj instanceof C10751j ? ((C10751j) obj).m38417e() : obj;
    }

    /* renamed from: i */
    public Object m38368i(FieldDescriptorType fielddescriptortype, int i2) {
        if (!fielddescriptortype.mo38378h()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objM38367h = m38367h(fielddescriptortype);
        if (objM38367h != null) {
            return ((List) objM38367h).get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: j */
    public int m38369j(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.mo38378h()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objM38367h = m38367h(fielddescriptortype);
        if (objM38367h == null) {
            return 0;
        }
        return ((List) objM38367h).size();
    }

    /* renamed from: k */
    public int m38370k() {
        int iM38354f = 0;
        for (int i2 = 0; i2 < this.f41289b.m38465j(); i2++) {
            Map.Entry<K, Object> entryM38464i = this.f41289b.m38464i(i2);
            iM38354f += m38354f((b) entryM38464i.getKey(), entryM38464i.getValue());
        }
        Iterator it = this.f41289b.m38466k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM38354f += m38354f((b) entry.getKey(), entry.getValue());
        }
        return iM38354f;
    }

    /* renamed from: m */
    public boolean m38371m(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.mo38378h()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f41289b.get(fielddescriptortype) != null;
    }

    /* renamed from: n */
    public boolean m38372n() {
        for (int i2 = 0; i2 < this.f41289b.m38465j(); i2++) {
            if (!m38357o(this.f41289b.m38464i(i2))) {
                return false;
            }
        }
        Iterator it = this.f41289b.m38466k().iterator();
        while (it.hasNext()) {
            if (!m38357o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public Iterator<Map.Entry<FieldDescriptorType, Object>> m38373p() {
        return this.f41291d ? new C10751j.c(this.f41289b.entrySet().iterator()) : this.f41289b.entrySet().iterator();
    }

    /* renamed from: q */
    public void m38374q() {
        if (this.f41290c) {
            return;
        }
        this.f41289b.mo38468n();
        this.f41290c = true;
    }

    /* renamed from: r */
    public void m38375r(C10748g<FieldDescriptorType> c10748g) {
        for (int i2 = 0; i2 < c10748g.f41289b.m38465j(); i2++) {
            m38358s(c10748g.f41289b.m38464i(i2));
        }
        Iterator it = c10748g.f41289b.m38466k().iterator();
        while (it.hasNext()) {
            m38358s((Map.Entry) it.next());
        }
    }

    /* renamed from: v */
    public void m38376v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo38378h()) {
            m38361w(fielddescriptortype.mo38379j(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m38361w(fielddescriptortype.mo38379j(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C10751j) {
            this.f41291d = true;
        }
        this.f41289b.m38469p(fielddescriptortype, obj);
    }

    private C10748g(boolean z) {
        m38374q();
    }
}
