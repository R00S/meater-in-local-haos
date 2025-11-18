package p456rx.p457l.p459c;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11243h;
import p456rx.p457l.p458b.C11248a;

/* compiled from: AndroidSchedulers.java */
/* renamed from: rx.l.c.a */
/* loaded from: classes.dex */
public final class C11250a {

    /* renamed from: a */
    private static final AtomicReference<C11250a> f42142a = new AtomicReference<>();

    /* renamed from: b */
    private final AbstractC11243h f42143b;

    private C11250a() {
        AbstractC11243h abstractC11243hM40153b = C11248a.m40150a().m40151b().m40153b();
        if (abstractC11243hM40153b != null) {
            this.f42143b = abstractC11243hM40153b;
        } else {
            this.f42143b = new C11251b(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    private static C11250a m40155a() {
        AtomicReference<C11250a> atomicReference;
        C11250a c11250a;
        do {
            atomicReference = f42142a;
            C11250a c11250a2 = atomicReference.get();
            if (c11250a2 != null) {
                return c11250a2;
            }
            c11250a = new C11250a();
        } while (!atomicReference.compareAndSet(null, c11250a));
        return c11250a;
    }

    /* renamed from: b */
    public static AbstractC11243h m40156b() {
        return m40155a().f42143b;
    }
}
