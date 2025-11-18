package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

@zzard
/* loaded from: classes2.dex */
public final class zzbgo extends zzbft implements zzsj<zzrv> {

    /* renamed from: i */
    private String f23004i;

    /* renamed from: j */
    private final zzbde f23005j;

    /* renamed from: k */
    private boolean f23006k;

    /* renamed from: l */
    private final C6851ka f23007l;

    /* renamed from: m */
    private final zzbfl f23008m;

    /* renamed from: n */
    private ByteBuffer f23009n;

    /* renamed from: o */
    private boolean f23010o;

    /* renamed from: p */
    private final Object f23011p;

    /* renamed from: q */
    private boolean f23012q;

    public zzbgo(zzbdf zzbdfVar, zzbde zzbdeVar) {
        super(zzbdfVar);
        this.f23005j = zzbdeVar;
        this.f23007l = new C6851ka();
        this.f23008m = new zzbfl();
        this.f23011p = new Object();
    }

    /* renamed from: D */
    private final void m17656D() {
        int iM15398b = (int) this.f23007l.m15398b();
        int iM17615a = (int) this.f23008m.m17615a(this.f23009n);
        int iPosition = this.f23009n.position();
        int iRound = Math.round(iM17615a * (iPosition / iM15398b));
        boolean z = iRound > 0;
        int iM17579G = zzbfa.m17579G();
        int iM17580H = zzbfa.m17580H();
        String str = this.f23004i;
        m17629k(str, mo17641z(str), iPosition, iM15398b, iRound, iM17615a, z, iM17579G, iM17580H);
    }

    /* renamed from: B */
    public final ByteBuffer m17657B() {
        synchronized (this.f23011p) {
            ByteBuffer byteBuffer = this.f23009n;
            if (byteBuffer != null && !this.f23010o) {
                byteBuffer.flip();
                this.f23010o = true;
            }
            this.f23006k = true;
        }
        return this.f23009n;
    }

    /* renamed from: C */
    public final String m17658C() {
        return this.f23004i;
    }

    /* renamed from: E */
    public final boolean m17659E() {
        return this.f23012q;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: b */
    public final void mo17627b() {
        this.f23006k = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo17593d(zzrv zzrvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    /* renamed from: n */
    public final /* synthetic */ void mo17603n(zzrv zzrvVar, zzry zzryVar) {
        zzrv zzrvVar2 = zzrvVar;
        if (zzrvVar2 instanceof zzsa) {
            this.f23007l.m15397a((zzsa) zzrvVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ void mo17604o(zzrv zzrvVar, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049 A[Catch: Exception -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:5:0x0026, B:11:0x0049, B:17:0x0096, B:42:0x00ed, B:43:0x0108, B:45:0x010b, B:46:0x012e), top: B:59:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7 A[Catch: Exception -> 0x013a, TRY_ENTER, TryCatch #1 {Exception -> 0x013a, blocks: (B:3:0x000d, B:9:0x0033, B:12:0x004c, B:13:0x0084, B:19:0x00a7, B:20:0x00a9), top: B:60:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:? -> B:53:0x0138). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo17640y(java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgo.mo17640y(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: z */
    protected final String mo17641z(String str) {
        String strValueOf = String.valueOf(super.mo17641z(str));
        return strValueOf.length() != 0 ? "cache:".concat(strValueOf) : new String("cache:");
    }
}
