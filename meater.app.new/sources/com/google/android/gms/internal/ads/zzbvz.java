package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public class zzbvz {

    /* renamed from: a */
    private final zzbwz f23616a;

    /* renamed from: b */
    private final zzbgz f23617b;

    public zzbvz(zzbwz zzbwzVar) {
        this(zzbwzVar, null);
    }

    /* renamed from: a */
    public Set<zzbuz<zzbrl>> mo15845a(zzbxc zzbxcVar) {
        return Collections.singleton(zzbuz.m18387a(zzbxcVar, zzbbm.f22758b));
    }

    /* renamed from: b */
    public final zzbgz m18404b() {
        return this.f23617b;
    }

    /* renamed from: c */
    public final zzbwz m18405c() {
        return this.f23616a;
    }

    /* renamed from: d */
    public final View m18406d() {
        zzbgz zzbgzVar = this.f23617b;
        if (zzbgzVar == null) {
            return null;
        }
        return zzbgzVar.getWebView();
    }

    /* renamed from: e */
    final /* synthetic */ void m18407e() {
        if (this.f23617b.mo14918k0() != null) {
            this.f23617b.mo14918k0().close();
        }
    }

    public zzbvz(zzbwz zzbwzVar, zzbgz zzbgzVar) {
        this.f23616a = zzbwzVar;
        this.f23617b = zzbgzVar;
    }
}
