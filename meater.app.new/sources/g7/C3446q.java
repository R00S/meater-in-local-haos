package g7;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: g7.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3446q {

    /* renamed from: b, reason: collision with root package name */
    private static C3446q f42100b;

    /* renamed from: c, reason: collision with root package name */
    private static final r f42101c = new r(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private r f42102a;

    private C3446q() {
    }

    public static synchronized C3446q b() {
        try {
            if (f42100b == null) {
                f42100b = new C3446q();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f42100b;
    }

    public r a() {
        return this.f42102a;
    }

    public final synchronized void c(r rVar) {
        if (rVar == null) {
            this.f42102a = f42101c;
            return;
        }
        r rVar2 = this.f42102a;
        if (rVar2 == null || rVar2.G0() < rVar.G0()) {
            this.f42102a = rVar;
        }
    }
}
