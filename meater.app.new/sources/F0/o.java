package F0;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: SemanticsModifier.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\u00020\u0003*\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0011\u001a\u00060\u000ej\u0002`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0012"}, d2 = {"", "b", "()I", "Lb0/i;", "", "mergeDescendants", "Lkotlin/Function1;", "LF0/x;", "Loa/F;", "properties", "c", "(Lb0/i;ZLBa/l;)Lb0/i;", "a", "(Lb0/i;LBa/l;)Lb0/i;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/AtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastIdentifier", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static AtomicInteger f4345a = new AtomicInteger(0);

    public static final b0.i a(b0.i iVar, Ba.l<? super x, C4153F> lVar) {
        return iVar.e(new ClearAndSetSemanticsElement(lVar));
    }

    public static final int b() {
        return f4345a.addAndGet(1);
    }

    public static final b0.i c(b0.i iVar, boolean z10, Ba.l<? super x, C4153F> lVar) {
        return iVar.e(new AppendedSemanticsElement(z10, lVar));
    }

    public static /* synthetic */ b0.i d(b0.i iVar, boolean z10, Ba.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(iVar, z10, lVar);
    }
}
