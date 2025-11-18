package com.google.android.gms.measurement.internal;

import g7.C3445p;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class N2<V> extends FutureTask<V> implements Comparable<N2<V>> {

    /* renamed from: B, reason: collision with root package name */
    private final long f35059B;

    /* renamed from: C, reason: collision with root package name */
    final boolean f35060C;

    /* renamed from: D, reason: collision with root package name */
    private final String f35061D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ J2 f35062E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N2(J2 j22, Runnable runnable, boolean z10, String str) {
        super(com.google.android.gms.internal.measurement.M0.a().b(runnable), null);
        this.f35062E = j22;
        C3445p.k(str);
        long andIncrement = J2.f34893l.getAndIncrement();
        this.f35059B = andIncrement;
        this.f35061D = str;
        this.f35060C = z10;
        if (andIncrement == Long.MAX_VALUE) {
            j22.k().H().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        N2 n22 = (N2) obj;
        boolean z10 = this.f35060C;
        if (z10 != n22.f35060C) {
            return z10 ? -1 : 1;
        }
        long j10 = this.f35059B;
        long j11 = n22.f35059B;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f35062E.k().J().b("Two tasks share the same index. index", Long.valueOf(this.f35059B));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f35062E.k().H().b(this.f35061D, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N2(J2 j22, Callable<V> callable, boolean z10, String str) {
        super(com.google.android.gms.internal.measurement.M0.a().a(callable));
        this.f35062E = j22;
        C3445p.k(str);
        long andIncrement = J2.f34893l.getAndIncrement();
        this.f35059B = andIncrement;
        this.f35061D = str;
        this.f35060C = z10;
        if (andIncrement == Long.MAX_VALUE) {
            j22.k().H().a("Tasks index overflow");
        }
    }
}
