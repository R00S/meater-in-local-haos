package androidx.compose.foundation.layout;

import A.I;
import androidx.compose.ui.platform.C2037q0;
import androidx.compose.ui.platform.C2040s0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: Intrinsic.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lb0/i;", "LA/I;", "intrinsicSize", "b", "(Lb0/i;LA/I;)Lb0/i;", "a", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ I f22262B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I i10) {
            super(1);
            this.f22262B = i10;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("height");
            c2040s0.getProperties().b("intrinsicSize", this.f22262B);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ I f22263B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(I i10) {
            super(1);
            this.f22263B = i10;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("width");
            c2040s0.getProperties().b("intrinsicSize", this.f22263B);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    public static final b0.i a(b0.i iVar, I i10) {
        return iVar.e(new IntrinsicHeightElement(i10, true, C2037q0.b() ? new a(i10) : C2037q0.a()));
    }

    public static final b0.i b(b0.i iVar, I i10) {
        return iVar.e(new IntrinsicWidthElement(i10, true, C2037q0.b() ? new b(i10) : C2037q0.a()));
    }
}
