package p6;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy.java */
/* loaded from: classes2.dex */
public class m implements k {

    /* renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f47642d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f47643e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f47644f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f47645g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f47646h;

    /* renamed from: a, reason: collision with root package name */
    private final c f47647a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final g<b, Bitmap> f47648b = new g<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f47649c = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47650a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f47650a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47650a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47650a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47650a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        private final c f47651a;

        /* renamed from: b, reason: collision with root package name */
        int f47652b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f47653c;

        public b(c cVar) {
            this.f47651a = cVar;
        }

        @Override // p6.l
        public void a() {
            this.f47651a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f47652b = i10;
            this.f47653c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f47652b == bVar.f47652b && H6.l.d(this.f47653c, bVar.f47653c);
        }

        public int hashCode() {
            int i10 = this.f47652b * 31;
            Bitmap.Config config = this.f47653c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.h(this.f47652b, this.f47653c);
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    static class c extends AbstractC4238c<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p6.AbstractC4238c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVarB = b();
            bVarB.b(i10, config);
            return bVarB;
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f47642d = configArr;
        f47643e = configArr;
        f47644f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f47645g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f47646h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num2 = navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    private b g(int i10, Bitmap.Config config) {
        b bVarE = this.f47647a.e(i10, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer numCeilingKey = j(config2).ceilingKey(Integer.valueOf(i10));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i10 * 8) {
                if (numCeilingKey.intValue() == i10) {
                    if (config2 == null) {
                        if (config == null) {
                            return bVarE;
                        }
                    } else if (config2.equals(config)) {
                        return bVarE;
                    }
                }
                this.f47647a.c(bVarE);
                return this.f47647a.e(numCeilingKey.intValue(), config2);
            }
        }
        return bVarE;
    }

    static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            return f47643e;
        }
        int i10 = a.f47650a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f47646h : f47645g : f47644f : f47642d;
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f47649c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f47649c.put(config, treeMap);
        return treeMap;
    }

    @Override // p6.k
    public String a(int i10, int i11, Bitmap.Config config) {
        return h(H6.l.g(i10, i11, config), config);
    }

    @Override // p6.k
    public int b(Bitmap bitmap) {
        return H6.l.h(bitmap);
    }

    @Override // p6.k
    public void c(Bitmap bitmap) {
        b bVarE = this.f47647a.e(H6.l.h(bitmap), bitmap.getConfig());
        this.f47648b.d(bVarE, bitmap);
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num = navigableMapJ.get(Integer.valueOf(bVarE.f47652b));
        navigableMapJ.put(Integer.valueOf(bVarE.f47652b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p6.k
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        b bVarG = g(H6.l.g(i10, i11, config), config);
        Bitmap bitmapA = this.f47648b.a(bVarG);
        if (bitmapA != null) {
            f(Integer.valueOf(bVarG.f47652b), bitmapA);
            bitmapA.reconfigure(i10, i11, config);
        }
        return bitmapA;
    }

    @Override // p6.k
    public String e(Bitmap bitmap) {
        return h(H6.l.h(bitmap), bitmap.getConfig());
    }

    @Override // p6.k
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f47648b.f();
        if (bitmapF != null) {
            f(Integer.valueOf(H6.l.h(bitmapF)), bitmapF);
        }
        return bitmapF;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f47648b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f47649c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f47649c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
