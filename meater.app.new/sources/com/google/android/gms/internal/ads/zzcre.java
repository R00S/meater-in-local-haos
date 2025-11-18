package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcre implements zzcva<zzcrd> {

    /* renamed from: a */
    private final zzbbl f24960a;

    /* renamed from: b */
    private final Context f24961b;

    /* renamed from: c */
    private final zzcxv f24962c;

    /* renamed from: d */
    private final View f24963d;

    public zzcre(zzbbl zzbblVar, Context context, zzcxv zzcxvVar, ViewGroup viewGroup) {
        this.f24960a = zzbblVar;
        this.f24961b = context;
        this.f24962c = zzcxvVar;
        this.f24963d = viewGroup;
    }

    /* renamed from: a */
    final /* synthetic */ zzcrd m18955a() throws Exception {
        Context context = this.f24961b;
        zzyd zzydVar = this.f24962c.f25294e;
        ArrayList arrayList = new ArrayList();
        View view = this.f24963d;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzcrd(context, zzydVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcrd> mo14982b() {
        return !((Boolean) zzyt.m20848e().m16421c(zzacu.f21899y0)).booleanValue() ? zzbar.m17375l(new Exception("Ad Key signal disabled.")) : this.f24960a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.on

            /* renamed from: f */
            private final zzcre f20205f;

            {
                this.f20205f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20205f.m18955a();
            }
        });
    }
}
