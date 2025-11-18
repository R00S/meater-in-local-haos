package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class W2 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ String f35195B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f35196C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ String f35197D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ long f35198E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ S2 f35199F;

    W2(S2 s22, String str, String str2, String str3, long j10) {
        this.f35195B = str;
        this.f35196C = str2;
        this.f35197D = str3;
        this.f35198E = j10;
        this.f35199F = s22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f35195B;
        if (str == null) {
            this.f35199F.f35164B.N(this.f35196C, null);
        } else {
            this.f35199F.f35164B.N(this.f35196C, new C2782k4(this.f35197D, str, this.f35198E));
        }
    }
}
