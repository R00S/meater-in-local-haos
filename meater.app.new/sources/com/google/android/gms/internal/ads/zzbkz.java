package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbkz extends zzaac {

    /* renamed from: f */
    private final Context f23175f;

    /* renamed from: g */
    private final zzbai f23176g;

    /* renamed from: h */
    private final zzclc f23177h;

    /* renamed from: i */
    private final zzcjz<zzams, zzclb> f23178i;

    /* renamed from: j */
    private final zzcpf f23179j;

    /* renamed from: k */
    private final zzcgb f23180k;

    /* renamed from: l */
    private boolean f23181l = false;

    zzbkz(Context context, zzbai zzbaiVar, zzclc zzclcVar, zzcjz<zzams, zzclb> zzcjzVar, zzcpf zzcpfVar, zzcgb zzcgbVar) {
        this.f23175f = context;
        this.f23176g = zzbaiVar;
        this.f23177h = zzclcVar;
        this.f23178i = zzcjzVar;
        this.f23179j = zzcpfVar;
        this.f23180k = zzcgbVar;
    }

    /* renamed from: h7 */
    private final String m17857h7() {
        Context applicationContext = this.f23175f.getApplicationContext() == null ? this.f23175f : this.f23175f.getApplicationContext();
        try {
            return Wrappers.m14674a(applicationContext).m14669c(applicationContext.getPackageName(), 128).metaData.getString("com.google.android.gms.ads.APPLICATION_ID");
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            zzawz.m17081l("Error getting metadata", e2);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: B2 */
    public final void mo16171B2(String str, IObjectWrapper iObjectWrapper) throws JSONException {
        String strM17857h7 = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21780e3)).booleanValue() ? m17857h7() : HttpUrl.FRAGMENT_ENCODE_SET;
        if (!TextUtils.isEmpty(strM17857h7)) {
            str = strM17857h7;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzacu.m16423a(this.f23175f);
        boolean zBooleanValue = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21766c3)).booleanValue();
        zzacj<Boolean> zzacjVar = zzacu.f21750a1;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) zzyt.m20848e().m16421c(zzacjVar)).booleanValue();
        Runnable runnable = null;
        if (((Boolean) zzyt.m20848e().m16421c(zzacjVar)).booleanValue()) {
            zBooleanValue2 = true;
            final Runnable runnable2 = (Runnable) ObjectWrapper.m14709k0(iObjectWrapper);
            runnable = new Runnable(this, runnable2) { // from class: com.google.android.gms.internal.ads.pc

                /* renamed from: f */
                private final zzbkz f20293f;

                /* renamed from: g */
                private final Runnable f20294g;

                {
                    this.f20293f = this;
                    this.f20294g = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final zzbkz zzbkzVar = this.f20293f;
                    final Runnable runnable3 = this.f20294g;
                    zzbbm.f22757a.execute(new Runnable(zzbkzVar, runnable3) { // from class: com.google.android.gms.internal.ads.qc

                        /* renamed from: f */
                        private final zzbkz f20386f;

                        /* renamed from: g */
                        private final Runnable f20387g;

                        {
                            this.f20386f = zzbkzVar;
                            this.f20387g = runnable3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f20386f.m17858i7(this.f20387g);
                        }
                    });
                }
            };
        }
        if (zBooleanValue2) {
            zzk.zzlo().zza(this.f23175f, this.f23176g, str, runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: C4 */
    public final synchronized float mo16172C4() {
        return zzk.zzll().m17216d();
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: H3 */
    public final String mo16173H3() {
        return this.f23176g.f22750f;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: J3 */
    public final synchronized boolean mo16174J3() {
        return zzk.zzll().m17217e();
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: N2 */
    public final void mo16175N2(String str) {
        this.f23179j.m18912g(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: O0 */
    public final void mo16176O0(zzamp zzampVar) throws RemoteException {
        this.f23177h.m18867c(zzampVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: T2 */
    public final List<zzaio> mo16177T2() throws RemoteException {
        return this.f23180k.m18765f();
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: Y1 */
    public final void mo16178Y1(zzait zzaitVar) throws RemoteException {
        this.f23180k.m18770l(zzaitVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: a */
    public final synchronized void mo16179a() {
        if (this.f23181l) {
            zzbad.m17353i("Mobile ads is initialized already.");
            return;
        }
        zzacu.m16423a(this.f23175f);
        zzk.zzlk().m17054k(this.f23175f, this.f23176g);
        zzk.zzlm().m20671c(this.f23175f);
        this.f23181l = true;
        this.f23180k.m18769k();
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21758b2)).booleanValue()) {
            this.f23179j.m18907a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: c2 */
    public final synchronized void mo16180c2(boolean z) {
        zzk.zzll().m17214a(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: e5 */
    public final synchronized void mo16181e5(String str) {
        zzacu.m16423a(this.f23175f);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21766c3)).booleanValue()) {
                zzk.zzlo().zza(this.f23175f, this.f23176g, str, (Runnable) null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i7 */
    final /* synthetic */ void m17858i7(Runnable runnable) {
        Preconditions.m14367f("Adapters must be initialized on the main thread.");
        Map<String, zzamm> mapM17042e = zzk.zzlk().m17061r().mo17103q().m17042e();
        if (mapM17042e == null || mapM17042e.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzbad.m17348d("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.f23177h.m18866a()) {
            HashMap map = new HashMap();
            IObjectWrapper iObjectWrapperM14708E0 = ObjectWrapper.m14708E0(this.f23175f);
            Iterator<zzamm> it = mapM17042e.values().iterator();
            while (it.hasNext()) {
                for (zzaml zzamlVar : it.next().f22147a) {
                    String str = zzamlVar.f22134k;
                    for (String str2 : zzamlVar.f22126c) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzcjy<zzams, ListenerT> zzcjyVarMo18850a = this.f23178i.mo18850a(str3, jSONObject);
                    if (zzcjyVarMo18850a != 0) {
                        zzams zzamsVar = (zzams) zzcjyVarMo18850a.f24422b;
                        if (!zzamsVar.isInitialized() && zzamsVar.mo16715x3()) {
                            zzamsVar.mo16699H4(iObjectWrapperM14708E0, (zzclb) zzcjyVarMo18850a.f24423c, (List) entry.getValue());
                            String strValueOf = String.valueOf(str3);
                            zzbad.m17349e(strValueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(strValueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (Throwable th2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb.append("Failed to initialize rewarded video mediation adapter \"");
                    sb.append(str3);
                    sb.append("\"");
                    zzbad.m17348d(sb.toString(), th2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: t6 */
    public final void mo16182t6(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzbad.m17351g("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.m14709k0(iObjectWrapper);
        if (context == null) {
            zzbad.m17351g("Context is null. Failed to open debug menu.");
            return;
        }
        zzayb zzaybVar = new zzayb(context);
        zzaybVar.m17220a(str);
        zzaybVar.m17227j(this.f23176g.f22750f);
        zzaybVar.m17221b();
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: v5 */
    public final synchronized void mo16183v5(float f2) {
        zzk.zzll().m17215b(f2);
    }
}
