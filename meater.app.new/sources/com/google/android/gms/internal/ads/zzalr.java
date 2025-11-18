package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzalr {

    /* renamed from: a */
    @VisibleForTesting
    private static final zzayp<zzajw> f22109a = new C6621e2();

    /* renamed from: b */
    @VisibleForTesting
    private static final zzayp<zzajw> f22110b = new C6658f2();

    /* renamed from: c */
    private final zzakh f22111c;

    public zzalr(Context context, zzbai zzbaiVar, String str) {
        this.f22111c = new zzakh(context, zzbaiVar, str, f22109a, f22110b);
    }

    /* renamed from: a */
    public final <I, O> zzalj<I, O> m16658a(String str, zzalm<I> zzalmVar, zzall<O> zzallVar) {
        return new zzalu(this.f22111c, str, zzalmVar, zzallVar);
    }

    /* renamed from: b */
    public final zzaly m16659b() {
        return new zzaly(this.f22111c);
    }
}
