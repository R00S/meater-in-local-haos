package B7;

import A7.C0865t;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import d7.InterfaceC3051e;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0954x extends X1 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ C0865t f1889q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0954x(C0960z c0960z, com.google.android.gms.common.api.c cVar, C0865t c0865t) {
        super(cVar);
        this.f1889q = c0865t;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ InterfaceC3051e d(Status status) {
        return new C0957y(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.a
    protected final /* synthetic */ void m(a.b bVar) throws Throwable {
        ((K1) bVar).l0(this, this.f1889q);
    }
}
