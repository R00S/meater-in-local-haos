package p456rx.p461n.p464c;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p456rx.p460m.InterfaceCallableC11255d;
import p456rx.p461n.p466e.ThreadFactoryC11360i;
import p456rx.p471q.C11409c;

/* compiled from: GenericScheduledExecutorServiceFactory.java */
/* renamed from: rx.n.c.e */
/* loaded from: classes3.dex */
enum EnumC11340e {
    ;


    /* renamed from: f */
    static final ThreadFactoryC11360i f42793f = new ThreadFactoryC11360i("RxScheduledExecutorPool-");

    /* renamed from: g */
    public static ScheduledExecutorService m40389g() {
        InterfaceCallableC11255d<? extends ScheduledExecutorService> interfaceCallableC11255dM40569a = C11409c.m40569a();
        return interfaceCallableC11255dM40569a == null ? m40390k() : interfaceCallableC11255dM40569a.call();
    }

    /* renamed from: k */
    static ScheduledExecutorService m40390k() {
        return Executors.newScheduledThreadPool(1, m40391q());
    }

    /* renamed from: q */
    static ThreadFactory m40391q() {
        return f42793f;
    }
}
