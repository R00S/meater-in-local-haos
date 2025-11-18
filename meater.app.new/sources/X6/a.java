package X6;

import K6.f;
import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: PriorityMapping.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray<f> f18768a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap<f, Integer> f18769b;

    static {
        HashMap<f, Integer> map = new HashMap<>();
        f18769b = map;
        map.put(f.DEFAULT, 0);
        f18769b.put(f.VERY_LOW, 1);
        f18769b.put(f.HIGHEST, 2);
        for (f fVar : f18769b.keySet()) {
            f18768a.append(f18769b.get(fVar).intValue(), fVar);
        }
    }

    public static int a(f fVar) {
        Integer num = f18769b.get(fVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + fVar);
    }

    public static f b(int i10) {
        f fVar = f18768a.get(i10);
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
