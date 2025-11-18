package Y2;

import W1.a;
import X1.C1804a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: TtmlNode.java */
/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f19325a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19326b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19327c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19328d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19329e;

    /* renamed from: f, reason: collision with root package name */
    public final g f19330f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f19331g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19332h;

    /* renamed from: i, reason: collision with root package name */
    public final String f19333i;

    /* renamed from: j, reason: collision with root package name */
    public final c f19334j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f19335k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f19336l;

    /* renamed from: m, reason: collision with root package name */
    private List<c> f19337m;

    private c(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f19325a = str;
        this.f19326b = str2;
        this.f19333i = str4;
        this.f19330f = gVar;
        this.f19331g = strArr;
        this.f19327c = str2 != null;
        this.f19328d = j10;
        this.f19329e = j11;
        this.f19332h = (String) C1804a.e(str3);
        this.f19334j = cVar;
        this.f19335k = new HashMap<>();
        this.f19336l = new HashMap<>();
    }

    private void b(Map<String, g> map, a.b bVar, int i10, int i11, int i12) {
        g gVarF = f.f(this.f19330f, this.f19331g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i10, i11, gVarF, this.f19334j, map, i12);
            if ("p".equals(this.f19325a)) {
                if (gVarF.k() != Float.MAX_VALUE) {
                    bVar.m((gVarF.k() * (-90.0f)) / 100.0f);
                }
                if (gVarF.m() != null) {
                    bVar.p(gVarF.m());
                }
                if (gVarF.h() != null) {
                    bVar.j(gVarF.h());
                }
            }
        }
    }

    public static c c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, c cVar) {
        return new c(str, null, j10, j11, gVar, strArr, str2, str3, cVar);
    }

    public static c d(String str) {
        return new c(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet<Long> treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f19325a);
        boolean zEquals2 = "div".equals(this.f19325a);
        if (z10 || zEquals || (zEquals2 && this.f19333i != null)) {
            long j10 = this.f19328d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f19329e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f19337m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f19337m.size(); i10++) {
            this.f19337m.get(i10).i(treeSet, z10 || zEquals);
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, a.b> map) {
        if (!map.containsKey(str)) {
            a.b bVar = new a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) C1804a.e(map.get(str).e());
    }

    private void n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f19332h)) {
            str = this.f19332h;
        }
        if (m(j10) && "div".equals(this.f19325a) && this.f19333i != null) {
            list.add(new Pair<>(str, this.f19333i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    private void o(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, a.b> map3) {
        int i10;
        if (m(j10)) {
            String str2 = "".equals(this.f19332h) ? str : this.f19332h;
            Iterator<Map.Entry<String, Integer>> it = this.f19336l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f19335k.containsKey(key) ? this.f19335k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (a.b) C1804a.e(map3.get(key)), iIntValue, iIntValue2, ((e) C1804a.e(map2.get(str2))).f19361j);
                }
            }
            while (i10 < g()) {
                f(i10).o(j10, map, map2, str2, map3);
                i10++;
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map<String, a.b> map) {
        this.f19335k.clear();
        this.f19336l.clear();
        if ("metadata".equals(this.f19325a)) {
            return;
        }
        if (!"".equals(this.f19332h)) {
            str = this.f19332h;
        }
        if (this.f19327c && z10) {
            k(str, map).append((CharSequence) C1804a.e(this.f19326b));
            return;
        }
        if ("br".equals(this.f19325a) && z10) {
            k(str, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry<String, a.b> entry : map.entrySet()) {
                this.f19335k.put(entry.getKey(), Integer.valueOf(((CharSequence) C1804a.e(entry.getValue().e())).length()));
            }
            boolean zEquals = "p".equals(this.f19325a);
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).p(j10, z10 || zEquals, str, map);
            }
            if (zEquals) {
                f.c(k(str, map));
            }
            for (Map.Entry<String, a.b> entry2 : map.entrySet()) {
                this.f19336l.put(entry2.getKey(), Integer.valueOf(((CharSequence) C1804a.e(entry2.getValue().e())).length()));
            }
        }
    }

    public void a(c cVar) {
        if (this.f19337m == null) {
            this.f19337m = new ArrayList();
        }
        this.f19337m.add(cVar);
    }

    public c f(int i10) {
        List<c> list = this.f19337m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<c> list = this.f19337m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<W1.a> h(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j10, this.f19332h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f19332h, treeMap);
        o(j10, map, map2, this.f19332h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) C1804a.e(map2.get(pair.first));
                arrayList2.add(new a.b().f(bitmapDecodeByteArray).k(eVar.f19353b).l(0).h(eVar.f19354c, 0).i(eVar.f19356e).n(eVar.f19357f).g(eVar.f19358g).r(eVar.f19361j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) C1804a.e(map2.get(entry.getKey()));
            a.b bVar = (a.b) entry.getValue();
            e((SpannableStringBuilder) C1804a.e(bVar.e()));
            bVar.h(eVar2.f19354c, eVar2.f19355d);
            bVar.i(eVar2.f19356e);
            bVar.k(eVar2.f19353b);
            bVar.n(eVar2.f19357f);
            bVar.q(eVar2.f19360i, eVar2.f19359h);
            bVar.r(eVar2.f19361j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f19331g;
    }

    public boolean m(long j10) {
        long j11 = this.f19328d;
        return (j11 == -9223372036854775807L && this.f19329e == -9223372036854775807L) || (j11 <= j10 && this.f19329e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f19329e) || (j11 <= j10 && j10 < this.f19329e));
    }
}
