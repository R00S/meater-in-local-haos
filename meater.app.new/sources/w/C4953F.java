package w;

import h0.C3476g;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Overscroll.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lw/F;", "Lw/I;", "<init>", "()V", "Lh0/g;", "delta", "Lt0/e;", "source", "Lkotlin/Function1;", "performScroll", "d", "(JILBa/l;)J", "LU0/y;", "velocity", "Lkotlin/Function2;", "Lta/d;", "", "performFling", "Loa/F;", "b", "(JLBa/p;Lta/d;)Ljava/lang/Object;", "", "c", "()Z", "isInProgress", "Lb0/i;", "a", "()Lb0/i;", "effectModifier", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: w.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4953F implements I {

    /* renamed from: a, reason: collision with root package name */
    public static final C4953F f51673a = new C4953F();

    private C4953F() {
    }

    @Override // w.I
    public b0.i a() {
        return b0.i.INSTANCE;
    }

    @Override // w.I
    public Object b(long j10, Ba.p<? super U0.y, ? super InterfaceC4588d<? super U0.y>, ? extends Object> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objInvoke = pVar.invoke(U0.y.b(j10), interfaceC4588d);
        return objInvoke == C4696b.e() ? objInvoke : C4153F.f46609a;
    }

    @Override // w.I
    public boolean c() {
        return false;
    }

    @Override // w.I
    public long d(long delta, int source, Ba.l<? super C3476g, C3476g> performScroll) {
        return performScroll.invoke(C3476g.d(delta)).getPackedValue();
    }
}
