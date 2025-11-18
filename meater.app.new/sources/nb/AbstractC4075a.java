package nb;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C3831l;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: BinaryVersion.kt */
/* renamed from: nb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4075a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0625a f45791f = new C0625a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int[] f45792a;

    /* renamed from: b, reason: collision with root package name */
    private final int f45793b;

    /* renamed from: c, reason: collision with root package name */
    private final int f45794c;

    /* renamed from: d, reason: collision with root package name */
    private final int f45795d;

    /* renamed from: e, reason: collision with root package name */
    private final List<Integer> f45796e;

    /* compiled from: BinaryVersion.kt */
    /* renamed from: nb.a$a, reason: collision with other inner class name */
    public static final class C0625a {
        public /* synthetic */ C0625a(C3854k c3854k) {
            this();
        }

        private C0625a() {
        }
    }

    public AbstractC4075a(int... numbers) {
        List<Integer> listM;
        C3862t.g(numbers, "numbers");
        this.f45792a = numbers;
        Integer numD0 = C3831l.d0(numbers, 0);
        this.f45793b = numD0 != null ? numD0.intValue() : -1;
        Integer numD02 = C3831l.d0(numbers, 1);
        this.f45794c = numD02 != null ? numD02.intValue() : -1;
        Integer numD03 = C3831l.d0(numbers, 2);
        this.f45795d = numD03 != null ? numD03.intValue() : -1;
        if (numbers.length <= 3) {
            listM = r.m();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
            listM = r.W0(C3831l.d(numbers).subList(3, numbers.length));
        }
        this.f45796e = listM;
    }

    public final int a() {
        return this.f45793b;
    }

    public final int b() {
        return this.f45794c;
    }

    public final boolean c(int i10, int i11, int i12) {
        int i13 = this.f45793b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f45794c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f45795d >= i12;
    }

    public final boolean d(AbstractC4075a version) {
        C3862t.g(version, "version");
        return c(version.f45793b, version.f45794c, version.f45795d);
    }

    public final boolean e(int i10, int i11, int i12) {
        int i13 = this.f45793b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f45794c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f45795d <= i12;
    }

    public boolean equals(Object obj) {
        if (obj != null && C3862t.b(getClass(), obj.getClass())) {
            AbstractC4075a abstractC4075a = (AbstractC4075a) obj;
            if (this.f45793b == abstractC4075a.f45793b && this.f45794c == abstractC4075a.f45794c && this.f45795d == abstractC4075a.f45795d && C3862t.b(this.f45796e, abstractC4075a.f45796e)) {
                return true;
            }
        }
        return false;
    }

    protected final boolean f(AbstractC4075a ourVersion) {
        C3862t.g(ourVersion, "ourVersion");
        int i10 = this.f45793b;
        if (i10 == 0) {
            if (ourVersion.f45793b != 0 || this.f45794c != ourVersion.f45794c) {
                return false;
            }
        } else if (i10 != ourVersion.f45793b || this.f45794c > ourVersion.f45794c) {
            return false;
        }
        return true;
    }

    public final int[] g() {
        return this.f45792a;
    }

    public int hashCode() {
        int i10 = this.f45793b;
        int i11 = i10 + (i10 * 31) + this.f45794c;
        int i12 = i11 + (i11 * 31) + this.f45795d;
        return i12 + (i12 * 31) + this.f45796e.hashCode();
    }

    public String toString() {
        int[] iArrG = g();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArrG) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : r.s0(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
