package p241e.p254e.p256b.p257a.p258i.p263d0;

import android.util.SparseArray;
import java.util.HashMap;
import p241e.p254e.p256b.p257a.EnumC8787d;

/* compiled from: PriorityMapping.java */
/* renamed from: e.e.b.a.i.d0.a */
/* loaded from: classes2.dex */
public final class C8861a {

    /* renamed from: a */
    private static SparseArray<EnumC8787d> f33581a = new SparseArray<>();

    /* renamed from: b */
    private static HashMap<EnumC8787d, Integer> f33582b;

    static {
        HashMap<EnumC8787d, Integer> map = new HashMap<>();
        f33582b = map;
        map.put(EnumC8787d.DEFAULT, 0);
        f33582b.put(EnumC8787d.VERY_LOW, 1);
        f33582b.put(EnumC8787d.HIGHEST, 2);
        for (EnumC8787d enumC8787d : f33582b.keySet()) {
            f33581a.append(f33582b.get(enumC8787d).intValue(), enumC8787d);
        }
    }

    /* renamed from: a */
    public static int m28132a(EnumC8787d enumC8787d) {
        Integer num = f33582b.get(enumC8787d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC8787d);
    }

    /* renamed from: b */
    public static EnumC8787d m28133b(int i2) {
        EnumC8787d enumC8787d = f33581a.get(i2);
        if (enumC8787d != null) {
            return enumC8787d;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i2);
    }
}
