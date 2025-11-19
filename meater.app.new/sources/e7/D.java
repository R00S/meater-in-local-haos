package e7;

import c7.C2335d;
import g7.C3443n;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
final class D {

    /* renamed from: a, reason: collision with root package name */
    private final C3212b f40603a;

    /* renamed from: b, reason: collision with root package name */
    private final C2335d f40604b;

    /* synthetic */ D(C3212b c3212b, C2335d c2335d, C3210C c3210c) {
        this.f40603a = c3212b;
        this.f40604b = c2335d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof D)) {
            D d10 = (D) obj;
            if (C3443n.a(this.f40603a, d10.f40603a) && C3443n.a(this.f40604b, d10.f40604b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C3443n.b(this.f40603a, this.f40604b);
    }

    public final String toString() {
        return C3443n.c(this).a("key", this.f40603a).a("feature", this.f40604b).toString();
    }
}
