package p456rx.exceptions;

import java.util.HashSet;
import java.util.List;
import p456rx.AbstractC11244i;
import p456rx.InterfaceC11241f;

/* compiled from: Exceptions.java */
/* renamed from: rx.exceptions.a */
/* loaded from: classes3.dex */
public final class C11240a {
    /* renamed from: a */
    public static void m40136a(Throwable th, Throwable th2) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (th.getCause() != null) {
            int i3 = i2 + 1;
            if (i2 >= 25) {
                return;
            }
            th = th.getCause();
            if (!hashSet.contains(th.getCause())) {
                hashSet.add(th.getCause());
                i2 = i3;
            }
        }
        try {
            th.initCause(th2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static Throwable m40137b(Throwable th) {
        int i2 = 0;
        while (th.getCause() != null) {
            int i3 = i2 + 1;
            if (i2 >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            th = th.getCause();
            i2 = i3;
        }
        return th;
    }

    /* renamed from: c */
    public static RuntimeException m40138c(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new RuntimeException(th);
    }

    /* renamed from: d */
    public static void m40139d(List<? extends Throwable> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new CompositeException(list);
        }
        Throwable th = list.get(0);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new RuntimeException(th);
        }
        throw ((Error) th);
    }

    /* renamed from: e */
    public static void m40140e(Throwable th) {
        if (th instanceof OnErrorNotImplementedException) {
            throw ((OnErrorNotImplementedException) th);
        }
        if (th instanceof OnErrorFailedException) {
            throw ((OnErrorFailedException) th);
        }
        if (th instanceof OnCompletedFailedException) {
            throw ((OnCompletedFailedException) th);
        }
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: f */
    public static void m40141f(Throwable th, InterfaceC11241f<?> interfaceC11241f) {
        m40140e(th);
        interfaceC11241f.onError(th);
    }

    /* renamed from: g */
    public static void m40142g(Throwable th, InterfaceC11241f<?> interfaceC11241f, Object obj) {
        m40140e(th);
        interfaceC11241f.onError(OnErrorThrowable.m40132a(th, obj));
    }

    /* renamed from: h */
    public static void m40143h(Throwable th, AbstractC11244i<?> abstractC11244i) {
        m40140e(th);
        abstractC11244i.onError(th);
    }

    /* renamed from: i */
    public static void m40144i(Throwable th, AbstractC11244i<?> abstractC11244i, Object obj) {
        m40140e(th);
        abstractC11244i.onError(OnErrorThrowable.m40132a(th, obj));
    }
}
