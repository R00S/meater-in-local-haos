package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcdp {

    /* renamed from: a */
    private final zzbri f24127a;

    /* renamed from: b */
    private final zzbse f24128b;

    /* renamed from: c */
    private final zzbss f24129c;

    /* renamed from: d */
    private final zzbsv f24130d;

    /* renamed from: e */
    private final zzbtp f24131e;

    /* renamed from: f */
    private final Executor f24132f;

    /* renamed from: g */
    private final zzbva f24133g;

    /* renamed from: h */
    private final zzbmn f24134h;

    /* renamed from: i */
    private final com.google.android.gms.ads.internal.zzb f24135i;

    /* renamed from: j */
    private final zzbry f24136j;

    /* renamed from: k */
    private final zzavb f24137k;

    /* renamed from: l */
    private final zzdh f24138l;

    /* renamed from: m */
    private final zzbtl f24139m;

    public zzcdp(zzbri zzbriVar, zzbse zzbseVar, zzbss zzbssVar, zzbsv zzbsvVar, zzbtp zzbtpVar, Executor executor, zzbva zzbvaVar, zzbmn zzbmnVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbry zzbryVar, zzavb zzavbVar, zzdh zzdhVar, zzbtl zzbtlVar) {
        this.f24127a = zzbriVar;
        this.f24128b = zzbseVar;
        this.f24129c = zzbssVar;
        this.f24130d = zzbsvVar;
        this.f24131e = zzbtpVar;
        this.f24132f = executor;
        this.f24133g = zzbvaVar;
        this.f24134h = zzbmnVar;
        this.f24135i = zzbVar;
        this.f24136j = zzbryVar;
        this.f24137k = zzavbVar;
        this.f24138l = zzdhVar;
        this.f24139m = zzbtlVar;
    }

    /* renamed from: a */
    public static zzbbh<?> m18683a(zzbgz zzbgzVar, String str, String str2) {
        final zzbbr zzbbrVar = new zzbbr();
        zzbgzVar.mo14926p().mo17687i(new zzbij(zzbbrVar) { // from class: com.google.android.gms.internal.ads.ci

            /* renamed from: a */
            private final zzbbr f18454a;

            {
                this.f18454a = zzbbrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zzae(boolean z) {
                zzbbr zzbbrVar2 = this.f18454a;
                if (z) {
                    zzbbrVar2.m17385a(null);
                } else {
                    zzbbrVar2.m17386c(new Exception("Ad Web View failed to load."));
                }
            }
        });
        zzbgzVar.mo14879G(str, str2, null);
        return zzbbrVar;
    }

    /* renamed from: c */
    final /* synthetic */ void m18686c(zzbgz zzbgzVar, zzbgz zzbgzVar2, Map map) {
        this.f24134h.m17895B(zzbgzVar);
    }

    /* renamed from: d */
    final /* synthetic */ boolean m18687d(View view, MotionEvent motionEvent) {
        this.f24135i.recordClick();
        zzavb zzavbVar = this.f24137k;
        if (zzavbVar == null) {
            return false;
        }
        zzavbVar.mo16973e();
        return false;
    }

    /* renamed from: e */
    final /* synthetic */ void m18688e(View view) {
        this.f24135i.recordClick();
        zzavb zzavbVar = this.f24137k;
        if (zzavbVar != null) {
            zzavbVar.mo16973e();
        }
    }

    /* renamed from: f */
    final /* synthetic */ void m18689f() {
        this.f24128b.m18309f0();
    }

    /* renamed from: g */
    final /* synthetic */ void m18690g() {
        this.f24127a.onAdClicked();
    }

    /* renamed from: i */
    public final void m18691i(final zzbgz zzbgzVar, boolean z) {
        zzdc zzdcVarM19455f;
        zzbgzVar.mo14926p().mo17681c(new zzxr(this) { // from class: com.google.android.gms.internal.ads.uh

            /* renamed from: f */
            private final zzcdp f20632f;

            {
                this.f20632f = this;
            }

            @Override // com.google.android.gms.internal.ads.zzxr
            public final void onAdClicked() {
                this.f20632f.m18690g();
            }
        }, this.f24129c, this.f24130d, new zzagx(this) { // from class: com.google.android.gms.internal.ads.vh

            /* renamed from: f */
            private final zzcdp f20743f;

            {
                this.f20743f = this;
            }

            @Override // com.google.android.gms.internal.ads.zzagx
            public final void onAppEvent(String str, String str2) {
                this.f20743f.m18692j(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzu(this) { // from class: com.google.android.gms.internal.ads.wh

            /* renamed from: f */
            private final zzcdp f20852f;

            {
                this.f20852f = this;
            }

            @Override // com.google.android.gms.ads.internal.overlay.zzu
            public final void zztq() {
                this.f20852f.m18689f();
            }
        }, z, null, this.f24135i, new C6600di(this), this.f24137k);
        zzbgzVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.google.android.gms.internal.ads.xh

            /* renamed from: f */
            private final zzcdp f20973f;

            {
                this.f20973f = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f20973f.m18687d(view, motionEvent);
            }
        });
        zzbgzVar.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.gms.internal.ads.yh

            /* renamed from: f */
            private final zzcdp f21303f;

            {
                this.f21303f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21303f.m18688e(view);
            }
        });
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21835n2)).booleanValue() && (zzdcVarM19455f = this.f24138l.m19455f()) != null) {
            zzdcVarM19455f.zzb(zzbgzVar.getView());
        }
        this.f24133g.m18332V(zzbgzVar, this.f24132f);
        this.f24133g.m18332V(new zzue(zzbgzVar) { // from class: com.google.android.gms.internal.ads.zh

            /* renamed from: f */
            private final zzbgz f21454f;

            {
                this.f21454f = zzbgzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzue
            /* renamed from: r0 */
            public final void mo14929r0(zzud zzudVar) {
                zzbii zzbiiVarMo14926p = this.f21454f.mo14926p();
                Rect rect = zzudVar.f27137f;
                zzbiiVarMo14926p.mo17690l(rect.left, rect.top, false);
            }
        }, this.f24132f);
        this.f24133g.m18388Y(zzbgzVar.getView());
        zzbgzVar.mo14907f("/trackActiveViewUnit", new zzaho(this, zzbgzVar) { // from class: com.google.android.gms.internal.ads.ai

            /* renamed from: a */
            private final zzcdp f18163a;

            /* renamed from: b */
            private final zzbgz f18164b;

            {
                this.f18163a = this;
                this.f18164b = zzbgzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzaho
            /* renamed from: a */
            public final void mo14739a(Object obj, Map map) {
                this.f18163a.m18686c(this.f18164b, (zzbgz) obj, map);
            }
        });
        this.f24134h.m17896F(zzbgzVar);
        this.f24136j.m18303Y(new zzbvp(zzbgzVar) { // from class: com.google.android.gms.internal.ads.bi

            /* renamed from: a */
            private final zzbgz f18343a;

            {
                this.f18343a = zzbgzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbvp
            /* renamed from: a */
            public final void mo14950a() {
                this.f18343a.destroy();
            }
        }, this.f24132f);
    }

    /* renamed from: j */
    final /* synthetic */ void m18692j(String str, String str2) {
        this.f24131e.onAppEvent(str, str2);
    }
}
