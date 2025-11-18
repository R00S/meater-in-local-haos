package kotlin.reflect.p371y.internal;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p425k0.C10489b;
import okhttp3.HttpUrl;

/* compiled from: kClassCache.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0005\u001a\u00020\u0006H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bH\u0000\"*\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m32267d2 = {"K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/pcollections/HashPMap;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", HttpUrl.FRAGMENT_ENCODE_SET, "clearKClassCache", HttpUrl.FRAGMENT_ENCODE_SET, "getOrCreateKotlinClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "jClass", "Ljava/lang/Class;", "kotlin-reflection"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.g */
/* loaded from: classes2.dex */
public final class C9890g {

    /* renamed from: a */
    private static C10489b<String, Object> f37315a;

    static {
        C10489b<String, Object> c10489bM37246b = C10489b.m37246b();
        C9801m.m32345e(c10489bM37246b, "empty<String, Any>()");
        f37315a = c10489bM37246b;
    }

    /* renamed from: a */
    public static final <T> KClassImpl<T> m32555a(Class<T> cls) {
        C9801m.m32346f(cls, "jClass");
        String name = cls.getName();
        Object objM37249c = f37315a.m37249c(name);
        if (objM37249c instanceof WeakReference) {
            KClassImpl<T> kClassImpl = (KClassImpl) ((WeakReference) objM37249c).get();
            if (C9801m.m32341a(kClassImpl != null ? kClassImpl.mo32283a() : null, cls)) {
                return kClassImpl;
            }
        } else if (objM37249c != null) {
            for (WeakReference weakReference : (WeakReference[]) objM37249c) {
                KClassImpl<T> kClassImpl2 = (KClassImpl) weakReference.get();
                if (C9801m.m32341a(kClassImpl2 != null ? kClassImpl2.mo32283a() : null, cls)) {
                    return kClassImpl2;
                }
            }
            int length = ((Object[]) objM37249c).length;
            WeakReference[] weakReferenceArr = new WeakReference[length + 1];
            System.arraycopy(objM37249c, 0, weakReferenceArr, 0, length);
            KClassImpl<T> kClassImpl3 = new KClassImpl<>(cls);
            weakReferenceArr[length] = new WeakReference(kClassImpl3);
            C10489b<String, Object> c10489bM37250f = f37315a.m37250f(name, weakReferenceArr);
            C9801m.m32345e(c10489bM37250f, "K_CLASS_CACHE.plus(name, newArray)");
            f37315a = c10489bM37250f;
            return kClassImpl3;
        }
        KClassImpl<T> kClassImpl4 = new KClassImpl<>(cls);
        C10489b<String, Object> c10489bM37250f2 = f37315a.m37250f(name, new WeakReference(kClassImpl4));
        C9801m.m32345e(c10489bM37250f2, "K_CLASS_CACHE.plus(name, WeakReference(newKClass))");
        f37315a = c10489bM37250f2;
        return kClassImpl4;
    }
}
