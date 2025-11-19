package E3;

import Ub.n;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;

/* compiled from: Version.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"LE3/k;", "", "", "major", "minor", "patch", "", "description", "<init>", "(IIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "other", "j", "(LE3/k;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "B", "I", "p", "C", "s", "D", "t", "E", "Ljava/lang/String;", "getDescription", "Ljava/math/BigInteger;", "F", "Loa/i;", "n", "()Ljava/math/BigInteger;", "bigInteger", "G", "a", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k implements Comparable<k> {

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: H, reason: collision with root package name */
    private static final k f3848H = new k(0, 0, 0, "");

    /* renamed from: I, reason: collision with root package name */
    private static final k f3849I = new k(0, 1, 0, "");

    /* renamed from: J, reason: collision with root package name */
    private static final k f3850J;

    /* renamed from: K, reason: collision with root package name */
    private static final k f3851K;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int major;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final int minor;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final int patch;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final String description;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i bigInteger;

    /* compiled from: Version.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LE3/k$a;", "", "<init>", "()V", "", "versionString", "LE3/k;", "b", "(Ljava/lang/String;)LE3/k;", "VERSION_0_1", "LE3/k;", "a", "()LE3/k;", "VERSION_PATTERN_STRING", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: E3.k$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final k a() {
            return k.f3849I;
        }

        public final k b(String versionString) throws NumberFormatException {
            String strGroup;
            if (versionString != null && !n.a0(versionString)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(versionString);
                if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                    int i10 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    if (strGroup2 != null) {
                        int i11 = Integer.parseInt(strGroup2);
                        String strGroup3 = matcher.group(3);
                        if (strGroup3 != null) {
                            int i12 = Integer.parseInt(strGroup3);
                            String description = matcher.group(4) != null ? matcher.group(4) : "";
                            C3862t.f(description, "description");
                            return new k(i10, i11, i12, description, null);
                        }
                    }
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    /* compiled from: Version.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/math/BigInteger;", "kotlin.jvm.PlatformType", "a", "()Ljava/math/BigInteger;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<BigInteger> {
        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BigInteger invoke() {
            return BigInteger.valueOf(k.this.getMajor()).shiftLeft(32).or(BigInteger.valueOf(k.this.getMinor())).shiftLeft(32).or(BigInteger.valueOf(k.this.getPatch()));
        }
    }

    static {
        k kVar = new k(1, 0, 0, "");
        f3850J = kVar;
        f3851K = kVar;
    }

    public /* synthetic */ k(int i10, int i11, int i12, String str, C3854k c3854k) {
        this(i10, i11, i12, str);
    }

    private final BigInteger n() {
        Object value = this.bigInteger.getValue();
        C3862t.f(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public boolean equals(Object other) {
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        return this.major == kVar.major && this.minor == kVar.minor && this.patch == kVar.patch;
    }

    public int hashCode() {
        return ((((527 + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    @Override // java.lang.Comparable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(k other) {
        C3862t.g(other, "other");
        return n().compareTo(other.n());
    }

    /* renamed from: p, reason: from getter */
    public final int getMajor() {
        return this.major;
    }

    /* renamed from: s, reason: from getter */
    public final int getMinor() {
        return this.minor;
    }

    /* renamed from: t, reason: from getter */
    public final int getPatch() {
        return this.patch;
    }

    public String toString() {
        String str;
        if (n.a0(this.description)) {
            str = "";
        } else {
            str = '-' + this.description;
        }
        return this.major + '.' + this.minor + '.' + this.patch + str;
    }

    private k(int i10, int i11, int i12, String str) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        this.description = str;
        this.bigInteger = C4165j.a(new b());
    }
}
