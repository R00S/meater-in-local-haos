package i8;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Map;
import z7.C5209k;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* loaded from: classes2.dex */
final class i extends j8.j {

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ C5209k f43155C;

    /* renamed from: D, reason: collision with root package name */
    final /* synthetic */ l f43156D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(l lVar, C5209k c5209k, C5209k c5209k2) {
        super(c5209k);
        this.f43155C = c5209k2;
        this.f43156D = lVar;
    }

    @Override // j8.j
    protected final void a() {
        try {
            j8.f fVar = (j8.f) this.f43156D.f43161a.e();
            String str = this.f43156D.f43162b;
            Bundle bundle = new Bundle();
            Map mapA = m.a();
            bundle.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
            if (mapA.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
            }
            if (mapA.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
            }
            l lVar = this.f43156D;
            fVar.y0(str, bundle, new k(lVar, this.f43155C, lVar.f43162b));
        } catch (RemoteException e10) {
            l.f43160c.b(e10, "error requesting in-app review for %s", this.f43156D.f43162b);
            this.f43155C.d(new RuntimeException(e10));
        }
    }
}
