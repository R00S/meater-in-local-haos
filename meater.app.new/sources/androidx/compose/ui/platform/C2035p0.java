package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/p0;", "", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "a", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "Ljava/lang/Object;", "lock", "", "b", "Z", "disposed", "()Z", "isActive", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2035p0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    public final InputConnection a(EditorInfo outAttrs) {
        synchronized (this.lock) {
            if (!this.disposed) {
                throw null;
            }
        }
        return null;
    }

    public final boolean b() {
        return !this.disposed;
    }
}
