package H3;

import F3.j;
import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import r1.InterfaceC4334a;

/* compiled from: ExtensionWindowBackendApi0.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LH3/c;", "LG3/a;", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "executor", "Lr1/a;", "LF3/j;", "callback", "Loa/F;", "a", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Lr1/a;)V", "b", "(Lr1/a;)V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c implements G3.a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC4334a callback) {
        C3862t.g(callback, "$callback");
        callback.accept(new j(r.m()));
    }

    @Override // G3.a
    public void a(Context context, Executor executor, final InterfaceC4334a<j> callback) {
        C3862t.g(context, "context");
        C3862t.g(executor, "executor");
        C3862t.g(callback, "callback");
        executor.execute(new Runnable() { // from class: H3.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(callback);
            }
        });
    }

    @Override // G3.a
    public void b(InterfaceC4334a<j> callback) {
        C3862t.g(callback, "callback");
    }
}
