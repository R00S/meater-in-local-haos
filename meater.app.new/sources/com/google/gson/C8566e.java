package com.google.gson;

import com.google.gson.p215t.C8590c;
import com.google.gson.p215t.C8591d;
import com.google.gson.p215t.C8599l;
import com.google.gson.p215t.p216n.C8601a;
import com.google.gson.p215t.p216n.C8602b;
import com.google.gson.p215t.p216n.C8603c;
import com.google.gson.p215t.p216n.C8604d;
import com.google.gson.p215t.p216n.C8607g;
import com.google.gson.p215t.p216n.C8608h;
import com.google.gson.p215t.p216n.C8609i;
import com.google.gson.p215t.p216n.C8610j;
import com.google.gson.p215t.p216n.C8611k;
import com.google.gson.p215t.p216n.C8614n;
import com.google.gson.p219u.C8619a;
import com.google.gson.stream.C8585a;
import com.google.gson.stream.C8587c;
import com.google.gson.stream.EnumC8586b;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson.java */
/* renamed from: com.google.gson.e */
/* loaded from: classes2.dex */
public final class C8566e {

    /* renamed from: a */
    private static final C8619a<?> f32421a = C8619a.get(Object.class);

    /* renamed from: b */
    private final ThreadLocal<Map<C8619a<?>, f<?>>> f32422b;

    /* renamed from: c */
    private final Map<C8619a<?>, AbstractC8578q<?>> f32423c;

    /* renamed from: d */
    private final C8590c f32424d;

    /* renamed from: e */
    private final C8604d f32425e;

    /* renamed from: f */
    final List<InterfaceC8579r> f32426f;

    /* renamed from: g */
    final C8591d f32427g;

    /* renamed from: h */
    final InterfaceC8565d f32428h;

    /* renamed from: i */
    final Map<Type, InterfaceC8567f<?>> f32429i;

    /* renamed from: j */
    final boolean f32430j;

    /* renamed from: k */
    final boolean f32431k;

    /* renamed from: l */
    final boolean f32432l;

    /* renamed from: m */
    final boolean f32433m;

    /* renamed from: n */
    final boolean f32434n;

    /* renamed from: o */
    final boolean f32435o;

    /* renamed from: p */
    final boolean f32436p;

    /* renamed from: q */
    final String f32437q;

    /* renamed from: r */
    final int f32438r;

    /* renamed from: s */
    final int f32439s;

    /* renamed from: t */
    final EnumC8577p f32440t;

    /* renamed from: u */
    final List<InterfaceC8579r> f32441u;

    /* renamed from: v */
    final List<InterfaceC8579r> f32442v;

    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.e$a */
    class a extends AbstractC8578q<Number> {
        a() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() != EnumC8586b.NULL) {
                return Double.valueOf(c8585a.mo27014z());
            }
            c8585a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Number number) throws IOException {
            if (number == null) {
                c8587c.mo27043y();
            } else {
                C8566e.m26919d(number.doubleValue());
                c8587c.mo27032W(number);
            }
        }
    }

    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.e$b */
    class b extends AbstractC8578q<Number> {
        b() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() != EnumC8586b.NULL) {
                return Float.valueOf((float) c8585a.mo27014z());
            }
            c8585a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Number number) throws IOException {
            if (number == null) {
                c8587c.mo27043y();
            } else {
                C8566e.m26919d(number.floatValue());
                c8587c.mo27032W(number);
            }
        }
    }

    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.e$c */
    static class c extends AbstractC8578q<Number> {
        c() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo26938b(C8585a c8585a) throws IOException {
            if (c8585a.mo27001Q() != EnumC8586b.NULL) {
                return Long.valueOf(c8585a.mo26997B());
            }
            c8585a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, Number number) throws IOException {
            if (number == null) {
                c8587c.mo27043y();
            } else {
                c8587c.mo27033Y(number.toString());
            }
        }
    }

    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.e$d */
    static class d extends AbstractC8578q<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ AbstractC8578q f32445a;

        d(AbstractC8578q abstractC8578q) {
            this.f32445a = abstractC8578q;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong mo26938b(C8585a c8585a) throws IOException {
            return new AtomicLong(((Number) this.f32445a.mo26938b(c8585a)).longValue());
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, AtomicLong atomicLong) throws IOException {
            this.f32445a.mo26939d(c8587c, Long.valueOf(atomicLong.get()));
        }
    }

    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.e$e */
    static class e extends AbstractC8578q<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ AbstractC8578q f32446a;

        e(AbstractC8578q abstractC8578q) {
            this.f32446a = abstractC8578q;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray mo26938b(C8585a c8585a) throws IOException {
            ArrayList arrayList = new ArrayList();
            c8585a.mo27002a();
            while (c8585a.mo27009l()) {
                arrayList.add(Long.valueOf(((Number) this.f32446a.mo26938b(c8585a)).longValue()));
            }
            c8585a.mo27006f();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8587c c8587c, AtomicLongArray atomicLongArray) throws IOException {
            c8587c.mo27035c();
            int length = atomicLongArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                this.f32446a.mo26939d(c8587c, Long.valueOf(atomicLongArray.get(i2)));
            }
            c8587c.mo27037f();
        }
    }

    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.e$f */
    static class f<T> extends AbstractC8578q<T> {

        /* renamed from: a */
        private AbstractC8578q<T> f32447a;

        f() {
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: b */
        public T mo26938b(C8585a c8585a) throws IOException {
            AbstractC8578q<T> abstractC8578q = this.f32447a;
            if (abstractC8578q != null) {
                return abstractC8578q.mo26938b(c8585a);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.AbstractC8578q
        /* renamed from: d */
        public void mo26939d(C8587c c8587c, T t) throws IOException {
            AbstractC8578q<T> abstractC8578q = this.f32447a;
            if (abstractC8578q == null) {
                throw new IllegalStateException();
            }
            abstractC8578q.mo26939d(c8587c, t);
        }

        /* renamed from: e */
        public void m26950e(AbstractC8578q<T> abstractC8578q) {
            if (this.f32447a != null) {
                throw new AssertionError();
            }
            this.f32447a = abstractC8578q;
        }
    }

    public C8566e() {
        this(C8591d.f32527f, EnumC8564c.f32414f, Collections.emptyMap(), false, false, false, true, false, false, false, EnumC8577p.f32453f, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    private static void m26916a(Object obj, C8585a c8585a) {
        if (obj != null) {
            try {
                if (c8585a.mo27001Q() == EnumC8586b.END_DOCUMENT) {
                } else {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException(e2);
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            }
        }
    }

    /* renamed from: b */
    private static AbstractC8578q<AtomicLong> m26917b(AbstractC8578q<Number> abstractC8578q) {
        return new d(abstractC8578q).m26977a();
    }

    /* renamed from: c */
    private static AbstractC8578q<AtomicLongArray> m26918c(AbstractC8578q<Number> abstractC8578q) {
        return new e(abstractC8578q).m26977a();
    }

    /* renamed from: d */
    static void m26919d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: e */
    private AbstractC8578q<Number> m26920e(boolean z) {
        return z ? C8614n.f32685v : new a();
    }

    /* renamed from: f */
    private AbstractC8578q<Number> m26921f(boolean z) {
        return z ? C8614n.f32684u : new b();
    }

    /* renamed from: m */
    private static AbstractC8578q<Number> m26922m(EnumC8577p enumC8577p) {
        return enumC8577p == EnumC8577p.f32453f ? C8614n.f32683t : new c();
    }

    /* renamed from: g */
    public <T> T m26923g(C8585a c8585a, Type type) throws JsonSyntaxException, JsonIOException {
        boolean zM27010m = c8585a.m27010m();
        boolean z = true;
        c8585a.m27003a0(true);
        try {
            try {
                try {
                    c8585a.mo27001Q();
                    z = false;
                    T tMo26938b = m26926j(C8619a.get(type)).mo26938b(c8585a);
                    c8585a.m27003a0(zM27010m);
                    return tMo26938b;
                } catch (EOFException e2) {
                    if (!z) {
                        throw new JsonSyntaxException(e2);
                    }
                    c8585a.m27003a0(zM27010m);
                    return null;
                } catch (IOException e3) {
                    throw new JsonSyntaxException(e3);
                }
            } catch (AssertionError e4) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.5): " + e4.getMessage());
                assertionError.initCause(e4);
                throw assertionError;
            } catch (IllegalStateException e5) {
                throw new JsonSyntaxException(e5);
            }
        } catch (Throwable th) {
            c8585a.m27003a0(zM27010m);
            throw th;
        }
    }

    /* renamed from: h */
    public <T> T m26924h(Reader reader, Type type) throws JsonSyntaxException, JsonIOException {
        C8585a c8585aM26929n = m26929n(reader);
        T t = (T) m26923g(c8585aM26929n, type);
        m26916a(t, c8585aM26929n);
        return t;
    }

    /* renamed from: i */
    public <T> T m26925i(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) m26924h(new StringReader(str), type);
    }

    /* renamed from: j */
    public <T> AbstractC8578q<T> m26926j(C8619a<T> c8619a) {
        AbstractC8578q<T> abstractC8578q = (AbstractC8578q) this.f32423c.get(c8619a == null ? f32421a : c8619a);
        if (abstractC8578q != null) {
            return abstractC8578q;
        }
        Map<C8619a<?>, f<?>> map = this.f32422b.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f32422b.set(map);
            z = true;
        }
        f<?> fVar = map.get(c8619a);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(c8619a, fVar2);
            Iterator<InterfaceC8579r> it = this.f32426f.iterator();
            while (it.hasNext()) {
                AbstractC8578q<T> abstractC8578qMo26979b = it.next().mo26979b(this, c8619a);
                if (abstractC8578qMo26979b != null) {
                    fVar2.m26950e(abstractC8578qMo26979b);
                    this.f32423c.put(c8619a, abstractC8578qMo26979b);
                    return abstractC8578qMo26979b;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + c8619a);
        } finally {
            map.remove(c8619a);
            if (z) {
                this.f32422b.remove();
            }
        }
    }

    /* renamed from: k */
    public <T> AbstractC8578q<T> m26927k(Class<T> cls) {
        return m26926j(C8619a.get((Class) cls));
    }

    /* renamed from: l */
    public <T> AbstractC8578q<T> m26928l(InterfaceC8579r interfaceC8579r, C8619a<T> c8619a) {
        if (!this.f32426f.contains(interfaceC8579r)) {
            interfaceC8579r = this.f32425e;
        }
        boolean z = false;
        for (InterfaceC8579r interfaceC8579r2 : this.f32426f) {
            if (z) {
                AbstractC8578q<T> abstractC8578qMo26979b = interfaceC8579r2.mo26979b(this, c8619a);
                if (abstractC8578qMo26979b != null) {
                    return abstractC8578qMo26979b;
                }
            } else if (interfaceC8579r2 == interfaceC8579r) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c8619a);
    }

    /* renamed from: n */
    public C8585a m26929n(Reader reader) {
        C8585a c8585a = new C8585a(reader);
        c8585a.m27003a0(this.f32435o);
        return c8585a;
    }

    /* renamed from: o */
    public C8587c m26930o(Writer writer) throws IOException {
        if (this.f32432l) {
            writer.write(")]}'\n");
        }
        C8587c c8587c = new C8587c(writer);
        if (this.f32434n) {
            c8587c.m27027I("  ");
        }
        c8587c.m27029K(this.f32430j);
        return c8587c;
    }

    /* renamed from: p */
    public String m26931p(AbstractC8571j abstractC8571j) throws JsonIOException {
        StringWriter stringWriter = new StringWriter();
        m26935t(abstractC8571j, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: q */
    public String m26932q(Object obj) {
        return obj == null ? m26931p(C8572k.f32449a) : m26933r(obj, obj.getClass());
    }

    /* renamed from: r */
    public String m26933r(Object obj, Type type) throws JsonIOException {
        StringWriter stringWriter = new StringWriter();
        m26937v(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: s */
    public void m26934s(AbstractC8571j abstractC8571j, C8587c c8587c) throws JsonIOException {
        boolean zM27041m = c8587c.m27041m();
        c8587c.m27028J(true);
        boolean zM27040l = c8587c.m27040l();
        c8587c.m27026H(this.f32433m);
        boolean zM27039k = c8587c.m27039k();
        c8587c.m27029K(this.f32430j);
        try {
            try {
                C8599l.m27111b(abstractC8571j, c8587c);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            c8587c.m27028J(zM27041m);
            c8587c.m27026H(zM27040l);
            c8587c.m27029K(zM27039k);
        }
    }

    /* renamed from: t */
    public void m26935t(AbstractC8571j abstractC8571j, Appendable appendable) throws JsonIOException {
        try {
            m26934s(abstractC8571j, m26930o(C8599l.m27112c(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f32430j + ",factories:" + this.f32426f + ",instanceCreators:" + this.f32424d + "}";
    }

    /* renamed from: u */
    public void m26936u(Object obj, Type type, C8587c c8587c) throws JsonIOException {
        AbstractC8578q abstractC8578qM26926j = m26926j(C8619a.get(type));
        boolean zM27041m = c8587c.m27041m();
        c8587c.m27028J(true);
        boolean zM27040l = c8587c.m27040l();
        c8587c.m27026H(this.f32433m);
        boolean zM27039k = c8587c.m27039k();
        c8587c.m27029K(this.f32430j);
        try {
            try {
                abstractC8578qM26926j.mo26939d(c8587c, obj);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            c8587c.m27028J(zM27041m);
            c8587c.m27026H(zM27040l);
            c8587c.m27029K(zM27039k);
        }
    }

    /* renamed from: v */
    public void m26937v(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            m26936u(obj, type, m26930o(C8599l.m27112c(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    C8566e(C8591d c8591d, InterfaceC8565d interfaceC8565d, Map<Type, InterfaceC8567f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, EnumC8577p enumC8577p, String str, int i2, int i3, List<InterfaceC8579r> list, List<InterfaceC8579r> list2, List<InterfaceC8579r> list3) {
        this.f32422b = new ThreadLocal<>();
        this.f32423c = new ConcurrentHashMap();
        this.f32427g = c8591d;
        this.f32428h = interfaceC8565d;
        this.f32429i = map;
        C8590c c8590c = new C8590c(map);
        this.f32424d = c8590c;
        this.f32430j = z;
        this.f32431k = z2;
        this.f32432l = z3;
        this.f32433m = z4;
        this.f32434n = z5;
        this.f32435o = z6;
        this.f32436p = z7;
        this.f32440t = enumC8577p;
        this.f32437q = str;
        this.f32438r = i2;
        this.f32439s = i3;
        this.f32441u = list;
        this.f32442v = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8614n.f32662Y);
        arrayList.add(C8608h.f32603a);
        arrayList.add(c8591d);
        arrayList.addAll(list3);
        arrayList.add(C8614n.f32641D);
        arrayList.add(C8614n.f32676m);
        arrayList.add(C8614n.f32670g);
        arrayList.add(C8614n.f32672i);
        arrayList.add(C8614n.f32674k);
        AbstractC8578q<Number> abstractC8578qM26922m = m26922m(enumC8577p);
        arrayList.add(C8614n.m27150b(Long.TYPE, Long.class, abstractC8578qM26922m));
        arrayList.add(C8614n.m27150b(Double.TYPE, Double.class, m26920e(z7)));
        arrayList.add(C8614n.m27150b(Float.TYPE, Float.class, m26921f(z7)));
        arrayList.add(C8614n.f32687x);
        arrayList.add(C8614n.f32678o);
        arrayList.add(C8614n.f32680q);
        arrayList.add(C8614n.m27149a(AtomicLong.class, m26917b(abstractC8578qM26922m)));
        arrayList.add(C8614n.m27149a(AtomicLongArray.class, m26918c(abstractC8578qM26922m)));
        arrayList.add(C8614n.f32682s);
        arrayList.add(C8614n.f32689z);
        arrayList.add(C8614n.f32643F);
        arrayList.add(C8614n.f32645H);
        arrayList.add(C8614n.m27149a(BigDecimal.class, C8614n.f32639B));
        arrayList.add(C8614n.m27149a(BigInteger.class, C8614n.f32640C));
        arrayList.add(C8614n.f32647J);
        arrayList.add(C8614n.f32649L);
        arrayList.add(C8614n.f32653P);
        arrayList.add(C8614n.f32655R);
        arrayList.add(C8614n.f32660W);
        arrayList.add(C8614n.f32651N);
        arrayList.add(C8614n.f32667d);
        arrayList.add(C8603c.f32583a);
        arrayList.add(C8614n.f32658U);
        arrayList.add(C8611k.f32625a);
        arrayList.add(C8610j.f32623a);
        arrayList.add(C8614n.f32656S);
        arrayList.add(C8601a.f32577a);
        arrayList.add(C8614n.f32665b);
        arrayList.add(new C8602b(c8590c));
        arrayList.add(new C8607g(c8590c, z2));
        C8604d c8604d = new C8604d(c8590c);
        this.f32425e = c8604d;
        arrayList.add(c8604d);
        arrayList.add(C8614n.f32663Z);
        arrayList.add(new C8609i(c8590c, interfaceC8565d, c8591d, c8604d));
        this.f32426f = Collections.unmodifiableList(arrayList);
    }
}
