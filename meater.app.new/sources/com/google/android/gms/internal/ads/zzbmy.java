package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbmy implements zzue {

    /* renamed from: f */
    private zzbgz f23282f;

    /* renamed from: g */
    private final Executor f23283g;

    /* renamed from: h */
    private final zzbml f23284h;

    /* renamed from: i */
    private final Clock f23285i;

    /* renamed from: j */
    private boolean f23286j = false;

    /* renamed from: k */
    private boolean f23287k = false;

    /* renamed from: l */
    private zzbmp f23288l = new zzbmp();

    public zzbmy(Executor executor, zzbml zzbmlVar, Clock clock) {
        this.f23283g = executor;
        this.f23284h = zzbmlVar;
        this.f23285i = clock;
    }

    /* renamed from: q */
    private final void m17907q() {
        try {
            final JSONObject jSONObjectMo15021b = this.f23284h.mo15021b(this.f23288l);
            if (this.f23282f != null) {
                this.f23283g.execute(new Runnable(this, jSONObjectMo15021b) { // from class: com.google.android.gms.internal.ads.wc

                    /* renamed from: f */
                    private final zzbmy f20845f;

                    /* renamed from: g */
                    private final JSONObject f20846g;

                    {
                        this.f20845f = this;
                        this.f20846g = jSONObjectMo15021b;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20845f.m17912y(this.f20846g);
                    }
                });
            }
        } catch (JSONException e2) {
            zzawz.m17081l("Failed to call video active view js", e2);
        }
    }

    /* renamed from: j */
    public final void m17908j() {
        this.f23286j = false;
    }

    /* renamed from: k */
    public final void m17909k() {
        this.f23286j = true;
        m17907q();
    }

    /* renamed from: r */
    public final void m17910r(boolean z) {
        this.f23287k = z;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    /* renamed from: r0 */
    public final void mo14929r0(zzud zzudVar) {
        zzbmp zzbmpVar = this.f23288l;
        zzbmpVar.f23251a = this.f23287k ? false : zzudVar.f27144m;
        zzbmpVar.f23254d = this.f23285i.mo14609b();
        this.f23288l.f23256f = zzudVar;
        if (this.f23286j) {
            m17907q();
        }
    }

    /* renamed from: u */
    public final void m17911u(zzbgz zzbgzVar) {
        this.f23282f = zzbgzVar;
    }

    /* renamed from: y */
    final /* synthetic */ void m17912y(JSONObject jSONObject) {
        this.f23282f.mo14895Y("AFMA_updateActiveView", jSONObject);
    }
}
