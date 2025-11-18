package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzk;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcrd implements zzcuz<Bundle> {

    /* renamed from: a */
    private final Context f24957a;

    /* renamed from: b */
    private final zzyd f24958b;

    /* renamed from: c */
    private final List<Parcelable> f24959c;

    public zzcrd(Context context, zzyd zzydVar, List<Parcelable> list) {
        this.f24957a = context;
        this.f24958b = zzydVar;
        this.f24959c = list;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzk.zzlg();
        bundle2.putString("activity", zzaxi.m17170z(this.f24957a));
        Bundle bundle3 = new Bundle();
        bundle3.putInt("width", this.f24958b.f27451j);
        bundle3.putInt("height", this.f24958b.f27448g);
        bundle2.putBundle("size", bundle3);
        if (this.f24959c.size() > 0) {
            List<Parcelable> list = this.f24959c;
            bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
        }
    }
}
