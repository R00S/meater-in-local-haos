package f0;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import b0.i;
import i0.G0;
import i0.Y0;
import i0.c1;
import kotlin.Metadata;

/* compiled from: Shadow.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aF\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lb0/i;", "LU0/h;", "elevation", "Li0/c1;", "shape", "", "clip", "Li0/t0;", "ambientColor", "spotColor", "a", "(Lb0/i;FLi0/c1;ZJJ)Lb0/i;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: f0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3307h {
    public static final i a(i iVar, float f10, c1 c1Var, boolean z10, long j10, long j11) {
        return (U0.h.t(f10, U0.h.u((float) 0)) > 0 || z10) ? iVar.e(new ShadowGraphicsLayerElement(f10, c1Var, z10, j10, j11, null)) : iVar;
    }

    public static /* synthetic */ i b(i iVar, float f10, c1 c1Var, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        c1 c1VarA = (i10 & 2) != 0 ? Y0.a() : c1Var;
        if ((i10 & 4) != 0) {
            z11 = false;
            if (U0.h.t(f10, U0.h.u(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        return a(iVar, f10, c1VarA, z11, (i10 & 8) != 0 ? G0.a() : j10, (i10 & 16) != 0 ? G0.a() : j11);
    }
}
