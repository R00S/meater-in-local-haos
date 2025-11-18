package e9;

import android.util.Base64;
import android.util.JsonWriter;
import c9.C2347b;
import c9.InterfaceC2348c;
import c9.InterfaceC2349d;
import c9.InterfaceC2350e;
import c9.InterfaceC2351f;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonValueObjectEncoderContext.java */
/* renamed from: e9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3261e implements InterfaceC2349d, InterfaceC2351f {

    /* renamed from: a, reason: collision with root package name */
    private C3261e f40797a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f40798b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f40799c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, InterfaceC2348c<?>> f40800d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, InterfaceC2350e<?>> f40801e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2348c<Object> f40802f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f40803g;

    C3261e(Writer writer, Map<Class<?>, InterfaceC2348c<?>> map, Map<Class<?>, InterfaceC2350e<?>> map2, InterfaceC2348c<Object> interfaceC2348c, boolean z10) {
        this.f40799c = new JsonWriter(writer);
        this.f40800d = map;
        this.f40801e = map2;
        this.f40802f = interfaceC2348c;
        this.f40803g = z10;
    }

    private boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private C3261e w(String str, Object obj) throws IOException {
        y();
        this.f40799c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f40799c.nullValue();
        return this;
    }

    private C3261e x(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        y();
        this.f40799c.name(str);
        return k(obj, false);
    }

    private void y() throws IOException {
        if (!this.f40798b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C3261e c3261e = this.f40797a;
        if (c3261e != null) {
            c3261e.y();
            this.f40797a.f40798b = false;
            this.f40797a = null;
            this.f40799c.endObject();
        }
    }

    @Override // c9.InterfaceC2349d
    public InterfaceC2349d a(C2347b c2347b, Object obj) {
        return p(c2347b.b(), obj);
    }

    @Override // c9.InterfaceC2349d
    public InterfaceC2349d d(C2347b c2347b, boolean z10) {
        return q(c2347b.b(), z10);
    }

    @Override // c9.InterfaceC2349d
    public InterfaceC2349d e(C2347b c2347b, long j10) {
        return o(c2347b.b(), j10);
    }

    @Override // c9.InterfaceC2349d
    public InterfaceC2349d f(C2347b c2347b, int i10) {
        return n(c2347b.b(), i10);
    }

    @Override // c9.InterfaceC2349d
    public InterfaceC2349d g(C2347b c2347b, double d10) {
        return m(c2347b.b(), d10);
    }

    public C3261e h(double d10) throws IOException {
        y();
        this.f40799c.value(d10);
        return this;
    }

    public C3261e i(int i10) throws IOException {
        y();
        this.f40799c.value(i10);
        return this;
    }

    public C3261e j(long j10) throws IOException {
        y();
        this.f40799c.value(j10);
        return this;
    }

    C3261e k(Object obj, boolean z10) {
        if (z10 && t(obj)) {
            throw new EncodingException(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f40799c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f40799c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f40799c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.f40799c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f40799c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f40799c.endObject();
                return this;
            }
            InterfaceC2348c<?> interfaceC2348c = this.f40800d.get(obj.getClass());
            if (interfaceC2348c != null) {
                return v(interfaceC2348c, obj, z10);
            }
            InterfaceC2350e<?> interfaceC2350e = this.f40801e.get(obj.getClass());
            if (interfaceC2350e != null) {
                interfaceC2350e.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return v(this.f40802f, obj, z10);
            }
            if (obj instanceof InterfaceC3262f) {
                i(((InterfaceC3262f) obj).getNumber());
            } else {
                b(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.f40799c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f40799c.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                j(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f40799c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f40799c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                k(obj2, false);
            }
        }
        this.f40799c.endArray();
        return this;
    }

    @Override // c9.InterfaceC2351f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C3261e b(String str) throws IOException {
        y();
        this.f40799c.value(str);
        return this;
    }

    public C3261e m(String str, double d10) throws IOException {
        y();
        this.f40799c.name(str);
        return h(d10);
    }

    public C3261e n(String str, int i10) throws IOException {
        y();
        this.f40799c.name(str);
        return i(i10);
    }

    public C3261e o(String str, long j10) throws IOException {
        y();
        this.f40799c.name(str);
        return j(j10);
    }

    public C3261e p(String str, Object obj) {
        return this.f40803g ? x(str, obj) : w(str, obj);
    }

    public C3261e q(String str, boolean z10) throws IOException {
        y();
        this.f40799c.name(str);
        return c(z10);
    }

    @Override // c9.InterfaceC2351f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C3261e c(boolean z10) throws IOException {
        y();
        this.f40799c.value(z10);
        return this;
    }

    public C3261e s(byte[] bArr) throws IOException {
        y();
        if (bArr == null) {
            this.f40799c.nullValue();
        } else {
            this.f40799c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void u() {
        y();
        this.f40799c.flush();
    }

    C3261e v(InterfaceC2348c<Object> interfaceC2348c, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f40799c.beginObject();
        }
        interfaceC2348c.a(obj, this);
        if (!z10) {
            this.f40799c.endObject();
        }
        return this;
    }
}
