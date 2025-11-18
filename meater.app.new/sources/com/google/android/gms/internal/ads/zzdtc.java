package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class zzdtc {
    /* renamed from: b */
    public static zzdtc m19860b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzdsx(cls.getSimpleName()) : new zzdsz(cls.getSimpleName());
    }

    /* renamed from: a */
    public abstract void mo19858a(String str);
}
