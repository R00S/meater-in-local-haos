package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbmn implements com.google.android.gms.ads.internal.overlay.zzo, zzbrw, zzbrx, zzue {

    /* renamed from: f */
    private final zzbmg f23241f;

    /* renamed from: g */
    private final zzbml f23242g;

    /* renamed from: i */
    private final zzamd<JSONObject, JSONObject> f23244i;

    /* renamed from: j */
    private final Executor f23245j;

    /* renamed from: k */
    private final Clock f23246k;

    /* renamed from: h */
    private final Set<zzbgz> f23243h = new HashSet();

    /* renamed from: l */
    private final AtomicBoolean f23247l = new AtomicBoolean(false);

    /* renamed from: m */
    private final zzbmp f23248m = new zzbmp();

    /* renamed from: n */
    private boolean f23249n = false;

    /* renamed from: o */
    private WeakReference<Object> f23250o = new WeakReference<>(this);

    public zzbmn(zzaly zzalyVar, zzbml zzbmlVar, Executor executor, zzbmg zzbmgVar, Clock clock) {
        this.f23241f = zzbmgVar;
        zzaln<JSONObject> zzalnVar = zzalo.f22107b;
        this.f23244i = zzalyVar.m16664a("google.afma.activeView.handleUpdate", zzalnVar, zzalnVar);
        this.f23242g = zzbmlVar;
        this.f23245j = executor;
        this.f23246k = clock;
    }

    /* renamed from: u */
    private final void m17894u() {
        Iterator<zzbgz> it = this.f23243h.iterator();
        while (it.hasNext()) {
            this.f23241f.m17891g(it.next());
        }
        this.f23241f.m17889d();
    }

    /* renamed from: B */
    public final synchronized void m17895B(zzbgz zzbgzVar) {
        this.f23243h.add(zzbgzVar);
        this.f23241f.m17890f(zzbgzVar);
    }

    /* renamed from: F */
    public final void m17896F(Object obj) {
        this.f23250o = new WeakReference<>(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    /* renamed from: j */
    public final synchronized void mo16103j(Context context) {
        this.f23248m.f23255e = "u";
        m17897q();
        m17894u();
        this.f23249n = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    /* renamed from: k */
    public final synchronized void mo16104k(Context context) {
        this.f23248m.f23252b = false;
        m17897q();
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final synchronized void onAdImpression() {
        if (this.f23247l.compareAndSet(false, true)) {
            this.f23241f.m17888b(this);
            m17897q();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onPause() {
        this.f23248m.f23252b = true;
        m17897q();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onResume() {
        this.f23248m.f23252b = false;
        m17897q();
    }

    /* renamed from: q */
    public final synchronized void m17897q() {
        if (!(this.f23250o.get() != null)) {
            m17898y();
            return;
        }
        if (!this.f23249n && this.f23247l.get()) {
            try {
                this.f23248m.f23254d = this.f23246k.mo14609b();
                final JSONObject jSONObjectMo15021b = this.f23242g.mo15021b(this.f23248m);
                for (final zzbgz zzbgzVar : this.f23243h) {
                    this.f23245j.execute(new Runnable(zzbgzVar, jSONObjectMo15021b) { // from class: com.google.android.gms.internal.ads.vc

                        /* renamed from: f */
                        private final zzbgz f20737f;

                        /* renamed from: g */
                        private final JSONObject f20738g;

                        {
                            this.f20737f = zzbgzVar;
                            this.f20738g = jSONObjectMo15021b;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f20737f.mo14895Y("AFMA_updateActiveView", this.f20738g);
                        }
                    });
                }
                zzbao.m17363b(this.f23244i.zzf(jSONObjectMo15021b), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e2) {
                zzawz.m17081l("Failed to call ActiveViewJS", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    /* renamed from: r */
    public final synchronized void mo16105r(Context context) {
        this.f23248m.f23252b = true;
        m17897q();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    /* renamed from: r0 */
    public final synchronized void mo14929r0(zzud zzudVar) {
        zzbmp zzbmpVar = this.f23248m;
        zzbmpVar.f23251a = zzudVar.f27144m;
        zzbmpVar.f23256f = zzudVar;
        m17897q();
    }

    /* renamed from: y */
    public final synchronized void m17898y() {
        m17894u();
        this.f23249n = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzta() {
    }
}
