package p456rx.p457l.p458b;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: RxAndroidPlugins.java */
/* renamed from: rx.l.b.a */
/* loaded from: classes3.dex */
public final class C11248a {

    /* renamed from: a */
    private static final C11248a f42139a = new C11248a();

    /* renamed from: b */
    private final AtomicReference<C11249b> f42140b = new AtomicReference<>();

    C11248a() {
    }

    /* renamed from: a */
    public static C11248a m40150a() {
        return f42139a;
    }

    /* renamed from: b */
    public C11249b m40151b() {
        if (this.f42140b.get() == null) {
            this.f42140b.compareAndSet(null, C11249b.m40152a());
        }
        return this.f42140b.get();
    }
}
