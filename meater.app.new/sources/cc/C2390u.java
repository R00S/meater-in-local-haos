package cc;

import Xb.G0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;

/* compiled from: MainDispatchers.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcc/u;", "", "<init>", "()V", "LXb/G0;", "a", "()LXb/G0;", "b", "LXb/G0;", "dispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2390u {

    /* renamed from: a, reason: collision with root package name */
    public static final C2390u f31204a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final G0 dispatcher;

    static {
        C2390u c2390u = new C2390u();
        f31204a = c2390u;
        C2362G.f("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = c2390u.a();
    }

    private C2390u() {
    }

    private final G0 a() {
        Object next;
        G0 g0E;
        try {
            List listH = Tb.k.H(Tb.k.c(ServiceLoader.load(InterfaceC2389t.class, InterfaceC2389t.class.getClassLoader()).iterator()));
            Iterator it = listH.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((InterfaceC2389t) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((InterfaceC2389t) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC2389t interfaceC2389t = (InterfaceC2389t) next;
            if (interfaceC2389t != null && (g0E = C2391v.e(interfaceC2389t, listH)) != null) {
                return g0E;
            }
            C2391v.b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            C2391v.b(th, null, 2, null);
            return null;
        }
    }
}
