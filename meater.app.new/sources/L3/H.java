package L3;

import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TextDelegate.java */
/* loaded from: classes.dex */
public class H {

    /* renamed from: b, reason: collision with root package name */
    private final LottieAnimationView f9138b;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f9137a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private boolean f9140d = true;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.n f9139c = null;

    public H(LottieAnimationView lottieAnimationView) {
        this.f9138b = lottieAnimationView;
    }

    private void d() {
        LottieAnimationView lottieAnimationView = this.f9138b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        com.airbnb.lottie.n nVar = this.f9139c;
        if (nVar != null) {
            nVar.invalidateSelf();
        }
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    public final String c(String str, String str2) {
        if (this.f9140d && this.f9137a.containsKey(str2)) {
            return this.f9137a.get(str2);
        }
        String strB = b(str, str2);
        if (this.f9140d) {
            this.f9137a.put(str2, strB);
        }
        return strB;
    }

    public void e(String str, String str2) {
        this.f9137a.put(str, str2);
        d();
    }

    public String a(String str) {
        return str;
    }
}
