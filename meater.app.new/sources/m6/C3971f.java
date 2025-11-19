package m6;

import java.security.MessageDigest;

/* compiled from: Option.java */
/* renamed from: m6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3971f<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final b<Object> f45118e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final T f45119a;

    /* renamed from: b, reason: collision with root package name */
    private final b<T> f45120b;

    /* renamed from: c, reason: collision with root package name */
    private final String f45121c;

    /* renamed from: d, reason: collision with root package name */
    private volatile byte[] f45122d;

    /* compiled from: Option.java */
    /* renamed from: m6.f$b */
    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    private C3971f(String str, T t10, b<T> bVar) {
        this.f45121c = H6.k.b(str);
        this.f45119a = t10;
        this.f45120b = (b) H6.k.d(bVar);
    }

    public static <T> C3971f<T> a(String str, T t10, b<T> bVar) {
        return new C3971f<>(str, t10, bVar);
    }

    private static <T> b<T> b() {
        return (b<T>) f45118e;
    }

    private byte[] d() {
        if (this.f45122d == null) {
            this.f45122d = this.f45121c.getBytes(InterfaceC3970e.f45117a);
        }
        return this.f45122d;
    }

    public static <T> C3971f<T> e(String str) {
        return new C3971f<>(str, null, b());
    }

    public static <T> C3971f<T> f(String str, T t10) {
        return new C3971f<>(str, t10, b());
    }

    public T c() {
        return this.f45119a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3971f) {
            return this.f45121c.equals(((C3971f) obj).f45121c);
        }
        return false;
    }

    public void g(T t10, MessageDigest messageDigest) {
        this.f45120b.a(d(), t10, messageDigest);
    }

    public int hashCode() {
        return this.f45121c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f45121c + "'}";
    }

    /* compiled from: Option.java */
    /* renamed from: m6.f$a */
    class a implements b<Object> {
        a() {
        }

        @Override // m6.C3971f.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
