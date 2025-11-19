package i8;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import z7.AbstractC5208j;
import z7.C5209k;
import z7.C5211m;

/* compiled from: com.google.android.play:review@@2.0.2 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class g implements InterfaceC3632b {

    /* renamed from: a, reason: collision with root package name */
    private final l f43153a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f43154b = new Handler(Looper.getMainLooper());

    g(l lVar) {
        this.f43153a = lVar;
    }

    @Override // i8.InterfaceC3632b
    public final AbstractC5208j<Void> a(Activity activity, AbstractC3631a abstractC3631a) {
        if (abstractC3631a.b()) {
            return C5211m.e(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", abstractC3631a.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C5209k c5209k = new C5209k();
        intent.putExtra("result_receiver", new f(this, this.f43154b, c5209k));
        activity.startActivity(intent);
        return c5209k.a();
    }

    @Override // i8.InterfaceC3632b
    public final AbstractC5208j<AbstractC3631a> b() {
        return this.f43153a.a();
    }
}
