package ic;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import mc.F;
import mc.G;
import mc.N;

/* compiled from: Serializers.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"", "T", "LIa/d;", "Lic/a;", "a", "(LIa/d;)Lic/a;", "b", "kotlinx-serialization-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
/* loaded from: classes3.dex */
final /* synthetic */ class h {
    public static final <T> InterfaceC3693a<T> a(Ia.d<T> dVar) {
        C3862t.g(dVar, "<this>");
        InterfaceC3693a<T> interfaceC3693aB = g.b(dVar);
        if (interfaceC3693aB != null) {
            return interfaceC3693aB;
        }
        G.e(dVar);
        throw new KotlinNothingValueException();
    }

    public static final <T> InterfaceC3693a<T> b(Ia.d<T> dVar) {
        C3862t.g(dVar, "<this>");
        InterfaceC3693a<T> interfaceC3693aB = F.b(dVar);
        return interfaceC3693aB == null ? N.a(dVar) : interfaceC3693aB;
    }
}
