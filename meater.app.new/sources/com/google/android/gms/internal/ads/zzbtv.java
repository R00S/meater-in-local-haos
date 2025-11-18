package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.util.Clock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class zzbtv {

    /* renamed from: a */
    private final Set<zzbuz<zzxr>> f23552a;

    /* renamed from: b */
    private final Set<zzbuz<zzbrl>> f23553b;

    /* renamed from: c */
    private final Set<zzbuz<zzbrw>> f23554c;

    /* renamed from: d */
    private final Set<zzbuz<zzbsr>> f23555d;

    /* renamed from: e */
    private final Set<zzbuz<zzbro>> f23556e;

    /* renamed from: f */
    private final Set<zzbuz<zzbrs>> f23557f;

    /* renamed from: g */
    private final Set<zzbuz<AdMetadataListener>> f23558g;

    /* renamed from: h */
    private final Set<zzbuz<AppEventListener>> f23559h;

    /* renamed from: i */
    private zzbrm f23560i;

    /* renamed from: j */
    private zzcmu f23561j;

    public static class zza {

        /* renamed from: a */
        private Set<zzbuz<zzxr>> f23562a = new HashSet();

        /* renamed from: b */
        private Set<zzbuz<zzbrl>> f23563b = new HashSet();

        /* renamed from: c */
        private Set<zzbuz<zzbrw>> f23564c = new HashSet();

        /* renamed from: d */
        private Set<zzbuz<zzbsr>> f23565d = new HashSet();

        /* renamed from: e */
        private Set<zzbuz<zzbro>> f23566e = new HashSet();

        /* renamed from: f */
        private Set<zzbuz<AdMetadataListener>> f23567f = new HashSet();

        /* renamed from: g */
        private Set<zzbuz<AppEventListener>> f23568g = new HashSet();

        /* renamed from: h */
        private Set<zzbuz<zzbrs>> f23569h = new HashSet();

        /* renamed from: a */
        public final zza m18351a(AppEventListener appEventListener, Executor executor) {
            this.f23568g.add(new zzbuz<>(appEventListener, executor));
            return this;
        }

        /* renamed from: b */
        public final zza m18352b(AdMetadataListener adMetadataListener, Executor executor) {
            this.f23567f.add(new zzbuz<>(adMetadataListener, executor));
            return this;
        }

        /* renamed from: c */
        public final zza m18353c(zzbrl zzbrlVar, Executor executor) {
            this.f23563b.add(new zzbuz<>(zzbrlVar, executor));
            return this;
        }

        /* renamed from: d */
        public final zza m18354d(zzbro zzbroVar, Executor executor) {
            this.f23566e.add(new zzbuz<>(zzbroVar, executor));
            return this;
        }

        /* renamed from: e */
        public final zza m18355e(zzbrs zzbrsVar, Executor executor) {
            this.f23569h.add(new zzbuz<>(zzbrsVar, executor));
            return this;
        }

        /* renamed from: f */
        public final zza m18356f(zzbrw zzbrwVar, Executor executor) {
            this.f23564c.add(new zzbuz<>(zzbrwVar, executor));
            return this;
        }

        /* renamed from: g */
        public final zza m18357g(zzbsr zzbsrVar, Executor executor) {
            this.f23565d.add(new zzbuz<>(zzbsrVar, executor));
            return this;
        }

        /* renamed from: h */
        public final zza m18358h(zzxr zzxrVar, Executor executor) {
            this.f23562a.add(new zzbuz<>(zzxrVar, executor));
            return this;
        }

        /* renamed from: i */
        public final zza m18359i(zzzs zzzsVar, Executor executor) {
            if (this.f23568g != null) {
                zzcpy zzcpyVar = new zzcpy();
                zzcpyVar.m18927b(zzzsVar);
                this.f23568g.add(new zzbuz<>(zzcpyVar, executor));
            }
            return this;
        }

        /* renamed from: k */
        public final zzbtv m18360k() {
            return new zzbtv(this);
        }
    }

    private zzbtv(zza zzaVar) {
        this.f23552a = zzaVar.f23562a;
        this.f23554c = zzaVar.f23564c;
        this.f23553b = zzaVar.f23563b;
        this.f23555d = zzaVar.f23565d;
        this.f23556e = zzaVar.f23566e;
        this.f23557f = zzaVar.f23569h;
        this.f23558g = zzaVar.f23567f;
        this.f23559h = zzaVar.f23568g;
    }

    /* renamed from: a */
    public final zzcmu m18333a(Clock clock) {
        if (this.f23561j == null) {
            this.f23561j = new zzcmu(clock);
        }
        return this.f23561j;
    }

    /* renamed from: b */
    public final Set<zzbuz<zzbrl>> m18334b() {
        return this.f23553b;
    }

    /* renamed from: c */
    public final Set<zzbuz<zzbsr>> m18335c() {
        return this.f23555d;
    }

    /* renamed from: d */
    public final Set<zzbuz<zzbro>> m18336d() {
        return this.f23556e;
    }

    /* renamed from: e */
    public final Set<zzbuz<zzbrs>> m18337e() {
        return this.f23557f;
    }

    /* renamed from: f */
    public final Set<zzbuz<AdMetadataListener>> m18338f() {
        return this.f23558g;
    }

    /* renamed from: g */
    public final Set<zzbuz<AppEventListener>> m18339g() {
        return this.f23559h;
    }

    /* renamed from: h */
    public final Set<zzbuz<zzxr>> m18340h() {
        return this.f23552a;
    }

    /* renamed from: i */
    public final Set<zzbuz<zzbrw>> m18341i() {
        return this.f23554c;
    }

    /* renamed from: j */
    public final zzbrm m18342j(Set<zzbuz<zzbro>> set) {
        if (this.f23560i == null) {
            this.f23560i = new zzbrm(set);
        }
        return this.f23560i;
    }
}
