package kotlin;

import Ba.l;
import Uc.a;
import Uc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import org.koin.core.error.KoinApplicationAlreadyStartedException;

/* compiled from: GlobalContext.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ'\u0010\u0010\u001a\u00020\u00042\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0016"}, d2 = {"LWc/b;", "LWc/c;", "<init>", "()V", "LUc/b;", "koinApplication", "Loa/F;", "c", "(LUc/b;)V", "LUc/a;", "get", "()LUc/a;", "b", "Lkotlin/Function1;", "Lorg/koin/dsl/KoinAppDeclaration;", "appDeclaration", "a", "(LBa/l;)LUc/b;", "LUc/a;", "_koin", "LUc/b;", "_koinApplication", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Wc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1802b implements InterfaceC1803c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1802b f18502a = new C1802b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static a _koin;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static b _koinApplication;

    private C1802b() {
    }

    private final void c(b koinApplication) throws KoinApplicationAlreadyStartedException {
        if (_koin != null) {
            throw new KoinApplicationAlreadyStartedException("A Koin Application has already been started");
        }
        _koinApplication = koinApplication;
        _koin = koinApplication.getKoin();
    }

    @Override // kotlin.InterfaceC1803c
    public b a(l<? super b, C4153F> appDeclaration) {
        b bVarA;
        C3862t.g(appDeclaration, "appDeclaration");
        synchronized (this) {
            bVarA = b.INSTANCE.a();
            f18502a.c(bVarA);
            appDeclaration.invoke(bVarA);
            bVarA.a();
        }
        return bVarA;
    }

    public a b() {
        return _koin;
    }

    @Override // kotlin.InterfaceC1803c
    public a get() {
        a aVar = _koin;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }
}
