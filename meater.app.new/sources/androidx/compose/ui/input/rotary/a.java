package androidx.compose.ui.input.rotary;

import Ba.l;
import b0.i;
import kotlin.Metadata;
import w0.RotaryScrollEvent;

/* compiled from: RotaryInputModifier.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb0/i;", "Lkotlin/Function1;", "Lw0/b;", "", "onRotaryScrollEvent", "a", "(Lb0/i;LBa/l;)Lb0/i;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    public static final i a(i iVar, l<? super RotaryScrollEvent, Boolean> lVar) {
        return iVar.e(new RotaryInputElement(lVar, null));
    }
}
