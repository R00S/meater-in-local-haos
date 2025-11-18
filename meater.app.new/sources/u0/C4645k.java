package u0;

import android.view.MotionEvent;
import h0.C3477h;
import kotlin.Metadata;

/* compiled from: MotionEventAdapter.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Lu0/k;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "motionEvent", "", "index", "Lh0/g;", "a", "(Landroid/view/MotionEvent;I)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4645k {

    /* renamed from: a, reason: collision with root package name */
    public static final C4645k f50273a = new C4645k();

    private C4645k() {
    }

    public final long a(MotionEvent motionEvent, int index) {
        return C3477h.a(motionEvent.getRawX(index), motionEvent.getRawY(index));
    }
}
