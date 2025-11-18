package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzaba {

    /* renamed from: g */
    private Date f21518g;

    /* renamed from: h */
    private String f21519h;

    /* renamed from: j */
    private Location f21521j;

    /* renamed from: l */
    private String f21523l;

    /* renamed from: m */
    private String f21524m;

    /* renamed from: o */
    private boolean f21526o;

    /* renamed from: q */
    private String f21528q;

    /* renamed from: a */
    private final HashSet<String> f21512a = new HashSet<>();

    /* renamed from: b */
    private final Bundle f21513b = new Bundle();

    /* renamed from: c */
    private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> f21514c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<String> f21515d = new HashSet<>();

    /* renamed from: e */
    private final Bundle f21516e = new Bundle();

    /* renamed from: f */
    private final HashSet<String> f21517f = new HashSet<>();

    /* renamed from: i */
    private int f21520i = -1;

    /* renamed from: k */
    private boolean f21522k = false;

    /* renamed from: n */
    private int f21525n = -1;

    /* renamed from: p */
    private int f21527p = -1;

    /* renamed from: I */
    public final void m16245I(boolean z) {
        this.f21525n = z ? 1 : 0;
    }

    @Deprecated
    /* renamed from: J */
    public final void m16246J(boolean z) {
        this.f21526o = z;
    }

    /* renamed from: a */
    public final void m16247a(boolean z) {
        this.f21522k = z;
    }

    /* renamed from: c */
    public final void m16248c(Location location) {
        this.f21521j = location;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    /* renamed from: d */
    public final void m16249d(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            m16250e(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.f21514c.put(networkExtras.getClass(), networkExtras);
        }
    }

    /* renamed from: e */
    public final void m16250e(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.f21513b.putBundle(cls.getName(), bundle);
    }

    @Deprecated
    /* renamed from: f */
    public final void m16251f(Date date) {
        this.f21518g = date;
    }

    /* renamed from: h */
    public final void m16252h(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.f21513b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.f21513b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.f21513b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    /* renamed from: i */
    public final void m16253i(String str) {
        this.f21512a.add(str);
    }

    /* renamed from: j */
    public final void m16254j(String str) {
        this.f21515d.add(str);
    }

    /* renamed from: k */
    public final void m16255k(String str) {
        this.f21515d.remove(str);
    }

    /* renamed from: l */
    public final void m16256l(String str) {
        this.f21519h = str;
    }

    /* renamed from: n */
    public final void m16257n(String str) {
        this.f21523l = str;
    }

    /* renamed from: o */
    public final void m16258o(String str) {
        this.f21524m = str;
    }

    /* renamed from: p */
    public final void m16259p(String str) {
        this.f21517f.add(str);
    }

    /* renamed from: q */
    public final void m16260q(String str) {
        if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
            this.f21528q = str;
        }
    }

    @Deprecated
    /* renamed from: r */
    public final void m16261r(int i2) {
        this.f21520i = i2;
    }

    /* renamed from: s */
    public final void m16262s(int i2) {
        if (i2 == -1 || i2 == 0 || i2 == 1) {
            this.f21527p = i2;
        }
    }

    /* renamed from: v */
    public final void m16263v(String str, String str2) {
        this.f21516e.putString(str, str2);
    }
}
