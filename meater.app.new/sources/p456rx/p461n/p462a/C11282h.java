package p456rx.p461n.p462a;

import java.io.Serializable;
import p456rx.InterfaceC11241f;

/* compiled from: NotificationLite.java */
/* renamed from: rx.n.a.h */
/* loaded from: classes3.dex */
public final class C11282h {

    /* renamed from: a */
    private static final Object f42308a = new a();

    /* renamed from: b */
    private static final Object f42309b = new b();

    /* compiled from: NotificationLite.java */
    /* renamed from: rx.n.a.h$a */
    static class a implements Serializable {
        a() {
        }

        public String toString() {
            return "Notification=>Completed";
        }
    }

    /* compiled from: NotificationLite.java */
    /* renamed from: rx.n.a.h$b */
    static class b implements Serializable {
        b() {
        }

        public String toString() {
            return "Notification=>NULL";
        }
    }

    /* compiled from: NotificationLite.java */
    /* renamed from: rx.n.a.h$c */
    static final class c implements Serializable {

        /* renamed from: f */
        final Throwable f42310f;

        public c(Throwable th) {
            this.f42310f = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.f42310f;
        }
    }

    /* renamed from: a */
    public static <T> boolean m40215a(InterfaceC11241f<? super T> interfaceC11241f, Object obj) {
        if (obj == f42308a) {
            interfaceC11241f.onCompleted();
            return true;
        }
        if (obj == f42309b) {
            interfaceC11241f.onNext(null);
            return false;
        }
        if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
        if (obj.getClass() == c.class) {
            interfaceC11241f.onError(((c) obj).f42310f);
            return true;
        }
        interfaceC11241f.onNext(obj);
        return false;
    }

    /* renamed from: b */
    public static Object m40216b() {
        return f42308a;
    }

    /* renamed from: c */
    public static Object m40217c(Throwable th) {
        return new c(th);
    }

    /* renamed from: d */
    public static Throwable m40218d(Object obj) {
        return ((c) obj).f42310f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static <T> T m40219e(Object obj) {
        if (obj == f42309b) {
            return null;
        }
        return obj;
    }

    /* renamed from: f */
    public static boolean m40220f(Object obj) {
        return obj == f42308a;
    }

    /* renamed from: g */
    public static <T> Object m40221g(T t) {
        return t == null ? f42309b : t;
    }
}
