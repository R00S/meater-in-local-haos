package p456rx.p471q;

import java.util.concurrent.ThreadFactory;
import p456rx.AbstractC11243h;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p461n.p464c.C11336a;
import p456rx.p461n.p464c.C11337b;
import p456rx.p461n.p464c.C11342g;
import p456rx.p461n.p466e.ThreadFactoryC11360i;

/* compiled from: RxJavaSchedulersHook.java */
/* renamed from: rx.q.g */
/* loaded from: classes3.dex */
public class C11413g {

    /* renamed from: a */
    private static final C11413g f43030a = new C11413g();

    /* renamed from: a */
    public static AbstractC11243h m40615a() {
        return m40616b(new ThreadFactoryC11360i("RxComputationScheduler-"));
    }

    /* renamed from: b */
    public static AbstractC11243h m40616b(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new C11337b(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    /* renamed from: c */
    public static AbstractC11243h m40617c() {
        return m40618d(new ThreadFactoryC11360i("RxIoScheduler-"));
    }

    /* renamed from: d */
    public static AbstractC11243h m40618d(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new C11336a(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    /* renamed from: e */
    public static AbstractC11243h m40619e() {
        return m40620f(new ThreadFactoryC11360i("RxNewThreadScheduler-"));
    }

    /* renamed from: f */
    public static AbstractC11243h m40620f(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new C11342g(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    /* renamed from: h */
    public static C11413g m40621h() {
        return f43030a;
    }

    /* renamed from: g */
    public AbstractC11243h m40622g() {
        return null;
    }

    /* renamed from: i */
    public AbstractC11243h m40623i() {
        return null;
    }

    /* renamed from: j */
    public AbstractC11243h m40624j() {
        return null;
    }

    @Deprecated
    /* renamed from: k */
    public InterfaceC11252a m40625k(InterfaceC11252a interfaceC11252a) {
        return interfaceC11252a;
    }
}
