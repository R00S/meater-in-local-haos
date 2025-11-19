package Ub;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\tj\u0002\b\u0013¨\u0006\u0014"}, d2 = {"LUb/m;", "", "", "", "value", "mask", "<init>", "(Ljava/lang/String;III)V", "B", "I", "j", "()I", "C", "getMask", "D", "E", "F", "G", "H", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: D, reason: collision with root package name */
    public static final m f17962D;

    /* renamed from: E, reason: collision with root package name */
    public static final m f17963E;

    /* renamed from: F, reason: collision with root package name */
    public static final m f17964F;

    /* renamed from: G, reason: collision with root package name */
    public static final m f17965G;

    /* renamed from: H, reason: collision with root package name */
    public static final m f17966H;

    /* renamed from: I, reason: collision with root package name */
    public static final m f17967I;

    /* renamed from: J, reason: collision with root package name */
    public static final m f17968J;

    /* renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ m[] f17969K;

    /* renamed from: L, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f17970L;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    static {
        int i10 = 2;
        f17962D = new m("IGNORE_CASE", 0, i10, 0, 2, null);
        int i11 = 2;
        C3854k c3854k = null;
        int i12 = 0;
        f17963E = new m("MULTILINE", 1, 8, i12, i11, c3854k);
        int i13 = 2;
        C3854k c3854k2 = null;
        int i14 = 0;
        f17964F = new m("LITERAL", i10, 16, i14, i13, c3854k2);
        f17965G = new m("UNIX_LINES", 3, 1, i12, i11, c3854k);
        f17966H = new m("COMMENTS", 4, 4, i14, i13, c3854k2);
        f17967I = new m("DOT_MATCHES_ALL", 5, 32, i12, i11, c3854k);
        f17968J = new m("CANON_EQ", 6, 128, i14, i13, c3854k2);
        m[] mVarArrC = c();
        f17969K = mVarArrC;
        f17970L = C4929b.a(mVarArrC);
    }

    private m(String str, int i10, int i11, int i12) {
        this.value = i11;
        this.mask = i12;
    }

    private static final /* synthetic */ m[] c() {
        return new m[]{f17962D, f17963E, f17964F, f17965G, f17966H, f17967I, f17968J};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f17969K.clone();
    }

    /* renamed from: j, reason: from getter */
    public int getValue() {
        return this.value;
    }

    /* synthetic */ m(String str, int i10, int i11, int i12, int i13, C3854k c3854k) {
        this(str, i10, i11, (i13 & 2) != 0 ? i11 : i12);
    }
}
