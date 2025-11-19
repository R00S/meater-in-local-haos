package P5;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: LocaleUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljava/util/Locale;", "", "a", "(Ljava/util/Locale;)Z", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: P5.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1611t {
    public static final boolean a(Locale locale) {
        C3862t.g(locale, "<this>");
        String country = locale.getCountry();
        C3862t.f(country, "getCountry(...)");
        String upperCase = country.toUpperCase(locale);
        C3862t.f(upperCase, "toUpperCase(...)");
        int iHashCode = upperCase.hashCode();
        return iHashCode == 2438 ? upperCase.equals("LR") : iHashCode == 2464 ? upperCase.equals("MM") : iHashCode == 2718 && upperCase.equals("US");
    }
}
