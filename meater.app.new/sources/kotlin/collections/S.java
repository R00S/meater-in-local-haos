package kotlin.collections;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Maps.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\u001a=\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"K", "V", "", "LTb/h;", "", "u", "(Ljava/util/Map;)LTb/h;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
/* loaded from: classes2.dex */
public class S extends Q {
    public static <K, V> Tb.h<Map.Entry<K, V>> u(Map<? extends K, ? extends V> map) {
        C3862t.g(map, "<this>");
        return r.Z(map.entrySet());
    }
}
