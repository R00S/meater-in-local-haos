package d8;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: d8.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3054A extends AbstractC3060d {

    /* renamed from: a, reason: collision with root package name */
    private final int f39734a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39735b;

    /* synthetic */ C3054A(int i10, boolean z10, C3082z c3082z) {
        this.f39734a = i10;
        this.f39735b = z10;
    }

    @Override // d8.AbstractC3060d
    public final boolean a() {
        return this.f39735b;
    }

    @Override // d8.AbstractC3060d
    public final int b() {
        return this.f39734a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3060d) {
            AbstractC3060d abstractC3060d = (AbstractC3060d) obj;
            if (this.f39734a == abstractC3060d.b() && this.f39735b == abstractC3060d.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f39734a ^ 1000003) * 1000003) ^ (true != this.f39735b ? 1237 : 1231);
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f39734a + ", allowAssetPackDeletion=" + this.f39735b + "}";
    }
}
