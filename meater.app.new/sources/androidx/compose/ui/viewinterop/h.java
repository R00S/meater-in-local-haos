package androidx.compose.ui.viewinterop;

import b0.i;
import g0.j;
import kotlin.Metadata;

/* compiled from: FocusGroupNode.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/viewinterop/h;", "Lb0/i$c;", "Lg0/j;", "<init>", "()V", "Landroidx/compose/ui/focus/g;", "focusProperties", "Loa/F;", "j0", "(Landroidx/compose/ui/focus/g;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class h extends i.c implements j {
    @Override // g0.j
    public void j0(androidx.compose.ui.focus.g focusProperties) {
        focusProperties.y(getNode().getIsAttached() && f.g(this).hasFocusable());
    }
}
