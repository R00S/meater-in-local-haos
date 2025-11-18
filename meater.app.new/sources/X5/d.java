package X5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import nd.f;
import nd.t;
import oc.E;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\f\u0012\u0004\u0012\u00020\f\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LX5/d;", "Lnd/f$a;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lnd/t;", "retrofit", "Lnd/f;", "Loc/E;", "d", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lnd/t;)Lnd/f;", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends f.a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(nd.f fVar, E e10) {
        if (e10.getContentLength() == 0) {
            return null;
        }
        return fVar.a(e10);
    }

    @Override // nd.f.a
    public nd.f<E, ?> d(Type type, Annotation[] annotations, t retrofit) {
        C3862t.g(type, "type");
        C3862t.g(annotations, "annotations");
        C3862t.g(retrofit, "retrofit");
        final nd.f fVarF = retrofit.f(this, type, annotations);
        C3862t.f(fVarF, "nextResponseBodyConverter(...)");
        return new nd.f() { // from class: X5.c
            @Override // nd.f
            public final Object a(Object obj) {
                return d.g(fVarF, (E) obj);
            }
        };
    }
}
