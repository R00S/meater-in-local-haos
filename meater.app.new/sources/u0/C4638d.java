package u0;

import kotlin.Metadata;
import oa.InterfaceC4156a;

/* compiled from: PointerEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\b\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\b\u0012\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0007\u0010\n\"\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Lu0/d;", "", "", "positionChange", "downChange", "<init>", "(ZZ)V", "a", "Z", "b", "()Z", "d", "(Z)V", "getPositionChange$annotations", "()V", "c", "getDownChange$annotations", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC4156a
/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4638d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean positionChange;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean downChange;

    public C4638d(boolean z10, boolean z11) {
        this.positionChange = z10;
        this.downChange = z11;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getDownChange() {
        return this.downChange;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getPositionChange() {
        return this.positionChange;
    }

    public final void c(boolean z10) {
        this.downChange = z10;
    }

    public final void d(boolean z10) {
        this.positionChange = z10;
    }
}
