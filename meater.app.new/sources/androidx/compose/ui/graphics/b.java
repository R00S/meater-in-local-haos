package androidx.compose.ui.graphics;

import Ba.l;
import androidx.compose.ui.platform.C2037q0;
import b0.i;
import i0.G0;
import i0.Y0;
import i0.Z0;
import i0.c1;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÂ\u0001\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lb0/i;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Li0/c1;", "shape", "", "clip", "Li0/Z0;", "renderEffect", "Li0/t0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "b", "(Lb0/i;FFFFFFFFFFJLi0/c1;ZLi0/Z0;JJI)Lb0/i;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Loa/F;", "block", "a", "(Lb0/i;LBa/l;)Lb0/i;", "d", "(Lb0/i;)Lb0/i;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    public static final i a(i iVar, l<? super c, C4153F> lVar) {
        return iVar.e(new BlockGraphicsLayerElement(lVar));
    }

    public static final i b(i iVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, c1 c1Var, boolean z10, Z0 z02, long j11, long j12, int i10) {
        return iVar.e(new GraphicsLayerElement(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, c1Var, z10, z02, j11, j12, i10, null));
    }

    public static /* synthetic */ i c(i iVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, c1 c1Var, boolean z10, Z0 z02, long j11, long j12, int i10, int i11, Object obj) {
        return b(iVar, (i11 & 1) != 0 ? 1.0f : f10, (i11 & 2) != 0 ? 1.0f : f11, (i11 & 4) == 0 ? f12 : 1.0f, (i11 & 8) != 0 ? 0.0f : f13, (i11 & 16) != 0 ? 0.0f : f14, (i11 & 32) != 0 ? 0.0f : f15, (i11 & 64) != 0 ? 0.0f : f16, (i11 & 128) != 0 ? 0.0f : f17, (i11 & 256) == 0 ? f18 : 0.0f, (i11 & 512) != 0 ? 8.0f : f19, (i11 & 1024) != 0 ? f.INSTANCE.a() : j10, (i11 & 2048) != 0 ? Y0.a() : c1Var, (i11 & 4096) != 0 ? false : z10, (i11 & 8192) != 0 ? null : z02, (i11 & 16384) != 0 ? G0.a() : j11, (i11 & 32768) != 0 ? G0.a() : j12, (i11 & 65536) != 0 ? a.INSTANCE.a() : i10);
    }

    public static final i d(i iVar) {
        return C2037q0.b() ? iVar.e(c(i.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : iVar;
    }
}
