package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.C8326b;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC8327c;
import com.google.firebase.encoders.InterfaceC8328d;
import com.google.firebase.encoders.InterfaceC8329e;
import com.google.firebase.encoders.InterfaceC8330f;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonValueObjectEncoderContext.java */
/* renamed from: com.google.firebase.encoders.h.e */
/* loaded from: classes2.dex */
final class C8337e implements InterfaceC8328d, InterfaceC8330f {

    /* renamed from: a */
    private C8337e f31660a = null;

    /* renamed from: b */
    private boolean f31661b = true;

    /* renamed from: c */
    private final JsonWriter f31662c;

    /* renamed from: d */
    private final Map<Class<?>, InterfaceC8327c<?>> f31663d;

    /* renamed from: e */
    private final Map<Class<?>, InterfaceC8329e<?>> f31664e;

    /* renamed from: f */
    private final InterfaceC8327c<Object> f31665f;

    /* renamed from: g */
    private final boolean f31666g;

    C8337e(Writer writer, Map<Class<?>, InterfaceC8327c<?>> map, Map<Class<?>, InterfaceC8329e<?>> map2, InterfaceC8327c<Object> interfaceC8327c, boolean z) {
        this.f31662c = new JsonWriter(writer);
        this.f31663d = map;
        this.f31664e = map2;
        this.f31665f = interfaceC8327c;
        this.f31666g = z;
    }

    /* renamed from: A */
    private void m26106A() throws IOException {
        if (!this.f31661b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C8337e c8337e = this.f31660a;
        if (c8337e != null) {
            c8337e.m26106A();
            this.f31660a.f31661b = false;
            this.f31660a = null;
            this.f31662c.endObject();
        }
    }

    /* renamed from: v */
    private boolean m26107v(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: y */
    private C8337e m26108y(String str, Object obj) throws EncodingException, IOException {
        m26106A();
        this.f31662c.name(str);
        if (obj != null) {
            return m26113m(obj, false);
        }
        this.f31662c.nullValue();
        return this;
    }

    /* renamed from: z */
    private C8337e m26109z(String str, Object obj) throws EncodingException, IOException {
        if (obj == null) {
            return this;
        }
        m26106A();
        this.f31662c.name(str);
        return m26113m(obj, false);
    }

    @Override // com.google.firebase.encoders.InterfaceC8328d
    /* renamed from: a */
    public InterfaceC8328d mo26082a(C8326b c8326b, boolean z) throws IOException {
        return m26119s(c8326b.m26078b(), z);
    }

    @Override // com.google.firebase.encoders.InterfaceC8328d
    /* renamed from: b */
    public InterfaceC8328d mo26083b(C8326b c8326b, long j2) throws IOException {
        return m26117q(c8326b.m26078b(), j2);
    }

    @Override // com.google.firebase.encoders.InterfaceC8328d
    /* renamed from: c */
    public InterfaceC8328d mo26084c(C8326b c8326b, int i2) throws IOException {
        return mo26086e(c8326b.m26078b(), i2);
    }

    @Override // com.google.firebase.encoders.InterfaceC8328d
    /* renamed from: d */
    public InterfaceC8328d mo26085d(C8326b c8326b, double d2) throws IOException {
        return m26115o(c8326b.m26078b(), d2);
    }

    @Override // com.google.firebase.encoders.InterfaceC8328d
    /* renamed from: i */
    public InterfaceC8328d mo26088i(C8326b c8326b, Object obj) throws IOException {
        return mo26087h(c8326b.m26078b(), obj);
    }

    /* renamed from: j */
    public C8337e m26110j(double d2) throws IOException {
        m26106A();
        this.f31662c.value(d2);
        return this;
    }

    /* renamed from: k */
    public C8337e m26111k(int i2) throws IOException {
        m26106A();
        this.f31662c.value(i2);
        return this;
    }

    /* renamed from: l */
    public C8337e m26112l(long j2) throws IOException {
        m26106A();
        this.f31662c.value(j2);
        return this;
    }

    /* renamed from: m */
    C8337e m26113m(Object obj, boolean z) throws IOException {
        int i2 = 0;
        if (z && m26107v(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f31662c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f31662c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f31662c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m26113m(it.next(), false);
                }
                this.f31662c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f31662c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        mo26087h((String) key, entry.getValue());
                    } catch (ClassCastException e2) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                    }
                }
                this.f31662c.endObject();
                return this;
            }
            InterfaceC8327c<?> interfaceC8327c = this.f31663d.get(obj.getClass());
            if (interfaceC8327c != null) {
                return m26123x(interfaceC8327c, obj, z);
            }
            InterfaceC8329e<?> interfaceC8329e = this.f31664e.get(obj.getClass());
            if (interfaceC8329e != null) {
                interfaceC8329e.mo26089a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return m26123x(this.f31665f, obj, z);
            }
            if (obj instanceof NumberedEnum) {
                m26111k(((NumberedEnum) obj).getF32246m());
            } else {
                mo26090f(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return m26121u((byte[]) obj);
        }
        this.f31662c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i2 < length) {
                this.f31662c.value(r6[i2]);
                i2++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i2 < length2) {
                m26112l(jArr[i2]);
                i2++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i2 < length3) {
                this.f31662c.value(dArr[i2]);
                i2++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i2 < length4) {
                this.f31662c.value(zArr[i2]);
                i2++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                m26113m(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                m26113m(obj2, false);
            }
        }
        this.f31662c.endArray();
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC8330f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C8337e mo26090f(String str) throws IOException {
        m26106A();
        this.f31662c.value(str);
        return this;
    }

    /* renamed from: o */
    public C8337e m26115o(String str, double d2) throws IOException {
        m26106A();
        this.f31662c.name(str);
        return m26110j(d2);
    }

    @Override // com.google.firebase.encoders.InterfaceC8328d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C8337e mo26086e(String str, int i2) throws IOException {
        m26106A();
        this.f31662c.name(str);
        return m26111k(i2);
    }

    /* renamed from: q */
    public C8337e m26117q(String str, long j2) throws IOException {
        m26106A();
        this.f31662c.name(str);
        return m26112l(j2);
    }

    @Override // com.google.firebase.encoders.InterfaceC8328d
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C8337e mo26087h(String str, Object obj) throws IOException {
        return this.f31666g ? m26109z(str, obj) : m26108y(str, obj);
    }

    /* renamed from: s */
    public C8337e m26119s(String str, boolean z) throws IOException {
        m26106A();
        this.f31662c.name(str);
        return mo26091g(z);
    }

    @Override // com.google.firebase.encoders.InterfaceC8330f
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C8337e mo26091g(boolean z) throws IOException {
        m26106A();
        this.f31662c.value(z);
        return this;
    }

    /* renamed from: u */
    public C8337e m26121u(byte[] bArr) throws IOException {
        m26106A();
        if (bArr == null) {
            this.f31662c.nullValue();
        } else {
            this.f31662c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* renamed from: w */
    void m26122w() throws IOException {
        m26106A();
        this.f31662c.flush();
    }

    /* renamed from: x */
    C8337e m26123x(InterfaceC8327c<Object> interfaceC8327c, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f31662c.beginObject();
        }
        interfaceC8327c.mo13444a(obj, this);
        if (!z) {
            this.f31662c.endObject();
        }
        return this;
    }
}
