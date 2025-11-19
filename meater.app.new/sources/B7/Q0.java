package B7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import d7.InterfaceC3051e;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class Q0 extends X1 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f1777q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f1778r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ byte[] f1779s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q0(T0 t02, com.google.android.gms.common.api.c cVar, String str, String str2, byte[] bArr) {
        super(cVar);
        this.f1777q = str;
        this.f1778r = str2;
        this.f1779s = bArr;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ InterfaceC3051e d(Status status) {
        return new S0(status, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    protected final /* bridge */ /* synthetic */ void m(a.b bVar) {
        ((N0) ((K1) bVar).D()).x1(new G1(this), this.f1777q, this.f1778r, this.f1779s);
    }
}
