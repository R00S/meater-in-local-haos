package jd;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: KoinJavaComponent.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ljd/b;", "", "<init>", "()V", "T", "Ljava/lang/Class;", "clazz", "Ldd/a;", "qualifier", "Lkotlin/Function0;", "Lcd/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Loa/i;", "e", "(Ljava/lang/Class;Ldd/a;LBa/a;)Loa/i;", "b", "(Ljava/lang/Class;Ldd/a;LBa/a;)Ljava/lang/Object;", "LUc/a;", "c", "()LUc/a;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f43693a = new b();

    private b() {
    }

    public static final <T> T b(Class<?> clazz, dd.a qualifier, Ba.a<? extends cd.a> parameters) {
        C3862t.g(clazz, "clazz");
        return (T) c().b(Aa.a.e(clazz), qualifier, parameters);
    }

    public static final Uc.a c() {
        return kd.a.f43922a.a().get();
    }

    public static final <T> InterfaceC4164i<T> d(Class<?> clazz) {
        C3862t.g(clazz, "clazz");
        return f(clazz, null, null, 6, null);
    }

    public static final <T> InterfaceC4164i<T> e(final Class<?> clazz, final dd.a qualifier, final Ba.a<? extends cd.a> parameters) {
        C3862t.g(clazz, "clazz");
        return C4165j.b(EnumC4168m.f46626B, new Ba.a() { // from class: jd.a
            @Override // Ba.a
            public final Object invoke() {
                return b.g(clazz, qualifier, parameters);
            }
        });
    }

    public static /* synthetic */ InterfaceC4164i f(Class cls, dd.a aVar, Ba.a aVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        if ((i10 & 4) != 0) {
            aVar2 = null;
        }
        return e(cls, aVar, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(Class cls, dd.a aVar, Ba.a aVar2) {
        return b(cls, aVar, aVar2);
    }
}
