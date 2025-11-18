package p456rx.p461n.p466e;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.exceptions.CompositeException;

/* compiled from: ExceptionsUtils.java */
/* renamed from: rx.n.e.e */
/* loaded from: classes3.dex */
public enum EnumC11356e {
    ;


    /* renamed from: f */
    private static final Throwable f42870f = new Throwable("Terminated");

    /* renamed from: g */
    public static boolean m40421g(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable compositeException;
        do {
            th2 = atomicReference.get();
            if (th2 == f42870f) {
                return false;
            }
            if (th2 == null) {
                compositeException = th;
            } else if (th2 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th2).m40129b());
                arrayList.add(th);
                compositeException = new CompositeException(arrayList);
            } else {
                compositeException = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, compositeException));
        return true;
    }

    /* renamed from: k */
    public static boolean m40422k(Throwable th) {
        return th == f42870f;
    }

    /* renamed from: q */
    public static Throwable m40423q(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f42870f;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }
}
