package androidx.compose.ui.input.key;

import Ba.l;
import android.view.KeyEvent;
import b0.i;
import kotlin.Metadata;
import s0.C4417b;
import s0.e;

/* compiled from: KeyInputModifier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/key/b;", "Ls0/e;", "Lb0/i$c;", "Lkotlin/Function1;", "Ls0/b;", "", "onEvent", "onPreEvent", "<init>", "(LBa/l;LBa/l;)V", "event", "p0", "(Landroid/view/KeyEvent;)Z", "Q", "O", "LBa/l;", "getOnEvent", "()LBa/l;", "j2", "(LBa/l;)V", "P", "getOnPreEvent", "k2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class b extends i.c implements e {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private l<? super C4417b, Boolean> onEvent;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private l<? super C4417b, Boolean> onPreEvent;

    public b(l<? super C4417b, Boolean> lVar, l<? super C4417b, Boolean> lVar2) {
        this.onEvent = lVar;
        this.onPreEvent = lVar2;
    }

    @Override // s0.e
    public boolean Q(KeyEvent event) {
        l<? super C4417b, Boolean> lVar = this.onPreEvent;
        if (lVar != null) {
            return lVar.invoke(C4417b.a(event)).booleanValue();
        }
        return false;
    }

    public final void j2(l<? super C4417b, Boolean> lVar) {
        this.onEvent = lVar;
    }

    public final void k2(l<? super C4417b, Boolean> lVar) {
        this.onPreEvent = lVar;
    }

    @Override // s0.e
    public boolean p0(KeyEvent event) {
        l<? super C4417b, Boolean> lVar = this.onEvent;
        if (lVar != null) {
            return lVar.invoke(C4417b.a(event)).booleanValue();
        }
        return false;
    }
}
