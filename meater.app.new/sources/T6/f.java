package T6;

import T6.c;
import android.app.job.JobInfo;
import com.apptionlabs.meater_app.data.Config;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: SchedulerConfig.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class f {

    /* compiled from: SchedulerConfig.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private W6.a f16173a;

        /* renamed from: b, reason: collision with root package name */
        private Map<K6.f, b> f16174b = new HashMap();

        public a a(K6.f fVar, b bVar) {
            this.f16174b.put(fVar, bVar);
            return this;
        }

        public f b() {
            if (this.f16173a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f16174b.keySet().size() < K6.f.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<K6.f, b> map = this.f16174b;
            this.f16174b = new HashMap();
            return f.d(this.f16173a, map);
        }

        public a c(W6.a aVar) {
            this.f16173a = aVar;
            return this;
        }
    }

    /* compiled from: SchedulerConfig.java */
    @AutoValue
    public static abstract class b {

        /* compiled from: SchedulerConfig.java */
        @AutoValue.Builder
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new c.b().c(Collections.emptySet());
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();
    }

    /* compiled from: SchedulerConfig.java */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r7)));
    }

    public static a b() {
        return new a();
    }

    static f d(W6.a aVar, Map<K6.f, b> map) {
        return new T6.b(aVar, map);
    }

    public static f f(W6.a aVar) {
        return b().a(K6.f.DEFAULT, b.a().b(Config.MC_STATS_INTERVAL).d(86400000L).a()).a(K6.f.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(K6.f.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
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

    public JobInfo.Builder c(JobInfo.Builder builder, K6.f fVar, long j10, int i10) {
        builder.setMinimumLatency(g(fVar, j10, i10));
        j(builder, h().get(fVar).c());
        return builder;
    }

    abstract W6.a e();

    public long g(K6.f fVar, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = h().get(fVar);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }

    abstract Map<K6.f, b> h();
}
