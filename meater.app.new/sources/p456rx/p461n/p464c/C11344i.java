package p456rx.p461n.p464c;

import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11243h;
import p456rx.InterfaceC11246k;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p461n.p465d.C11350a;

/* compiled from: SchedulePeriodicHelper.java */
/* renamed from: rx.n.c.i */
/* loaded from: classes3.dex */
public final class C11344i {

    /* renamed from: a */
    public static final long f42807a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: SchedulePeriodicHelper.java */
    /* renamed from: rx.n.c.i$a */
    static class a implements InterfaceC11252a {

        /* renamed from: f */
        long f42808f;

        /* renamed from: g */
        long f42809g;

        /* renamed from: h */
        long f42810h;

        /* renamed from: i */
        final /* synthetic */ long f42811i;

        /* renamed from: j */
        final /* synthetic */ long f42812j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC11252a f42813k;

        /* renamed from: l */
        final /* synthetic */ C11350a f42814l;

        /* renamed from: m */
        final /* synthetic */ b f42815m;

        /* renamed from: n */
        final /* synthetic */ AbstractC11243h.a f42816n;

        /* renamed from: o */
        final /* synthetic */ long f42817o;

        a(long j2, long j3, InterfaceC11252a interfaceC11252a, C11350a c11350a, b bVar, AbstractC11243h.a aVar, long j4) {
            this.f42811i = j2;
            this.f42812j = j3;
            this.f42813k = interfaceC11252a;
            this.f42814l = c11350a;
            this.f42815m = bVar;
            this.f42816n = aVar;
            this.f42817o = j4;
            this.f42809g = j2;
            this.f42810h = j3;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
        @Override // p456rx.p460m.InterfaceC11252a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void call() {
            /*
                r11 = this;
                rx.m.a r0 = r11.f42813k
                r0.call()
                rx.n.d.a r0 = r11.f42814l
                boolean r0 = r0.isUnsubscribed()
                if (r0 != 0) goto L62
                rx.n.c.i$b r0 = r11.f42815m
                if (r0 == 0) goto L16
                long r0 = r0.mo40401a()
                goto L22
            L16:
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                rx.h$a r1 = r11.f42816n
                long r1 = r1.mo40145b()
                long r0 = r0.toNanos(r1)
            L22:
                long r2 = p456rx.p461n.p464c.C11344i.f42807a
                long r4 = r0 + r2
                long r6 = r11.f42809g
                r8 = 1
                int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r10 < 0) goto L42
                long r4 = r11.f42817o
                long r6 = r6 + r4
                long r6 = r6 + r2
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L37
                goto L42
            L37:
                long r2 = r11.f42810h
                long r6 = r11.f42808f
                long r6 = r6 + r8
                r11.f42808f = r6
                long r6 = r6 * r4
                long r2 = r2 + r6
                goto L52
            L42:
                long r2 = r11.f42817o
                long r4 = r0 + r2
                long r6 = r11.f42808f
                long r6 = r6 + r8
                r11.f42808f = r6
                long r2 = r2 * r6
                long r2 = r4 - r2
                r11.f42810h = r2
                r2 = r4
            L52:
                r11.f42809g = r0
                long r2 = r2 - r0
                rx.n.d.a r0 = r11.f42814l
                rx.h$a r1 = r11.f42816n
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
                rx.k r1 = r1.mo40147d(r11, r2, r4)
                r0.m40415b(r1)
            L62:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p456rx.p461n.p464c.C11344i.a.call():void");
        }
    }

    /* compiled from: SchedulePeriodicHelper.java */
    /* renamed from: rx.n.c.i$b */
    public interface b {
        /* renamed from: a */
        long mo40401a();
    }

    /* renamed from: a */
    public static InterfaceC11246k m40400a(AbstractC11243h.a aVar, InterfaceC11252a interfaceC11252a, long j2, long j3, TimeUnit timeUnit, b bVar) {
        long nanos = timeUnit.toNanos(j3);
        long jMo40401a = bVar != null ? bVar.mo40401a() : TimeUnit.MILLISECONDS.toNanos(aVar.mo40145b());
        long nanos2 = timeUnit.toNanos(j2) + jMo40401a;
        C11350a c11350a = new C11350a();
        C11350a c11350a2 = new C11350a(c11350a);
        c11350a.m40415b(aVar.mo40147d(new a(jMo40401a, nanos2, interfaceC11252a, c11350a2, bVar, aVar, nanos), j2, timeUnit));
        return c11350a2;
    }
}
