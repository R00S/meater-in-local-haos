package D;

import A0.C0833l;
import A0.InterfaceC0831j;
import android.graphics.Rect;
import android.view.View;
import h0.C3478i;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import y0.C5117w;
import y0.InterfaceC5116v;

/* compiled from: BringIntoViewResponder.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LA0/j;", "LD/a;", "b", "(LA0/j;)LD/a;", "Lh0/i;", "Landroid/graphics/Rect;", "c", "(Lh0/i;)Landroid/graphics/Rect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* compiled from: BringIntoViewResponder.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly0/v;", "childCoordinates", "Lkotlin/Function0;", "Lh0/i;", "boundsProvider", "Loa/F;", "D0", "(Ly0/v;LBa/a;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a implements D.a {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC0831j f3314B;

        a(InterfaceC0831j interfaceC0831j) {
            this.f3314B = interfaceC0831j;
        }

        @Override // D.a
        public final Object D0(InterfaceC5116v interfaceC5116v, Ba.a<C3478i> aVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            View viewA = C0833l.a(this.f3314B);
            long jE = C5117w.e(interfaceC5116v);
            C3478i c3478iInvoke = aVar.invoke();
            C3478i c3478iQ = c3478iInvoke != null ? c3478iInvoke.q(jE) : null;
            if (c3478iQ != null) {
                viewA.requestRectangleOnScreen(f.c(c3478iQ), false);
            }
            return C4153F.f46609a;
        }
    }

    public static final D.a b(InterfaceC0831j interfaceC0831j) {
        return new a(interfaceC0831j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(C3478i c3478i) {
        return new Rect((int) c3478i.getLeft(), (int) c3478i.getTop(), (int) c3478i.getRight(), (int) c3478i.getBottom());
    }
}
