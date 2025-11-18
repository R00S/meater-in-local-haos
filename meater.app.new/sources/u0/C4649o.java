package u0;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PointerEvent.android.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\u00020\u00148\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0010\u0010\fR\u001d\u0010\u0019\u001a\u00020\u00178\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0018\u0010\fR0\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8\u0006@@X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010!\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lu0/o;", "", "", "Lu0/z;", "changes", "Lu0/g;", "internalPointerEvent", "<init>", "(Ljava/util/List;Lu0/g;)V", "(Ljava/util/List;)V", "Lu0/r;", "a", "()I", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lu0/g;", "d", "()Lu0/g;", "Lu0/n;", "I", "buttons", "Lu0/L;", "getKeyboardModifiers-k7X9c1A", "keyboardModifiers", "<set-?>", "e", "f", "g", "(I)V", "type", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4649o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<PointerInputChange> changes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C4641g internalPointerEvent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int buttons;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int keyboardModifiers;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int type;

    public C4649o(List<PointerInputChange> list, C4641g c4641g) {
        this.changes = list;
        this.internalPointerEvent = c4641g;
        MotionEvent motionEventE = e();
        this.buttons = C4648n.a(motionEventE != null ? motionEventE.getButtonState() : 0);
        MotionEvent motionEventE2 = e();
        this.keyboardModifiers = C4626L.b(motionEventE2 != null ? motionEventE2.getMetaState() : 0);
        this.type = a();
    }

    private final int a() {
        MotionEvent motionEventE = e();
        if (motionEventE != null) {
            int actionMasked = motionEventE.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                        }
                        return C4652r.INSTANCE.d();
                    }
                    return C4652r.INSTANCE.c();
                }
                return C4652r.INSTANCE.e();
            }
            return C4652r.INSTANCE.d();
        }
        List<PointerInputChange> list = this.changes;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputChange c4660z = list.get(i10);
            if (C4650p.d(c4660z)) {
                return C4652r.INSTANCE.e();
            }
            if (C4650p.b(c4660z)) {
                return C4652r.INSTANCE.d();
            }
        }
        return C4652r.INSTANCE.c();
    }

    /* renamed from: b, reason: from getter */
    public final int getButtons() {
        return this.buttons;
    }

    public final List<PointerInputChange> c() {
        return this.changes;
    }

    /* renamed from: d, reason: from getter */
    public final C4641g getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    public final MotionEvent e() {
        C4641g c4641g = this.internalPointerEvent;
        if (c4641g != null) {
            return c4641g.c();
        }
        return null;
    }

    /* renamed from: f, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final void g(int i10) {
        this.type = i10;
    }

    public C4649o(List<PointerInputChange> list) {
        this(list, null);
    }
}
