package B7;

import A7.InterfaceC0862p;
import A7.InterfaceC0863q;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class Z0 implements InterfaceC0863q.a {

    /* renamed from: B, reason: collision with root package name */
    private final Status f1809B;

    /* renamed from: C, reason: collision with root package name */
    private final List f1810C;

    public Z0(Status status, List list) {
        this.f1809B = status;
        this.f1810C = list;
    }

    @Override // d7.InterfaceC3051e
    public final Status a0() {
        return this.f1809B;
    }

    @Override // A7.InterfaceC0863q.a
    public final List<InterfaceC0862p> j() {
        return this.f1810C;
    }
}
