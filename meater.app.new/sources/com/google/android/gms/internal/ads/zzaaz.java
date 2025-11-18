package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public final class zzaaz {

    /* renamed from: a */
    private final Date f21493a;

    /* renamed from: b */
    private final String f21494b;

    /* renamed from: c */
    private final int f21495c;

    /* renamed from: d */
    private final Set<String> f21496d;

    /* renamed from: e */
    private final Location f21497e;

    /* renamed from: f */
    private final boolean f21498f;

    /* renamed from: g */
    private final Bundle f21499g;

    /* renamed from: h */
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> f21500h;

    /* renamed from: i */
    private final String f21501i;

    /* renamed from: j */
    private final String f21502j;

    /* renamed from: k */
    private final SearchAdRequest f21503k;

    /* renamed from: l */
    private final int f21504l;

    /* renamed from: m */
    private final Set<String> f21505m;

    /* renamed from: n */
    private final Bundle f21506n;

    /* renamed from: o */
    private final Set<String> f21507o;

    /* renamed from: p */
    private final boolean f21508p;

    /* renamed from: q */
    private final zzdak f21509q;

    /* renamed from: r */
    private final int f21510r;

    /* renamed from: s */
    private final String f21511s;

    public zzaaz(zzaba zzabaVar) {
        this(zzabaVar, null);
    }

    @Deprecated
    /* renamed from: a */
    public final Date m16204a() {
        return this.f21493a;
    }

    /* renamed from: b */
    public final String m16205b() {
        return this.f21494b;
    }

    /* renamed from: c */
    public final Bundle m16206c(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.f21499g.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    /* renamed from: d */
    public final Bundle m16207d() {
        return this.f21506n;
    }

    @Deprecated
    /* renamed from: e */
    public final int m16208e() {
        return this.f21495c;
    }

    /* renamed from: f */
    public final Set<String> m16209f() {
        return this.f21496d;
    }

    /* renamed from: g */
    public final Location m16210g() {
        return this.f21497e;
    }

    /* renamed from: h */
    public final boolean m16211h() {
        return this.f21498f;
    }

    /* renamed from: i */
    public final String m16212i() {
        return this.f21511s;
    }

    @Deprecated
    /* renamed from: j */
    public final <T extends NetworkExtras> T m16213j(Class<T> cls) {
        return (T) this.f21500h.get(cls);
    }

    /* renamed from: k */
    public final Bundle m16214k(Class<? extends MediationExtrasReceiver> cls) {
        return this.f21499g.getBundle(cls.getName());
    }

    /* renamed from: l */
    public final String m16215l() {
        return this.f21501i;
    }

    @Deprecated
    /* renamed from: m */
    public final boolean m16216m() {
        return this.f21508p;
    }

    /* renamed from: n */
    public final boolean m16217n(Context context) {
        Set<String> set = this.f21505m;
        zzyt.m20844a();
        return set.contains(zzazt.m17307l(context));
    }

    /* renamed from: o */
    public final String m16218o() {
        return this.f21502j;
    }

    /* renamed from: p */
    public final SearchAdRequest m16219p() {
        return this.f21503k;
    }

    /* renamed from: q */
    public final Map<Class<? extends NetworkExtras>, NetworkExtras> m16220q() {
        return this.f21500h;
    }

    /* renamed from: r */
    public final Bundle m16221r() {
        return this.f21499g;
    }

    /* renamed from: s */
    public final int m16222s() {
        return this.f21504l;
    }

    /* renamed from: t */
    public final Set<String> m16223t() {
        return this.f21507o;
    }

    /* renamed from: u */
    public final int m16224u() {
        return this.f21510r;
    }

    public zzaaz(zzaba zzabaVar, SearchAdRequest searchAdRequest) {
        this.f21493a = zzabaVar.f21518g;
        this.f21494b = zzabaVar.f21519h;
        this.f21495c = zzabaVar.f21520i;
        this.f21496d = Collections.unmodifiableSet(zzabaVar.f21512a);
        this.f21497e = zzabaVar.f21521j;
        this.f21498f = zzabaVar.f21522k;
        this.f21499g = zzabaVar.f21513b;
        this.f21500h = Collections.unmodifiableMap(zzabaVar.f21514c);
        this.f21501i = zzabaVar.f21523l;
        this.f21502j = zzabaVar.f21524m;
        this.f21503k = searchAdRequest;
        this.f21504l = zzabaVar.f21525n;
        this.f21505m = Collections.unmodifiableSet(zzabaVar.f21515d);
        this.f21506n = zzabaVar.f21516e;
        this.f21507o = Collections.unmodifiableSet(zzabaVar.f21517f);
        this.f21508p = zzabaVar.f21526o;
        this.f21509q = null;
        this.f21510r = zzabaVar.f21527p;
        this.f21511s = zzabaVar.f21528q;
    }
}
