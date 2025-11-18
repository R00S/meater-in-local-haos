package md;

import android.view.Y;
import android.view.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: KoinViewModelFactory.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BC\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lmd/d;", "Landroidx/lifecycle/a0$c;", "LIa/d;", "Landroidx/lifecycle/Y;", "kClass", "Lfd/a;", "scope", "Ldd/a;", "qualifier", "Lkotlin/Function0;", "Lcd/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "params", "<init>", "(LIa/d;Lfd/a;Ldd/a;LBa/a;)V", "T", "modelClass", "LQ1/a;", "extras", "b", "(LIa/d;LQ1/a;)Landroidx/lifecycle/Y;", "LIa/d;", "c", "Lfd/a;", "d", "Ldd/a;", "e", "LBa/a;", "koin-core-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements a0.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ia.d<? extends Y> kClass;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final fd.a scope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final dd.a qualifier;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<cd.a> params;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Ia.d<? extends Y> kClass, fd.a scope, dd.a aVar, Ba.a<? extends cd.a> aVar2) {
        C3862t.g(kClass, "kClass");
        C3862t.g(scope, "scope");
        this.kClass = kClass;
        this.scope = scope;
        this.qualifier = aVar;
        this.params = aVar2;
    }

    @Override // androidx.lifecycle.a0.c
    public <T extends Y> T b(Ia.d<T> modelClass, Q1.a extras) {
        C3862t.g(modelClass, "modelClass");
        C3862t.g(extras, "extras");
        final b bVar = new b(this.params, extras);
        return (T) this.scope.c(this.kClass, this.qualifier, new Ba.a() { // from class: md.c
            @Override // Ba.a
            public final Object invoke() {
                return d.e(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cd.a e(b bVar) {
        return bVar;
    }
}
