package e9;

import c9.InterfaceC2346a;
import c9.InterfaceC2348c;
import c9.InterfaceC2349d;
import c9.InterfaceC2350e;
import c9.InterfaceC2351f;
import com.google.firebase.encoders.EncodingException;
import d9.InterfaceC3083a;
import d9.InterfaceC3084b;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: JsonDataEncoderBuilder.java */
/* renamed from: e9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3260d implements InterfaceC3084b<C3260d> {

    /* renamed from: e, reason: collision with root package name */
    private static final InterfaceC2348c<Object> f40787e = new InterfaceC2348c() { // from class: e9.a
        @Override // c9.InterfaceC2348c
        public final void a(Object obj, Object obj2) {
            C3260d.l(obj, (InterfaceC2349d) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final InterfaceC2350e<String> f40788f = new InterfaceC2350e() { // from class: e9.b
        @Override // c9.InterfaceC2350e
        public final void a(Object obj, Object obj2) {
            ((InterfaceC2351f) obj2).b((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final InterfaceC2350e<Boolean> f40789g = new InterfaceC2350e() { // from class: e9.c
        @Override // c9.InterfaceC2350e
        public final void a(Object obj, Object obj2) {
            C3260d.n((Boolean) obj, (InterfaceC2351f) obj2);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f40790h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, InterfaceC2348c<?>> f40791a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, InterfaceC2350e<?>> f40792b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC2348c<Object> f40793c = f40787e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f40794d = false;

    /* compiled from: JsonDataEncoderBuilder.java */
    /* renamed from: e9.d$a */
    class a implements InterfaceC2346a {
        a() {
        }

        @Override // c9.InterfaceC2346a
        public void a(Object obj, Writer writer) {
            C3261e c3261e = new C3261e(writer, C3260d.this.f40791a, C3260d.this.f40792b, C3260d.this.f40793c, C3260d.this.f40794d);
            c3261e.k(obj, false);
            c3261e.u();
        }

        @Override // c9.InterfaceC2346a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* compiled from: JsonDataEncoderBuilder.java */
    /* renamed from: e9.d$b */
    private static final class b implements InterfaceC2350e<Date> {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f40796a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f40796a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // c9.InterfaceC2350e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, InterfaceC2351f interfaceC2351f) {
            interfaceC2351f.b(f40796a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C3260d() {
        p(String.class, f40788f);
        p(Boolean.class, f40789g);
        p(Date.class, f40790h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, InterfaceC2349d interfaceC2349d) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, InterfaceC2351f interfaceC2351f) {
        interfaceC2351f.c(bool.booleanValue());
    }

    public InterfaceC2346a i() {
        return new a();
    }

    public C3260d j(InterfaceC3083a interfaceC3083a) {
        interfaceC3083a.a(this);
        return this;
    }

    public C3260d k(boolean z10) {
        this.f40794d = z10;
        return this;
    }

    @Override // d9.InterfaceC3084b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public <T> C3260d a(Class<T> cls, InterfaceC2348c<? super T> interfaceC2348c) {
        this.f40791a.put(cls, interfaceC2348c);
        this.f40792b.remove(cls);
        return this;
    }

    public <T> C3260d p(Class<T> cls, InterfaceC2350e<? super T> interfaceC2350e) {
        this.f40792b.put(cls, interfaceC2350e);
        this.f40791a.remove(cls);
        return this;
    }
}
