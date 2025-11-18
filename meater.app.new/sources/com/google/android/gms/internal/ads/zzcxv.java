package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcxv {

    /* renamed from: a */
    public final zzzy f25290a;

    /* renamed from: b */
    public final zzacd f25291b;

    /* renamed from: c */
    public final zzaiy f25292c;

    /* renamed from: d */
    public final zzxz f25293d;

    /* renamed from: e */
    public final zzyd f25294e;

    /* renamed from: f */
    public final String f25295f;

    /* renamed from: g */
    public final ArrayList<String> f25296g;

    /* renamed from: h */
    public final ArrayList<String> f25297h;

    /* renamed from: i */
    public final zzady f25298i;

    /* renamed from: j */
    public final String f25299j;

    /* renamed from: k */
    public final String f25300k;

    /* renamed from: l */
    public final int f25301l;

    /* renamed from: m */
    public final PublisherAdViewOptions f25302m;

    /* renamed from: n */
    public final zzzs f25303n;

    /* renamed from: o */
    public final Set<String> f25304o;

    private zzcxv(zzcxx zzcxxVar) {
        this.f25294e = zzcxxVar.f25306b;
        this.f25295f = zzcxxVar.f25308d;
        this.f25290a = zzcxxVar.f25307c;
        this.f25293d = new zzxz(zzcxxVar.f25305a.f27402f, zzcxxVar.f25305a.f27403g, zzcxxVar.f25305a.f27404h, zzcxxVar.f25305a.f27405i, zzcxxVar.f25305a.f27406j, zzcxxVar.f25305a.f27407k, zzcxxVar.f25305a.f27408l, zzcxxVar.f25305a.f27409m || zzcxxVar.f25310f, zzcxxVar.f25305a.f27410n, zzcxxVar.f25305a.f27411o, zzcxxVar.f25305a.f27412p, zzcxxVar.f25305a.f27413q, zzcxxVar.f25305a.f27414r, zzcxxVar.f25305a.f27415s, zzcxxVar.f25305a.f27416t, zzcxxVar.f25305a.f27417u, zzcxxVar.f25305a.f27418v, zzcxxVar.f25305a.f27419w, zzcxxVar.f25305a.f27420x, zzcxxVar.f25305a.f27421y, zzcxxVar.f25305a.f27422z);
        this.f25291b = zzcxxVar.f25309e != null ? zzcxxVar.f25309e : zzcxxVar.f25313i != null ? zzcxxVar.f25313i.f21966k : null;
        this.f25296g = zzcxxVar.f25311g;
        this.f25297h = zzcxxVar.f25312h;
        this.f25298i = zzcxxVar.f25311g != null ? zzcxxVar.f25313i == null ? new zzady(new NativeAdOptions.Builder().build()) : zzcxxVar.f25313i : null;
        this.f25299j = zzcxxVar.f25316l;
        this.f25300k = zzcxxVar.f25317m;
        this.f25301l = zzcxxVar.f25318n;
        this.f25302m = zzcxxVar.f25314j;
        this.f25303n = zzcxxVar.f25315k;
        this.f25292c = zzcxxVar.f25319o;
        this.f25304o = zzcxxVar.f25320p;
    }

    /* renamed from: a */
    public final zzaga m19024a() {
        PublisherAdViewOptions publisherAdViewOptions = this.f25302m;
        if (publisherAdViewOptions == null) {
            return null;
        }
        return publisherAdViewOptions.zzku();
    }
}
