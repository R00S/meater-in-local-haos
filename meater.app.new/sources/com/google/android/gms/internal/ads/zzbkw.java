package com.google.android.gms.internal.ads;

@zzard
/* loaded from: classes2.dex */
public class zzbkw {

    /* renamed from: a */
    private zza f23172a;

    public static abstract class zza {
        /* renamed from: a */
        public abstract zzbgd mo17816a();

        /* renamed from: b */
        public abstract zzbcp mo17817b();

        /* renamed from: c */
        public abstract zzwo mo17818c();

        /* renamed from: d */
        public abstract zzavd mo17819d();
    }

    public zzbkw(zza zzaVar) {
        this.f23172a = zzaVar;
    }

    /* renamed from: a */
    public final zzavd m17855a() {
        return this.f23172a.mo17819d();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzauw, com.google.android.gms.internal.ads.zzavc] */
    /* renamed from: b */
    public final com.google.android.gms.ads.internal.zza m17856b() {
        zza zzaVar = this.f23172a;
        return new com.google.android.gms.ads.internal.zza(zzaVar.mo17816a(), zzaVar.mo17817b(), new zzauw(zzaVar.mo17819d()), zzaVar.mo17818c());
    }
}
