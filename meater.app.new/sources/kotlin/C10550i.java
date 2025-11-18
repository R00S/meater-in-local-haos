package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
@Metadata(m32266d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\t"}, m32267d2 = {"lazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "lock", HttpUrl.FRAGMENT_ENCODE_SET, "mode", "Lkotlin/LazyThreadSafetyMode;", "kotlin-stdlib"}, m32268k = 5, m32269mv = {1, 7, 1}, m32271xi = 49, m32272xs = "kotlin/LazyKt")
/* renamed from: kotlin.i */
/* loaded from: classes2.dex */
public class C10550i {

    /* compiled from: LazyJVM.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.i$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40691a;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            f40691a = iArr;
        }
    }

    /* renamed from: a */
    public static <T> Lazy<T> m37593a(LazyThreadSafetyMode lazyThreadSafetyMode, Function0<? extends T> function0) {
        C9801m.m32346f(lazyThreadSafetyMode, "mode");
        C9801m.m32346f(function0, "initializer");
        int i2 = a.f40691a[lazyThreadSafetyMode.ordinal()];
        if (i2 == 1) {
            return new SynchronizedLazyImpl(function0, null, 2, null);
        }
        if (i2 == 2) {
            return new SafePublicationLazyImpl(function0);
        }
        if (i2 == 3) {
            return new UnsafeLazyImpl(function0);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static <T> Lazy<T> m37594b(Function0<? extends T> function0) {
        C9801m.m32346f(function0, "initializer");
        return new SynchronizedLazyImpl(function0, null, 2, null);
    }
}
