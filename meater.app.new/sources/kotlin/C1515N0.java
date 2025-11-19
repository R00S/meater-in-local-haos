package kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.r;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aA\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\t\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u000f"}, d2 = {"K", "V", "", "", "key", "value", "", "a", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "b", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "Ljava/lang/Object;", "ProduceAnotherFrame", "FramePending", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.N0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1515N0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f12732a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f12733b = new Object();

    public static final <K, V> boolean a(Map<K, List<V>> map, K k10, V v10) {
        List<V> arrayList = map.get(k10);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(k10, arrayList);
        }
        return arrayList.add(v10);
    }

    public static final <K, V> V b(Map<K, List<V>> map, K k10) {
        List<V> list = map.get(k10);
        if (list == null) {
            return null;
        }
        V v10 = (V) r.K(list);
        if (!list.isEmpty()) {
            return v10;
        }
        map.remove(k10);
        return v10;
    }
}
