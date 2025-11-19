package androidx.compose.ui.input.rotary;

import Ba.l;
import b0.i;
import kotlin.Metadata;
import w0.InterfaceC4969a;
import w0.RotaryScrollEvent;

/* compiled from: RotaryInputModifier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/rotary/b;", "Lw0/a;", "Lb0/i$c;", "Lkotlin/Function1;", "Lw0/b;", "", "onEvent", "onPreEvent", "<init>", "(LBa/l;LBa/l;)V", "event", "K0", "(Lw0/b;)Z", "v0", "O", "LBa/l;", "getOnEvent", "()LBa/l;", "j2", "(LBa/l;)V", "P", "getOnPreEvent", "k2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class b extends i.c implements InterfaceC4969a {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private l<? super RotaryScrollEvent, Boolean> onEvent;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private l<? super RotaryScrollEvent, Boolean> onPreEvent;

    public b(l<? super RotaryScrollEvent, Boolean> lVar, l<? super RotaryScrollEvent, Boolean> lVar2) {
        this.onEvent = lVar;
        this.onPreEvent = lVar2;
    }

    @Override // w0.InterfaceC4969a
    public boolean K0(RotaryScrollEvent event) {
        l<? super RotaryScrollEvent, Boolean> lVar = this.onEvent;
        if (lVar != null) {
            return lVar.invoke(event).booleanValue();
        }
        return false;
    }

    public final void j2(l<? super RotaryScrollEvent, Boolean> lVar) {
        this.onEvent = lVar;
    }

    public final void k2(l<? super RotaryScrollEvent, Boolean> lVar) {
        this.onPreEvent = lVar;
    }

    @Override // w0.InterfaceC4969a
    public boolean v0(RotaryScrollEvent event) {
        l<? super RotaryScrollEvent, Boolean> lVar = this.onPreEvent;
        if (lVar != null) {
            return lVar.invoke(event).booleanValue();
        }
        return false;
    }
}
