package A7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import d7.InterfaceC3051e;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: A7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0854h extends f7.e<Object> implements InterfaceC3051e {

    /* renamed from: E, reason: collision with root package name */
    private final Status f1009E;

    public C0854h(DataHolder dataHolder) {
        super(dataHolder);
        this.f1009E = new Status(dataHolder.v0());
    }

    @Override // f7.e
    protected final String K() {
        return "path";
    }

    @Override // d7.InterfaceC3051e
    public Status a0() {
        return this.f1009E;
    }

    @Override // f7.e
    protected final /* bridge */ /* synthetic */ Object x(int i10, int i11) {
        return new B7.C(this.f41374B, i10, i11);
    }
}
