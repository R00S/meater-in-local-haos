package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.C2497i1;
import g7.C3445p;
import v7.C4919v;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2521l1 extends C2497i1.a {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ String f34191F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ String f34192G;

    /* renamed from: H, reason: collision with root package name */
    private final /* synthetic */ Context f34193H;

    /* renamed from: I, reason: collision with root package name */
    private final /* synthetic */ Bundle f34194I;

    /* renamed from: J, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f34195J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2521l1(C2497i1 c2497i1, String str, String str2, Context context, Bundle bundle) {
        super(c2497i1);
        this.f34191F = str;
        this.f34192G = str2;
        this.f34193H = context;
        this.f34194I = bundle;
        this.f34195J = c2497i1;
    }

    @Override // com.google.android.gms.internal.measurement.C2497i1.a
    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f34195J.H(this.f34191F, this.f34192G)) {
                str3 = this.f34192G;
                str2 = this.f34191F;
                str = this.f34195J.f34154a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            C3445p.k(this.f34193H);
            C2497i1 c2497i1 = this.f34195J;
            c2497i1.f34162i = c2497i1.c(this.f34193H, true);
            if (this.f34195J.f34162i == null) {
                Log.w(this.f34195J.f34154a, "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(this.f34193H, ModuleDescriptor.MODULE_ID);
            ((P0) C3445p.k(this.f34195J.f34162i)).initialize(m7.b.u1(this.f34193H), new C2456d1(114010L, Math.max(iA, r0), DynamiteModule.b(this.f34193H, ModuleDescriptor.MODULE_ID) < iA, str, str2, str3, this.f34194I, C4919v.a(this.f34193H)), this.f34163B);
        } catch (Exception e10) {
            this.f34195J.q(e10, true, false);
        }
    }
}
