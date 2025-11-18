package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2773j2 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ int f35407B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f35408C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ Object f35409D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ Object f35410E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ Object f35411F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2759h2 f35412G;

    RunnableC2773j2(C2759h2 c2759h2, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f35407B = i10;
        this.f35408C = str;
        this.f35409D = obj;
        this.f35410E = obj2;
        this.f35411F = obj3;
        this.f35412G = c2759h2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2835s2 c2835s2H = this.f35412G.f35457a.H();
        if (!c2835s2H.t()) {
            this.f35412G.z(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f35412G.f35371c == 0) {
            if (this.f35412G.c().v()) {
                this.f35412G.f35371c = 'C';
            } else {
                this.f35412G.f35371c = 'c';
            }
        }
        if (this.f35412G.f35372d < 0) {
            this.f35412G.f35372d = 114010L;
        }
        String strSubstring = "2" + "01VDIWEA?".charAt(this.f35407B) + this.f35412G.f35371c + this.f35412G.f35372d + ":" + C2759h2.y(true, this.f35408C, this.f35409D, this.f35410E, this.f35411F);
        if (strSubstring.length() > 1024) {
            strSubstring = this.f35408C.substring(0, 1024);
        }
        C2863w2 c2863w2 = c2835s2H.f35600f;
        if (c2863w2 != null) {
            c2863w2.b(strSubstring, 1L);
        }
    }
}
