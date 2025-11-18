package A7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import d7.InterfaceC3051e;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: A7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0857k extends f7.e<InterfaceC0855i> implements InterfaceC3051e {

    /* renamed from: E, reason: collision with root package name */
    private final Status f1010E;

    public C0857k(DataHolder dataHolder) {
        super(dataHolder);
        this.f1010E = new Status(dataHolder.v0());
    }

    @Override // f7.e
    protected final String K() {
        return "path";
    }

    @Override // d7.InterfaceC3051e
    public Status a0() {
        return this.f1010E;
    }

    @Override // f7.e
    protected final /* bridge */ /* synthetic */ InterfaceC0855i x(int i10, int i11) {
        return new B7.G(this.f41374B, i10, i11);
    }
}
