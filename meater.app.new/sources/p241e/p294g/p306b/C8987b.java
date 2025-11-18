package p241e.p294g.p306b;

import java.io.Serializable;
import p456rx.InterfaceC11241f;

/* compiled from: NotificationLite.java */
/* renamed from: e.g.b.b */
/* loaded from: classes2.dex */
final class C8987b {

    /* renamed from: a */
    private static final Object f34562a = new a();

    /* compiled from: NotificationLite.java */
    /* renamed from: e.g.b.b$a */
    static class a implements Serializable {
        a() {
        }

        public String toString() {
            return "Notification=>NULL";
        }
    }

    /* renamed from: a */
    public static <T> boolean m28591a(InterfaceC11241f<? super T> interfaceC11241f, Object obj) {
        if (obj == f34562a) {
            interfaceC11241f.onNext(null);
            return false;
        }
        if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
        interfaceC11241f.onNext(obj);
        return false;
    }

    /* renamed from: b */
    public static <T> Object m28592b(T t) {
        return t == null ? f34562a : t;
    }
}
