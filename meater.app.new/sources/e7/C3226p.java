package e7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import d7.AbstractC3049c;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: e7.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3226p implements AbstractC3049c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f40726a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f40727b;

    C3226p(r rVar, BasePendingResult basePendingResult) {
        this.f40727b = rVar;
        this.f40726a = basePendingResult;
    }

    @Override // d7.AbstractC3049c.a
    public final void a(Status status) {
        this.f40727b.f40730a.remove(this.f40726a);
    }
}
