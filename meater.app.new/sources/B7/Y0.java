package B7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import d7.InterfaceC3051e;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class Y0 extends X1 {
    Y0(C0888a1 c0888a1, com.google.android.gms.common.api.c cVar) {
        super(cVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ InterfaceC3051e d(Status status) {
        return new Z0(status, new ArrayList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    protected final /* synthetic */ void m(a.b bVar) {
        ((N0) ((K1) bVar).D()).v1(new D1(this));
    }
}
