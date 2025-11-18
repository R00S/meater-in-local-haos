package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8571j;
import com.google.gson.AbstractC8578q;
import com.google.gson.C8566e;
import com.google.gson.C8568g;
import com.google.gson.C8572k;
import com.google.gson.C8573l;
import com.google.gson.C8574m;
import com.google.gson.InterfaceC8579r;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p214s.InterfaceC8582c;
import com.google.gson.p215t.C8594g;
import com.google.gson.p219u.C8619a;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.C8587c;
import com.google.gson.stream.EnumC8586b;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: TypeAdapters.java */
/* renamed from: com.google.gson.t.n.n */
/* loaded from: classes2.dex */
public final class C8614n {

    /* renamed from: A */
    public static final AbstractC8578q<String> f32638A;

    /* renamed from: B */
    public static final AbstractC8578q<BigDecimal> f32639B;

    /* renamed from: C */
    public static final AbstractC8578q<BigInteger> f32640C;

    /* renamed from: D */
    public static final InterfaceC8579r f32641D;

    /* renamed from: E */
    public static final AbstractC8578q<StringBuilder> f32642E;

    /* renamed from: F */
    public static final InterfaceC8579r f32643F;

    /* renamed from: G */
    public static final AbstractC8578q<StringBuffer> f32644G;

    /* renamed from: H */
    public static final InterfaceC8579r f32645H;

    /* renamed from: I */
    public static final AbstractC8578q<URL> f32646I;

    /* renamed from: J */
    public static final InterfaceC8579r f32647J;

    /* renamed from: K */
    public static final AbstractC8578q<URI> f32648K;

    /* renamed from: L */
    public static final InterfaceC8579r f32649L;

    /* renamed from: M */
    public static final AbstractC8578q<InetAddress> f32650M;

    /* renamed from: N */
    public static final InterfaceC8579r f32651N;

    /* renamed from: O */
    public static final AbstractC8578q<UUID> f32652O;

    /* renamed from: P */
    public static final InterfaceC8579r f32653P;

    /* renamed from: Q */
    public static final AbstractC8578q<Currency> f32654Q;

    /* renamed from: R */
    public static final InterfaceC8579r f32655R;

    /* renamed from: S */
    public static final InterfaceC8579r f32656S;

    /* renamed from: T */
    public static final AbstractC8578q<Calendar> f32657T;

    /* renamed from: U */
    public static final InterfaceC8579r f32658U;

    /* renamed from: V */
    public static final AbstractC8578q<Locale> f32659V;

    /* renamed from: W */
    public static final InterfaceC8579r f32660W;

    /* renamed from: X */
    public static final AbstractC8578q<AbstractC8571j> f32661X;

    /* renamed from: Y */
    public static final InterfaceC8579r f32662Y;

    /* renamed from: Z */
    public static final InterfaceC8579r f32663Z;

    /* renamed from: a */
    public static final AbstractC8578q<Class> f32664a;

    /* renamed from: b */
    public static final InterfaceC8579r f32665b;

    /* renamed from: c */
    public static final AbstractC8578q<BitSet> f32666c;

    /* renamed from: d */
    public static final InterfaceC8579r f32667d;

    /* renamed from: e */
    public static final AbstractC8578q<Boolean> f32668e;

    /* renamed from: f */
    public static final AbstractC8578q<Boolean> f32669f;

    /* renamed from: g */
    public static final InterfaceC8579r f32670g;

    /* renamed from: h */
    public static final AbstractC8578q<Number> f32671h;

    /* renamed from: i */
    public static final InterfaceC8579r f32672i;

    /* renamed from: j */
    public static final AbstractC8578q<Number> f32673j;

    /* renamed from: k */
    public static final InterfaceC8579r f32674k;

    /* renamed from: l */
    public static final AbstractC8578q<Number> f32675l;

    /* renamed from: m */
    public static final InterfaceC8579r f32676m;

    /* renamed from: n */
    public static final AbstractC8578q<AtomicInteger> f32677n;

    /* renamed from: o */
    public static final InterfaceC8579r f32678o;

    /* renamed from: p */
    public static final AbstractC8578q<AtomicBoolean> f32679p;

    /* renamed from: q */
    public static final InterfaceC8579r f32680q;

    /* renamed from: r */
    public static final AbstractC8578q<AtomicIntegerArray> f32681r;

    /* renamed from: s */
    public static final InterfaceC8579r f32682s;

    /* renamed from: t */
    public static final AbstractC8578q<Number> f32683t;

    /* renamed from: u */
    public static final AbstractC8578q<Number> f32684u;

    /* renamed from: v */
    public static final AbstractC8578q<Number> f32685v;

    /* renamed from: w */
    public static final AbstractC8578q<Number> f32686w;

    /* renamed from: x */
    public static final InterfaceC8579r f32687x;

    /* renamed from: y */
    public static final AbstractC8578q<Character> f32688y;

    /* renamed from: z */
    public static final InterfaceC8579r f32689z;

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$a */
    static class a extends AbstractC8578q<AtomicIntegerArray> {
        a() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray mo26938b(C8585a c8585a) throws IOException {
            ArrayList arrayList = new ArrayList();
            c8585a.mo27002a();
            while (c8585a.mo27009l()) {
                try {
                    arrayList.add(Integer.valueOf(c8585a.mo26996A()));
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }
            c8585a.mo27006f();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, AtomicIntegerArray atomicIntegerArray) throws IOException {
            c8587c.mo27035c();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                c8587c.mo27030Q(atomicIntegerArray.get(i2));
            }
            c8587c.mo27037f();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$a0 */
    static class a0 implements InterfaceC8579r {

        /* renamed from: f */
        final /* synthetic */ Class f32690f;

        /* renamed from: g */
        final /* synthetic */ AbstractC8578q f32691g;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        /* compiled from: TypeAdapters.java */
        /* renamed from: com.google.gson.t.n.n$a0$a */
        class a<T1> extends AbstractC8578q<T1> {

            /* renamed from: a */
            final /* synthetic */ Class f32692a;

            a(Class cls) {
                this.f32692a = cls;
            }

            @Override // com.google.gson.AbstractC8578q
            /* renamed from: b */
            public T1 mo26938b(C8585a c8585a) throws IOException {
                T1 t1 = (T1) a0.this.f32691g.mo26938b(c8585a);
                if (t1 == null || this.f32692a.isInstance(t1)) {
                    return t1;
                }
                throw new JsonSyntaxException("Expected a " + this.f32692a.getName() + " but was " + t1.getClass().getName());
            }

            @Override // com.google.gson.AbstractC8578q
            /* renamed from: d */
            public void mo26939d(C8587c c8587c, T1 t1) throws IOException {
                a0.this.f32691g.mo26939d(c8587c, t1);
            }
        }

        a0(Class cls, AbstractC8578q abstractC8578q) {
            this.f32690f = cls;
            this.f32691g = abstractC8578q;
        }

        @Override // com.google.gson.InterfaceC8579r
        /* renamed from: b */
        public <T2> AbstractC8578q<T2> mo26979b(C8566e c8566e, C8619a<T2> c8619a) {
            Class<? super T2> rawType = c8619a.getRawType();
            if (this.f32690f.isAssignableFrom(rawType)) {
                return new a(rawType);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f32690f.getName() + ",adapter=" + this.f32691g + "]";
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$b */
    static class b extends AbstractC8578q<Number> {
        b() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() == EnumC8586b.NULL) {
                c8585a.mo26999I();
                return null;
            }
            try {
                return Long.valueOf(c8585a.mo26997B());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Number number) throws IOException {
            c8587c.mo27032W(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$b0 */
    static /* synthetic */ class b0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f32694a;

        static {
            int[] iArr = new int[EnumC8586b.values().length];
            f32694a = iArr;
            try {
                iArr[EnumC8586b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32694a[EnumC8586b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32694a[EnumC8586b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32694a[EnumC8586b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32694a[EnumC8586b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32694a[EnumC8586b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32694a[EnumC8586b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32694a[EnumC8586b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32694a[EnumC8586b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32694a[EnumC8586b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$c */
    static class c extends AbstractC8578q<Number> {
        c() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() != EnumC8586b.NULL) {
                return Float.valueOf((float) c8585a.mo27014z());
            }
            c8585a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Number number) throws IOException {
            c8587c.mo27032W(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$c0 */
    static class c0 extends AbstractC8578q<Boolean> {
        c0() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo26938b(C8585a c8585a) throws IOException {
            EnumC8586b enumC8586bMo27001Q = c8585a.mo27001Q();
            if (enumC8586bMo27001Q != EnumC8586b.NULL) {
                return enumC8586bMo27001Q == EnumC8586b.STRING ? Boolean.valueOf(Boolean.parseBoolean(c8585a.mo27000K())) : Boolean.valueOf(c8585a.mo27013y());
            }
            c8585a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Boolean bool) throws IOException {
            c8587c.mo27031T(bool);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$d */
    static class d extends AbstractC8578q<Number> {
        d() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() != EnumC8586b.NULL) {
                return Double.valueOf(c8585a.mo27014z());
            }
            c8585a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Number number) throws IOException {
            c8587c.mo27032W(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$d0 */
    static class d0 extends AbstractC8578q<Boolean> {
        d0() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() != EnumC8586b.NULL) {
                return Boolean.valueOf(c8585a.mo27000K());
            }
            c8585a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Boolean bool) throws IOException {
            c8587c.mo27033Y(bool == null ? "null" : bool.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$e */
    static class e extends AbstractC8578q<Number> {
        e() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8585a c8585a) throws IOException {
            EnumC8586b enumC8586bMo27001Q = c8585a.mo27001Q();
            int i2 = b0.f32694a[enumC8586bMo27001Q.ordinal()];
            if (i2 == 1 || i2 == 3) {
                return new C8594g(c8585a.mo27000K());
            }
            if (i2 == 4) {
                c8585a.mo26999I();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + enumC8586bMo27001Q);
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Number number) throws IOException {
            c8587c.mo27032W(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$e0 */
    static class e0 extends AbstractC8578q<Number> {
        e0() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() == EnumC8586b.NULL) {
                c8585a.mo26999I();
                return null;
            }
            try {
                return Byte.valueOf((byte) c8585a.mo26996A());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Number number) throws IOException {
            c8587c.mo27032W(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$f */
    static class f extends AbstractC8578q<Character> {
        f() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() == EnumC8586b.NULL) {
                c8585a.mo26999I();
                return null;
            }
            String strMo27000K = c8585a.mo27000K();
            if (strMo27000K.length() == 1) {
                return Character.valueOf(strMo27000K.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + strMo27000K);
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Character ch) throws IOException {
            c8587c.mo27033Y(ch == null ? null : String.valueOf(ch));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$f0 */
    static class f0 extends AbstractC8578q<Number> {
        f0() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() == EnumC8586b.NULL) {
                c8585a.mo26999I();
                return null;
            }
            try {
                return Short.valueOf((short) c8585a.mo26996A());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Number number) throws IOException {
            c8587c.mo27032W(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$g */
    static class g extends AbstractC8578q<String> {
        g() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String mo26938b(C8585a c8585a) throws IOException {
            EnumC8586b enumC8586bMo27001Q = c8585a.mo27001Q();
            if (enumC8586bMo27001Q != EnumC8586b.NULL) {
                return enumC8586bMo27001Q == EnumC8586b.BOOLEAN ? Boolean.toString(c8585a.mo27013y()) : c8585a.mo27000K();
            }
            c8585a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, String str) throws IOException {
            c8587c.mo27033Y(str);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$g0 */
    static class g0 extends AbstractC8578q<Number> {
        g0() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() == EnumC8586b.NULL) {
                c8585a.mo26999I();
                return null;
            }
            try {
                return Integer.valueOf(c8585a.mo26996A());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Number number) throws IOException {
            c8587c.mo27032W(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$h */
    static class h extends AbstractC8578q<BigDecimal> {
        h() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() == EnumC8586b.NULL) {
                c8585a.mo26999I();
                return null;
            }
            try {
                return new BigDecimal(c8585a.mo27000K());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, BigDecimal bigDecimal) throws IOException {
            c8587c.mo27032W(bigDecimal);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$h0 */
    static class h0 extends AbstractC8578q<AtomicInteger> {
        h0() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger mo26938b(C8585a c8585a) throws IOException {
            try {
                return new AtomicInteger(c8585a.mo26996A());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, AtomicInteger atomicInteger) throws IOException {
            c8587c.mo27030Q(atomicInteger.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$i */
    static class i extends AbstractC8578q<BigInteger> {
        i() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() == EnumC8586b.NULL) {
                c8585a.mo26999I();
                return null;
            }
            try {
                return new BigInteger(c8585a.mo27000K());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, BigInteger bigInteger) throws IOException {
            c8587c.mo27032W(bigInteger);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$i0 */
    static class i0 extends AbstractC8578q<AtomicBoolean> {
        i0() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean mo26938b(C8585a c8585a) throws IOException {
            return new AtomicBoolean(c8585a.mo27013y());
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, AtomicBoolean atomicBoolean) throws IOException {
            c8587c.mo27034Z(atomicBoolean.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$j */
    static class j extends AbstractC8578q<StringBuilder> {
        j() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() != EnumC8586b.NULL) {
                return new StringBuilder(c8585a.mo27000K());
            }
            c8585a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, StringBuilder sb) throws IOException {
            c8587c.mo27033Y(sb == null ? null : sb.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$j0 */
    private static final class j0<T extends Enum<T>> extends AbstractC8578q<T> {

        /* renamed from: a */
        private final Map<String, T> f32695a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f32696b = new HashMap();

        public j0(Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    String strName = t.name();
                    InterfaceC8582c interfaceC8582c = (InterfaceC8582c) cls.getField(strName).getAnnotation(InterfaceC8582c.class);
                    if (interfaceC8582c != null) {
                        strName = interfaceC8582c.value();
                        for (String str : interfaceC8582c.alternate()) {
                            this.f32695a.put(str, t);
                        }
                    }
                    this.f32695a.put(strName, t);
                    this.f32696b.put(t, strName);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public T mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() != EnumC8586b.NULL) {
                return this.f32695a.get(c8585a.mo27000K());
            }
            c8585a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, T t) throws IOException {
            c8587c.mo27033Y(t == null ? null : this.f32696b.get(t));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$k */
    static class k extends AbstractC8578q<Class> {
        k() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class mo26938b(C8585a c8585a) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$l */
    static class l extends AbstractC8578q<StringBuffer> {
        l() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() != EnumC8586b.NULL) {
                return new StringBuffer(c8585a.mo27000K());
            }
            c8585a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, StringBuffer stringBuffer) throws IOException {
            c8587c.mo27033Y(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$m */
    static class m extends AbstractC8578q<URL> {
        m() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() == EnumC8586b.NULL) {
                c8585a.mo26999I();
                return null;
            }
            String strMo27000K = c8585a.mo27000K();
            if ("null".equals(strMo27000K)) {
                return null;
            }
            return new URL(strMo27000K);
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, URL url) throws IOException {
            c8587c.mo27033Y(url == null ? null : url.toExternalForm());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$n */
    static class n extends AbstractC8578q<URI> {
        n() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() == EnumC8586b.NULL) {
                c8585a.mo26999I();
                return null;
            }
            try {
                String strMo27000K = c8585a.mo27000K();
                if ("null".equals(strMo27000K)) {
                    return null;
                }
                return new URI(strMo27000K);
            } catch (URISyntaxException e2) {
                throw new JsonIOException(e2);
            }
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, URI uri) throws IOException {
            c8587c.mo27033Y(uri == null ? null : uri.toASCIIString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$o */
    static class o extends AbstractC8578q<InetAddress> {
        o() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() != EnumC8586b.NULL) {
                return InetAddress.getByName(c8585a.mo27000K());
            }
            c8585a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, InetAddress inetAddress) throws IOException {
            c8587c.mo27033Y(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$p */
    static class p extends AbstractC8578q<UUID> {
        p() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() != EnumC8586b.NULL) {
                return UUID.fromString(c8585a.mo27000K());
            }
            c8585a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, UUID uuid) throws IOException {
            c8587c.mo27033Y(uuid == null ? null : uuid.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$q */
    static class q extends AbstractC8578q<Currency> {
        q() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency mo26938b(C8585a c8585a) throws IOException {
            return Currency.getInstance(c8585a.mo27000K());
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Currency currency) throws IOException {
            c8587c.mo27033Y(currency.getCurrencyCode());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$r */
    static class r implements InterfaceC8579r {

        /* compiled from: TypeAdapters.java */
        /* renamed from: com.google.gson.t.n.n$r$a */
        class a extends AbstractC8578q<Timestamp> {

            /* renamed from: a */
            final /* synthetic */ AbstractC8578q f32697a;

            a(AbstractC8578q abstractC8578q) {
                this.f32697a = abstractC8578q;
            }

            @Override // com.google.gson.AbstractC8578q
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Timestamp mo26938b(C8585a c8585a) throws IOException {
                Date date = (Date) this.f32697a.mo26938b(c8585a);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // com.google.gson.AbstractC8578q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo26939d(C8587c c8587c, Timestamp timestamp) throws IOException {
                this.f32697a.mo26939d(c8587c, timestamp);
            }
        }

        r() {
        }

        @Override // com.google.gson.InterfaceC8579r
        /* renamed from: b */
        public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) {
            if (c8619a.getRawType() != Timestamp.class) {
                return null;
            }
            return new a(c8566e.m26927k(Date.class));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$s */
    static class s extends AbstractC8578q<Calendar> {
        s() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar mo26938b(C8585a c8585a) throws IOException, NumberFormatException {
            if (c8585a.mo27001Q() == EnumC8586b.NULL) {
                c8585a.mo26999I();
                return null;
            }
            c8585a.mo27004b();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (c8585a.mo27001Q() != EnumC8586b.END_OBJECT) {
                String strMo26998D = c8585a.mo26998D();
                int iMo26996A = c8585a.mo26996A();
                if ("year".equals(strMo26998D)) {
                    i2 = iMo26996A;
                } else if ("month".equals(strMo26998D)) {
                    i3 = iMo26996A;
                } else if ("dayOfMonth".equals(strMo26998D)) {
                    i4 = iMo26996A;
                } else if ("hourOfDay".equals(strMo26998D)) {
                    i5 = iMo26996A;
                } else if ("minute".equals(strMo26998D)) {
                    i6 = iMo26996A;
                } else if ("second".equals(strMo26998D)) {
                    i7 = iMo26996A;
                }
            }
            c8585a.mo27008j();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Calendar calendar) throws IOException {
            if (calendar == null) {
                c8587c.mo27043y();
                return;
            }
            c8587c.mo27036d();
            c8587c.mo27042p("year");
            c8587c.mo27030Q(calendar.get(1));
            c8587c.mo27042p("month");
            c8587c.mo27030Q(calendar.get(2));
            c8587c.mo27042p("dayOfMonth");
            c8587c.mo27030Q(calendar.get(5));
            c8587c.mo27042p("hourOfDay");
            c8587c.mo27030Q(calendar.get(11));
            c8587c.mo27042p("minute");
            c8587c.mo27030Q(calendar.get(12));
            c8587c.mo27042p("second");
            c8587c.mo27030Q(calendar.get(13));
            c8587c.mo27038j();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$t */
    static class t extends AbstractC8578q<Locale> {
        t() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() == EnumC8586b.NULL) {
                c8585a.mo26999I();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c8585a.mo27000K(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Locale locale) throws IOException {
            c8587c.mo27033Y(locale == null ? null : locale.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$u */
    static class u extends AbstractC8578q<AbstractC8571j> {
        u() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AbstractC8571j mo26938b(C8585a c8585a) throws IOException {
            switch (b0.f32694a[c8585a.mo27001Q().ordinal()]) {
                case 1:
                    return new C8574m(new C8594g(c8585a.mo27000K()));
                case 2:
                    return new C8574m(Boolean.valueOf(c8585a.mo27013y()));
                case 3:
                    return new C8574m(c8585a.mo27000K());
                case 4:
                    c8585a.mo26999I();
                    return C8572k.f32449a;
                case 5:
                    C8568g c8568g = new C8568g();
                    c8585a.mo27002a();
                    while (c8585a.mo27009l()) {
                        c8568g.m26952q(mo26938b(c8585a));
                    }
                    c8585a.mo27006f();
                    return c8568g;
                case 6:
                    C8573l c8573l = new C8573l();
                    c8585a.mo27004b();
                    while (c8585a.mo27009l()) {
                        c8573l.m26961q(c8585a.mo26998D(), mo26938b(c8585a));
                    }
                    c8585a.mo27008j();
                    return c8573l;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, AbstractC8571j abstractC8571j) throws IOException {
            if (abstractC8571j == null || abstractC8571j.m26958i()) {
                c8587c.mo27043y();
                return;
            }
            if (abstractC8571j.m26960o()) {
                C8574m c8574mM26956g = abstractC8571j.m26956g();
                if (c8574mM26956g.m26975z()) {
                    c8587c.mo27032W(c8574mM26956g.m26972v());
                    return;
                } else if (c8574mM26956g.m26974x()) {
                    c8587c.mo27034Z(c8574mM26956g.m26967q());
                    return;
                } else {
                    c8587c.mo27033Y(c8574mM26956g.m26973w());
                    return;
                }
            }
            if (abstractC8571j.m26957h()) {
                c8587c.mo27035c();
                Iterator<AbstractC8571j> it = abstractC8571j.m26954c().iterator();
                while (it.hasNext()) {
                    mo26939d(c8587c, it.next());
                }
                c8587c.mo27037f();
                return;
            }
            if (!abstractC8571j.m26959n()) {
                throw new IllegalArgumentException("Couldn't write " + abstractC8571j.getClass());
            }
            c8587c.mo27036d();
            for (Map.Entry<String, AbstractC8571j> entry : abstractC8571j.m26955f().m26962r()) {
                c8587c.mo27042p(entry.getKey());
                mo26939d(c8587c, entry.getValue());
            }
            c8587c.mo27038j();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$v */
    static class v extends AbstractC8578q<BitSet> {
        v() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.BitSet mo26938b(com.google.gson.stream.C8585a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.mo27002a()
                com.google.gson.stream.b r1 = r8.mo27001Q()
                r2 = 0
                r3 = 0
            Le:
                com.google.gson.stream.b r4 = com.google.gson.stream.EnumC8586b.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = com.google.gson.p215t.p216n.C8614n.b0.f32694a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.mo27000K()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = 0
                goto L69
            L30:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.mo27013y()
                goto L69
            L63:
                int r1 = r8.mo26996A()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                com.google.gson.stream.b r1 = r8.mo27001Q()
                goto Le
            L75:
                r8.mo27006f()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p215t.p216n.C8614n.v.mo26938b(com.google.gson.stream.a):java.util.BitSet");
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, BitSet bitSet) throws IOException {
            c8587c.mo27035c();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                c8587c.mo27030Q(bitSet.get(i2) ? 1L : 0L);
            }
            c8587c.mo27037f();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$w */
    static class w implements InterfaceC8579r {
        w() {
        }

        @Override // com.google.gson.InterfaceC8579r
        /* renamed from: b */
        public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) {
            Class<? super T> rawType = c8619a.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new j0(rawType);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$x */
    static class x implements InterfaceC8579r {

        /* renamed from: f */
        final /* synthetic */ Class f32699f;

        /* renamed from: g */
        final /* synthetic */ AbstractC8578q f32700g;

        x(Class cls, AbstractC8578q abstractC8578q) {
            this.f32699f = cls;
            this.f32700g = abstractC8578q;
        }

        @Override // com.google.gson.InterfaceC8579r
        /* renamed from: b */
        public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) {
            if (c8619a.getRawType() == this.f32699f) {
                return this.f32700g;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f32699f.getName() + ",adapter=" + this.f32700g + "]";
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$y */
    static class y implements InterfaceC8579r {

        /* renamed from: f */
        final /* synthetic */ Class f32701f;

        /* renamed from: g */
        final /* synthetic */ Class f32702g;

        /* renamed from: h */
        final /* synthetic */ AbstractC8578q f32703h;

        y(Class cls, Class cls2, AbstractC8578q abstractC8578q) {
            this.f32701f = cls;
            this.f32702g = cls2;
            this.f32703h = abstractC8578q;
        }

        @Override // com.google.gson.InterfaceC8579r
        /* renamed from: b */
        public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) {
            Class<? super T> rawType = c8619a.getRawType();
            if (rawType == this.f32701f || rawType == this.f32702g) {
                return this.f32703h;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f32702g.getName() + "+" + this.f32701f.getName() + ",adapter=" + this.f32703h + "]";
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.t.n.n$z */
    static class z implements InterfaceC8579r {

        /* renamed from: f */
        final /* synthetic */ Class f32704f;

        /* renamed from: g */
        final /* synthetic */ Class f32705g;

        /* renamed from: h */
        final /* synthetic */ AbstractC8578q f32706h;

        z(Class cls, Class cls2, AbstractC8578q abstractC8578q) {
            this.f32704f = cls;
            this.f32705g = cls2;
            this.f32706h = abstractC8578q;
        }

        @Override // com.google.gson.InterfaceC8579r
        /* renamed from: b */
        public <T> AbstractC8578q<T> mo26979b(C8566e c8566e, C8619a<T> c8619a) {
            Class<? super T> rawType = c8619a.getRawType();
            if (rawType == this.f32704f || rawType == this.f32705g) {
                return this.f32706h;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f32704f.getName() + "+" + this.f32705g.getName() + ",adapter=" + this.f32706h + "]";
        }
    }

    static {
        AbstractC8578q<Class> abstractC8578qM26977a = new k().m26977a();
        f32664a = abstractC8578qM26977a;
        f32665b = m27149a(Class.class, abstractC8578qM26977a);
        AbstractC8578q<BitSet> abstractC8578qM26977a2 = new v().m26977a();
        f32666c = abstractC8578qM26977a2;
        f32667d = m27149a(BitSet.class, abstractC8578qM26977a2);
        c0 c0Var = new c0();
        f32668e = c0Var;
        f32669f = new d0();
        f32670g = m27150b(Boolean.TYPE, Boolean.class, c0Var);
        e0 e0Var = new e0();
        f32671h = e0Var;
        f32672i = m27150b(Byte.TYPE, Byte.class, e0Var);
        f0 f0Var = new f0();
        f32673j = f0Var;
        f32674k = m27150b(Short.TYPE, Short.class, f0Var);
        g0 g0Var = new g0();
        f32675l = g0Var;
        f32676m = m27150b(Integer.TYPE, Integer.class, g0Var);
        AbstractC8578q<AtomicInteger> abstractC8578qM26977a3 = new h0().m26977a();
        f32677n = abstractC8578qM26977a3;
        f32678o = m27149a(AtomicInteger.class, abstractC8578qM26977a3);
        AbstractC8578q<AtomicBoolean> abstractC8578qM26977a4 = new i0().m26977a();
        f32679p = abstractC8578qM26977a4;
        f32680q = m27149a(AtomicBoolean.class, abstractC8578qM26977a4);
        AbstractC8578q<AtomicIntegerArray> abstractC8578qM26977a5 = new a().m26977a();
        f32681r = abstractC8578qM26977a5;
        f32682s = m27149a(AtomicIntegerArray.class, abstractC8578qM26977a5);
        f32683t = new b();
        f32684u = new c();
        f32685v = new d();
        e eVar = new e();
        f32686w = eVar;
        f32687x = m27149a(Number.class, eVar);
        f fVar = new f();
        f32688y = fVar;
        f32689z = m27150b(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        f32638A = gVar;
        f32639B = new h();
        f32640C = new i();
        f32641D = m27149a(String.class, gVar);
        j jVar = new j();
        f32642E = jVar;
        f32643F = m27149a(StringBuilder.class, jVar);
        l lVar = new l();
        f32644G = lVar;
        f32645H = m27149a(StringBuffer.class, lVar);
        m mVar = new m();
        f32646I = mVar;
        f32647J = m27149a(URL.class, mVar);
        n nVar = new n();
        f32648K = nVar;
        f32649L = m27149a(URI.class, nVar);
        o oVar = new o();
        f32650M = oVar;
        f32651N = m27152d(InetAddress.class, oVar);
        p pVar = new p();
        f32652O = pVar;
        f32653P = m27149a(UUID.class, pVar);
        AbstractC8578q<Currency> abstractC8578qM26977a6 = new q().m26977a();
        f32654Q = abstractC8578qM26977a6;
        f32655R = m27149a(Currency.class, abstractC8578qM26977a6);
        f32656S = new r();
        s sVar = new s();
        f32657T = sVar;
        f32658U = m27151c(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        f32659V = tVar;
        f32660W = m27149a(Locale.class, tVar);
        u uVar = new u();
        f32661X = uVar;
        f32662Y = m27152d(AbstractC8571j.class, uVar);
        f32663Z = new w();
    }

    /* renamed from: a */
    public static <TT> InterfaceC8579r m27149a(Class<TT> cls, AbstractC8578q<TT> abstractC8578q) {
        return new x(cls, abstractC8578q);
    }

    /* renamed from: b */
    public static <TT> InterfaceC8579r m27150b(Class<TT> cls, Class<TT> cls2, AbstractC8578q<? super TT> abstractC8578q) {
        return new y(cls, cls2, abstractC8578q);
    }

    /* renamed from: c */
    public static <TT> InterfaceC8579r m27151c(Class<TT> cls, Class<? extends TT> cls2, AbstractC8578q<? super TT> abstractC8578q) {
        return new z(cls, cls2, abstractC8578q);
    }

    /* renamed from: d */
    public static <T1> InterfaceC8579r m27152d(Class<T1> cls, AbstractC8578q<T1> abstractC8578q) {
        return new a0(cls, abstractC8578q);
    }
}
