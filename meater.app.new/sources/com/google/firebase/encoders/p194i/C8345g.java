package com.google.firebase.encoders.p194i;

import cm.aptoide.p092pt.database.room.RoomNotification;
import com.google.firebase.encoders.C8326b;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC8327c;
import com.google.firebase.encoders.InterfaceC8328d;
import com.google.firebase.encoders.InterfaceC8329e;
import com.google.firebase.encoders.p194i.InterfaceC8344f;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ProtobufDataEncoderContext.java */
/* renamed from: com.google.firebase.encoders.i.g */
/* loaded from: classes2.dex */
final class C8345g implements InterfaceC8328d {

    /* renamed from: a */
    private static final Charset f31678a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final C8326b f31679b = C8326b.m26076a(RoomNotification.KEY).m26081b(C8341c.m26125b().m26127c(1).m26126a()).m26080a();

    /* renamed from: c */
    private static final C8326b f31680c = C8326b.m26076a("value").m26081b(C8341c.m26125b().m26127c(2).m26126a()).m26080a();

    /* renamed from: d */
    private static final InterfaceC8327c<Map.Entry<Object, Object>> f31681d = new InterfaceC8327c() { // from class: com.google.firebase.encoders.i.a
        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: a */
        public final void mo13444a(Object obj, Object obj2) throws IOException {
            C8345g.m26136x((Map.Entry) obj, (InterfaceC8328d) obj2);
        }
    };

    /* renamed from: e */
    private OutputStream f31682e;

    /* renamed from: f */
    private final Map<Class<?>, InterfaceC8327c<?>> f31683f;

    /* renamed from: g */
    private final Map<Class<?>, InterfaceC8329e<?>> f31684g;

    /* renamed from: h */
    private final InterfaceC8327c<Object> f31685h;

    /* renamed from: i */
    private final C8347i f31686i = new C8347i(this);

    /* compiled from: ProtobufDataEncoderContext.java */
    /* renamed from: com.google.firebase.encoders.i.g$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31687a;

        static {
            int[] iArr = new int[InterfaceC8344f.a.values().length];
            f31687a = iArr;
            try {
                iArr[InterfaceC8344f.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31687a[InterfaceC8344f.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31687a[InterfaceC8344f.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C8345g(OutputStream outputStream, Map<Class<?>, InterfaceC8327c<?>> map, Map<Class<?>, InterfaceC8329e<?>> map2, InterfaceC8327c<Object> interfaceC8327c) {
        this.f31682e = outputStream;
        this.f31683f = map;
        this.f31684g = map2;
        this.f31685h = interfaceC8327c;
    }

    /* renamed from: q */
    private static ByteBuffer m26130q(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private <T> long m26131r(InterfaceC8327c<T> interfaceC8327c, T t) throws IOException {
        C8342d c8342d = new C8342d();
        try {
            OutputStream outputStream = this.f31682e;
            this.f31682e = c8342d;
            try {
                interfaceC8327c.mo13444a(t, this);
                this.f31682e = outputStream;
                long jM26128a = c8342d.m26128a();
                c8342d.close();
                return jM26128a;
            } catch (Throwable th) {
                this.f31682e = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c8342d.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    /* renamed from: s */
    private <T> C8345g m26132s(InterfaceC8327c<T> interfaceC8327c, C8326b c8326b, T t, boolean z) throws IOException {
        long jM26131r = m26131r(interfaceC8327c, t);
        if (z && jM26131r == 0) {
            return this;
        }
        m26137y((m26135w(c8326b) << 3) | 2);
        m26138z(jM26131r);
        interfaceC8327c.mo13444a(t, this);
        return this;
    }

    /* renamed from: t */
    private <T> C8345g m26133t(InterfaceC8329e<T> interfaceC8329e, C8326b c8326b, T t, boolean z) throws IOException {
        this.f31686i.m26157b(c8326b, z);
        interfaceC8329e.mo26089a(t, this.f31686i);
        return this;
    }

    /* renamed from: v */
    private static InterfaceC8344f m26134v(C8326b c8326b) {
        InterfaceC8344f interfaceC8344f = (InterfaceC8344f) c8326b.m26079c(InterfaceC8344f.class);
        if (interfaceC8344f != null) {
            return interfaceC8344f;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: w */
    private static int m26135w(C8326b c8326b) {
        InterfaceC8344f interfaceC8344f = (InterfaceC8344f) c8326b.m26079c(InterfaceC8344f.class);
        if (interfaceC8344f != null) {
            return interfaceC8344f.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: x */
    static /* synthetic */ void m26136x(Map.Entry entry, InterfaceC8328d interfaceC8328d) throws IOException {
        interfaceC8328d.mo26088i(f31679b, entry.getKey());
        interfaceC8328d.mo26088i(f31680c, entry.getValue());
    }

    /* renamed from: y */
    private void m26137y(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.f31682e.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.f31682e.write(i2 & 127);
    }

    /* renamed from: z */
    private void m26138z(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            this.f31682e.write((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        this.f31682e.write(((int) j2) & 127);
    }

    @Override // com.google.firebase.encoders.InterfaceC8328d
    /* renamed from: d */
    public InterfaceC8328d mo26085d(C8326b c8326b, double d2) throws IOException {
        return m26139f(c8326b, d2, true);
    }

    @Override // com.google.firebase.encoders.InterfaceC8328d
    /* renamed from: e */
    public InterfaceC8328d mo26086e(String str, int i2) throws IOException {
        return mo26084c(C8326b.m26077d(str), i2);
    }

    /* renamed from: f */
    InterfaceC8328d m26139f(C8326b c8326b, double d2, boolean z) throws IOException {
        if (z && d2 == 0.0d) {
            return this;
        }
        m26137y((m26135w(c8326b) << 3) | 1);
        this.f31682e.write(m26130q(8).putDouble(d2).array());
        return this;
    }

    /* renamed from: g */
    InterfaceC8328d m26140g(C8326b c8326b, float f2, boolean z) throws IOException {
        if (z && f2 == 0.0f) {
            return this;
        }
        m26137y((m26135w(c8326b) << 3) | 5);
        this.f31682e.write(m26130q(4).putFloat(f2).array());
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC8328d
    /* renamed from: h */
    public InterfaceC8328d mo26087h(String str, Object obj) throws IOException {
        return mo26088i(C8326b.m26077d(str), obj);
    }

    @Override // com.google.firebase.encoders.InterfaceC8328d
    /* renamed from: i */
    public InterfaceC8328d mo26088i(C8326b c8326b, Object obj) throws IOException {
        return m26141j(c8326b, obj, true);
    }

    /* renamed from: j */
    InterfaceC8328d m26141j(C8326b c8326b, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m26137y((m26135w(c8326b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f31678a);
            m26137y(bytes.length);
            this.f31682e.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m26141j(c8326b, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m26132s(f31681d, c8326b, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return m26139f(c8326b, ((Double) obj).doubleValue(), z);
        }
        if (obj instanceof Float) {
            return m26140g(c8326b, ((Float) obj).floatValue(), z);
        }
        if (obj instanceof Number) {
            return m26145n(c8326b, ((Number) obj).longValue(), z);
        }
        if (obj instanceof Boolean) {
            return m26147p(c8326b, ((Boolean) obj).booleanValue(), z);
        }
        if (!(obj instanceof byte[])) {
            InterfaceC8327c<?> interfaceC8327c = this.f31683f.get(obj.getClass());
            if (interfaceC8327c != null) {
                return m26132s(interfaceC8327c, c8326b, obj, z);
            }
            InterfaceC8329e<?> interfaceC8329e = this.f31684g.get(obj.getClass());
            return interfaceC8329e != null ? m26133t(interfaceC8329e, c8326b, obj, z) : obj instanceof InterfaceC8343e ? mo26084c(c8326b, ((InterfaceC8343e) obj).mo26129f()) : obj instanceof Enum ? mo26084c(c8326b, ((Enum) obj).ordinal()) : m26132s(this.f31685h, c8326b, obj, z);
        }
        byte[] bArr = (byte[]) obj;
        if (z && bArr.length == 0) {
            return this;
        }
        m26137y((m26135w(c8326b) << 3) | 2);
        m26137y(bArr.length);
        this.f31682e.write(bArr);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC8328d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C8345g mo26084c(C8326b c8326b, int i2) throws IOException {
        return m26143l(c8326b, i2, true);
    }

    /* renamed from: l */
    C8345g m26143l(C8326b c8326b, int i2, boolean z) throws IOException {
        if (z && i2 == 0) {
            return this;
        }
        InterfaceC8344f interfaceC8344fM26134v = m26134v(c8326b);
        int i3 = a.f31687a[interfaceC8344fM26134v.intEncoding().ordinal()];
        if (i3 == 1) {
            m26137y(interfaceC8344fM26134v.tag() << 3);
            m26137y(i2);
        } else if (i3 == 2) {
            m26137y(interfaceC8344fM26134v.tag() << 3);
            m26137y((i2 << 1) ^ (i2 >> 31));
        } else if (i3 == 3) {
            m26137y((interfaceC8344fM26134v.tag() << 3) | 5);
            this.f31682e.write(m26130q(4).putInt(i2).array());
        }
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC8328d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C8345g mo26083b(C8326b c8326b, long j2) throws IOException {
        return m26145n(c8326b, j2, true);
    }

    /* renamed from: n */
    C8345g m26145n(C8326b c8326b, long j2, boolean z) throws IOException {
        if (z && j2 == 0) {
            return this;
        }
        InterfaceC8344f interfaceC8344fM26134v = m26134v(c8326b);
        int i2 = a.f31687a[interfaceC8344fM26134v.intEncoding().ordinal()];
        if (i2 == 1) {
            m26137y(interfaceC8344fM26134v.tag() << 3);
            m26138z(j2);
        } else if (i2 == 2) {
            m26137y(interfaceC8344fM26134v.tag() << 3);
            m26138z((j2 >> 63) ^ (j2 << 1));
        } else if (i2 == 3) {
            m26137y((interfaceC8344fM26134v.tag() << 3) | 1);
            this.f31682e.write(m26130q(8).putLong(j2).array());
        }
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC8328d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C8345g mo26082a(C8326b c8326b, boolean z) throws IOException {
        return m26147p(c8326b, z, true);
    }

    /* renamed from: p */
    C8345g m26147p(C8326b c8326b, boolean z, boolean z2) throws IOException {
        return m26143l(c8326b, z ? 1 : 0, z2);
    }

    /* renamed from: u */
    C8345g m26148u(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC8327c<?> interfaceC8327c = this.f31683f.get(obj.getClass());
        if (interfaceC8327c != null) {
            interfaceC8327c.mo13444a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
