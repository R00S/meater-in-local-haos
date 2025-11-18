package kotlin;

import Uc.a;
import kotlin.AbstractC1501G0;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import org.koin.compose.error.UnknownKoinContext;

/* compiled from: KoinApplication.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\"\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, d2 = {"LUc/a;", "f", "()LUc/a;", "Lfd/a;", "e", "(LO/l;I)Lfd/a;", "ctx", "Loa/F;", "g", "(LUc/a;)V", "LO/G0;", "a", "LO/G0;", "getLocalKoinApplication", "()LO/G0;", "LocalKoinApplication", "b", "getLocalKoinScope", "LocalKoinScope", "koin-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: Tc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1724d {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<a> f16712a = C1576w.d(null, new Ba.a() { // from class: Tc.b
        @Override // Ba.a
        public final Object invoke() {
            return C1724d.c();
        }
    }, 1, null);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1501G0<fd.a> f16713b = C1576w.d(null, new Ba.a() { // from class: Tc.c
        @Override // Ba.a
        public final Object invoke() {
            return C1724d.d();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final a c() throws UnknownKoinContext {
        throw new UnknownKoinContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fd.a d() throws UnknownKoinContext {
        throw new UnknownKoinContext();
    }

    public static final fd.a e(InterfaceC1554l interfaceC1554l, int i10) {
        interfaceC1554l.e(1668867238);
        if (C1560o.J()) {
            C1560o.S(1668867238, i10, -1, "org.koin.compose.currentKoinScope (KoinApplication.kt:79)");
        }
        interfaceC1554l.e(-899075222);
        Object objF = interfaceC1554l.f();
        if (objF == InterfaceC1554l.INSTANCE.a()) {
            try {
                objF = (fd.a) interfaceC1554l.o(f16713b);
            } catch (UnknownKoinContext unused) {
                g(f());
                objF = f().getScopeRegistry().getRootScope();
            }
            interfaceC1554l.J(objF);
        }
        fd.a aVar = (fd.a) objF;
        interfaceC1554l.O();
        if (C1560o.J()) {
            C1560o.R();
        }
        interfaceC1554l.O();
        return aVar;
    }

    private static final a f() {
        return kd.a.f43922a.a().get();
    }

    private static final void g(a aVar) {
        aVar.getLogger().c("[Warning] - No Compose Koin context setup, taking default. Use KoinContext(), KoinAndroidContext() or KoinApplication() function to setup or create Koin context and avoid such message.");
    }
}
