package com.squareup.moshi;

import com.squareup.moshi.AbstractC8719i;
import com.squareup.moshi.p231w.C8733a;
import com.squareup.moshi.p231w.C8734b;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import p353j.C9703f;
import p353j.InterfaceC9705g;
import p353j.InterfaceC9709h;

/* compiled from: JsonAdapter.java */
/* renamed from: com.squareup.moshi.f */
/* loaded from: classes2.dex */
public abstract class AbstractC8716f<T> {

    /* compiled from: JsonAdapter.java */
    /* renamed from: com.squareup.moshi.f$a */
    class a extends AbstractC8716f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC8716f f33093a;

        a(AbstractC8716f abstractC8716f) {
            this.f33093a = abstractC8716f;
        }

        @Override // com.squareup.moshi.AbstractC8716f
        public T fromJson(AbstractC8719i abstractC8719i) throws IOException {
            return (T) this.f33093a.fromJson(abstractC8719i);
        }

        @Override // com.squareup.moshi.AbstractC8716f
        boolean isLenient() {
            return this.f33093a.isLenient();
        }

        @Override // com.squareup.moshi.AbstractC8716f
        public void toJson(AbstractC8725o abstractC8725o, T t) throws IOException {
            boolean zM27777j = abstractC8725o.m27777j();
            abstractC8725o.m27773H(true);
            try {
                this.f33093a.toJson(abstractC8725o, (AbstractC8725o) t);
            } finally {
                abstractC8725o.m27773H(zM27777j);
            }
        }

        public String toString() {
            return this.f33093a + ".serializeNulls()";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* renamed from: com.squareup.moshi.f$b */
    class b extends AbstractC8716f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC8716f f33095a;

        b(AbstractC8716f abstractC8716f) {
            this.f33095a = abstractC8716f;
        }

        @Override // com.squareup.moshi.AbstractC8716f
        public T fromJson(AbstractC8719i abstractC8719i) throws IOException {
            boolean zM27717j = abstractC8719i.m27717j();
            abstractC8719i.m27705K(true);
            try {
                return (T) this.f33095a.fromJson(abstractC8719i);
            } finally {
                abstractC8719i.m27705K(zM27717j);
            }
        }

        @Override // com.squareup.moshi.AbstractC8716f
        boolean isLenient() {
            return true;
        }

        @Override // com.squareup.moshi.AbstractC8716f
        public void toJson(AbstractC8725o abstractC8725o, T t) throws IOException {
            boolean zM27778k = abstractC8725o.m27778k();
            abstractC8725o.m27772D(true);
            try {
                this.f33095a.toJson(abstractC8725o, (AbstractC8725o) t);
            } finally {
                abstractC8725o.m27772D(zM27778k);
            }
        }

        public String toString() {
            return this.f33095a + ".lenient()";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* renamed from: com.squareup.moshi.f$c */
    class c extends AbstractC8716f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC8716f f33097a;

        c(AbstractC8716f abstractC8716f) {
            this.f33097a = abstractC8716f;
        }

        @Override // com.squareup.moshi.AbstractC8716f
        public T fromJson(AbstractC8719i abstractC8719i) throws IOException {
            boolean zM27714e = abstractC8719i.m27714e();
            abstractC8719i.m27704J(true);
            try {
                return (T) this.f33097a.fromJson(abstractC8719i);
            } finally {
                abstractC8719i.m27704J(zM27714e);
            }
        }

        @Override // com.squareup.moshi.AbstractC8716f
        boolean isLenient() {
            return this.f33097a.isLenient();
        }

        @Override // com.squareup.moshi.AbstractC8716f
        public void toJson(AbstractC8725o abstractC8725o, T t) throws IOException {
            this.f33097a.toJson(abstractC8725o, (AbstractC8725o) t);
        }

        public String toString() {
            return this.f33097a + ".failOnUnknown()";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* renamed from: com.squareup.moshi.f$d */
    class d extends AbstractC8716f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC8716f f33099a;

        /* renamed from: b */
        final /* synthetic */ String f33100b;

        d(AbstractC8716f abstractC8716f, String str) {
            this.f33099a = abstractC8716f;
            this.f33100b = str;
        }

        @Override // com.squareup.moshi.AbstractC8716f
        public T fromJson(AbstractC8719i abstractC8719i) throws IOException {
            return (T) this.f33099a.fromJson(abstractC8719i);
        }

        @Override // com.squareup.moshi.AbstractC8716f
        boolean isLenient() {
            return this.f33099a.isLenient();
        }

        @Override // com.squareup.moshi.AbstractC8716f
        public void toJson(AbstractC8725o abstractC8725o, T t) throws IOException {
            String strM27775f = abstractC8725o.m27775f();
            abstractC8725o.mo27750B(this.f33100b);
            try {
                this.f33099a.toJson(abstractC8725o, (AbstractC8725o) t);
            } finally {
                abstractC8725o.mo27750B(strM27775f);
            }
        }

        public String toString() {
            return this.f33099a + ".indent(\"" + this.f33100b + "\")";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* renamed from: com.squareup.moshi.f$e */
    public interface e {
        /* renamed from: a */
        AbstractC8716f<?> mo27684a(Type type, Set<? extends Annotation> set, C8728r c8728r);
    }

    public final AbstractC8716f<T> failOnUnknown() {
        return new c(this);
    }

    public abstract T fromJson(AbstractC8719i abstractC8719i) throws IOException;

    public final T fromJson(InterfaceC9709h interfaceC9709h) throws IOException {
        return fromJson(AbstractC8719i.m27698z(interfaceC9709h));
    }

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson(new C8723m(obj));
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public AbstractC8716f<T> indent(String str) {
        if (str != null) {
            return new d(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    boolean isLenient() {
        return false;
    }

    public final AbstractC8716f<T> lenient() {
        return new b(this);
    }

    public final AbstractC8716f<T> nonNull() {
        return this instanceof C8733a ? this : new C8733a(this);
    }

    public final AbstractC8716f<T> nullSafe() {
        return this instanceof C8734b ? this : new C8734b(this);
    }

    public final AbstractC8716f<T> serializeNulls() {
        return new a(this);
    }

    public abstract void toJson(AbstractC8725o abstractC8725o, T t) throws IOException;

    public final void toJson(InterfaceC9705g interfaceC9705g, T t) throws IOException {
        toJson(AbstractC8725o.m27770p(interfaceC9705g), (AbstractC8725o) t);
    }

    public final Object toJsonValue(T t) {
        C8724n c8724n = new C8724n();
        try {
            toJson((AbstractC8725o) c8724n, (C8724n) t);
            return c8724n.m27769W();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final T fromJson(String str) throws IOException {
        AbstractC8719i abstractC8719iM27698z = AbstractC8719i.m27698z(new C9703f().mo32055r0(str));
        T tFromJson = fromJson(abstractC8719iM27698z);
        if (isLenient() || abstractC8719iM27698z.mo27699A() == AbstractC8719i.b.END_DOCUMENT) {
            return tFromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final String toJson(T t) {
        C9703f c9703f = new C9703f();
        try {
            toJson((InterfaceC9705g) c9703f, (C9703f) t);
            return c9703f.m32021T();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
