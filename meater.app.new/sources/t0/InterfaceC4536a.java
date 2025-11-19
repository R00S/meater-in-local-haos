package t0;

import U0.y;
import h0.C3476g;
import kotlin.Metadata;
import ta.InterfaceC4588d;

/* compiled from: NestedScrollModifier.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lt0/a;", "", "Lh0/g;", "available", "Lt0/e;", "source", "Q0", "(JI)J", "consumed", "u1", "(JJI)J", "LU0/y;", "C0", "(JLta/d;)Ljava/lang/Object;", "d0", "(JJLta/d;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4536a {
    static /* synthetic */ Object B1(InterfaceC4536a interfaceC4536a, long j10, InterfaceC4588d<? super y> interfaceC4588d) {
        return y.b(y.INSTANCE.a());
    }

    static /* synthetic */ Object y1(InterfaceC4536a interfaceC4536a, long j10, long j11, InterfaceC4588d<? super y> interfaceC4588d) {
        return y.b(y.INSTANCE.a());
    }

    default Object C0(long j10, InterfaceC4588d<? super y> interfaceC4588d) {
        return B1(this, j10, interfaceC4588d);
    }

    default long Q0(long available, int source) {
        return C3476g.INSTANCE.c();
    }

    default Object d0(long j10, long j11, InterfaceC4588d<? super y> interfaceC4588d) {
        return y1(this, j10, j11, interfaceC4588d);
    }

    default long u1(long consumed, long available, int source) {
        return C3476g.INSTANCE.c();
    }
}
