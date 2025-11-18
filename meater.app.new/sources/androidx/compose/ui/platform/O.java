package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/O;", "", "LXb/I;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "a", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "B", "LXb/I;", "coroutineScope", "Lb0/o;", "Landroidx/compose/ui/platform/p0;", "C", "Ljava/util/concurrent/atomic/AtomicReference;", "methodSessionMutex", "Lta/g;", "getCoroutineContext", "()Lta/g;", "coroutineContext", "", "b", "()Z", "isReadyForConnection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O implements Xb.I {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Xb.I coroutineScope;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference methodSessionMutex;

    public final InputConnection a(EditorInfo outAttrs) {
        C2035p0 c2035p0 = (C2035p0) b0.o.c(this.methodSessionMutex);
        if (c2035p0 != null) {
            return c2035p0.a(outAttrs);
        }
        return null;
    }

    public final boolean b() {
        C2035p0 c2035p0 = (C2035p0) b0.o.c(this.methodSessionMutex);
        return c2035p0 != null && c2035p0.b();
    }

    @Override // Xb.I
    public ta.g getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }
}
