package E0;

import E0.d;
import F0.r;
import U0.q;
import Xb.J;
import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import h0.C3478i;
import i0.X0;
import java.util.function.Consumer;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3844a;
import kotlin.r1;
import oa.C4153F;
import ra.C4370a;
import y0.C5117w;

/* compiled from: ScrollCapture.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R+\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LE0/l;", "LE0/d$a;", "<init>", "()V", "Landroid/view/View;", "view", "LF0/r;", "semanticsOwner", "Lta/g;", "coroutineContext", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "Loa/F;", "d", "(Landroid/view/View;LF0/r;Lta/g;Ljava/util/function/Consumer;)V", "a", "b", "", "<set-?>", "LO/p0;", "c", "()Z", "e", "(Z)V", "scrollCaptureInProgress", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements d.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 scrollCaptureInProgress = r1.c(Boolean.FALSE, null, 2, null);

    /* compiled from: ScrollCapture.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends C3844a implements Ba.l<ScrollCaptureCandidate, C4153F> {
        a(Object obj) {
            super(1, obj, Q.b.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        public final void a(ScrollCaptureCandidate scrollCaptureCandidate) {
            ((Q.b) this.f43986B).c(scrollCaptureCandidate);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
            a(scrollCaptureCandidate);
            return C4153F.f46609a;
        }
    }

    /* compiled from: ScrollCapture.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE0/m;", "it", "", "a", "(LE0/m;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<ScrollCaptureCandidate, Comparable<?>> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f3791B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
            return Integer.valueOf(scrollCaptureCandidate.getDepth());
        }
    }

    /* compiled from: ScrollCapture.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE0/m;", "it", "", "a", "(LE0/m;)Ljava/lang/Comparable;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.l<ScrollCaptureCandidate, Comparable<?>> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f3792B = new c();

        c() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
            return Integer.valueOf(scrollCaptureCandidate.getViewportBoundsInWindow().f());
        }
    }

    private final void e(boolean z10) {
        this.scrollCaptureInProgress.setValue(Boolean.valueOf(z10));
    }

    @Override // E0.d.a
    public void a() {
        e(true);
    }

    @Override // E0.d.a
    public void b() {
        e(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.scrollCaptureInProgress.getValue()).booleanValue();
    }

    public final void d(View view, r semanticsOwner, ta.g coroutineContext, Consumer<ScrollCaptureTarget> targets) {
        Q.b bVar = new Q.b(new ScrollCaptureCandidate[16], 0);
        n.e(semanticsOwner.a(), 0, new a(bVar), 2, null);
        bVar.J(C4370a.b(b.f3791B, c.f3792B));
        ScrollCaptureCandidate scrollCaptureCandidate = (ScrollCaptureCandidate) (bVar.x() ? null : bVar.t()[bVar.getSize() - 1]);
        if (scrollCaptureCandidate == null) {
            return;
        }
        d dVar = new d(scrollCaptureCandidate.getNode(), scrollCaptureCandidate.getViewportBoundsInWindow(), J.a(coroutineContext), this);
        C3478i c3478iB = C5117w.b(scrollCaptureCandidate.getCoordinates());
        long jK = scrollCaptureCandidate.getViewportBoundsInWindow().k();
        ScrollCaptureTarget scrollCaptureTargetA = k.a(view, X0.a(q.b(c3478iB)), new Point(U0.n.h(jK), U0.n.i(jK)), i.a(dVar));
        scrollCaptureTargetA.setScrollBounds(X0.a(scrollCaptureCandidate.getViewportBoundsInWindow()));
        targets.accept(scrollCaptureTargetA);
    }
}
