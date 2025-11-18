package md;

import android.view.O;
import android.view.S;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;

/* compiled from: AndroidParametersHolder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmd/b;", "Lcd/a;", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersDefinition;", "initialValues", "LQ1/a;", "extras", "<init>", "(LBa/a;LQ1/a;)V", "T", "LIa/d;", "clazz", "block", "g", "(LIa/d;LBa/a;)Ljava/lang/Object;", "c", "(LIa/d;)Ljava/lang/Object;", "d", "LQ1/a;", "koin-core-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends cd.a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Q1.a extras;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Ba.a<? extends cd.a> aVar, Q1.a extras) {
        cd.a aVarInvoke;
        List<Object> listD;
        List listZ0;
        C3862t.g(extras, "extras");
        super((aVar == null || (aVarInvoke = aVar.invoke()) == null || (listD = aVarInvoke.d()) == null || (listZ0 = r.Z0(listD)) == null) ? new ArrayList() : listZ0, null, 2, null);
        this.extras = extras;
    }

    private final <T> T g(Ia.d<?> clazz, Ba.a<? extends T> block) {
        return C3862t.b(clazz, P.b(O.class)) ? (T) S.a(this.extras) : block.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(b bVar, Ia.d dVar) {
        return super.c(dVar);
    }

    @Override // cd.a
    public <T> T c(final Ia.d<?> clazz) {
        C3862t.g(clazz, "clazz");
        return (T) g(clazz, new Ba.a() { // from class: md.a
            @Override // Ba.a
            public final Object invoke() {
                return b.h(this.f45529B, clazz);
            }
        });
    }
}
