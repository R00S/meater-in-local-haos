package androidx.compose.ui.platform;

import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import u0.C4626L;
import u0.C4653s;

/* compiled from: WindowInfo.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR0\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8W@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0006\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/r1;", "Landroidx/compose/ui/platform/q1;", "<init>", "()V", "LO/p0;", "", "a", "LO/p0;", "_isWindowFocused", "value", "isWindowFocused", "()Z", "b", "(Z)V", "Lu0/L;", "getKeyboardModifiers-k7X9c1A", "()I", "(I)V", "getKeyboardModifiers-k7X9c1A$annotations", "keyboardModifiers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r1 implements q1 {

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC1563p0<C4626L> f23341c = kotlin.r1.c(C4626L.a(C4653s.a()), null, 2, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0<Boolean> _isWindowFocused = kotlin.r1.c(Boolean.FALSE, null, 2, null);

    public void a(int i10) {
        f23341c.setValue(C4626L.a(i10));
    }

    public void b(boolean z10) {
        this._isWindowFocused.setValue(Boolean.valueOf(z10));
    }
}
