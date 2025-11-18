package p456rx;

import java.util.concurrent.TimeUnit;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p461n.p464c.C11344i;
import p456rx.p461n.p464c.C11347l;

/* compiled from: Scheduler.java */
/* renamed from: rx.h */
/* loaded from: classes.dex */
public abstract class AbstractC11243h {

    /* compiled from: Scheduler.java */
    /* renamed from: rx.h$a */
    /* loaded from: classes3.dex */
    public static abstract class a implements InterfaceC11246k {
        /* renamed from: b */
        public long mo40145b() {
            return System.currentTimeMillis();
        }

        /* renamed from: c */
        public abstract InterfaceC11246k mo40146c(InterfaceC11252a interfaceC11252a);

        /* renamed from: d */
        public abstract InterfaceC11246k mo40147d(InterfaceC11252a interfaceC11252a, long j2, TimeUnit timeUnit);

        /* renamed from: e */
        public InterfaceC11246k mo40148e(InterfaceC11252a interfaceC11252a, long j2, long j3, TimeUnit timeUnit) {
            return C11344i.m40400a(this, interfaceC11252a, j2, j3, timeUnit, null);
        }
    }

    public abstract a createWorker();

    public long now() {
        return System.currentTimeMillis();
    }

    public <S extends AbstractC11243h & InterfaceC11246k> S when(InterfaceC11256e<C11234e<C11234e<C11231b>>, C11231b> interfaceC11256e) {
        return new C11347l(interfaceC11256e, this);
    }
}
