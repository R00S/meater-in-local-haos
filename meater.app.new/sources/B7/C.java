package B7;

import A7.InterfaceC0855i;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class C extends f7.d {

    /* renamed from: E, reason: collision with root package name */
    private final int f1716E;

    public C(DataHolder dataHolder, int i10, int i11) {
        super(dataHolder, i10);
        this.f1716E = i11;
    }

    public final InterfaceC0855i f() {
        return new G(this.f41377B, this.f41378C, this.f1716E);
    }

    public final String toString() {
        return "DataEventRef{ type=" + (b("event_type") == 1 ? "changed" : b("event_type") == 2 ? "deleted" : "unknown") + ", dataitem=" + f().toString() + " }";
    }
}
