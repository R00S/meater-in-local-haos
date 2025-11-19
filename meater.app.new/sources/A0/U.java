package A0;

import A0.G;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;

/* compiled from: MeasureScopeWithLayoutNode.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly0/r;", "scope", "", "Ly0/H;", "a", "(Ly0/r;)Ljava/util/List;", "LA0/G;", "", "b", "(LA0/G;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U {

    /* compiled from: MeasureScopeWithLayoutNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f491a;

        static {
            int[] iArr = new int[G.e.values().length];
            try {
                iArr[G.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.e.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G.e.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[G.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f491a = iArr;
        }
    }

    public static final List<List<y0.H>> a(y0.r rVar) {
        C3862t.e(rVar, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        G layoutNode = ((T) rVar).getLayoutNode();
        boolean zB = b(layoutNode);
        List<G> listM = layoutNode.M();
        ArrayList arrayList = new ArrayList(listM.size());
        int size = listM.size();
        for (int i10 = 0; i10 < size; i10++) {
            G g10 = listM.get(i10);
            arrayList.add(zB ? g10.F() : g10.G());
        }
        return arrayList;
    }

    private static final boolean b(G g10) {
        int i10 = a.f491a[g10.W().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        if (i10 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        G gO0 = g10.o0();
        if (gO0 != null) {
            return b(gO0);
        }
        throw new IllegalArgumentException("no parent for idle node");
    }
}
