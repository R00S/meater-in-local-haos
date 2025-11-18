package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.v3 */
/* loaded from: classes2.dex */
final class C7843v3<V> extends FutureTask<V> implements Comparable<C7843v3> {

    /* renamed from: f */
    private final long f28948f;

    /* renamed from: g */
    final boolean f28949g;

    /* renamed from: h */
    private final String f28950h;

    /* renamed from: i */
    private final /* synthetic */ zzfu f28951i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7843v3(zzfu zzfuVar, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f28951i = zzfuVar;
        Preconditions.m14372k(str);
        long andIncrement = zzfu.f29261c.getAndIncrement();
        this.f28948f = andIncrement;
        this.f28950h = str;
        this.f28949g = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzfuVar.mo22836h().m23137H().m23147a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C7843v3 c7843v3) {
        C7843v3 c7843v32 = c7843v3;
        boolean z = this.f28949g;
        if (z != c7843v32.f28949g) {
            return z ? -1 : 1;
        }
        long j2 = this.f28948f;
        long j3 = c7843v32.f28948f;
        if (j2 < j3) {
            return -1;
        }
        if (j2 > j3) {
            return 1;
        }
        this.f28951i.mo22836h().m23138I().m23148b("Two tasks share the same index. index", Long.valueOf(this.f28948f));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f28951i.mo22836h().m23137H().m23148b(this.f28950h, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7843v3(zzfu zzfuVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f28951i = zzfuVar;
        Preconditions.m14372k(str);
        long andIncrement = zzfu.f29261c.getAndIncrement();
        this.f28948f = andIncrement;
        this.f28950h = str;
        this.f28949g = false;
        if (andIncrement == Long.MAX_VALUE) {
            zzfuVar.mo22836h().m23137H().m23147a("Tasks index overflow");
        }
    }
}
