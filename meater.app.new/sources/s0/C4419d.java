package s0;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: KeyEvent.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\f\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b*\n\u0010\u0010\"\u00020\u000f2\u00020\u000f¨\u0006\u0011"}, d2 = {"Ls0/b;", "Ls0/a;", "a", "(Landroid/view/KeyEvent;)J", "key", "Ls0/c;", "b", "(Landroid/view/KeyEvent;)I", "type", "", "c", "(Landroid/view/KeyEvent;)Z", "isCtrlPressed", "d", "isShiftPressed", "Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4419d {
    public static final long a(KeyEvent keyEvent) {
        return f.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        return action != 0 ? action != 1 ? C4418c.INSTANCE.c() : C4418c.INSTANCE.b() : C4418c.INSTANCE.a();
    }

    public static final boolean c(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean d(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
