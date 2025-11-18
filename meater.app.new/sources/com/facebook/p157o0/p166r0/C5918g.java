package com.facebook.p157o0.p166r0;

import com.facebook.p157o0.p166r0.C5919h;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.C10773s;
import kotlin.collections.C10810q0;
import kotlin.collections.C10822w0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import org.json.JSONException;

/* compiled from: Model.kt */
/* renamed from: com.facebook.o0.r0.g */
/* loaded from: classes2.dex */
public final class C5918g {

    /* renamed from: a */
    public static final a f15417a = new a(null);

    /* renamed from: b */
    private static final Map<String, String> f15418b = C10810q0.m38799k(C10773s.m38547a("embedding.weight", "embed.weight"), C10773s.m38547a("dense1.weight", "fc1.weight"), C10773s.m38547a("dense2.weight", "fc2.weight"), C10773s.m38547a("dense3.weight", "fc3.weight"), C10773s.m38547a("dense1.bias", "fc1.bias"), C10773s.m38547a("dense2.bias", "fc2.bias"), C10773s.m38547a("dense3.bias", "fc3.bias"));

    /* renamed from: c */
    private final C5917f f15419c;

    /* renamed from: d */
    private final C5917f f15420d;

    /* renamed from: e */
    private final C5917f f15421e;

    /* renamed from: f */
    private final C5917f f15422f;

    /* renamed from: g */
    private final C5917f f15423g;

    /* renamed from: h */
    private final C5917f f15424h;

    /* renamed from: i */
    private final C5917f f15425i;

    /* renamed from: j */
    private final C5917f f15426j;

    /* renamed from: k */
    private final C5917f f15427k;

    /* renamed from: l */
    private final C5917f f15428l;

    /* renamed from: m */
    private final C5917f f15429m;

    /* renamed from: n */
    private final Map<String, C5917f> f15430n;

    /* compiled from: Model.kt */
    /* renamed from: com.facebook.o0.r0.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: b */
        private final Map<String, C5917f> m12681b(File file) throws JSONException, IOException {
            C5921j c5921j = C5921j.f15450a;
            Map<String, C5917f> mapM12737c = C5921j.m12737c(file);
            if (mapM12737c == null) {
                return null;
            }
            HashMap map = new HashMap();
            Map map2 = C5918g.f15418b;
            for (Map.Entry<String, C5917f> entry : mapM12737c.entrySet()) {
                String key = entry.getKey();
                if (map2.containsKey(entry.getKey()) && (key = (String) map2.get(entry.getKey())) == null) {
                    return null;
                }
                map.put(key, entry.getValue());
            }
            return map;
        }

        /* renamed from: a */
        public final C5918g m12682a(File file) {
            C9801m.m32346f(file, "file");
            Map<String, C5917f> mapM12681b = m12681b(file);
            C9789g c9789g = null;
            if (mapM12681b == null) {
                return null;
            }
            try {
                return new C5918g(mapM12681b, c9789g);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private C5918g(Map<String, C5917f> map) {
        C5917f c5917f = map.get("embed.weight");
        if (c5917f == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15419c = c5917f;
        C5920i c5920i = C5920i.f15449a;
        C5917f c5917f2 = map.get("convs.0.weight");
        if (c5917f2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15420d = C5920i.m12735l(c5917f2);
        C5917f c5917f3 = map.get("convs.1.weight");
        if (c5917f3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15421e = C5920i.m12735l(c5917f3);
        C5917f c5917f4 = map.get("convs.2.weight");
        if (c5917f4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15422f = C5920i.m12735l(c5917f4);
        C5917f c5917f5 = map.get("convs.0.bias");
        if (c5917f5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15423g = c5917f5;
        C5917f c5917f6 = map.get("convs.1.bias");
        if (c5917f6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15424h = c5917f6;
        C5917f c5917f7 = map.get("convs.2.bias");
        if (c5917f7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15425i = c5917f7;
        C5917f c5917f8 = map.get("fc1.weight");
        if (c5917f8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15426j = C5920i.m12734k(c5917f8);
        C5917f c5917f9 = map.get("fc2.weight");
        if (c5917f9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15427k = C5920i.m12734k(c5917f9);
        C5917f c5917f10 = map.get("fc1.bias");
        if (c5917f10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15428l = c5917f10;
        C5917f c5917f11 = map.get("fc2.bias");
        if (c5917f11 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15429m = c5917f11;
        this.f15430n = new HashMap();
        for (String str : C10822w0.m38922i(C5919h.a.MTML_INTEGRITY_DETECT.m12703k(), C5919h.a.MTML_APP_EVENT_PREDICTION.m12703k())) {
            String strM32354n = C9801m.m32354n(str, ".weight");
            String strM32354n2 = C9801m.m32354n(str, ".bias");
            C5917f c5917f12 = map.get(strM32354n);
            C5917f c5917f13 = map.get(strM32354n2);
            if (c5917f12 != null) {
                C5920i c5920i2 = C5920i.f15449a;
                this.f15430n.put(strM32354n, C5920i.m12734k(c5917f12));
            }
            if (c5917f13 != null) {
                this.f15430n.put(strM32354n2, c5917f13);
            }
        }
    }

    public /* synthetic */ C5918g(Map map, C9789g c9789g) {
        this(map);
    }

    /* renamed from: b */
    public final C5917f m12680b(C5917f c5917f, String[] strArr, String str) {
        C9801m.m32346f(c5917f, "dense");
        C9801m.m32346f(strArr, "texts");
        C9801m.m32346f(str, "task");
        C5920i c5920i = C5920i.f15449a;
        C5917f c5917fM12726c = C5920i.m12726c(C5920i.m12728e(strArr, 128, this.f15419c), this.f15420d);
        C5920i.m12724a(c5917fM12726c, this.f15423g);
        C5920i.m12732i(c5917fM12726c);
        C5917f c5917fM12726c2 = C5920i.m12726c(c5917fM12726c, this.f15421e);
        C5920i.m12724a(c5917fM12726c2, this.f15424h);
        C5920i.m12732i(c5917fM12726c2);
        C5917f c5917fM12730g = C5920i.m12730g(c5917fM12726c2, 2);
        C5917f c5917fM12726c3 = C5920i.m12726c(c5917fM12730g, this.f15422f);
        C5920i.m12724a(c5917fM12726c3, this.f15425i);
        C5920i.m12732i(c5917fM12726c3);
        C5917f c5917fM12730g2 = C5920i.m12730g(c5917fM12726c, c5917fM12726c.m12674b(1));
        C5917f c5917fM12730g3 = C5920i.m12730g(c5917fM12730g, c5917fM12730g.m12674b(1));
        C5917f c5917fM12730g4 = C5920i.m12730g(c5917fM12726c3, c5917fM12726c3.m12674b(1));
        C5920i.m12729f(c5917fM12730g2, 1);
        C5920i.m12729f(c5917fM12730g3, 1);
        C5920i.m12729f(c5917fM12730g4, 1);
        C5917f c5917fM12727d = C5920i.m12727d(C5920i.m12725b(new C5917f[]{c5917fM12730g2, c5917fM12730g3, c5917fM12730g4, c5917f}), this.f15426j, this.f15428l);
        C5920i.m12732i(c5917fM12727d);
        C5917f c5917fM12727d2 = C5920i.m12727d(c5917fM12727d, this.f15427k, this.f15429m);
        C5920i.m12732i(c5917fM12727d2);
        C5917f c5917f2 = this.f15430n.get(C9801m.m32354n(str, ".weight"));
        C5917f c5917f3 = this.f15430n.get(C9801m.m32354n(str, ".bias"));
        if (c5917f2 == null || c5917f3 == null) {
            return null;
        }
        C5917f c5917fM12727d3 = C5920i.m12727d(c5917fM12727d2, c5917f2, c5917f3);
        C5920i.m12733j(c5917fM12727d3);
        return c5917fM12727d3;
    }
}
