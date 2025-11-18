package gc;

import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: Mutex.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lgc/a;", "", "owner", "", "a", "(Ljava/lang/Object;)Z", "Loa/F;", "d", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "c", "(Ljava/lang/Object;)V", "b", "()Z", "isLocked", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3460a {

    /* compiled from: Mutex.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gc.a$a, reason: collision with other inner class name */
    public static final class C0535a {
        public static /* synthetic */ Object a(InterfaceC3460a interfaceC3460a, Object obj, InterfaceC4588d interfaceC4588d, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return interfaceC3460a.d(obj, interfaceC4588d);
        }

        public static /* synthetic */ boolean b(InterfaceC3460a interfaceC3460a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return interfaceC3460a.a(obj);
        }

        public static /* synthetic */ void c(InterfaceC3460a interfaceC3460a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            interfaceC3460a.c(obj);
        }
    }

    boolean a(Object owner);

    boolean b();

    void c(Object owner);

    Object d(Object obj, InterfaceC4588d<? super C4153F> interfaceC4588d);
}
