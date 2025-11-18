package i8;

import android.app.PendingIntent;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* renamed from: i8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3634d extends AbstractC3631a {

    /* renamed from: B, reason: collision with root package name */
    private final PendingIntent f43150B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f43151C;

    C3634d(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f43150B = pendingIntent;
        this.f43151C = z10;
    }

    @Override // i8.AbstractC3631a
    final PendingIntent a() {
        return this.f43150B;
    }

    @Override // i8.AbstractC3631a
    final boolean b() {
        return this.f43151C;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3631a) {
            AbstractC3631a abstractC3631a = (AbstractC3631a) obj;
            if (this.f43150B.equals(abstractC3631a.a()) && this.f43151C == abstractC3631a.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f43150B.hashCode() ^ 1000003) * 1000003) ^ (true != this.f43151C ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f43150B.toString() + ", isNoOp=" + this.f43151C + "}";
    }
}
