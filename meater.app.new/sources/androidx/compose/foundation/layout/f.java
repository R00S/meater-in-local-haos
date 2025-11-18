package androidx.compose.foundation.layout;

import A.InterfaceC0795c;
import androidx.compose.ui.platform.C2037q0;
import androidx.compose.ui.platform.C2040s0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: Box.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/layout/f;", "LA/c;", "<init>", "()V", "Lb0/i;", "Lb0/c;", "alignment", "a", "(Lb0/i;Lb0/c;)Lb0/i;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f implements InterfaceC0795c {

    /* renamed from: a, reason: collision with root package name */
    public static final f f22255a = new f();

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ b0.c f22256B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0.c cVar) {
            super(1);
            this.f22256B = cVar;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("align");
            c2040s0.c(this.f22256B);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    private f() {
    }

    @Override // A.InterfaceC0795c
    public b0.i a(b0.i iVar, b0.c cVar) {
        return iVar.e(new BoxChildDataElement(cVar, false, C2037q0.b() ? new a(cVar) : C2037q0.a()));
    }
}
