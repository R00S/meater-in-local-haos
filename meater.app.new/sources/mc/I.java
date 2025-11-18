package mc;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: PluginGeneratedSerialDescriptor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkc/f;", "", "typeParams", "", "a", "(Lkc/f;[Lkc/f;)I", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class I {
    public static final int a(kc.f fVar, kc.f[] typeParams) {
        C3862t.g(fVar, "<this>");
        C3862t.g(typeParams, "typeParams");
        int iHashCode = (fVar.getSerialName().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<kc.f> iterableA = kc.h.a(fVar);
        Iterator<kc.f> it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String serialName = it.next().getSerialName();
            if (serialName != null) {
                iHashCode3 = serialName.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator<kc.f> it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            kc.j jVarI = it2.next().i();
            iHashCode2 = i12 + (jVarI != null ? jVarI.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }
}
