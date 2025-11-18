package g2;

import X1.L;
import android.os.SystemClock;
import android.util.Pair;
import h2.C3486b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import m8.C3982E;

/* compiled from: BaseUrlExclusionList.java */
/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3382b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f41545a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, Long> f41546b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<List<Pair<String, Integer>>, C3486b> f41547c;

    /* renamed from: d, reason: collision with root package name */
    private final Random f41548d;

    public C3382b() {
        this(new Random());
    }

    private static <T> void b(T t10, long j10, Map<T, Long> map) {
        if (map.containsKey(t10)) {
            j10 = Math.max(j10, ((Long) L.i(map.get(t10))).longValue());
        }
        map.put(t10, Long.valueOf(j10));
    }

    private List<C3486b> c(List<C3486b> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h(jElapsedRealtime, this.f41545a);
        h(jElapsedRealtime, this.f41546b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C3486b c3486b = list.get(i10);
            if (!this.f41545a.containsKey(c3486b.f42214b) && !this.f41546b.containsKey(Integer.valueOf(c3486b.f42215c))) {
                arrayList.add(c3486b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(C3486b c3486b, C3486b c3486b2) {
        int iCompare = Integer.compare(c3486b.f42215c, c3486b2.f42215c);
        return iCompare != 0 ? iCompare : c3486b.f42214b.compareTo(c3486b2.f42214b);
    }

    public static int f(List<C3486b> list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(list.get(i10).f42215c));
        }
        return hashSet.size();
    }

    private static <T> void h(long j10, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    private C3486b k(List<C3486b> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += list.get(i11).f42216d;
        }
        int iNextInt = this.f41548d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            C3486b c3486b = list.get(i13);
            i12 += c3486b.f42216d;
            if (iNextInt < i12) {
                return c3486b;
            }
        }
        return (C3486b) C3982E.e(list);
    }

    public void e(C3486b c3486b, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(c3486b.f42214b, jElapsedRealtime, this.f41545a);
        int i10 = c3486b.f42215c;
        if (i10 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i10), jElapsedRealtime, this.f41546b);
        }
    }

    public int g(List<C3486b> list) {
        HashSet hashSet = new HashSet();
        List<C3486b> listC = c(list);
        for (int i10 = 0; i10 < listC.size(); i10++) {
            hashSet.add(Integer.valueOf(listC.get(i10).f42215c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f41545a.clear();
        this.f41546b.clear();
        this.f41547c.clear();
    }

    public C3486b j(List<C3486b> list) {
        List<C3486b> listC = c(list);
        if (listC.size() < 2) {
            return (C3486b) C3982E.d(listC, null);
        }
        Collections.sort(listC, new Comparator() { // from class: g2.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C3382b.d((C3486b) obj, (C3486b) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i10 = listC.get(0).f42215c;
        int i11 = 0;
        while (true) {
            if (i11 >= listC.size()) {
                break;
            }
            C3486b c3486b = listC.get(i11);
            if (i10 == c3486b.f42215c) {
                arrayList.add(new Pair(c3486b.f42214b, Integer.valueOf(c3486b.f42216d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return listC.get(0);
            }
        }
        C3486b c3486b2 = this.f41547c.get(arrayList);
        if (c3486b2 != null) {
            return c3486b2;
        }
        C3486b c3486bK = k(listC.subList(0, arrayList.size()));
        this.f41547c.put(arrayList, c3486bK);
        return c3486bK;
    }

    C3382b(Random random) {
        this.f41547c = new HashMap();
        this.f41548d = random;
        this.f41545a = new HashMap();
        this.f41546b = new HashMap();
    }
}
