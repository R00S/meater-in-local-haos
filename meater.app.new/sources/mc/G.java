package mc;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlinx.serialization.SerializationException;

/* compiled from: Platform.common.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkc/f;", "", "", "a", "(Lkc/f;)Ljava/util/Set;", "", "", "b", "(Ljava/util/List;)[Lkc/f;", "LIa/d;", "", "e", "(LIa/d;)Ljava/lang/Void;", "c", "(LIa/d;)Ljava/lang/String;", "className", "d", "(Ljava/lang/String;)Ljava/lang/String;", "[Lkc/f;", "EMPTY_DESCRIPTOR_ARRAY", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private static final kc.f[] f45450a = new kc.f[0];

    public static final Set<String> a(kc.f fVar) {
        C3862t.g(fVar, "<this>");
        if (fVar instanceof InterfaceC4028h) {
            return ((InterfaceC4028h) fVar).b();
        }
        HashSet hashSet = new HashSet(fVar.getElementsCount());
        int elementsCount = fVar.getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            hashSet.add(fVar.d(i10));
        }
        return hashSet;
    }

    public static final kc.f[] b(List<? extends kc.f> list) {
        kc.f[] fVarArr;
        List<? extends kc.f> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (kc.f[]) list.toArray(new kc.f[0])) == null) ? f45450a : fVarArr;
    }

    public static final String c(Ia.d<?> dVar) {
        C3862t.g(dVar, "<this>");
        String strR = dVar.r();
        if (strR == null) {
            strR = "<local class name not available>";
        }
        return d(strR);
    }

    public static final String d(String className) {
        C3862t.g(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final Void e(Ia.d<?> dVar) {
        C3862t.g(dVar, "<this>");
        throw new SerializationException(c(dVar));
    }
}
