package kotlin.reflect.p371y.internal.p374j0.p397f;

import kotlin.jvm.internal.C9801m;
import kotlin.text.Regex;

/* compiled from: NameUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.f.g */
/* loaded from: classes3.dex */
public final class C10164g {

    /* renamed from: a */
    public static final C10164g f39263a = new C10164g();

    /* renamed from: b */
    private static final Regex f39264b = new Regex("[^\\p{L}\\p{Digit}]");

    private C10164g() {
    }

    /* renamed from: a */
    public static final String m35459a(String str) {
        C9801m.m32346f(str, "name");
        return f39264b.m37439c(str, "_");
    }
}
