package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzclc {

    /* renamed from: a */
    private final AtomicReference<zzamp> f24666a = new AtomicReference<>();

    zzclc() {
    }

    /* renamed from: b */
    private final zzamp m18864b() throws RemoteException {
        zzamp zzampVar = this.f24666a.get();
        if (zzampVar != null) {
            return zzampVar;
        }
        zzbad.m17353i("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    /* renamed from: f */
    private final zzams m18865f(String str, JSONObject jSONObject) throws RemoteException {
        zzamp zzampVarM18864b = m18864b();
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                return zzampVarM18864b.mo16692N6(jSONObject.getString("class_name")) ? zzampVarM18864b.mo16695l6("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzampVarM18864b.mo16695l6("com.google.ads.mediation.customevent.CustomEventAdapter");
            } catch (JSONException e2) {
                zzbad.m17347c("Invalid custom event.", e2);
            }
        }
        return zzampVarM18864b.mo16695l6(str);
    }

    /* renamed from: a */
    public final boolean m18866a() {
        return this.f24666a.get() != null;
    }

    /* renamed from: c */
    public final void m18867c(zzamp zzampVar) {
        this.f24666a.compareAndSet(null, zzampVar);
    }

    /* renamed from: d */
    public final zzaov m18868d(String str) throws RemoteException {
        return m18864b().mo16693P2(str);
    }

    /* renamed from: e */
    public final zzams m18869e(String str, JSONObject jSONObject) throws RemoteException {
        return "com.google.ads.mediation.admob.AdMobAdapter".equals(str) ? new zzanl(new AdMobAdapter()) : "com.google.ads.mediation.AdUrlAdapter".equals(str) ? new zzanl(new AdUrlAdapter()) : "com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str) ? new zzanl(new zzapl()) : m18865f(str, jSONObject);
    }
}
