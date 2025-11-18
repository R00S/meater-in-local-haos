package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcxx {

    /* renamed from: a */
    private zzxz f25305a;

    /* renamed from: b */
    private zzyd f25306b;

    /* renamed from: c */
    private zzzy f25307c;

    /* renamed from: d */
    private String f25308d;

    /* renamed from: e */
    private zzacd f25309e;

    /* renamed from: f */
    private boolean f25310f;

    /* renamed from: g */
    private ArrayList<String> f25311g;

    /* renamed from: h */
    private ArrayList<String> f25312h;

    /* renamed from: i */
    private zzady f25313i;

    /* renamed from: j */
    private PublisherAdViewOptions f25314j;

    /* renamed from: k */
    private zzzs f25315k;

    /* renamed from: l */
    private String f25316l;

    /* renamed from: m */
    private String f25317m;

    /* renamed from: o */
    private zzaiy f25319o;

    /* renamed from: n */
    private int f25318n = 1;

    /* renamed from: p */
    public final Set<String> f25320p = new HashSet();

    /* renamed from: G */
    public final zzyd m19040G() {
        return this.f25306b;
    }

    /* renamed from: b */
    public final zzxz m19041b() {
        return this.f25305a;
    }

    /* renamed from: c */
    public final String m19042c() {
        return this.f25308d;
    }

    /* renamed from: d */
    public final zzcxv m19043d() {
        Preconditions.m14373l(this.f25308d, "ad unit must not be null");
        Preconditions.m14373l(this.f25306b, "ad size must not be null");
        Preconditions.m14373l(this.f25305a, "ad request must not be null");
        return new zzcxv(this);
    }

    /* renamed from: e */
    public final zzcxx m19044e(PublisherAdViewOptions publisherAdViewOptions) {
        this.f25314j = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.f25310f = publisherAdViewOptions.getManualImpressionsEnabled();
            this.f25315k = publisherAdViewOptions.zzkt();
        }
        return this;
    }

    /* renamed from: f */
    public final zzcxx m19045f(zzady zzadyVar) {
        this.f25313i = zzadyVar;
        return this;
    }

    /* renamed from: g */
    public final zzcxx m19046g(zzaiy zzaiyVar) {
        this.f25319o = zzaiyVar;
        this.f25309e = new zzacd(false, true, false);
        return this;
    }

    /* renamed from: h */
    public final zzcxx m19047h(ArrayList<String> arrayList) {
        this.f25311g = arrayList;
        return this;
    }

    /* renamed from: j */
    public final zzcxx m19048j(boolean z) {
        this.f25310f = z;
        return this;
    }

    /* renamed from: k */
    public final zzcxx m19049k(zzacd zzacdVar) {
        this.f25309e = zzacdVar;
        return this;
    }

    /* renamed from: l */
    public final zzcxx m19050l(ArrayList<String> arrayList) {
        this.f25312h = arrayList;
        return this;
    }

    /* renamed from: n */
    public final zzcxx m19051n(zzyd zzydVar) {
        this.f25306b = zzydVar;
        return this;
    }

    /* renamed from: o */
    public final zzcxx m19052o(zzzy zzzyVar) {
        this.f25307c = zzzyVar;
        return this;
    }

    /* renamed from: q */
    public final zzcxx m19053q(int i2) {
        this.f25318n = i2;
        return this;
    }

    /* renamed from: t */
    public final zzcxx m19054t(String str) {
        this.f25308d = str;
        return this;
    }

    /* renamed from: u */
    public final zzcxx m19055u(String str) {
        this.f25316l = str;
        return this;
    }

    /* renamed from: v */
    public final zzcxx m19056v(String str) {
        this.f25317m = str;
        return this;
    }

    /* renamed from: w */
    public final zzcxx m19057w(zzxz zzxzVar) {
        this.f25305a = zzxzVar;
        return this;
    }
}
