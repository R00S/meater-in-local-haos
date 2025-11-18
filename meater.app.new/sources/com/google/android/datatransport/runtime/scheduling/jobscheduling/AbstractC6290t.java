package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import cm.aptoide.p092pt.notification.PullingContentService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6288r;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p241e.p254e.p256b.p257a.EnumC8787d;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8854a;

/* compiled from: SchedulerConfig.java */
@AutoValue
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.t */
/* loaded from: classes2.dex */
public abstract class AbstractC6290t {

    /* compiled from: SchedulerConfig.java */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.t$a */
    public static class a {

        /* renamed from: a */
        private InterfaceC8854a f16833a;

        /* renamed from: b */
        private Map<EnumC8787d, b> f16834b = new HashMap();

        /* renamed from: a */
        public a m13562a(EnumC8787d enumC8787d, b bVar) {
            this.f16834b.put(enumC8787d, bVar);
            return this;
        }

        /* renamed from: b */
        public AbstractC6290t m13563b() {
            if (this.f16833a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f16834b.keySet().size() < EnumC8787d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<EnumC8787d, b> map = this.f16834b;
            this.f16834b = new HashMap();
            return AbstractC6290t.m13556d(this.f16833a, map);
        }

        /* renamed from: c */
        public a m13564c(InterfaceC8854a interfaceC8854a) {
            this.f16833a = interfaceC8854a;
            return this;
        }
    }

    /* compiled from: SchedulerConfig.java */
    @AutoValue
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.t$b */
    public static abstract class b {

        /* compiled from: SchedulerConfig.java */
        @AutoValue.Builder
        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.t$b$a */
        public static abstract class a {
            /* renamed from: a */
            public abstract b mo13548a();

            /* renamed from: b */
            public abstract a mo13549b(long j2);

            /* renamed from: c */
            public abstract a mo13550c(Set<c> set);

            /* renamed from: d */
            public abstract a mo13551d(long j2);
        }

        /* renamed from: a */
        public static a m13565a() {
            return new C6288r.b().mo13550c(Collections.emptySet());
        }

        /* renamed from: b */
        abstract long mo13545b();

        /* renamed from: c */
        abstract Set<c> mo13546c();

        /* renamed from: d */
        abstract long mo13547d();
    }

    /* compiled from: SchedulerConfig.java */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.t$c */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m13554a(int i2, long j2) {
        int i3 = i2 - 1;
        double dMax = Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * i3));
        double dPow = Math.pow(3.0d, i3);
        double d2 = j2;
        Double.isNaN(d2);
        return (long) (dPow * d2 * dMax);
    }

    /* renamed from: b */
    public static a m13555b() {
        return new a();
    }

    /* renamed from: d */
    static AbstractC6290t m13556d(InterfaceC8854a interfaceC8854a, Map<EnumC8787d, b> map) {
        return new C6287q(interfaceC8854a, map);
    }

    /* renamed from: f */
    public static AbstractC6290t m13557f(InterfaceC8854a interfaceC8854a) {
        return m13555b().m13562a(EnumC8787d.DEFAULT, b.m13565a().mo13549b(30000L).mo13551d(PullingContentService.UPDATES_INTERVAL).mo13548a()).m13562a(EnumC8787d.HIGHEST, b.m13565a().mo13549b(1000L).mo13551d(PullingContentService.UPDATES_INTERVAL).mo13548a()).m13562a(EnumC8787d.VERY_LOW, b.m13565a().mo13549b(PullingContentService.UPDATES_INTERVAL).mo13551d(PullingContentService.UPDATES_INTERVAL).mo13550c(m13558i(c.DEVICE_IDLE)).mo13548a()).m13564c(interfaceC8854a).m13563b();
    }

    /* renamed from: i */
    private static <T> Set<T> m13558i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: j */
    private void m13559j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: c */
    public JobInfo.Builder m13560c(JobInfo.Builder builder, EnumC8787d enumC8787d, long j2, int i2) {
        builder.setMinimumLatency(m13561g(enumC8787d, j2, i2));
        m13559j(builder, mo13544h().get(enumC8787d).mo13546c());
        return builder;
    }

    /* renamed from: e */
    abstract InterfaceC8854a mo13543e();

    /* renamed from: g */
    public long m13561g(EnumC8787d enumC8787d, long j2, int i2) {
        long jMo28110a = j2 - mo13543e().mo28110a();
        b bVar = mo13544h().get(enumC8787d);
        return Math.min(Math.max(m13554a(i2, bVar.mo13545b()), jMo28110a), bVar.mo13547d());
    }

    /* renamed from: h */
    abstract Map<EnumC8787d, b> mo13544h();
}
