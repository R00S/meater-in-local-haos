package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bc */
/* loaded from: classes2.dex */
final class C6520bc extends zzcvs {

    /* renamed from: a */
    private zzcwx f18312a;

    /* renamed from: b */
    private zzdtu<zzcvo> f18313b;

    /* renamed from: c */
    private zzdtu<String> f18314c;

    /* renamed from: d */
    private zzdtu<zzcvy> f18315d;

    /* renamed from: e */
    private zzdtu<zzcwc> f18316e;

    /* renamed from: f */
    private zzdtu<zzcwj> f18317f;

    /* renamed from: g */
    private zzdtu<Boolean> f18318g;

    /* renamed from: h */
    private zzdtu<ApplicationInfo> f18319h;

    /* renamed from: i */
    private zzdtu<zzcwq> f18320i;

    /* renamed from: j */
    private zzdtu<zzcwu> f18321j;

    /* renamed from: k */
    private zzdtu<zzcxh> f18322k;

    /* renamed from: l */
    private zzdtu<String> f18323l;

    /* renamed from: m */
    private zzdtu<zzcez> f18324m;

    /* renamed from: n */
    private zzdtu<zzcez> f18325n;

    /* renamed from: o */
    private zzdtu<zzcez> f18326o;

    /* renamed from: p */
    private zzdtu<zzcez> f18327p;

    /* renamed from: q */
    private zzdtu<Map<zzczs, zzcez>> f18328q;

    /* renamed from: r */
    private zzdtu<Set<zzbuz<zzczz>>> f18329r;

    /* renamed from: s */
    private zzdtu<Set<zzbuz<zzczz>>> f18330s;

    /* renamed from: t */
    private zzdtu f18331t;

    /* renamed from: u */
    private zzdtu<zzczt> f18332u;

    /* renamed from: v */
    private final /* synthetic */ zzbkc f18333v;

    private C6520bc(zzbkc zzbkcVar, zzcwx zzcwxVar) {
        this.f18333v = zzbkcVar;
        this.f18312a = zzcwxVar;
        this.f18313b = new zzcvr(zzbln.m17870a(), zzbkcVar.f23149i, zzbkcVar.f23145e, zzcyx.m19087a());
        this.f18314c = new zzcwy(zzcwxVar);
        this.f18315d = new zzcwa(zzbjy.m17801a(), zzbkcVar.f23149i, this.f18314c, zzcyx.m19087a());
        this.f18316e = new zzcwe(zzblj.m17862a(), zzcyx.m19087a(), zzbkcVar.f23149i);
        this.f18317f = new zzcwl(zzblk.m17864a(), zzcyx.m19087a(), this.f18314c);
        this.f18318g = new zzcxa(zzcwxVar);
        this.f18319h = new zzcwz(zzcwxVar);
        this.f18320i = new zzcws(zzbll.m17866a(), zzbkcVar.f23145e, this.f18318g, this.f18319h);
        this.f18321j = new zzcww(zzblm.m17868a(), zzbkcVar.f23145e, zzbkcVar.f23149i);
        this.f18322k = new zzcxj(zzcyx.m19087a());
        this.f18323l = new zzcxb(zzcwxVar);
        this.f18324m = zzdth.m19867a(zzcet.m18710a());
        this.f18325n = zzdth.m19867a(zzces.m18709a());
        this.f18326o = zzdth.m19867a(zzceu.m18711a());
        this.f18327p = zzdth.m19867a(zzcev.m18712a());
        this.f18328q = zzdtk.m19870a(4).m19871a(zzczs.GMS_SIGNALS, this.f18324m).m19871a(zzczs.BUILD_URL, this.f18325n).m19871a(zzczs.HTTP, this.f18326o).m19871a(zzczs.PRE_PROCESS, this.f18327p).m19872b();
        this.f18329r = zzdth.m19867a(new zzcew(this.f18323l, zzbkcVar.f23149i, zzcyx.m19087a(), this.f18328q));
        zzdtq zzdtqVarM19883c = zzdtq.m19880a(0, 1).m19882b(this.f18329r).m19883c();
        this.f18330s = zzdtqVarM19883c;
        this.f18331t = zzdab.m19129a(zzdtqVarM19883c);
        this.f18332u = zzdth.m19867a(zzdaa.m19128a(zzcyx.m19087a(), zzbkcVar.f23145e, this.f18331t));
    }

    /* renamed from: d */
    private final zzcwn m14942d() {
        return new zzcwn(zzbli.m17861a(), zzcyx.m19088b(), (List) zzdto.m19874b(this.f18312a.m19009e(), "Cannot return null from a non-@Nullable @Provides method"));
    }

    /* renamed from: e */
    private final zzcvu m14943e() {
        return new zzcvu(zzbln.m17871b(), zzcyx.m19088b(), (String) zzdto.m19874b(this.f18312a.m19006b(), "Cannot return null from a non-@Nullable @Provides method"), this.f18312a.m19007c());
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* renamed from: a */
    public final zzcvb<JSONObject> mo14944a() {
        return new zzcvb<>(zzcyx.m19088b(), zzdtp.m19876d(11).m19877a((zzcva) zzdto.m19874b(new zzctz(new zzcwj(zzblk.m17865b(), zzcyx.m19088b(), zzcwy.m19012a(this.f18312a)), 0L, (ScheduledExecutorService) this.f18333v.f23145e.get()), "Cannot return null from a non-@Nullable @Provides method")).m19877a((zzcva) zzdto.m19874b(new zzctz(new zzcwq(zzbll.m17867b(), (ScheduledExecutorService) this.f18333v.f23145e.get(), this.f18312a.m19008d(), zzcwz.m19013a(this.f18312a)), ((Long) zzyt.m20848e().m16421c(zzacu.f21733X2)).longValue(), (ScheduledExecutorService) this.f18333v.f23145e.get()), "Cannot return null from a non-@Nullable @Provides method")).m19877a((zzcva) zzdto.m19874b(new zzctz(new zzcwu(zzblm.m17869b(), (ScheduledExecutorService) this.f18333v.f23145e.get(), zzbjq.m17799a(this.f18333v.f23142b)), ((Long) zzyt.m20848e().m16421c(zzacu.f21836n3)).longValue(), (ScheduledExecutorService) this.f18333v.f23145e.get()), "Cannot return null from a non-@Nullable @Provides method")).m19877a((zzcva) zzdto.m19874b(new zzctz(new zzcvo(zzbln.m17871b(), zzbjq.m17799a(this.f18333v.f23142b), (ScheduledExecutorService) this.f18333v.f23145e.get(), zzcyx.m19088b()), 0L, (ScheduledExecutorService) this.f18333v.f23145e.get()), "Cannot return null from a non-@Nullable @Provides method")).m19877a((zzcva) zzdto.m19874b(new zzctz(new zzcxh(zzcyx.m19088b()), 0L, (ScheduledExecutorService) this.f18333v.f23145e.get()), "Cannot return null from a non-@Nullable @Provides method")).m19877a(zzcxe.m19014a()).m19877a(new zzcvy(null, zzbjq.m17799a(this.f18333v.f23142b), zzcwy.m19012a(this.f18312a), zzcyx.m19088b())).m19877a(new zzcwc(zzblj.m17863b(), zzcyx.m19088b(), zzbjq.m17799a(this.f18333v.f23142b))).m19877a(m14942d()).m19877a(m14943e()).m19877a((zzcva) this.f18333v.f23158r.get()).m19879c());
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* renamed from: b */
    public final zzcvb<JSONObject> mo14945b() {
        return zzcxf.m19015a(this.f18333v.f23158r.get(), m14943e(), m14942d(), zzdth.m19868b(this.f18313b), zzdth.m19868b(this.f18315d), zzdth.m19868b(this.f18316e), zzdth.m19868b(this.f18317f), zzdth.m19868b(this.f18320i), zzdth.m19868b(this.f18321j), zzdth.m19868b(this.f18322k), zzcyx.m19088b());
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* renamed from: c */
    public final zzczt mo14946c() {
        return this.f18332u.get();
    }
}
