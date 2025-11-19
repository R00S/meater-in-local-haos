package androidx.compose.ui.draw;

import b0.i;
import i0.C3604u0;
import kotlin.Metadata;
import n0.AbstractC4051b;
import y0.InterfaceC5106k;

/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb0/i;", "Ln0/b;", "painter", "", "sizeToIntrinsics", "Lb0/c;", "alignment", "Ly0/k;", "contentScale", "", "alpha", "Li0/u0;", "colorFilter", "a", "(Lb0/i;Ln0/b;ZLb0/c;Ly0/k;FLi0/u0;)Lb0/i;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    public static final i a(i iVar, AbstractC4051b abstractC4051b, boolean z10, b0.c cVar, InterfaceC5106k interfaceC5106k, float f10, C3604u0 c3604u0) {
        return iVar.e(new PainterElement(abstractC4051b, z10, cVar, interfaceC5106k, f10, c3604u0));
    }

    public static /* synthetic */ i b(i iVar, AbstractC4051b abstractC4051b, boolean z10, b0.c cVar, InterfaceC5106k interfaceC5106k, float f10, C3604u0 c3604u0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            cVar = b0.c.INSTANCE.e();
        }
        b0.c cVar2 = cVar;
        if ((i10 & 8) != 0) {
            interfaceC5106k = InterfaceC5106k.INSTANCE.b();
        }
        InterfaceC5106k interfaceC5106k2 = interfaceC5106k;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            c3604u0 = null;
        }
        return a(iVar, abstractC4051b, z11, cVar2, interfaceC5106k2, f11, c3604u0);
    }
}
