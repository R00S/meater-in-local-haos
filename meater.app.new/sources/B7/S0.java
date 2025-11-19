package B7;

import A7.InterfaceC0859m;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class S0 implements InterfaceC0859m.a {

    /* renamed from: B, reason: collision with root package name */
    private final Status f1789B;

    /* renamed from: C, reason: collision with root package name */
    private final int f1790C;

    public S0(Status status, int i10) {
        this.f1789B = status;
        this.f1790C = i10;
    }

    @Override // d7.InterfaceC3051e
    public final Status a0() {
        return this.f1789B;
    }

    @Override // A7.InterfaceC0859m.a
    public final int z() {
        return this.f1790C;
    }
}
