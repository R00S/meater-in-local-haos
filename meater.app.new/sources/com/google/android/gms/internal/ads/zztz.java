package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.WeakHashMap;

@zzard
/* loaded from: classes2.dex */
public final class zztz {

    /* renamed from: a */
    private final Object f27105a = new Object();

    /* renamed from: b */
    private final WeakHashMap<Object, Object> f27106b = new WeakHashMap<>();

    /* renamed from: c */
    private final ArrayList<Object> f27107c = new ArrayList<>();

    /* renamed from: d */
    private final Context f27108d;

    /* renamed from: e */
    private final zzbai f27109e;

    /* renamed from: f */
    private final zzakh f27110f;

    public zztz(Context context, zzbai zzbaiVar) {
        this.f27108d = context.getApplicationContext();
        this.f27109e = zzbaiVar;
        this.f27110f = new zzakh(context.getApplicationContext(), zzbaiVar, (String) zzyt.m20848e().m16421c(zzacu.f21769d));
    }
}
