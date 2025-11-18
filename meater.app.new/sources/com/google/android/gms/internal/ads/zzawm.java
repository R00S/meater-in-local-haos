package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

@zzard
/* loaded from: classes2.dex */
public final class zzawm {

    /* renamed from: a */
    private final Object f22593a = new Object();

    /* renamed from: b */
    private zztz f22594b;

    /* renamed from: c */
    private final zzaxc f22595c;

    /* renamed from: d */
    private final zzawu f22596d;

    /* renamed from: e */
    private boolean f22597e;

    /* renamed from: f */
    private Context f22598f;

    /* renamed from: g */
    private zzbai f22599g;

    /* renamed from: h */
    private zzacy f22600h;

    /* renamed from: i */
    private Boolean f22601i;

    /* renamed from: j */
    private final AtomicInteger f22602j;

    /* renamed from: k */
    private final C7326x4 f22603k;

    /* renamed from: l */
    private final Object f22604l;

    /* renamed from: m */
    private zzbbh<ArrayList<String>> f22605m;

    public zzawm() {
        zzaxc zzaxcVar = new zzaxc();
        this.f22595c = zzaxcVar;
        this.f22596d = new zzawu(zzyt.m20849f(), zzaxcVar);
        this.f22597e = false;
        this.f22600h = null;
        this.f22601i = null;
        this.f22602j = new AtomicInteger(0);
        this.f22603k = new C7326x4(null);
        this.f22604l = new Object();
    }

    @TargetApi(16)
    /* renamed from: f */
    private static ArrayList<String> m17045f(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo packageInfoM14671e = Wrappers.m14674a(context).m14671e(context.getApplicationInfo().packageName, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);
            if (packageInfoM14671e.requestedPermissions != null && packageInfoM14671e.requestedPermissionsFlags != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = packageInfoM14671e.requestedPermissions;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if ((packageInfoM14671e.requestedPermissionsFlags[i2] & 2) != 0) {
                        arrayList.add(strArr[i2]);
                    }
                    i2++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Context m17049a() {
        return this.f22598f;
    }

    /* renamed from: b */
    public final Resources m17050b() {
        if (this.f22599g.f22753i) {
            return this.f22598f.getResources();
        }
        try {
            zzbae.m17357b(this.f22598f).getResources();
            return null;
        } catch (zzbag e2) {
            zzbad.m17348d("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    /* renamed from: d */
    public final void m17051d(Boolean bool) {
        synchronized (this.f22593a) {
            this.f22601i = bool;
        }
    }

    /* renamed from: e */
    public final void m17052e(Throwable th, String str) {
        zzaqx.m16882e(this.f22598f, this.f22599g).mo16884a(th, str);
    }

    /* renamed from: h */
    public final void m17053h(Throwable th, String str) {
        zzaqx.m16882e(this.f22598f, this.f22599g).mo16885b(th, str, ((Float) zzyt.m20848e().m16421c(zzacu.f21844p)).floatValue());
    }

    @TargetApi(23)
    /* renamed from: k */
    public final void m17054k(Context context, zzbai zzbaiVar) {
        synchronized (this.f22593a) {
            if (!this.f22597e) {
                this.f22598f = context.getApplicationContext();
                this.f22599g = zzbaiVar;
                zzk.zzlj().m20630d(this.f22596d);
                zzacy zzacyVar = null;
                this.f22595c.m17116B(this.f22598f, null, true);
                zzaqx.m16882e(this.f22598f, this.f22599g);
                this.f22594b = new zztz(context.getApplicationContext(), this.f22599g);
                zzk.zzlp();
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21777e0)).booleanValue()) {
                    zzacyVar = new zzacy();
                } else {
                    zzawz.m17082m("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                }
                this.f22600h = zzacyVar;
                if (zzacyVar != null) {
                    zzbao.m17362a(new C7289w4(this).zzvi(), "AppState.registerCsiReporter");
                }
                this.f22597e = true;
                m17062s();
            }
        }
        zzk.zzlg().m17177g0(context, zzbaiVar.f22750f);
    }

    /* renamed from: l */
    public final zzacy m17055l() {
        zzacy zzacyVar;
        synchronized (this.f22593a) {
            zzacyVar = this.f22600h;
        }
        return zzacyVar;
    }

    /* renamed from: m */
    public final Boolean m17056m() {
        Boolean bool;
        synchronized (this.f22593a) {
            bool = this.f22601i;
        }
        return bool;
    }

    /* renamed from: n */
    public final void m17057n() {
        this.f22603k.m16034a();
    }

    /* renamed from: o */
    public final void m17058o() {
        this.f22602j.incrementAndGet();
    }

    /* renamed from: p */
    public final void m17059p() {
        this.f22602j.decrementAndGet();
    }

    /* renamed from: q */
    public final int m17060q() {
        return this.f22602j.get();
    }

    /* renamed from: r */
    public final zzaxb m17061r() {
        zzaxc zzaxcVar;
        synchronized (this.f22593a) {
            zzaxcVar = this.f22595c;
        }
        return zzaxcVar;
    }

    /* renamed from: s */
    public final zzbbh<ArrayList<String>> m17062s() {
        if (PlatformVersion.m14639c() && this.f22598f != null) {
            if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21847p2)).booleanValue()) {
                synchronized (this.f22604l) {
                    zzbbh<ArrayList<String>> zzbbhVar = this.f22605m;
                    if (zzbbhVar != null) {
                        return zzbbhVar;
                    }
                    zzbbh<ArrayList<String>> zzbbhVarM17118a = zzaxg.m17118a(new Callable(this) { // from class: com.google.android.gms.internal.ads.v4

                        /* renamed from: f */
                        private final zzawm f20721f;

                        {
                            this.f20721f = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f20721f.m17064u();
                        }
                    });
                    this.f22605m = zzbbhVarM17118a;
                    return zzbbhVarM17118a;
                }
            }
        }
        return zzbar.m17378o(new ArrayList());
    }

    /* renamed from: t */
    public final zzawu m17063t() {
        return this.f22596d;
    }

    /* renamed from: u */
    final /* synthetic */ ArrayList m17064u() throws Exception {
        return m17045f(zzasq.m16926f(this.f22598f));
    }
}
