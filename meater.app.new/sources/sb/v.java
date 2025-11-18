package sb;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: C, reason: collision with root package name */
    public static final a f49615C;

    /* renamed from: D, reason: collision with root package name */
    public static final Set<v> f49616D;

    /* renamed from: E, reason: collision with root package name */
    public static final Set<v> f49617E;

    /* renamed from: F, reason: collision with root package name */
    public static final v f49618F = new v("VISIBILITY", 0, true);

    /* renamed from: G, reason: collision with root package name */
    public static final v f49619G = new v("MODALITY", 1, true);

    /* renamed from: H, reason: collision with root package name */
    public static final v f49620H = new v("OVERRIDE", 2, true);

    /* renamed from: I, reason: collision with root package name */
    public static final v f49621I = new v("ANNOTATIONS", 3, false);

    /* renamed from: J, reason: collision with root package name */
    public static final v f49622J = new v("INNER", 4, true);

    /* renamed from: K, reason: collision with root package name */
    public static final v f49623K = new v("MEMBER_KIND", 5, true);

    /* renamed from: L, reason: collision with root package name */
    public static final v f49624L = new v("DATA", 6, true);

    /* renamed from: M, reason: collision with root package name */
    public static final v f49625M = new v("INLINE", 7, true);

    /* renamed from: N, reason: collision with root package name */
    public static final v f49626N = new v("EXPECT", 8, true);

    /* renamed from: O, reason: collision with root package name */
    public static final v f49627O = new v("ACTUAL", 9, true);

    /* renamed from: P, reason: collision with root package name */
    public static final v f49628P = new v("CONST", 10, true);

    /* renamed from: Q, reason: collision with root package name */
    public static final v f49629Q = new v("LATEINIT", 11, true);

    /* renamed from: R, reason: collision with root package name */
    public static final v f49630R = new v("FUN", 12, true);

    /* renamed from: S, reason: collision with root package name */
    public static final v f49631S = new v("VALUE", 13, true);

    /* renamed from: T, reason: collision with root package name */
    private static final /* synthetic */ v[] f49632T;

    /* renamed from: U, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f49633U;

    /* renamed from: B, reason: collision with root package name */
    private final boolean f49634B;

    /* compiled from: DescriptorRenderer.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    static {
        v[] vVarArrC = c();
        f49632T = vVarArrC;
        f49633U = C4929b.a(vVarArrC);
        f49615C = new a(null);
        v[] vVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (v vVar : vVarArrValues) {
            if (vVar.f49634B) {
                arrayList.add(vVar);
            }
        }
        f49616D = kotlin.collections.r.b1(arrayList);
        f49617E = C3831l.U0(values());
    }

    private v(String str, int i10, boolean z10) {
        this.f49634B = z10;
    }

    private static final /* synthetic */ v[] c() {
        return new v[]{f49618F, f49619G, f49620H, f49621I, f49622J, f49623K, f49624L, f49625M, f49626N, f49627O, f49628P, f49629Q, f49630R, f49631S};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f49632T.clone();
    }
}
