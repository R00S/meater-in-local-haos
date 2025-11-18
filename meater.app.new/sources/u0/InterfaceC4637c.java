package u0;

import androidx.compose.ui.platform.i1;
import h0.C3482m;
import kotlin.Metadata;
import ta.InterfaceC4588d;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006JD\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJB\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00118&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00158VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lu0/c;", "LU0/d;", "Lu0/q;", "pass", "Lu0/o;", "l0", "(Lu0/q;Lta/d;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "Lta/d;", "", "block", "u0", "(JLBa/p;Lta/d;)Ljava/lang/Object;", "l1", "LU0/r;", "a", "()J", "size", "Lh0/m;", "b1", "extendedTouchPadding", "V", "()Lu0/o;", "currentEvent", "Landroidx/compose/ui/platform/i1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/i1;", "viewConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4637c extends U0.d {
    static /* synthetic */ Object D1(InterfaceC4637c interfaceC4637c, EnumC4651q enumC4651q, InterfaceC4588d interfaceC4588d, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            enumC4651q = EnumC4651q.Main;
        }
        return interfaceC4637c.l0(enumC4651q, interfaceC4588d);
    }

    static /* synthetic */ <T> Object P(InterfaceC4637c interfaceC4637c, long j10, Ba.p<? super InterfaceC4637c, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, InterfaceC4588d<? super T> interfaceC4588d) {
        return pVar.invoke(interfaceC4637c, interfaceC4588d);
    }

    static /* synthetic */ <T> Object k1(InterfaceC4637c interfaceC4637c, long j10, Ba.p<? super InterfaceC4637c, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, InterfaceC4588d<? super T> interfaceC4588d) {
        return pVar.invoke(interfaceC4637c, interfaceC4588d);
    }

    C4649o V();

    long a();

    default long b1() {
        return C3482m.INSTANCE.b();
    }

    i1 getViewConfiguration();

    Object l0(EnumC4651q enumC4651q, InterfaceC4588d<? super C4649o> interfaceC4588d);

    default <T> Object l1(long j10, Ba.p<? super InterfaceC4637c, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, InterfaceC4588d<? super T> interfaceC4588d) {
        return P(this, j10, pVar, interfaceC4588d);
    }

    default <T> Object u0(long j10, Ba.p<? super InterfaceC4637c, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, InterfaceC4588d<? super T> interfaceC4588d) {
        return k1(this, j10, pVar, interfaceC4588d);
    }
}
