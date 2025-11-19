package androidx.compose.ui.focus;

import b0.i;
import kotlin.Metadata;

/* compiled from: FocusProperties.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/focus/j;", "Lg0/j;", "Lb0/i$c;", "Lg0/l;", "focusPropertiesScope", "<init>", "(Lg0/l;)V", "Landroidx/compose/ui/focus/g;", "focusProperties", "Loa/F;", "j0", "(Landroidx/compose/ui/focus/g;)V", "O", "Lg0/l;", "getFocusPropertiesScope", "()Lg0/l;", "j2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class j extends i.c implements g0.j {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private g0.l focusPropertiesScope;

    public j(g0.l lVar) {
        this.focusPropertiesScope = lVar;
    }

    @Override // g0.j
    public void j0(g focusProperties) {
        this.focusPropertiesScope.b(focusProperties);
    }

    public final void j2(g0.l lVar) {
        this.focusPropertiesScope = lVar;
    }
}
