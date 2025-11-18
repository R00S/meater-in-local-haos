package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b;

import java.util.List;
import java.util.Set;
import kotlin.collections.C10782c0;
import kotlin.collections.C10822w0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a;
import okhttp3.HttpUrl;

/* compiled from: JvmNameResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.e.a0.b.f */
/* loaded from: classes3.dex */
public final class C10118f extends C10119g {

    /* renamed from: h */
    private final C10112a.e f38598h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C10118f(C10112a.e eVar, String[] strArr) {
        Set setM38574I0;
        C9801m.m32346f(eVar, "types");
        C9801m.m32346f(strArr, "strings");
        List<Integer> listM34177x = eVar.m34177x();
        if (listM34177x.isEmpty()) {
            setM38574I0 = C10822w0.m38917d();
        } else {
            C9801m.m32345e(listM34177x, HttpUrl.FRAGMENT_ENCODE_SET);
            setM38574I0 = C10782c0.m38574I0(listM34177x);
        }
        List<C10112a.e.c> listM34178y = eVar.m34178y();
        C9801m.m32345e(listM34178y, "types.recordList");
        super(strArr, setM38574I0, C10120h.m34255a(listM34178y));
        this.f38598h = eVar;
    }
}
