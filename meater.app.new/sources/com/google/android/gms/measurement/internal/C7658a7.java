package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.internal.measurement.zzkn;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.a7 */
/* loaded from: classes2.dex */
final class C7658a7 {

    /* renamed from: a */
    private final AbstractC7695f f28550a;

    /* renamed from: b */
    final /* synthetic */ zzjl f28551b;

    C7658a7(zzjl zzjlVar) {
        this.f28551b = zzjlVar;
        this.f28550a = new C7685d7(this, zzjlVar.f28874a);
    }

    /* renamed from: a */
    final void m22699a(long j2) {
        this.f28551b.mo22792d();
        if (this.f28551b.f28874a.m23236p()) {
            if (this.f28551b.mo22841n().m23564B(this.f28551b.mo22795q().m23110C(), zzap.f29136c0)) {
                this.f28551b.mo22840m().f28873z.m23157a(false);
            }
            if (this.f28551b.mo22841n().m23578R(this.f28551b.mo22795q().m23110C())) {
                m22700b(this.f28551b.mo22837j().mo14608a(), false);
                return;
            }
            this.f28550a.m22776e();
            if (this.f28551b.mo22840m().m22829x(this.f28551b.mo22837j().mo14608a())) {
                this.f28551b.mo22840m().f28866s.m23157a(true);
                this.f28551b.mo22840m().f28871x.m23156b(0L);
            }
            if (this.f28551b.mo22840m().f28866s.m23158b()) {
                this.f28550a.m22774c(Math.max(0L, this.f28551b.mo22840m().f28864q.m23155a() - this.f28551b.mo22840m().f28871x.m23155a()));
            }
        }
    }

    /* renamed from: b */
    final void m22700b(long j2, boolean z) {
        this.f28551b.mo22792d();
        this.f28551b.m23395H();
        if (this.f28551b.mo22840m().m22829x(j2)) {
            this.f28551b.mo22840m().f28866s.m23157a(true);
            this.f28551b.mo22840m().f28871x.m23156b(0L);
        }
        if (z && this.f28551b.mo22841n().m23579S(this.f28551b.mo22795q().m23110C())) {
            this.f28551b.mo22840m().f28870w.m23156b(j2);
        }
        if (this.f28551b.mo22840m().f28866s.m23158b()) {
            m22701c(j2, z);
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    final void m22701c(long j2, boolean z) {
        this.f28551b.mo22792d();
        if (zzkn.m22461b() && this.f28551b.mo22841n().m23564B(this.f28551b.mo22795q().m23110C(), zzap.f29144g0)) {
            if (!this.f28551b.f28874a.m23236p()) {
                return;
            } else {
                this.f28551b.mo22840m().f28870w.m23156b(j2);
            }
        }
        this.f28551b.mo22836h().m23145P().m23148b("Session started, time", Long.valueOf(this.f28551b.mo22837j().mo14609b()));
        Long lValueOf = this.f28551b.mo22841n().m23576P(this.f28551b.mo22795q().m23110C()) ? Long.valueOf(j2 / 1000) : null;
        this.f28551b.mo22794p().m23284V("auto", "_sid", lValueOf, j2);
        this.f28551b.mo22840m().f28866s.m23157a(false);
        Bundle bundle = new Bundle();
        if (this.f28551b.mo22841n().m23576P(this.f28551b.mo22795q().m23110C())) {
            bundle.putLong("_sid", lValueOf.longValue());
        }
        if (this.f28551b.mo22841n().m23587r(zzap.f29112P0) && z) {
            bundle.putLong("_aib", 1L);
        }
        this.f28551b.mo22794p().m23279P("auto", "_s", j2, bundle);
        if (zzkb.m22447b() && this.f28551b.mo22841n().m23587r(zzap.f29128X0)) {
            String strM23159a = this.f28551b.mo22840m().f28850C.m23159a();
            if (!TextUtils.isEmpty(strM23159a)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strM23159a);
                this.f28551b.mo22794p().m23279P("auto", "_ssr", j2, bundle2);
            }
        }
        if (zzkn.m22461b() && this.f28551b.mo22841n().m23564B(this.f28551b.mo22795q().m23110C(), zzap.f29144g0)) {
            return;
        }
        this.f28551b.mo22840m().f28870w.m23156b(j2);
    }
}
