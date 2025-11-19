package i8;

import android.app.PendingIntent;
import android.os.Bundle;
import z7.C5209k;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* loaded from: classes2.dex */
final class k extends j {
    k(l lVar, C5209k c5209k, String str) {
        super(lVar, new j8.i("OnRequestInstallCallback"), c5209k);
    }

    @Override // i8.j, j8.h
    public final void i(Bundle bundle) {
        super.i(bundle);
        this.f43158C.e(new C3634d((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
