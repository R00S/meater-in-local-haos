package pb;

import java.util.Arrays;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import nb.AbstractC4075a;

/* compiled from: JvmMetadataVersion.kt */
/* loaded from: classes3.dex */
public final class e extends AbstractC4075a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f47732h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final e f47733i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f47734j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f47735k;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f47736g;

    /* compiled from: JvmMetadataVersion.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    static {
        e eVar = new e(2, 0, 0);
        f47733i = eVar;
        f47734j = eVar.m();
        f47735k = new e(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int[] versionArray, boolean z10) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        C3862t.g(versionArray, "versionArray");
        this.f47736g = z10;
    }

    private final boolean i(e eVar) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(eVar);
    }

    private final boolean l(e eVar) {
        if (a() > eVar.a()) {
            return true;
        }
        return a() >= eVar.a() && b() > eVar.b();
    }

    public final boolean h(e metadataVersionFromLanguageVersion) {
        C3862t.g(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        if (a() == 2 && b() == 0) {
            e eVar = f47733i;
            if (eVar.a() == 1 && eVar.b() == 8) {
                return true;
            }
        }
        return i(metadataVersionFromLanguageVersion.k(this.f47736g));
    }

    public final boolean j() {
        return this.f47736g;
    }

    public final e k(boolean z10) {
        e eVar = z10 ? f47733i : f47734j;
        return eVar.l(this) ? eVar : this;
    }

    public final e m() {
        return (a() == 1 && b() == 9) ? new e(2, 0, 0) : new e(a(), b() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(int... numbers) {
        this(numbers, false);
        C3862t.g(numbers, "numbers");
    }
}
