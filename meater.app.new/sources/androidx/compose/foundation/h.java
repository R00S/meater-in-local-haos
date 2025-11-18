package androidx.compose.foundation;

import kotlin.Metadata;
import z.InterfaceC5162k;

/* compiled from: Hoverable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb0/i;", "Lz/k;", "interactionSource", "", "enabled", "a", "(Lb0/i;Lz/k;Z)Lb0/i;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {
    public static final b0.i a(b0.i iVar, InterfaceC5162k interfaceC5162k, boolean z10) {
        return iVar.e(z10 ? new HoverableElement(interfaceC5162k) : b0.i.INSTANCE);
    }

    public static /* synthetic */ b0.i b(b0.i iVar, InterfaceC5162k interfaceC5162k, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(iVar, interfaceC5162k, z10);
    }
}
