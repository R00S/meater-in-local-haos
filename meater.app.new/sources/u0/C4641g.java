package u0;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;
import s.C4411v;

/* compiled from: InternalPointerEvent.android.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lu0/g;", "", "Ls/v;", "Lu0/z;", "changes", "Lu0/B;", "pointerInputEvent", "<init>", "(Ls/v;Lu0/B;)V", "Lu0/y;", "pointerId", "", "a", "(J)Z", "Ls/v;", "b", "()Ls/v;", "Lu0/B;", "getPointerInputEvent", "()Lu0/B;", "c", "Z", "d", "()Z", "e", "(Z)V", "suppressMovementConsumption", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4641g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4411v<PointerInputChange> changes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C4616B pointerInputEvent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean suppressMovementConsumption;

    public C4641g(C4411v<PointerInputChange> c4411v, C4616B c4616b) {
        this.changes = c4411v;
        this.pointerInputEvent = c4616b;
    }

    public final boolean a(long pointerId) {
        PointerInputEventData c4617c;
        List<PointerInputEventData> listB = this.pointerInputEvent.b();
        int size = listB.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                c4617c = null;
                break;
            }
            c4617c = listB.get(i10);
            if (C4659y.d(c4617c.getId(), pointerId)) {
                break;
            }
            i10++;
        }
        PointerInputEventData c4617c2 = c4617c;
        if (c4617c2 != null) {
            return c4617c2.getActiveHover();
        }
        return false;
    }

    public final C4411v<PointerInputChange> b() {
        return this.changes;
    }

    public final MotionEvent c() {
        return this.pointerInputEvent.getMotionEvent();
    }

    /* renamed from: d, reason: from getter */
    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    public final void e(boolean z10) {
        this.suppressMovementConsumption = z10;
    }
}
