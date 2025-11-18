package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

@zzard
/* loaded from: classes2.dex */
public final class zzbgg extends zzbft {

    /* renamed from: i */
    private String f22991i;

    /* renamed from: j */
    private final zzbde f22992j;

    /* renamed from: k */
    private boolean f22993k;

    /* renamed from: l */
    private final zzbfl f22994l;

    /* renamed from: m */
    private ByteBuffer f22995m;

    /* renamed from: n */
    private boolean f22996n;

    /* renamed from: o */
    private final Object f22997o;

    /* renamed from: p */
    private boolean f22998p;

    public zzbgg(zzbdf zzbdfVar, zzbde zzbdeVar) {
        super(zzbdfVar);
        this.f22992j = zzbdeVar;
        this.f22994l = new zzbfl();
        this.f22997o = new Object();
    }

    /* renamed from: D */
    private final void m17646D() {
        int iPosition = this.f22995m.position();
        boolean z = iPosition > 0;
        int iM17497g = zzbdk.m17497g();
        int iM17498h = zzbdk.m17498h();
        String str = this.f22991i;
        m17630l(str, mo17641z(str), iPosition, 0, z, iM17497g, iM17498h);
    }

    /* renamed from: B */
    public final ByteBuffer m17647B() {
        synchronized (this.f22997o) {
            ByteBuffer byteBuffer = this.f22995m;
            if (byteBuffer != null && !this.f22996n) {
                byteBuffer.flip();
                this.f22996n = true;
            }
            this.f22993k = true;
        }
        return this.f22995m;
    }

    /* renamed from: C */
    public final String m17648C() {
        return this.f22991i;
    }

    /* renamed from: E */
    public final boolean m17649E() {
        return this.f22998p;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: b */
    public final void mo17627b() {
        this.f22993k = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047 A[Catch: Exception -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:5:0x0024, B:11:0x0047, B:17:0x0094, B:42:0x00eb, B:43:0x0106, B:45:0x0109, B:46:0x012c), top: B:59:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5 A[Catch: Exception -> 0x0138, TRY_ENTER, TryCatch #2 {Exception -> 0x0138, blocks: (B:3:0x000d, B:9:0x0031, B:12:0x004a, B:13:0x0082, B:19:0x00a5, B:20:0x00a7), top: B:62:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:? -> B:53:0x0136). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo17640y(java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgg.mo17640y(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: z */
    protected final String mo17641z(String str) {
        String strValueOf = String.valueOf(super.mo17641z(str));
        return strValueOf.length() != 0 ? "cache:".concat(strValueOf) : new String("cache:");
    }
}
