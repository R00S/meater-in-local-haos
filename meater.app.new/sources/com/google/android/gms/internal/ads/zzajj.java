package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzajj extends zzaju<zzalf> implements zzajq, zzajw {

    /* renamed from: h */
    private final zzbjb f22070h;

    /* renamed from: i */
    private zzajx f22071i;

    public zzajj(Context context, zzbai zzbaiVar) throws zzbhj {
        try {
            zzbjb zzbjbVar = new zzbjb(context, new C7396z0(this));
            this.f22070h = zzbjbVar;
            zzbjbVar.setWillNotDraw(true);
            zzbjbVar.addJavascriptInterface(new C7359y0(this), "GoogleJsInterface");
            zzk.zzlg().m17179k(context, zzbaiVar.f22750f, zzbjbVar.getSettings());
            super.m16620r0(this);
        } catch (Throwable th) {
            throw new zzbhj("Init failed.", th);
        }
    }

    /* renamed from: A0 */
    final /* synthetic */ void m16601A0(String str) {
        this.f22070h.mo14917k(str);
    }

    /* renamed from: B0 */
    final /* synthetic */ void m16602B0(String str) {
        this.f22070h.loadUrl(str);
    }

    /* renamed from: C0 */
    final /* synthetic */ void m16603C0(String str) {
        this.f22070h.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    /* renamed from: T */
    public final void mo16604T(final String str) {
        zzbbm.f22757a.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.v0

            /* renamed from: f */
            private final zzajj f20662f;

            /* renamed from: g */
            private final String f20663g;

            {
                this.f20662f = this;
                this.f20663g = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20662f.m16602B0(this.f20663g);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    /* renamed from: X */
    public final void mo15685X(String str, String str2) {
        zzajr.m16610a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    /* renamed from: Y */
    public final void mo14895Y(String str, JSONObject jSONObject) {
        zzajr.m16612c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void destroy() {
        this.f22070h.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzaji
    /* renamed from: j */
    public final void mo14915j(String str, JSONObject jSONObject) {
        zzajr.m16613d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzakg
    /* renamed from: k */
    public final void mo14917k(final String str) {
        zzbbm.f22757a.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.w0

            /* renamed from: f */
            private final zzajj f20817f;

            /* renamed from: g */
            private final String f20818g;

            {
                this.f20817f = this;
                this.f20818g = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20817f.m16601A0(this.f20818g);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    /* renamed from: l */
    public final boolean mo16605l() {
        return this.f22070h.m17770l();
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    /* renamed from: o0 */
    public final void mo16606o0(String str) {
        mo16609u0(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", str));
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    /* renamed from: q */
    public final void mo16607q(zzajx zzajxVar) {
        this.f22071i = zzajxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    /* renamed from: q0 */
    public final zzalg mo16608q0() {
        return new zzalh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    /* renamed from: u0 */
    public final void mo16609u0(final String str) {
        zzbbm.f22757a.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.u0

            /* renamed from: f */
            private final zzajj f20598f;

            /* renamed from: g */
            private final String f20599g;

            {
                this.f20598f = this;
                this.f20599g = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20598f.m16603C0(this.f20599g);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    /* renamed from: y */
    public final void mo14940y(String str, Map map) {
        zzajr.m16611b(this, str, map);
    }
}
