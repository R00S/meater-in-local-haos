package ia;

import ja.C3756a;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: DataPublisher.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lia/f;", "", "Lja/a;", "state", "", "pushStateUpdate", "Loa/F;", "b", "(Lja/a;ZLta/d;)Ljava/lang/Object;", "getState", "()Lja/a;", "uniflow-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: ia.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3641f {

    /* compiled from: DataPublisher.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: ia.f$a */
    public static final class a {
        public static /* synthetic */ Object a(InterfaceC3641f interfaceC3641f, C3756a c3756a, boolean z10, InterfaceC4588d interfaceC4588d, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: publishState");
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return interfaceC3641f.b(c3756a, z10, interfaceC4588d);
        }

        public static Object b(InterfaceC3641f interfaceC3641f, C3756a c3756a, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            Object objA = a(interfaceC3641f, c3756a, false, interfaceC4588d, 2, null);
            return objA == C4696b.e() ? objA : C4153F.f46609a;
        }
    }

    Object b(C3756a c3756a, boolean z10, InterfaceC4588d<? super C4153F> interfaceC4588d);

    C3756a getState();
}
