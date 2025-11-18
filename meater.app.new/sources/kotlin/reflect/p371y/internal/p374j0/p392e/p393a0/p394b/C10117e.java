package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b;

import java.util.Arrays;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10149a;

/* compiled from: JvmMetadataVersion.kt */
/* renamed from: kotlin.f0.y.e.j0.e.a0.b.e */
/* loaded from: classes3.dex */
public final class C10117e extends AbstractC10149a {

    /* renamed from: g */
    public static final a f38594g = new a(null);

    /* renamed from: h */
    public static final C10117e f38595h = new C10117e(1, 7, 1);

    /* renamed from: i */
    public static final C10117e f38596i = new C10117e(new int[0]);

    /* renamed from: j */
    private final boolean f38597j;

    /* compiled from: JvmMetadataVersion.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.a0.b.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10117e(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        C9801m.m32346f(iArr, "versionArray");
        this.f38597j = z;
    }

    /* renamed from: h */
    public boolean m34252h() {
        boolean zM35363f;
        if (m35358a() == 1 && m35359b() == 0) {
            return false;
        }
        if (this.f38597j) {
            zM35363f = m35363f(f38595h);
        } else {
            int iM35358a = m35358a();
            C10117e c10117e = f38595h;
            zM35363f = iM35358a == c10117e.m35358a() && m35359b() <= c10117e.m35359b() + 1;
        }
        return zM35363f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10117e(int... iArr) {
        this(iArr, false);
        C9801m.m32346f(iArr, "numbers");
    }
}
