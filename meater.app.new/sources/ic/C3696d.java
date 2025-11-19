package ic;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import mc.AbstractC4022b;
import mc.C4023c;

/* compiled from: PolymorphicSerializer.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "T", "Lmc/b;", "Llc/c;", "encoder", "value", "Lic/f;", "a", "(Lmc/b;Llc/c;Ljava/lang/Object;)Lic/f;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: ic.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3696d {
    public static final <T> InterfaceC3698f<T> a(AbstractC4022b<T> abstractC4022b, lc.c encoder, T value) {
        C3862t.g(abstractC4022b, "<this>");
        C3862t.g(encoder, "encoder");
        C3862t.g(value, "value");
        InterfaceC3698f<T> interfaceC3698fE = abstractC4022b.e(encoder, value);
        if (interfaceC3698fE != null) {
            return interfaceC3698fE;
        }
        C4023c.a(P.b(value.getClass()), abstractC4022b.f());
        throw new KotlinNothingValueException();
    }
}
