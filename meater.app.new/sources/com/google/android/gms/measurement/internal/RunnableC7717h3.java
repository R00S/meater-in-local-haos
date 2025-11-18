package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.h3 */
/* loaded from: classes2.dex */
final class RunnableC7717h3 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ int f28676f;

    /* renamed from: g */
    private final /* synthetic */ String f28677g;

    /* renamed from: h */
    private final /* synthetic */ Object f28678h;

    /* renamed from: i */
    private final /* synthetic */ Object f28679i;

    /* renamed from: j */
    private final /* synthetic */ Object f28680j;

    /* renamed from: k */
    private final /* synthetic */ zzet f28681k;

    RunnableC7717h3(zzet zzetVar, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.f28681k = zzetVar;
        this.f28676f = i2;
        this.f28677g = str;
        this.f28678h = obj;
        this.f28679i = obj2;
        this.f28680j = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7807r3 c7807r3M23211B = this.f28681k.f28874a.m23211B();
        if (!c7807r3M23211B.m22811t()) {
            this.f28681k.m23134A(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f28681k.f29212c == 0) {
            if (this.f28681k.mo22841n().m23567E()) {
                zzet zzetVar = this.f28681k;
                zzetVar.mo22832G();
                zzetVar.f29212c = 'C';
            } else {
                zzet zzetVar2 = this.f28681k;
                zzetVar2.mo22832G();
                zzetVar2.f29212c = 'c';
            }
        }
        if (this.f28681k.f29213d < 0) {
            zzet zzetVar3 = this.f28681k;
            zzetVar3.f29213d = zzetVar3.mo22841n().m23565C();
        }
        char cCharAt = "01VDIWEA?".charAt(this.f28676f);
        char c2 = this.f28681k.f29212c;
        long j2 = this.f28681k.f29213d;
        String strM23133z = zzet.m23133z(true, this.f28677g, this.f28678h, this.f28679i, this.f28680j);
        StringBuilder sb = new StringBuilder(String.valueOf(strM23133z).length() + 24);
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c2);
        sb.append(j2);
        sb.append(":");
        sb.append(strM23133z);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = this.f28677g.substring(0, 1024);
        }
        c7807r3M23211B.f28852e.m23164b(string, 1L);
    }
}
