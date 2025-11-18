package i8;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import z7.C5209k;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* loaded from: classes2.dex */
final class f extends ResultReceiver {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ C5209k f43152B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, Handler handler, C5209k c5209k) {
        super(handler);
        this.f43152B = c5209k;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f43152B.e(null);
    }
}
