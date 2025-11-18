package f9;

import c9.InterfaceC2348c;
import c9.InterfaceC2349d;
import c9.InterfaceC2350e;
import com.google.firebase.encoders.EncodingException;
import d9.InterfaceC3083a;
import d9.InterfaceC3084b;
import f9.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProtobufEncoder.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, InterfaceC2348c<?>> f41401a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, InterfaceC2350e<?>> f41402b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2348c<Object> f41403c;

    /* compiled from: ProtobufEncoder.java */
    public static final class a implements InterfaceC3084b<a> {

        /* renamed from: d, reason: collision with root package name */
        private static final InterfaceC2348c<Object> f41404d = new InterfaceC2348c() { // from class: f9.g
            @Override // c9.InterfaceC2348c
            public final void a(Object obj, Object obj2) {
                h.a.e(obj, (InterfaceC2349d) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, InterfaceC2348c<?>> f41405a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, InterfaceC2350e<?>> f41406b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC2348c<Object> f41407c = f41404d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, InterfaceC2349d interfaceC2349d) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f41405a), new HashMap(this.f41406b), this.f41407c);
        }

        public a d(InterfaceC3083a interfaceC3083a) {
            interfaceC3083a.a(this);
            return this;
        }

        @Override // d9.InterfaceC3084b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public <U> a a(Class<U> cls, InterfaceC2348c<? super U> interfaceC2348c) {
            this.f41405a.put(cls, interfaceC2348c);
            this.f41406b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, InterfaceC2348c<?>> map, Map<Class<?>, InterfaceC2350e<?>> map2, InterfaceC2348c<Object> interfaceC2348c) {
        this.f41401a = map;
        this.f41402b = map2;
        this.f41403c = interfaceC2348c;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f41401a, this.f41402b, this.f41403c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
