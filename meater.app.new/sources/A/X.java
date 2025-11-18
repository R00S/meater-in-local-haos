package A;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import b0.c;
import kotlin.Metadata;

/* compiled from: Row.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LA/X;", "LA/W;", "<init>", "()V", "Lb0/i;", "", "weight", "", "fill", "a", "(Lb0/i;FZ)Lb0/i;", "Lb0/c$c;", "alignment", "b", "(Lb0/i;Lb0/c$c;)Lb0/i;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X implements W {

    /* renamed from: a, reason: collision with root package name */
    public static final X f45a = new X();

    private X() {
    }

    @Override // A.W
    public b0.i a(b0.i iVar, float f10, boolean z10) {
        if (f10 > 0.0d) {
            return iVar.e(new LayoutWeightElement(Ha.g.f(f10, Float.MAX_VALUE), z10));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    @Override // A.W
    public b0.i b(b0.i iVar, c.InterfaceC0420c interfaceC0420c) {
        return iVar.e(new VerticalAlignElement(interfaceC0420c));
    }
}
