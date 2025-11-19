package d8;

import d8.AbstractC3060d;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: d8.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3081y extends AbstractC3060d.a {

    /* renamed from: a, reason: collision with root package name */
    private int f39792a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39793b;

    /* renamed from: c, reason: collision with root package name */
    private byte f39794c;

    C3081y() {
    }

    @Override // d8.AbstractC3060d.a
    public final AbstractC3060d a() {
        if (this.f39794c == 3) {
            return new C3054A(this.f39792a, this.f39793b, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f39794c & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((this.f39794c & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // d8.AbstractC3060d.a
    public final AbstractC3060d.a b(boolean z10) {
        this.f39793b = z10;
        this.f39794c = (byte) (this.f39794c | 2);
        return this;
    }

    public final AbstractC3060d.a c(int i10) {
        this.f39792a = i10;
        this.f39794c = (byte) (this.f39794c | 1);
        return this;
    }
}
