package f2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class G implements Executor {

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Handler f41213B;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f41213B.post(runnable);
    }
}
