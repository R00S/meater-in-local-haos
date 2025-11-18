package p456rx;

/* compiled from: Notification.java */
/* renamed from: rx.d */
/* loaded from: classes3.dex */
public final class C11233d<T> {

    /* renamed from: a */
    private static final C11233d<Void> f42121a = new C11233d<>(a.OnCompleted, null, null);

    /* renamed from: b */
    private final a f42122b;

    /* renamed from: c */
    private final Throwable f42123c;

    /* renamed from: d */
    private final T f42124d;

    /* compiled from: Notification.java */
    /* renamed from: rx.d$a */
    public enum a {
        OnNext,
        OnError,
        OnCompleted
    }

    private C11233d(a aVar, T t, Throwable th) {
        this.f42124d = t;
        this.f42123c = th;
        this.f42122b = aVar;
    }

    /* renamed from: a */
    public static <T> C11233d<T> m40005a() {
        return (C11233d<T>) f42121a;
    }

    /* renamed from: b */
    public static <T> C11233d<T> m40006b(Throwable th) {
        return new C11233d<>(a.OnError, null, th);
    }

    /* renamed from: c */
    public static <T> C11233d<T> m40007c(T t) {
        return new C11233d<>(a.OnNext, t, null);
    }

    /* renamed from: d */
    public a m40008d() {
        return this.f42122b;
    }

    /* renamed from: e */
    public Throwable m40009e() {
        return this.f42123c;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != C11233d.class) {
            return false;
        }
        C11233d c11233d = (C11233d) obj;
        if (c11233d.m40008d() != m40008d()) {
            return false;
        }
        T t = this.f42124d;
        T t2 = c11233d.f42124d;
        if (t != t2 && (t == null || !t.equals(t2))) {
            return false;
        }
        Throwable th = this.f42123c;
        Throwable th2 = c11233d.f42123c;
        return th == th2 || (th != null && th.equals(th2));
    }

    /* renamed from: f */
    public T m40010f() {
        return this.f42124d;
    }

    /* renamed from: g */
    public boolean m40011g() {
        return m40014j() && this.f42123c != null;
    }

    /* renamed from: h */
    public boolean m40012h() {
        return m40015k() && this.f42124d != null;
    }

    public int hashCode() {
        int iHashCode = m40008d().hashCode();
        if (m40012h()) {
            iHashCode = (iHashCode * 31) + m40010f().hashCode();
        }
        return m40011g() ? (iHashCode * 31) + m40009e().hashCode() : iHashCode;
    }

    /* renamed from: i */
    public boolean m40013i() {
        return m40008d() == a.OnCompleted;
    }

    /* renamed from: j */
    public boolean m40014j() {
        return m40008d() == a.OnError;
    }

    /* renamed from: k */
    public boolean m40015k() {
        return m40008d() == a.OnNext;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append('[');
        sb.append(super.toString());
        sb.append(' ');
        sb.append(m40008d());
        if (m40012h()) {
            sb.append(' ');
            sb.append(m40010f());
        }
        if (m40011g()) {
            sb.append(' ');
            sb.append(m40009e().getMessage());
        }
        sb.append(']');
        return sb.toString();
    }
}
