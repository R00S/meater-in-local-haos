package androidx.compose.foundation;

import androidx.compose.ui.platform.C2037q0;
import androidx.compose.ui.platform.C2040s0;
import i0.C3602t0;
import i0.Y0;
import i0.c1;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Lb0/i;", "Li0/t0;", "color", "Li0/c1;", "shape", "a", "(Lb0/i;JLi0/c1;)Lb0/i;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ long f21915B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ c1 f21916C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, c1 c1Var) {
            super(1);
            this.f21915B = j10;
            this.f21916C = c1Var;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("background");
            c2040s0.c(C3602t0.g(this.f21915B));
            c2040s0.getProperties().b("color", C3602t0.g(this.f21915B));
            c2040s0.getProperties().b("shape", this.f21916C);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    public static final b0.i a(b0.i iVar, long j10, c1 c1Var) {
        return iVar.e(new BackgroundElement(j10, null, 1.0f, c1Var, C2037q0.b() ? new a(j10, c1Var) : C2037q0.a(), 2, null));
    }

    public static /* synthetic */ b0.i b(b0.i iVar, long j10, c1 c1Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c1Var = Y0.a();
        }
        return a(iVar, j10, c1Var);
    }
}
