package com.squareup.moshi;

import com.squareup.moshi.AbstractC8716f;
import com.squareup.moshi.AbstractC8719i;
import com.squareup.moshi.p231w.C8735c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: StandardJsonAdapters.java */
/* renamed from: com.squareup.moshi.t */
/* loaded from: classes2.dex */
final class C8730t {

    /* renamed from: a */
    public static final AbstractC8716f.e f33202a = new c();

    /* renamed from: b */
    static final AbstractC8716f<Boolean> f33203b = new d();

    /* renamed from: c */
    static final AbstractC8716f<Byte> f33204c = new e();

    /* renamed from: d */
    static final AbstractC8716f<Character> f33205d = new f();

    /* renamed from: e */
    static final AbstractC8716f<Double> f33206e = new g();

    /* renamed from: f */
    static final AbstractC8716f<Float> f33207f = new h();

    /* renamed from: g */
    static final AbstractC8716f<Integer> f33208g = new i();

    /* renamed from: h */
    static final AbstractC8716f<Long> f33209h = new j();

    /* renamed from: i */
    static final AbstractC8716f<Short> f33210i = new k();

    /* renamed from: j */
    static final AbstractC8716f<String> f33211j = new a();

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$a */
    class a extends AbstractC8716f<String> {
        a() {
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String fromJson(AbstractC8719i abstractC8719i) throws IOException {
            return abstractC8719i.mo27723y();
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8725o abstractC8725o, String str) throws IOException {
            abstractC8725o.mo27754N(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f33212a;

        static {
            int[] iArr = new int[AbstractC8719i.b.values().length];
            f33212a = iArr;
            try {
                iArr[AbstractC8719i.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33212a[AbstractC8719i.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33212a[AbstractC8719i.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33212a[AbstractC8719i.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33212a[AbstractC8719i.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33212a[AbstractC8719i.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$c */
    class c implements AbstractC8716f.e {
        c() {
        }

        @Override // com.squareup.moshi.AbstractC8716f.e
        /* renamed from: a */
        public AbstractC8716f<?> mo27684a(Type type, Set<? extends Annotation> set, C8728r c8728r) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C8730t.f33203b;
            }
            if (type == Byte.TYPE) {
                return C8730t.f33204c;
            }
            if (type == Character.TYPE) {
                return C8730t.f33205d;
            }
            if (type == Double.TYPE) {
                return C8730t.f33206e;
            }
            if (type == Float.TYPE) {
                return C8730t.f33207f;
            }
            if (type == Integer.TYPE) {
                return C8730t.f33208g;
            }
            if (type == Long.TYPE) {
                return C8730t.f33209h;
            }
            if (type == Short.TYPE) {
                return C8730t.f33210i;
            }
            if (type == Boolean.class) {
                return C8730t.f33203b.nullSafe();
            }
            if (type == Byte.class) {
                return C8730t.f33204c.nullSafe();
            }
            if (type == Character.class) {
                return C8730t.f33205d.nullSafe();
            }
            if (type == Double.class) {
                return C8730t.f33206e.nullSafe();
            }
            if (type == Float.class) {
                return C8730t.f33207f.nullSafe();
            }
            if (type == Integer.class) {
                return C8730t.f33208g.nullSafe();
            }
            if (type == Long.class) {
                return C8730t.f33209h.nullSafe();
            }
            if (type == Short.class) {
                return C8730t.f33210i.nullSafe();
            }
            if (type == String.class) {
                return C8730t.f33211j.nullSafe();
            }
            if (type == Object.class) {
                return new m(c8728r).nullSafe();
            }
            Class<?> clsM27848g = C8731u.m27848g(type);
            AbstractC8716f<?> abstractC8716fM27858d = C8735c.m27858d(c8728r, type, clsM27848g);
            if (abstractC8716fM27858d != null) {
                return abstractC8716fM27858d;
            }
            if (clsM27848g.isEnum()) {
                return new l(clsM27848g).nullSafe();
            }
            return null;
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$d */
    class d extends AbstractC8716f<Boolean> {
        d() {
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean fromJson(AbstractC8719i abstractC8719i) throws IOException {
            return Boolean.valueOf(abstractC8719i.mo27718k());
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8725o abstractC8725o, Boolean bool) throws IOException {
            abstractC8725o.mo27755Q(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$e */
    class e extends AbstractC8716f<Byte> {
        e() {
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte fromJson(AbstractC8719i abstractC8719i) throws IOException {
            return Byte.valueOf((byte) C8730t.m27820a(abstractC8719i, "a byte", -128, 255));
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8725o abstractC8725o, Byte b2) throws IOException {
            abstractC8725o.mo27752J(b2.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$f */
    class f extends AbstractC8716f<Character> {
        f() {
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character fromJson(AbstractC8719i abstractC8719i) throws IOException {
            String strMo27723y = abstractC8719i.mo27723y();
            if (strMo27723y.length() <= 1) {
                return Character.valueOf(strMo27723y.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", '\"' + strMo27723y + '\"', abstractC8719i.m27716g()));
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8725o abstractC8725o, Character ch) throws IOException {
            abstractC8725o.mo27754N(ch.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$g */
    class g extends AbstractC8716f<Double> {
        g() {
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double fromJson(AbstractC8719i abstractC8719i) throws IOException {
            return Double.valueOf(abstractC8719i.mo27719l());
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8725o abstractC8725o, Double d2) throws IOException {
            abstractC8725o.mo27751I(d2.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$h */
    class h extends AbstractC8716f<Float> {
        h() {
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float fromJson(AbstractC8719i abstractC8719i) throws IOException {
            float fMo27719l = (float) abstractC8719i.mo27719l();
            if (abstractC8719i.m27717j() || !Float.isInfinite(fMo27719l)) {
                return Float.valueOf(fMo27719l);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + fMo27719l + " at path " + abstractC8719i.m27716g());
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8725o abstractC8725o, Float f2) throws IOException {
            f2.getClass();
            abstractC8725o.mo27753K(f2);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$i */
    class i extends AbstractC8716f<Integer> {
        i() {
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer fromJson(AbstractC8719i abstractC8719i) throws IOException {
            return Integer.valueOf(abstractC8719i.mo27720m());
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8725o abstractC8725o, Integer num) throws IOException {
            abstractC8725o.mo27752J(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$j */
    class j extends AbstractC8716f<Long> {
        j() {
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long fromJson(AbstractC8719i abstractC8719i) throws IOException {
            return Long.valueOf(abstractC8719i.mo27721p());
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8725o abstractC8725o, Long l) throws IOException {
            abstractC8725o.mo27752J(l.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$k */
    class k extends AbstractC8716f<Short> {
        k() {
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short fromJson(AbstractC8719i abstractC8719i) throws IOException {
            return Short.valueOf((short) C8730t.m27820a(abstractC8719i, "a short", -32768, 32767));
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8725o abstractC8725o, Short sh) throws IOException {
            abstractC8725o.mo27752J(sh.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$l */
    static final class l<T extends Enum<T>> extends AbstractC8716f<T> {

        /* renamed from: a */
        private final Class<T> f33213a;

        /* renamed from: b */
        private final String[] f33214b;

        /* renamed from: c */
        private final T[] f33215c;

        /* renamed from: d */
        private final AbstractC8719i.a f33216d;

        l(Class<T> cls) {
            this.f33213a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f33215c = enumConstants;
                this.f33214b = new String[enumConstants.length];
                int i2 = 0;
                while (true) {
                    T[] tArr = this.f33215c;
                    if (i2 >= tArr.length) {
                        this.f33216d = AbstractC8719i.a.m27724a(this.f33214b);
                        return;
                    } else {
                        String strName = tArr[i2].name();
                        this.f33214b[i2] = C8735c.m27867m(strName, cls.getField(strName));
                        i2++;
                    }
                }
            } catch (NoSuchFieldException e2) {
                AssertionError assertionError = new AssertionError("Missing field in " + cls.getName());
                assertionError.initCause(e2);
                throw assertionError;
            }
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T fromJson(AbstractC8719i abstractC8719i) throws IOException {
            int iMo27703I = abstractC8719i.mo27703I(this.f33216d);
            if (iMo27703I != -1) {
                return this.f33215c[iMo27703I];
            }
            String strM27716g = abstractC8719i.m27716g();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f33214b) + " but was " + abstractC8719i.mo27723y() + " at path " + strM27716g);
        }

        @Override // com.squareup.moshi.AbstractC8716f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(AbstractC8725o abstractC8725o, T t) throws IOException {
            abstractC8725o.mo27754N(this.f33214b[t.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f33213a.getName() + ")";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.t$m */
    static final class m extends AbstractC8716f<Object> {

        /* renamed from: a */
        private final C8728r f33217a;

        /* renamed from: b */
        private final AbstractC8716f<List> f33218b;

        /* renamed from: c */
        private final AbstractC8716f<Map> f33219c;

        /* renamed from: d */
        private final AbstractC8716f<String> f33220d;

        /* renamed from: e */
        private final AbstractC8716f<Double> f33221e;

        /* renamed from: f */
        private final AbstractC8716f<Boolean> f33222f;

        m(C8728r c8728r) {
            this.f33217a = c8728r;
            this.f33218b = c8728r.m27810c(List.class);
            this.f33219c = c8728r.m27810c(Map.class);
            this.f33220d = c8728r.m27810c(String.class);
            this.f33221e = c8728r.m27810c(Double.class);
            this.f33222f = c8728r.m27810c(Boolean.class);
        }

        /* renamed from: a */
        private Class<?> m27841a(Class<?> cls) {
            return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // com.squareup.moshi.AbstractC8716f
        public Object fromJson(AbstractC8719i abstractC8719i) throws IOException {
            switch (b.f33212a[abstractC8719i.mo27699A().ordinal()]) {
                case 1:
                    return this.f33218b.fromJson(abstractC8719i);
                case 2:
                    return this.f33219c.fromJson(abstractC8719i);
                case 3:
                    return this.f33220d.fromJson(abstractC8719i);
                case 4:
                    return this.f33221e.fromJson(abstractC8719i);
                case 5:
                    return this.f33222f.fromJson(abstractC8719i);
                case 6:
                    return abstractC8719i.mo27722x();
                default:
                    throw new IllegalStateException("Expected a value but was " + abstractC8719i.mo27699A() + " at path " + abstractC8719i.m27716g());
            }
        }

        @Override // com.squareup.moshi.AbstractC8716f
        public void toJson(AbstractC8725o abstractC8725o, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls != Object.class) {
                this.f33217a.m27812e(m27841a(cls), C8735c.f33225a).toJson(abstractC8725o, (AbstractC8725o) obj);
            } else {
                abstractC8725o.mo27757b();
                abstractC8725o.mo27759e();
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* renamed from: a */
    static int m27820a(AbstractC8719i abstractC8719i, String str, int i2, int i3) throws IOException {
        int iMo27720m = abstractC8719i.mo27720m();
        if (iMo27720m < i2 || iMo27720m > i3) {
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(iMo27720m), abstractC8719i.m27716g()));
        }
        return iMo27720m;
    }
}
