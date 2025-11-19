package f9;

import c9.C2347b;
import c9.InterfaceC2348c;
import c9.InterfaceC2349d;
import c9.InterfaceC2350e;
import com.google.firebase.encoders.EncodingException;
import f9.InterfaceC3350d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ProtobufDataEncoderContext.java */
/* loaded from: classes2.dex */
final class f implements InterfaceC2349d {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f41391f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final C2347b f41392g = C2347b.a("key").b(C3347a.b().c(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    private static final C2347b f41393h = C2347b.a("value").b(C3347a.b().c(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    private static final InterfaceC2348c<Map.Entry<Object, Object>> f41394i = new InterfaceC2348c() { // from class: f9.e
        @Override // c9.InterfaceC2348c
        public final void a(Object obj, Object obj2) {
            f.w((Map.Entry) obj, (InterfaceC2349d) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f41395a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, InterfaceC2348c<?>> f41396b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, InterfaceC2350e<?>> f41397c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2348c<Object> f41398d;

    /* renamed from: e, reason: collision with root package name */
    private final i f41399e = new i(this);

    /* compiled from: ProtobufDataEncoderContext.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41400a;

        static {
            int[] iArr = new int[InterfaceC3350d.a.values().length];
            f41400a = iArr;
            try {
                iArr[InterfaceC3350d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41400a[InterfaceC3350d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41400a[InterfaceC3350d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map<Class<?>, InterfaceC2348c<?>> map, Map<Class<?>, InterfaceC2350e<?>> map2, InterfaceC2348c<Object> interfaceC2348c) {
        this.f41395a = outputStream;
        this.f41396b = map;
        this.f41397c = map2;
        this.f41398d = interfaceC2348c;
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long q(InterfaceC2348c<T> interfaceC2348c, T t10) throws IOException {
        C3348b c3348b = new C3348b();
        try {
            OutputStream outputStream = this.f41395a;
            this.f41395a = c3348b;
            try {
                interfaceC2348c.a(t10, this);
                this.f41395a = outputStream;
                long jA = c3348b.a();
                c3348b.close();
                return jA;
            } catch (Throwable th) {
                this.f41395a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c3348b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> f r(InterfaceC2348c<T> interfaceC2348c, C2347b c2347b, T t10, boolean z10) throws IOException {
        long jQ = q(interfaceC2348c, t10);
        if (z10 && jQ == 0) {
            return this;
        }
        x((v(c2347b) << 3) | 2);
        y(jQ);
        interfaceC2348c.a(t10, this);
        return this;
    }

    private <T> f s(InterfaceC2350e<T> interfaceC2350e, C2347b c2347b, T t10, boolean z10) {
        this.f41399e.d(c2347b, z10);
        interfaceC2350e.a(t10, this.f41399e);
        return this;
    }

    private static InterfaceC3350d u(C2347b c2347b) {
        InterfaceC3350d interfaceC3350d = (InterfaceC3350d) c2347b.c(InterfaceC3350d.class);
        if (interfaceC3350d != null) {
            return interfaceC3350d;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int v(C2347b c2347b) {
        InterfaceC3350d interfaceC3350d = (InterfaceC3350d) c2347b.c(InterfaceC3350d.class);
        if (interfaceC3350d != null) {
            return interfaceC3350d.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Map.Entry entry, InterfaceC2349d interfaceC2349d) {
        interfaceC2349d.a(f41392g, entry.getKey());
        interfaceC2349d.a(f41393h, entry.getValue());
    }

    private void x(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f41395a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f41395a.write(i10 & 127);
    }

    private void y(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f41395a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f41395a.write(((int) j10) & 127);
    }

    @Override // c9.InterfaceC2349d
    public InterfaceC2349d a(C2347b c2347b, Object obj) {
        return i(c2347b, obj, true);
    }

    InterfaceC2349d c(C2347b c2347b, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        x((v(c2347b) << 3) | 1);
        this.f41395a.write(p(8).putDouble(d10).array());
        return this;
    }

    @Override // c9.InterfaceC2349d
    public InterfaceC2349d g(C2347b c2347b, double d10) {
        return c(c2347b, d10, true);
    }

    InterfaceC2349d h(C2347b c2347b, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        x((v(c2347b) << 3) | 5);
        this.f41395a.write(p(4).putFloat(f10).array());
        return this;
    }

    InterfaceC2349d i(C2347b c2347b, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            x((v(c2347b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f41391f);
            x(bytes.length);
            this.f41395a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(c2347b, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                r(f41394i, c2347b, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return c(c2347b, ((Double) obj).doubleValue(), z10);
        }
        if (obj instanceof Float) {
            return h(c2347b, ((Float) obj).floatValue(), z10);
        }
        if (obj instanceof Number) {
            return m(c2347b, ((Number) obj).longValue(), z10);
        }
        if (obj instanceof Boolean) {
            return o(c2347b, ((Boolean) obj).booleanValue(), z10);
        }
        if (!(obj instanceof byte[])) {
            InterfaceC2348c<?> interfaceC2348c = this.f41396b.get(obj.getClass());
            if (interfaceC2348c != null) {
                return r(interfaceC2348c, c2347b, obj, z10);
            }
            InterfaceC2350e<?> interfaceC2350e = this.f41397c.get(obj.getClass());
            return interfaceC2350e != null ? s(interfaceC2350e, c2347b, obj, z10) : obj instanceof InterfaceC3349c ? f(c2347b, ((InterfaceC3349c) obj).e()) : obj instanceof Enum ? f(c2347b, ((Enum) obj).ordinal()) : r(this.f41398d, c2347b, obj, z10);
        }
        byte[] bArr = (byte[]) obj;
        if (z10 && bArr.length == 0) {
            return this;
        }
        x((v(c2347b) << 3) | 2);
        x(bArr.length);
        this.f41395a.write(bArr);
        return this;
    }

    @Override // c9.InterfaceC2349d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f f(C2347b c2347b, int i10) {
        return k(c2347b, i10, true);
    }

    f k(C2347b c2347b, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        InterfaceC3350d interfaceC3350dU = u(c2347b);
        int i11 = a.f41400a[interfaceC3350dU.intEncoding().ordinal()];
        if (i11 == 1) {
            x(interfaceC3350dU.tag() << 3);
            x(i10);
        } else if (i11 == 2) {
            x(interfaceC3350dU.tag() << 3);
            x((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            x((interfaceC3350dU.tag() << 3) | 5);
            this.f41395a.write(p(4).putInt(i10).array());
        }
        return this;
    }

    @Override // c9.InterfaceC2349d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public f e(C2347b c2347b, long j10) {
        return m(c2347b, j10, true);
    }

    f m(C2347b c2347b, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        InterfaceC3350d interfaceC3350dU = u(c2347b);
        int i10 = a.f41400a[interfaceC3350dU.intEncoding().ordinal()];
        if (i10 == 1) {
            x(interfaceC3350dU.tag() << 3);
            y(j10);
        } else if (i10 == 2) {
            x(interfaceC3350dU.tag() << 3);
            y((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            x((interfaceC3350dU.tag() << 3) | 1);
            this.f41395a.write(p(8).putLong(j10).array());
        }
        return this;
    }

    @Override // c9.InterfaceC2349d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f d(C2347b c2347b, boolean z10) {
        return o(c2347b, z10, true);
    }

    f o(C2347b c2347b, boolean z10, boolean z11) {
        return k(c2347b, z10 ? 1 : 0, z11);
    }

    f t(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC2348c<?> interfaceC2348c = this.f41396b.get(obj.getClass());
        if (interfaceC2348c != null) {
            interfaceC2348c.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
