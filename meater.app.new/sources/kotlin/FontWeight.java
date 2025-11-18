package kotlin;

import com.apptionlabs.meater_app.data.Temperature;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: FontWeight.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0017"}, d2 = {"LL0/B;", "", "", "weight", "<init>", "(I)V", "other", "w", "(LL0/B;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "B", "I", "x", "C", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.B, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class FontWeight implements Comparable<FontWeight> {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    private static final FontWeight f8922D;

    /* renamed from: E, reason: collision with root package name */
    private static final FontWeight f8923E;

    /* renamed from: F, reason: collision with root package name */
    private static final FontWeight f8924F;

    /* renamed from: G, reason: collision with root package name */
    private static final FontWeight f8925G;

    /* renamed from: H, reason: collision with root package name */
    private static final FontWeight f8926H;

    /* renamed from: I, reason: collision with root package name */
    private static final FontWeight f8927I;

    /* renamed from: J, reason: collision with root package name */
    private static final FontWeight f8928J;

    /* renamed from: K, reason: collision with root package name */
    private static final FontWeight f8929K;

    /* renamed from: L, reason: collision with root package name */
    private static final FontWeight f8930L;

    /* renamed from: M, reason: collision with root package name */
    private static final FontWeight f8931M;

    /* renamed from: N, reason: collision with root package name */
    private static final FontWeight f8932N;

    /* renamed from: O, reason: collision with root package name */
    private static final FontWeight f8933O;

    /* renamed from: P, reason: collision with root package name */
    private static final FontWeight f8934P;

    /* renamed from: Q, reason: collision with root package name */
    private static final FontWeight f8935Q;

    /* renamed from: R, reason: collision with root package name */
    private static final FontWeight f8936R;

    /* renamed from: S, reason: collision with root package name */
    private static final FontWeight f8937S;

    /* renamed from: T, reason: collision with root package name */
    private static final FontWeight f8938T;

    /* renamed from: U, reason: collision with root package name */
    private static final FontWeight f8939U;

    /* renamed from: V, reason: collision with root package name */
    private static final List<FontWeight> f8940V;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final int weight;

    /* compiled from: FontWeight.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"LL0/B$a;", "", "<init>", "()V", "LL0/B;", "W400", "LL0/B;", "f", "()LL0/B;", "getW400$annotations", "W500", "g", "getW500$annotations", "W600", "h", "getW600$annotations", "Light", "b", "getLight$annotations", "Normal", "d", "getNormal$annotations", "Medium", "c", "getMedium$annotations", "SemiBold", "e", "getSemiBold$annotations", "Bold", "a", "getBold$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L0.B$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final FontWeight a() {
            return FontWeight.f8937S;
        }

        public final FontWeight b() {
            return FontWeight.f8933O;
        }

        public final FontWeight c() {
            return FontWeight.f8935Q;
        }

        public final FontWeight d() {
            return FontWeight.f8934P;
        }

        public final FontWeight e() {
            return FontWeight.f8936R;
        }

        public final FontWeight f() {
            return FontWeight.f8925G;
        }

        public final FontWeight g() {
            return FontWeight.f8926H;
        }

        public final FontWeight h() {
            return FontWeight.f8927I;
        }

        private Companion() {
        }
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        f8922D = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        f8923E = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(300);
        f8924F = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(400);
        f8925G = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(Temperature.MAX_AMBIENT_SECOND_GEN_PROBE);
        f8926H = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        f8927I = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        f8928J = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        f8929K = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        f8930L = fontWeight9;
        f8931M = fontWeight;
        f8932N = fontWeight2;
        f8933O = fontWeight3;
        f8934P = fontWeight4;
        f8935Q = fontWeight5;
        f8936R = fontWeight6;
        f8937S = fontWeight7;
        f8938T = fontWeight8;
        f8939U = fontWeight9;
        f8940V = r.p(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
    }

    public FontWeight(int i10) {
        this.weight = i10;
        if (1 > i10 || i10 >= 1001) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i10).toString());
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FontWeight) && this.weight == ((FontWeight) other).weight;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        return "FontWeight(weight=" + this.weight + ')';
    }

    @Override // java.lang.Comparable
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int compareTo(FontWeight other) {
        return C3862t.i(this.weight, other.weight);
    }

    public final int x() {
        return this.weight;
    }
}
