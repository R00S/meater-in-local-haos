package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* renamed from: com.google.android.gms.internal.ads.fv */
/* loaded from: classes2.dex */
final class C6687fv implements InterfaceC7390yv {

    /* renamed from: a */
    private static final C6687fv f18917a = new C6687fv();

    private C6687fv() {
    }

    /* renamed from: c */
    public static C6687fv m15150c() {
        return f18917a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7390yv
    /* renamed from: a */
    public final InterfaceC7353xv mo15151a(Class<?> cls) {
        if (!zzdob.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC7353xv) zzdob.m19724w(cls.asSubclass(zzdob.class)).mo17725q(zzdob.zze.f25760c, null, null);
        } catch (Exception e2) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7390yv
    /* renamed from: b */
    public final boolean mo15152b(Class<?> cls) {
        return zzdob.class.isAssignableFrom(cls);
    }
}
