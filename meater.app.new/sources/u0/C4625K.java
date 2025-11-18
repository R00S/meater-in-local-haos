package u0;

import android.view.MotionEvent;
import h0.C3476g;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: PointerInteropUtils.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a2\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lu0/o;", "Lh0/g;", "offset", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Loa/F;", "block", "c", "(Lu0/o;JLBa/l;)V", "b", "", "nowMillis", "a", "(JLBa/l;)V", "", "cancel", "d", "(Lu0/o;JLBa/l;Z)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4625K {
    public static final void a(long j10, Ba.l<? super MotionEvent, C4153F> lVar) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        lVar.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static final void b(C4649o c4649o, long j10, Ba.l<? super MotionEvent, C4153F> lVar) {
        d(c4649o, j10, lVar, true);
    }

    public static final void c(C4649o c4649o, long j10, Ba.l<? super MotionEvent, C4153F> lVar) {
        d(c4649o, j10, lVar, false);
    }

    private static final void d(C4649o c4649o, long j10, Ba.l<? super MotionEvent, C4153F> lVar, boolean z10) {
        MotionEvent motionEventE = c4649o.e();
        if (motionEventE == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventE.getAction();
        if (z10) {
            motionEventE.setAction(3);
        }
        motionEventE.offsetLocation(-C3476g.m(j10), -C3476g.n(j10));
        lVar.invoke(motionEventE);
        motionEventE.offsetLocation(C3476g.m(j10), C3476g.n(j10));
        motionEventE.setAction(action);
    }
}
