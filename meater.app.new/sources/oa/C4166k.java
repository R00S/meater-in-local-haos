package oa;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lkotlin/Function0;", "initializer", "Loa/i;", "a", "(LBa/a;)Loa/i;", "Loa/m;", "mode", "b", "(Loa/m;LBa/a;)Loa/i;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/LazyKt")
/* renamed from: oa.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4166k {

    /* compiled from: LazyJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oa.k$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46625a;

        static {
            int[] iArr = new int[EnumC4168m.values().length];
            try {
                iArr[EnumC4168m.f46626B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4168m.f46627C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4168m.f46628D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46625a = iArr;
        }
    }

    public static <T> InterfaceC4164i<T> a(Ba.a<? extends T> initializer) {
        C3862t.g(initializer, "initializer");
        C3854k c3854k = null;
        return new C4175t(initializer, c3854k, 2, c3854k);
    }

    public static <T> InterfaceC4164i<T> b(EnumC4168m mode, Ba.a<? extends T> initializer) {
        C3862t.g(mode, "mode");
        C3862t.g(initializer, "initializer");
        int i10 = a.f46625a[mode.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            C3854k c3854k = null;
            return new C4175t(initializer, c3854k, i11, c3854k);
        }
        if (i10 == 2) {
            return new C4174s(initializer);
        }
        if (i10 == 3) {
            return new C4154G(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }
}
