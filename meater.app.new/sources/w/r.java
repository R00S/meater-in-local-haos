package w;

import A0.C0830i;
import A0.InterfaceC0829h;
import androidx.compose.ui.platform.C2013e0;
import b0.i;
import kotlin.Metadata;
import r0.C4331a;
import r0.InterfaceC4332b;

/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lw/r;", "Lb0/i$c;", "LA0/h;", "Lg0/j;", "<init>", "()V", "Landroidx/compose/ui/focus/g;", "focusProperties", "Loa/F;", "j0", "(Landroidx/compose/ui/focus/g;)V", "", "O", "Z", "O1", "()Z", "shouldAutoInvalidate", "Lr0/b;", "j2", "()Lr0/b;", "inputModeManager", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r extends i.c implements InterfaceC0829h, g0.j {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    private final InterfaceC4332b j2() {
        return (InterfaceC4332b) C0830i.a(this, C2013e0.g());
    }

    @Override // b0.i.c
    /* renamed from: O1, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // g0.j
    public void j0(androidx.compose.ui.focus.g focusProperties) {
        focusProperties.y(!C4331a.f(j2().a(), C4331a.INSTANCE.b()));
    }
}
