package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcwy implements zzdti<String> {

    /* renamed from: a */
    private final zzcwx f25216a;

    public zzcwy(zzcwx zzcwxVar) {
        this.f25216a = zzcwxVar;
    }

    /* renamed from: a */
    public static String m19012a(zzcwx zzcwxVar) {
        return (String) zzdto.m19874b(zzcwxVar.m19005a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return m19012a(this.f25216a);
    }
}
