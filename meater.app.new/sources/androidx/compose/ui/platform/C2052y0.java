package androidx.compose.ui.platform;

import android.view.MotionEvent;
import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/y0;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "", "index", "", "a", "(Landroid/view/MotionEvent;I)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2052y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2052y0 f23488a = new C2052y0();

    private C2052y0() {
    }

    public final boolean a(MotionEvent event, int index) {
        float rawX = event.getRawX(index);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            float rawY = event.getRawY(index);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
