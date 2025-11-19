package androidx.compose.ui.layout;

import A0.InterfaceC0840t;
import Ba.l;
import b0.i;
import kotlin.Metadata;
import oa.C4153F;
import y0.InterfaceC5116v;

/* compiled from: OnGloballyPositionedModifier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/d;", "Lb0/i$c;", "LA0/t;", "Lkotlin/Function1;", "Ly0/v;", "Loa/F;", "callback", "<init>", "(LBa/l;)V", "coordinates", "F", "(Ly0/v;)V", "O", "LBa/l;", "getCallback", "()LBa/l;", "j2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class d extends i.c implements InterfaceC0840t {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private l<? super InterfaceC5116v, C4153F> callback;

    public d(l<? super InterfaceC5116v, C4153F> lVar) {
        this.callback = lVar;
    }

    @Override // A0.InterfaceC0840t
    public void F(InterfaceC5116v coordinates) {
        this.callback.invoke(coordinates);
    }

    public final void j2(l<? super InterfaceC5116v, C4153F> lVar) {
        this.callback = lVar;
    }
}
