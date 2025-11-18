package cm.aptoide.p092pt.themes;

import android.os.Bundle;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.database.room.RoomStore;
import cm.aptoide.p092pt.themes.ThemeManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.rakam.api.C9230f;
import io.rakam.api.C9231g;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import p241e.p291f.p292a.p293a.C8956a;

/* compiled from: ThemeAnalytics.kt */
@Metadata(m32266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J\u0016\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, m32267d2 = {"Lcm/aptoide/pt/themes/ThemeAnalytics;", HttpUrl.FRAGMENT_ENCODE_SET, "analyticsManager", "Lcm/aptoide/analytics/AnalyticsManager;", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "(Lcm/aptoide/analytics/AnalyticsManager;Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "getAnalyticsManager", "()Lcm/aptoide/analytics/AnalyticsManager;", "getFirebaseAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "createDarkThemeRakamSuperProperty", "Lorg/json/JSONObject;", "currentProperties", "darkThemeMode", "Lcm/aptoide/pt/themes/DarkThemeMode;", "getThemeOptionName", HttpUrl.FRAGMENT_ENCODE_SET, "themeOption", "Lcm/aptoide/pt/themes/ThemeManager$ThemeOption;", "sendDarkThemeDialogTurnItOnClickEvent", HttpUrl.FRAGMENT_ENCODE_SET, "context", "sendDarkThemeDismissClickEvent", "sendDarkThemeInteractEvent", "action", "sendThemeChangedEvent", RoomStore.THEME, "setDarkThemeUserProperty", "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class ThemeAnalytics {
    public static final String DARK_THEME_INTERACT_EVENT = "Dark_Theme_Interact";
    private final AnalyticsManager analyticsManager;
    private final FirebaseAnalytics firebaseAnalytics;

    /* compiled from: ThemeAnalytics.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeManager.ThemeOption.values().length];
            iArr[ThemeManager.ThemeOption.SYSTEM_DEFAULT.ordinal()] = 1;
            iArr[ThemeManager.ThemeOption.LIGHT.ordinal()] = 2;
            iArr[ThemeManager.ThemeOption.DARK.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ThemeAnalytics(AnalyticsManager analyticsManager, FirebaseAnalytics firebaseAnalytics) {
        C9801m.m32346f(analyticsManager, "analyticsManager");
        C9801m.m32346f(firebaseAnalytics, "firebaseAnalytics");
        this.analyticsManager = analyticsManager;
        this.firebaseAnalytics = firebaseAnalytics;
    }

    private final JSONObject createDarkThemeRakamSuperProperty(JSONObject currentProperties, DarkThemeMode darkThemeMode) throws JSONException {
        if (currentProperties == null) {
            currentProperties = new JSONObject();
        }
        try {
            String lowerCase = darkThemeMode.name().toLowerCase();
            C9801m.m32345e(lowerCase, "this as java.lang.String).toLowerCase()");
            currentProperties.put(RoomStore.THEME, lowerCase);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return currentProperties;
    }

    private final String getThemeOptionName(ThemeManager.ThemeOption themeOption) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[themeOption.ordinal()];
        if (i2 == 1) {
            return "system default";
        }
        if (i2 == 2) {
            return "light theme";
        }
        if (i2 == 3) {
            return "dark theme";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void sendDarkThemeInteractEvent(String action, String context) {
        HashMap map = new HashMap();
        map.put("action", action);
        this.analyticsManager.logEvent(map, DARK_THEME_INTERACT_EVENT, AnalyticsManager.Action.CLICK, context);
    }

    public final AnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    public final FirebaseAnalytics getFirebaseAnalytics() {
        return this.firebaseAnalytics;
    }

    public final void sendDarkThemeDialogTurnItOnClickEvent(String context) {
        C9801m.m32346f(context, "context");
        sendDarkThemeInteractEvent("turn it on", context);
    }

    public final void sendDarkThemeDismissClickEvent(String context) {
        C9801m.m32346f(context, "context");
        sendDarkThemeInteractEvent("dismiss", context);
    }

    public final void sendThemeChangedEvent(ThemeManager.ThemeOption theme, String context) {
        C9801m.m32346f(theme, RoomStore.THEME);
        C9801m.m32346f(context, "context");
        sendDarkThemeInteractEvent(getThemeOptionName(theme), context);
    }

    public final void setDarkThemeUserProperty(DarkThemeMode darkThemeMode) {
        C9801m.m32346f(darkThemeMode, "darkThemeMode");
        new Bundle().putBoolean("dark_theme", darkThemeMode.isDark());
        C9231g c9231gM29891a = C9230f.m29891a();
        c9231gM29891a.m29950c0(createDarkThemeRakamSuperProperty(c9231gM29891a.m29962x(), darkThemeMode));
        String lowerCase = darkThemeMode.name().toLowerCase();
        C9801m.m32345e(lowerCase, "this as java.lang.String).toLowerCase()");
        C8956a.m28532e(RoomStore.THEME, lowerCase);
        FirebaseAnalytics firebaseAnalytics = this.firebaseAnalytics;
        String lowerCase2 = darkThemeMode.name().toLowerCase();
        C9801m.m32345e(lowerCase2, "this as java.lang.String).toLowerCase()");
        firebaseAnalytics.m24949b(RoomStore.THEME, lowerCase2);
    }
}
