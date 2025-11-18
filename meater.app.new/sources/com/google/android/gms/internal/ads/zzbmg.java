package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbmg {

    /* renamed from: a */
    private final String f23230a;

    /* renamed from: b */
    private final zzaly f23231b;

    /* renamed from: c */
    private final Executor f23232c;

    /* renamed from: d */
    private zzbmn f23233d;

    /* renamed from: e */
    private final zzaho<Object> f23234e = new C7112rc(this);

    /* renamed from: f */
    private final zzaho<Object> f23235f = new C7186tc(this);

    public zzbmg(String str, zzaly zzalyVar, Executor executor) {
        this.f23230a = str;
        this.f23231b = zzalyVar;
        this.f23232c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final boolean m17887h(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f23230a);
    }

    /* renamed from: b */
    public final void m17888b(zzbmn zzbmnVar) {
        this.f23231b.m16665b("/updateActiveView", this.f23234e);
        this.f23231b.m16665b("/untrackActiveViewUnit", this.f23235f);
        this.f23233d = zzbmnVar;
    }

    /* renamed from: d */
    public final void m17889d() {
        this.f23231b.m16666c("/updateActiveView", this.f23234e);
        this.f23231b.m16666c("/untrackActiveViewUnit", this.f23235f);
    }

    /* renamed from: f */
    public final void m17890f(zzbgz zzbgzVar) {
        zzbgzVar.mo14907f("/updateActiveView", this.f23234e);
        zzbgzVar.mo14907f("/untrackActiveViewUnit", this.f23235f);
    }

    /* renamed from: g */
    public final void m17891g(zzbgz zzbgzVar) {
        zzbgzVar.mo14913i("/updateActiveView", this.f23234e);
        zzbgzVar.mo14913i("/untrackActiveViewUnit", this.f23235f);
    }
}
