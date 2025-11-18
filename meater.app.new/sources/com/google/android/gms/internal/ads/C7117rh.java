package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rh */
/* loaded from: classes2.dex */
final class C7117rh<T> implements zzaho<Object> {

    /* renamed from: a */
    private final WeakReference<T> f20450a;

    /* renamed from: b */
    private final String f20451b;

    /* renamed from: c */
    private final zzaho<T> f20452c;

    /* renamed from: d */
    private final /* synthetic */ zzccj f20453d;

    private C7117rh(zzccj zzccjVar, WeakReference<T> weakReference, String str, zzaho<T> zzahoVar) {
        this.f20453d = zzccjVar;
        this.f20450a = weakReference;
        this.f20451b = str;
        this.f20452c = zzahoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) {
        T t = this.f20450a.get();
        if (t == null) {
            this.f20453d.m18669h(this.f20451b, this);
        } else {
            this.f20452c.mo14739a(t, map);
        }
    }

    /* synthetic */ C7117rh(zzccj zzccjVar, WeakReference weakReference, String str, zzaho zzahoVar, C6895lh c6895lh) {
        this(zzccjVar, weakReference, str, zzahoVar);
    }
}
