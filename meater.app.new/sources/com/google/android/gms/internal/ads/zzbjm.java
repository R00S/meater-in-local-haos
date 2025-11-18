package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbkw;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class zzbjm implements zzblp {

    /* renamed from: a */
    private static zzbjm f23107a;

    /* renamed from: b */
    public static zzbjm m17775b(Context context, zzamp zzampVar, int i2) {
        zzbjm zzbjmVarM17777o = m17777o(context, i2);
        zzbjmVarM17777o.mo17783h().m18867c(zzampVar);
        return zzbjmVarM17777o;
    }

    @Deprecated
    /* renamed from: c */
    private static zzbjm m17776c(zzbai zzbaiVar, Context context, zzbkw.zza zzaVar) {
        zzbjm zzbjmVar;
        synchronized (zzbjm.class) {
            if (f23107a == null) {
                f23107a = new zzbkn().m17854c(new zzbjn(new zzbjn.zza().m17797b(zzbaiVar).m17798d(context))).m17852a(new zzbkw(zzaVar)).m17853b();
                zzacu.m16423a(context);
                zzk.zzlk().m17054k(context, zzbaiVar);
                zzk.zzlm().m20671c(context);
                zzk.zzlg().m17184u(context);
                zzk.zzlg().m17185v(context);
                zzawx.m17080a(context);
                zzk.zzlj().m20629c(context);
                zzk.zzmb().m17287a(context);
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21754a5)).booleanValue()) {
                    new zzcjr(context, zzbaiVar, new zzwj(new zzwo(context)), new zzcjc(new zzcja(context), f23107a.mo17781f())).m18844a();
                }
            }
            zzbjmVar = f23107a;
        }
        return zzbjmVar;
    }

    @Deprecated
    /* renamed from: o */
    public static zzbjm m17777o(Context context, int i2) {
        synchronized (zzbjm.class) {
            zzbjm zzbjmVar = f23107a;
            return zzbjmVar != null ? zzbjmVar : m17776c(new zzbai(15000000, i2, true, false), context, new zzbkb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    /* renamed from: a */
    public final zzcvs mo17778a(zzarx zzarxVar) {
        return mo17779d(new zzcwx(zzarxVar));
    }

    /* renamed from: d */
    protected abstract zzcvs mo17779d(zzcwx zzcwxVar);

    /* renamed from: e */
    public abstract Executor mo17780e();

    /* renamed from: f */
    public abstract zzbbl mo17781f();

    /* renamed from: g */
    public abstract zzbtb mo17782g();

    /* renamed from: h */
    public abstract zzclc mo17783h();

    /* renamed from: i */
    public abstract zzbkz mo17784i();

    /* renamed from: j */
    public abstract zzbod mo17785j();

    /* renamed from: k */
    public abstract zzbwt mo17786k();

    /* renamed from: l */
    public abstract zzbxp mo17787l();

    /* renamed from: m */
    public abstract zzcdg mo17788m();

    /* renamed from: n */
    public abstract zzcqp mo17789n();
}
