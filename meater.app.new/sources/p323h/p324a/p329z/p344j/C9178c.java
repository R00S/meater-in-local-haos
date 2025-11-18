package p323h.p324a.p329z.p344j;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ExceptionHelper.java */
/* renamed from: h.a.z.j.c */
/* loaded from: classes2.dex */
public final class C9178c {

    /* renamed from: a */
    public static final Throwable f35281a = new a();

    /* compiled from: ExceptionHelper.java */
    /* renamed from: h.a.z.j.c$a */
    static final class a extends Throwable {
        a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static <T> boolean m29389a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = atomicReference.get();
            if (th2 == f35281a) {
                return false;
            }
        } while (!atomicReference.compareAndSet(th2, th2 == null ? th : new CompositeException(th2, th)));
        return true;
    }

    /* renamed from: b */
    public static <T> Throwable m29390b(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f35281a;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: c */
    public static RuntimeException m29391c(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
