package kotlin;

import Ba.l;
import Ba.p;
import kotlin.Metadata;
import ta.InterfaceC4588d;
import ta.g;

/* compiled from: MonotonicFrameClock.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \f2\u00020\u0001:\u0001\rJ*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"LO/g0;", "Lta/g$b;", "R", "Lkotlin/Function1;", "", "onFrame", "K", "(LBa/l;Lta/d;)Ljava/lang/Object;", "Lta/g$c;", "getKey", "()Lta/g$c;", "key", "d", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1545g0 extends g.b {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f12848B;

    /* compiled from: MonotonicFrameClock.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.g0$a */
    public static final class a {
        public static <R> R a(InterfaceC1545g0 interfaceC1545g0, R r10, p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(interfaceC1545g0, r10, pVar);
        }

        public static <E extends g.b> E b(InterfaceC1545g0 interfaceC1545g0, g.c<E> cVar) {
            return (E) g.b.a.b(interfaceC1545g0, cVar);
        }

        public static g c(InterfaceC1545g0 interfaceC1545g0, g.c<?> cVar) {
            return g.b.a.c(interfaceC1545g0, cVar);
        }

        public static g d(InterfaceC1545g0 interfaceC1545g0, g gVar) {
            return g.b.a.d(interfaceC1545g0, gVar);
        }
    }

    /* compiled from: MonotonicFrameClock.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LO/g0$b;", "Lta/g$c;", "LO/g0;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.g0$b, reason: from kotlin metadata */
    public static final class Companion implements g.c<InterfaceC1545g0> {

        /* renamed from: B, reason: collision with root package name */
        static final /* synthetic */ Companion f12848B = new Companion();

        private Companion() {
        }
    }

    <R> Object K(l<? super Long, ? extends R> lVar, InterfaceC4588d<? super R> interfaceC4588d);

    @Override // ta.g.b
    default g.c<?> getKey() {
        return INSTANCE;
    }
}
