package oc;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: CipherSuite.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007¨\u0006\f"}, d2 = {"Loc/i;", "", "", "javaName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "b", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: A, reason: collision with root package name */
    public static final i f46905A;

    /* renamed from: A0, reason: collision with root package name */
    public static final i f46906A0;

    /* renamed from: B, reason: collision with root package name */
    public static final i f46907B;

    /* renamed from: B0, reason: collision with root package name */
    public static final i f46908B0;

    /* renamed from: C, reason: collision with root package name */
    public static final i f46909C;

    /* renamed from: C0, reason: collision with root package name */
    public static final i f46910C0;

    /* renamed from: D, reason: collision with root package name */
    public static final i f46911D;

    /* renamed from: D0, reason: collision with root package name */
    public static final i f46912D0;

    /* renamed from: E, reason: collision with root package name */
    public static final i f46913E;

    /* renamed from: E0, reason: collision with root package name */
    public static final i f46914E0;

    /* renamed from: F, reason: collision with root package name */
    public static final i f46915F;

    /* renamed from: F0, reason: collision with root package name */
    public static final i f46916F0;

    /* renamed from: G, reason: collision with root package name */
    public static final i f46917G;

    /* renamed from: G0, reason: collision with root package name */
    public static final i f46918G0;

    /* renamed from: H, reason: collision with root package name */
    public static final i f46919H;

    /* renamed from: H0, reason: collision with root package name */
    public static final i f46920H0;

    /* renamed from: I, reason: collision with root package name */
    public static final i f46921I;

    /* renamed from: I0, reason: collision with root package name */
    public static final i f46922I0;

    /* renamed from: J, reason: collision with root package name */
    public static final i f46923J;

    /* renamed from: J0, reason: collision with root package name */
    public static final i f46924J0;

    /* renamed from: K, reason: collision with root package name */
    public static final i f46925K;

    /* renamed from: K0, reason: collision with root package name */
    public static final i f46926K0;

    /* renamed from: L, reason: collision with root package name */
    public static final i f46927L;

    /* renamed from: L0, reason: collision with root package name */
    public static final i f46928L0;

    /* renamed from: M, reason: collision with root package name */
    public static final i f46929M;

    /* renamed from: M0, reason: collision with root package name */
    public static final i f46930M0;

    /* renamed from: N, reason: collision with root package name */
    public static final i f46931N;

    /* renamed from: N0, reason: collision with root package name */
    public static final i f46932N0;

    /* renamed from: O, reason: collision with root package name */
    public static final i f46933O;

    /* renamed from: O0, reason: collision with root package name */
    public static final i f46934O0;

    /* renamed from: P, reason: collision with root package name */
    public static final i f46935P;

    /* renamed from: P0, reason: collision with root package name */
    public static final i f46936P0;

    /* renamed from: Q, reason: collision with root package name */
    public static final i f46937Q;

    /* renamed from: Q0, reason: collision with root package name */
    public static final i f46938Q0;

    /* renamed from: R, reason: collision with root package name */
    public static final i f46939R;

    /* renamed from: R0, reason: collision with root package name */
    public static final i f46940R0;

    /* renamed from: S, reason: collision with root package name */
    public static final i f46941S;

    /* renamed from: S0, reason: collision with root package name */
    public static final i f46942S0;

    /* renamed from: T, reason: collision with root package name */
    public static final i f46943T;

    /* renamed from: T0, reason: collision with root package name */
    public static final i f46944T0;

    /* renamed from: U, reason: collision with root package name */
    public static final i f46945U;

    /* renamed from: U0, reason: collision with root package name */
    public static final i f46946U0;

    /* renamed from: V, reason: collision with root package name */
    public static final i f46947V;

    /* renamed from: V0, reason: collision with root package name */
    public static final i f46948V0;

    /* renamed from: W, reason: collision with root package name */
    public static final i f46949W;

    /* renamed from: W0, reason: collision with root package name */
    public static final i f46950W0;

    /* renamed from: X, reason: collision with root package name */
    public static final i f46951X;

    /* renamed from: X0, reason: collision with root package name */
    public static final i f46952X0;

    /* renamed from: Y, reason: collision with root package name */
    public static final i f46953Y;

    /* renamed from: Y0, reason: collision with root package name */
    public static final i f46954Y0;

    /* renamed from: Z, reason: collision with root package name */
    public static final i f46955Z;

    /* renamed from: Z0, reason: collision with root package name */
    public static final i f46956Z0;

    /* renamed from: a0, reason: collision with root package name */
    public static final i f46957a0;

    /* renamed from: a1, reason: collision with root package name */
    public static final i f46958a1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: b0, reason: collision with root package name */
    public static final i f46960b0;

    /* renamed from: b1, reason: collision with root package name */
    public static final i f46961b1;

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator<String> f46962c;

    /* renamed from: c0, reason: collision with root package name */
    public static final i f46963c0;

    /* renamed from: c1, reason: collision with root package name */
    public static final i f46964c1;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, i> f46965d;

    /* renamed from: d0, reason: collision with root package name */
    public static final i f46966d0;

    /* renamed from: d1, reason: collision with root package name */
    public static final i f46967d1;

    /* renamed from: e, reason: collision with root package name */
    public static final i f46968e;

    /* renamed from: e0, reason: collision with root package name */
    public static final i f46969e0;

    /* renamed from: e1, reason: collision with root package name */
    public static final i f46970e1;

    /* renamed from: f, reason: collision with root package name */
    public static final i f46971f;

    /* renamed from: f0, reason: collision with root package name */
    public static final i f46972f0;

    /* renamed from: f1, reason: collision with root package name */
    public static final i f46973f1;

    /* renamed from: g, reason: collision with root package name */
    public static final i f46974g;

    /* renamed from: g0, reason: collision with root package name */
    public static final i f46975g0;

    /* renamed from: g1, reason: collision with root package name */
    public static final i f46976g1;

    /* renamed from: h, reason: collision with root package name */
    public static final i f46977h;

    /* renamed from: h0, reason: collision with root package name */
    public static final i f46978h0;

    /* renamed from: h1, reason: collision with root package name */
    public static final i f46979h1;

    /* renamed from: i, reason: collision with root package name */
    public static final i f46980i;

    /* renamed from: i0, reason: collision with root package name */
    public static final i f46981i0;

    /* renamed from: i1, reason: collision with root package name */
    public static final i f46982i1;

    /* renamed from: j, reason: collision with root package name */
    public static final i f46983j;

    /* renamed from: j0, reason: collision with root package name */
    public static final i f46984j0;

    /* renamed from: j1, reason: collision with root package name */
    public static final i f46985j1;

    /* renamed from: k, reason: collision with root package name */
    public static final i f46986k;

    /* renamed from: k0, reason: collision with root package name */
    public static final i f46987k0;

    /* renamed from: k1, reason: collision with root package name */
    public static final i f46988k1;

    /* renamed from: l, reason: collision with root package name */
    public static final i f46989l;

    /* renamed from: l0, reason: collision with root package name */
    public static final i f46990l0;

    /* renamed from: l1, reason: collision with root package name */
    public static final i f46991l1;

    /* renamed from: m, reason: collision with root package name */
    public static final i f46992m;

    /* renamed from: m0, reason: collision with root package name */
    public static final i f46993m0;

    /* renamed from: m1, reason: collision with root package name */
    public static final i f46994m1;

    /* renamed from: n, reason: collision with root package name */
    public static final i f46995n;

    /* renamed from: n0, reason: collision with root package name */
    public static final i f46996n0;

    /* renamed from: n1, reason: collision with root package name */
    public static final i f46997n1;

    /* renamed from: o, reason: collision with root package name */
    public static final i f46998o;

    /* renamed from: o0, reason: collision with root package name */
    public static final i f46999o0;

    /* renamed from: o1, reason: collision with root package name */
    public static final i f47000o1;

    /* renamed from: p, reason: collision with root package name */
    public static final i f47001p;

    /* renamed from: p0, reason: collision with root package name */
    public static final i f47002p0;

    /* renamed from: p1, reason: collision with root package name */
    public static final i f47003p1;

    /* renamed from: q, reason: collision with root package name */
    public static final i f47004q;

    /* renamed from: q0, reason: collision with root package name */
    public static final i f47005q0;

    /* renamed from: q1, reason: collision with root package name */
    public static final i f47006q1;

    /* renamed from: r, reason: collision with root package name */
    public static final i f47007r;

    /* renamed from: r0, reason: collision with root package name */
    public static final i f47008r0;

    /* renamed from: r1, reason: collision with root package name */
    public static final i f47009r1;

    /* renamed from: s, reason: collision with root package name */
    public static final i f47010s;

    /* renamed from: s0, reason: collision with root package name */
    public static final i f47011s0;

    /* renamed from: s1, reason: collision with root package name */
    public static final i f47012s1;

    /* renamed from: t, reason: collision with root package name */
    public static final i f47013t;

    /* renamed from: t0, reason: collision with root package name */
    public static final i f47014t0;

    /* renamed from: u, reason: collision with root package name */
    public static final i f47015u;

    /* renamed from: u0, reason: collision with root package name */
    public static final i f47016u0;

    /* renamed from: v, reason: collision with root package name */
    public static final i f47017v;

    /* renamed from: v0, reason: collision with root package name */
    public static final i f47018v0;

    /* renamed from: w, reason: collision with root package name */
    public static final i f47019w;

    /* renamed from: w0, reason: collision with root package name */
    public static final i f47020w0;

    /* renamed from: x, reason: collision with root package name */
    public static final i f47021x;

    /* renamed from: x0, reason: collision with root package name */
    public static final i f47022x0;

    /* renamed from: y, reason: collision with root package name */
    public static final i f47023y;

    /* renamed from: y0, reason: collision with root package name */
    public static final i f47024y0;

    /* renamed from: z, reason: collision with root package name */
    public static final i f47025z;

    /* renamed from: z0, reason: collision with root package name */
    public static final i f47026z0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String javaName;

    /* compiled from: CipherSuite.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u001f\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"oc/i$a", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "a", "b", "", "(Ljava/lang/String;Ljava/lang/String;)I", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String a10, String b10) {
            C3862t.g(a10, "a");
            C3862t.g(b10, "b");
            int iMin = Math.min(a10.length(), b10.length());
            for (int i10 = 4; i10 < iMin; i10++) {
                char cCharAt = a10.charAt(i10);
                char cCharAt2 = b10.charAt(i10);
                if (cCharAt != cCharAt2) {
                    return C3862t.i(cCharAt, cCharAt2) < 0 ? -1 : 1;
                }
            }
            int length = a10.length();
            int length2 = b10.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    /* compiled from: CipherSuite.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b{\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010#\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010$\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0014\u0010%\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u0014\u0010&\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u0014\u0010'\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u0014\u0010(\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u0014\u0010)\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u0014\u0010*\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u0014\u0010+\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u0014\u0010,\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u0014\u0010-\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u0014\u0010.\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u0014\u0010/\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u0014\u00100\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u0014\u00101\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019R\u0014\u00102\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u0014\u00103\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0019R\u0014\u00104\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0019R\u0014\u00105\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0019R\u0014\u00106\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0019R\u0014\u00107\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0019R\u0014\u00108\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0019R\u0014\u00109\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0019R\u0014\u0010:\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0019R\u0014\u0010;\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0019R\u0014\u0010<\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0019R\u0014\u0010=\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0019R\u0014\u0010>\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0019R\u0014\u0010?\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0019R\u0014\u0010@\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0019R\u0014\u0010A\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0019R\u0014\u0010B\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0019R\u0014\u0010C\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0019R\u0014\u0010D\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0019R\u0014\u0010E\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0019R\u0014\u0010F\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0019R\u0014\u0010G\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0019R\u0014\u0010H\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0019R\u0014\u0010I\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0019R\u0014\u0010J\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0019R\u0014\u0010K\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0019R\u0014\u0010L\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0019R\u0014\u0010M\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0019R\u0014\u0010N\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0019R\u0014\u0010O\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0019R\u0014\u0010P\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010\u0019R\u0014\u0010Q\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0019R\u0014\u0010R\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0019R\u0014\u0010S\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0019R\u0014\u0010T\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0019R\u0014\u0010U\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0019R\u0014\u0010V\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010\u0019R\u0014\u0010W\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0019R\u0014\u0010X\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0019R\u0014\u0010Y\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010\u0019R\u0014\u0010Z\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0019R\u0014\u0010[\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0019R\u0014\u0010\\\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0019R\u0014\u0010]\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0019R\u0014\u0010^\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0019R\u0014\u0010_\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010\u0019R\u0014\u0010`\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010\u0019R\u0014\u0010a\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0019R\u0014\u0010b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0019R\u0014\u0010c\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010\u0019R\u0014\u0010d\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010\u0019R\u0014\u0010e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010\u0019R\u0014\u0010f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010\u0019R\u0014\u0010g\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bg\u0010\u0019R\u0014\u0010h\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010\u0019R\u0014\u0010i\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bi\u0010\u0019R\u0014\u0010j\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bj\u0010\u0019R\u0014\u0010k\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010\u0019R\u0014\u0010l\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010\u0019R\u0014\u0010m\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bm\u0010\u0019R\u0014\u0010n\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bn\u0010\u0019R\u0014\u0010o\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bo\u0010\u0019R\u0014\u0010p\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bp\u0010\u0019R\u0014\u0010q\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bq\u0010\u0019R\u0014\u0010r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\br\u0010\u0019R\u0014\u0010s\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bs\u0010\u0019R\u0014\u0010t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0019R\u0014\u0010u\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bu\u0010\u0019R\u0014\u0010v\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010\u0019R\u0014\u0010w\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bw\u0010\u0019R\u0014\u0010x\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bx\u0010\u0019R\u0014\u0010y\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\by\u0010\u0019R\u0014\u0010z\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bz\u0010\u0019R\u0014\u0010{\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b{\u0010\u0019R\u0014\u0010|\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b|\u0010\u0019R\u0014\u0010}\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b}\u0010\u0019R\u0014\u0010~\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b~\u0010\u0019R\u0014\u0010\u007f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010\u0019R\u0016\u0010\u0080\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0019R\u0016\u0010\u0081\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u0019R\u0016\u0010\u0082\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0019R\u0016\u0010\u0083\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0019R\u0016\u0010\u0084\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0019R\u0016\u0010\u0085\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u0019R\u0016\u0010\u0086\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0019R\u0016\u0010\u0087\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0019R\u0016\u0010\u0088\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u0019R\u0016\u0010\u0089\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u0019R\u0016\u0010\u008a\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010\u0019R\u0016\u0010\u008b\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010\u0019R\u0016\u0010\u008c\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010\u0019R\u0016\u0010\u008d\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010\u0019R\u0016\u0010\u008e\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010\u0019R\u0016\u0010\u008f\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010\u0019¨\u0006\u0090\u0001"}, d2 = {"Loc/i$b;", "", "<init>", "()V", "", "javaName", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "value", "Loc/i;", "d", "(Ljava/lang/String;I)Loc/i;", "b", "(Ljava/lang/String;)Loc/i;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "ORDER_BY_NAME", "Ljava/util/Comparator;", "c", "()Ljava/util/Comparator;", "", "INSTANCES", "Ljava/util/Map;", "TLS_AES_128_CCM_8_SHA256", "Loc/i;", "TLS_AES_128_CCM_SHA256", "TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256", "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_DSS_WITH_DES_CBC_SHA", "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_DHE_RSA_WITH_DES_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA256", "TLS_DH_anon_WITH_AES_128_GCM_SHA256", "TLS_DH_anon_WITH_AES_256_CBC_SHA", "TLS_DH_anon_WITH_AES_256_CBC_SHA256", "TLS_DH_anon_WITH_AES_256_GCM_SHA384", "TLS_DH_anon_WITH_DES_CBC_SHA", "TLS_DH_anon_WITH_RC4_128_MD5", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_ECDSA_WITH_NULL_SHA", "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_NULL_SHA", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_ECDSA_WITH_NULL_SHA", "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_RSA_WITH_NULL_SHA", "TLS_ECDH_RSA_WITH_RC4_128_SHA", "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", "TLS_ECDH_anon_WITH_NULL_SHA", "TLS_ECDH_anon_WITH_RC4_128_SHA", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_FALLBACK_SCSV", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", "TLS_KRB5_WITH_DES_CBC_MD5", "TLS_KRB5_WITH_DES_CBC_SHA", "TLS_KRB5_WITH_RC4_128_MD5", "TLS_KRB5_WITH_RC4_128_SHA", "TLS_PSK_WITH_3DES_EDE_CBC_SHA", "TLS_PSK_WITH_AES_128_CBC_SHA", "TLS_PSK_WITH_AES_256_CBC_SHA", "TLS_PSK_WITH_RC4_128_SHA", "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_RSA_EXPORT_WITH_RC4_40_MD5", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA256", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA256", "TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_RSA_WITH_DES_CBC_SHA", "TLS_RSA_WITH_NULL_MD5", "TLS_RSA_WITH_NULL_SHA", "TLS_RSA_WITH_NULL_SHA256", "TLS_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_RC4_128_SHA", "TLS_RSA_WITH_SEED_CBC_SHA", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.i$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final i d(String javaName, int value) {
            i iVar = new i(javaName, null);
            i.f46965d.put(javaName, iVar);
            return iVar;
        }

        private final String e(String javaName) {
            if (Ub.n.G(javaName, "TLS_", false, 2, null)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SSL_");
                String strSubstring = javaName.substring(4);
                C3862t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                return sb2.toString();
            }
            if (!Ub.n.G(javaName, "SSL_", false, 2, null)) {
                return javaName;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("TLS_");
            String strSubstring2 = javaName.substring(4);
            C3862t.f(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb3.append(strSubstring2);
            return sb3.toString();
        }

        public final synchronized i b(String javaName) {
            i iVar;
            try {
                C3862t.g(javaName, "javaName");
                iVar = (i) i.f46965d.get(javaName);
                if (iVar == null) {
                    iVar = (i) i.f46965d.get(e(javaName));
                    if (iVar == null) {
                        iVar = new i(javaName, null);
                    }
                    i.f46965d.put(javaName, iVar);
                }
            } catch (Throwable th) {
                throw th;
            }
            return iVar;
        }

        public final Comparator<String> c() {
            return i.f46962c;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f46962c = new a();
        f46965d = new LinkedHashMap();
        f46968e = companion.d("SSL_RSA_WITH_NULL_MD5", 1);
        f46971f = companion.d("SSL_RSA_WITH_NULL_SHA", 2);
        f46974g = companion.d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        f46977h = companion.d("SSL_RSA_WITH_RC4_128_MD5", 4);
        f46980i = companion.d("SSL_RSA_WITH_RC4_128_SHA", 5);
        f46983j = companion.d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        f46986k = companion.d("SSL_RSA_WITH_DES_CBC_SHA", 9);
        f46989l = companion.d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        f46992m = companion.d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        f46995n = companion.d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        f46998o = companion.d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        f47001p = companion.d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        f47004q = companion.d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        f47007r = companion.d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        f47010s = companion.d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        f47013t = companion.d("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        f47015u = companion.d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        f47017v = companion.d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        f47019w = companion.d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        f47021x = companion.d("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        f47023y = companion.d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        f47025z = companion.d("TLS_KRB5_WITH_RC4_128_SHA", 32);
        f46905A = companion.d("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        f46907B = companion.d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        f46909C = companion.d("TLS_KRB5_WITH_RC4_128_MD5", 36);
        f46911D = companion.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        f46913E = companion.d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        f46915F = companion.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        f46917G = companion.d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f46919H = companion.d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        f46921I = companion.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        f46923J = companion.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        f46925K = companion.d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f46927L = companion.d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        f46929M = companion.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        f46931N = companion.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        f46933O = companion.d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        f46935P = companion.d("TLS_RSA_WITH_NULL_SHA256", 59);
        f46937Q = companion.d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        f46939R = companion.d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        f46941S = companion.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        f46943T = companion.d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        f46945U = companion.d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        f46947V = companion.d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        f46949W = companion.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        f46951X = companion.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        f46953Y = companion.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        f46955Z = companion.d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        f46957a0 = companion.d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        f46960b0 = companion.d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        f46963c0 = companion.d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        f46966d0 = companion.d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", ModuleDescriptor.MODULE_VERSION);
        f46969e0 = companion.d("TLS_PSK_WITH_RC4_128_SHA", 138);
        f46972f0 = companion.d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        f46975g0 = companion.d("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        f46978h0 = companion.d("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        f46981i0 = companion.d("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f46984j0 = companion.d("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f46987k0 = companion.d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        f46990l0 = companion.d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        f46993m0 = companion.d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        f46996n0 = companion.d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        f46999o0 = companion.d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        f47002p0 = companion.d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        f47005q0 = companion.d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        f47008r0 = companion.d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        f47011s0 = companion.d("TLS_FALLBACK_SCSV", 22016);
        f47014t0 = companion.d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        f47016u0 = companion.d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        f47018v0 = companion.d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        f47020w0 = companion.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        f47022x0 = companion.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        f47024y0 = companion.d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        f47026z0 = companion.d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        f46906A0 = companion.d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        f46908B0 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        f46910C0 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        f46912D0 = companion.d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        f46914E0 = companion.d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        f46916F0 = companion.d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        f46918G0 = companion.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        f46920H0 = companion.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        f46922I0 = companion.d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        f46924J0 = companion.d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        f46926K0 = companion.d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f46928L0 = companion.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f46930M0 = companion.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        f46932N0 = companion.d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        f46934O0 = companion.d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        f46936P0 = companion.d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        f46938Q0 = companion.d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        f46940R0 = companion.d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        f46942S0 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        f46944T0 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        f46946U0 = companion.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        f46948V0 = companion.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        f46950W0 = companion.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        f46952X0 = companion.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        f46954Y0 = companion.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        f46956Z0 = companion.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f46958a1 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f46961b1 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        f46964c1 = companion.d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        f46967d1 = companion.d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f46970e1 = companion.d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f46973f1 = companion.d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        f46976g1 = companion.d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        f46979h1 = companion.d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        f46982i1 = companion.d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        f46985j1 = companion.d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f46988k1 = companion.d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f46991l1 = companion.d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        f46994m1 = companion.d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        f46997n1 = companion.d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f47000o1 = companion.d("TLS_AES_128_GCM_SHA256", 4865);
        f47003p1 = companion.d("TLS_AES_256_GCM_SHA384", 4866);
        f47006q1 = companion.d("TLS_CHACHA20_POLY1305_SHA256", 4867);
        f47009r1 = companion.d("TLS_AES_128_CCM_SHA256", 4868);
        f47012s1 = companion.d("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public /* synthetic */ i(String str, C3854k c3854k) {
        this(str);
    }

    /* renamed from: c, reason: from getter */
    public final String getJavaName() {
        return this.javaName;
    }

    public String toString() {
        return this.javaName;
    }

    private i(String str) {
        this.javaName = str;
    }
}
