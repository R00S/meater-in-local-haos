package P5;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.apptionlabs.meater_app.data.Config;
import java.util.Locale;

/* compiled from: LanguageUtils.java */
/* renamed from: P5.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1610s {

    /* renamed from: a, reason: collision with root package name */
    private static C1610s f14064a;

    /* compiled from: LanguageUtils.java */
    /* renamed from: P5.s$a */
    public enum a {
        GB("🇬🇧"),
        US("🇺🇸"),
        DE("🇩🇪"),
        ES("🇪🇸"),
        FI("🇫🇮"),
        FR("🇫🇷"),
        IT("🇮🇹"),
        PL("🇵🇱"),
        NONE("");


        /* renamed from: B, reason: collision with root package name */
        private final String f14075B;

        a(String str) {
            this.f14075B = str;
        }

        public static a n(String str) {
            for (a aVar : values()) {
                if (aVar.name().equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            return NONE;
        }

        public String j(String str) {
            return String.format("%s %s", str, this.f14075B).trim();
        }
    }

    public static C1610s a() {
        if (f14064a == null) {
            f14064a = new C1610s();
        }
        return f14064a;
    }

    private Resources b(Context context, Locale locale) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration).getResources();
    }

    private Locale c(String str) {
        if (str == null) {
            str = x4.g.j();
        }
        return "gb".equalsIgnoreCase(str) ? Locale.UK : "us".equalsIgnoreCase(str) ? Locale.US : "fr".equalsIgnoreCase(str) ? Locale.FRANCE : "it".equalsIgnoreCase(str) ? Locale.ITALY : "de".equalsIgnoreCase(str) ? Locale.GERMANY : new Locale(str.toLowerCase(), str.toUpperCase());
    }

    public static boolean e() {
        return "nl".contains(Locale.getDefault().getLanguage());
    }

    public String d(Context context, String str) {
        String strD;
        String strC = H.c(str, false);
        if (strC != null && !strC.isEmpty()) {
            return strC;
        }
        String country = Locale.getDefault().getCountry();
        if (country.equalsIgnoreCase(Locale.UK.getCountry()) && (strD = H.d(b(context, c(country)), context.getPackageName(), str)) != null && !strD.isEmpty()) {
            return a.n(country).j(strD);
        }
        String country2 = Locale.US.getCountry();
        String strD2 = H.d(b(context, c(country2)), context.getPackageName(), str);
        if (strD2 == null || strD2.isEmpty()) {
            return String.format(Config.getInstance().DEBUG_UI_ENABLED ? "*%s*" : "%s", H.g(str.replace('_', ' ')));
        }
        return a.n(country2).j(strD2);
    }
}
