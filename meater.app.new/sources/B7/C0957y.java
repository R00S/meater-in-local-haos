package B7;

import A7.InterfaceC0852f;
import A7.InterfaceC0855i;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0957y implements InterfaceC0852f.a {

    /* renamed from: B, reason: collision with root package name */
    private final Status f1892B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC0855i f1893C;

    public C0957y(Status status, InterfaceC0855i interfaceC0855i) {
        this.f1892B = status;
        this.f1893C = interfaceC0855i;
    }

    @Override // d7.InterfaceC3051e
    public final Status a0() {
        return this.f1892B;
    }

    @Override // A7.InterfaceC0852f.a
    public final InterfaceC0855i y() {
        return this.f1893C;
    }
}
