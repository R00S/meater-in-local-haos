package cm.aptoide.p092pt.themes;

import android.R;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.TypedValue;
import android.view.Window;
import androidx.appcompat.app.AbstractC0069f;
import cm.aptoide.p092pt.BuildConfig;
import cm.aptoide.p092pt.database.room.RoomStore;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ThemeManager.kt */
@Metadata(m32266d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\"B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\fJ\u0010\u0010\u001d\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\bJ\u0010\u0010 \u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\bJ\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m32267d2 = {"Lcm/aptoide/pt/themes/ThemeManager;", HttpUrl.FRAGMENT_ENCODE_SET, "activity", "Landroid/app/Activity;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/app/Activity;Landroid/content/SharedPreferences;)V", "THEME_PREFERENCE_KEY", HttpUrl.FRAGMENT_ENCODE_SET, "getAttributeForTheme", "Landroid/util/TypedValue;", "attributeResourceId", HttpUrl.FRAGMENT_ENCODE_SET, "themeName", "getBaseTheme", "Lcm/aptoide/pt/themes/StoreTheme;", "getDarkThemeMode", "Lcm/aptoide/pt/themes/DarkThemeMode;", "getStoreTheme", "storeThemeName", "getThemeOption", "Lcm/aptoide/pt/themes/ThemeManager$ThemeOption;", "isThemeDark", HttpUrl.FRAGMENT_ENCODE_SET, "resetStatusBarColor", HttpUrl.FRAGMENT_ENCODE_SET, "resetToBaseTheme", "setDefaultNightMode", "themeOption", "setStatusBarThemeColor", "color", RoomStore.THEME, "setTheme", "setThemeOption", "ThemeOption", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class ThemeManager {
    private String THEME_PREFERENCE_KEY;
    private final Activity activity;
    private final SharedPreferences sharedPreferences;

    /* compiled from: ThemeManager.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m32267d2 = {"Lcm/aptoide/pt/themes/ThemeManager$ThemeOption;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "SYSTEM_DEFAULT", "LIGHT", "DARK", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public enum ThemeOption {
        SYSTEM_DEFAULT,
        LIGHT,
        DARK
    }

    /* compiled from: ThemeManager.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeOption.values().length];
            iArr[ThemeOption.SYSTEM_DEFAULT.ordinal()] = 1;
            iArr[ThemeOption.LIGHT.ordinal()] = 2;
            iArr[ThemeOption.DARK.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ThemeManager(Activity activity, SharedPreferences sharedPreferences) {
        C9801m.m32346f(activity, "activity");
        C9801m.m32346f(sharedPreferences, "sharedPreferences");
        this.activity = activity;
        this.sharedPreferences = sharedPreferences;
        this.THEME_PREFERENCE_KEY = "app_theme_preference";
    }

    private final void setDefaultNightMode(ThemeOption themeOption) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[themeOption.ordinal()];
        if (i2 == 1) {
            AbstractC0069f.m269G(-1);
        } else if (i2 == 2) {
            AbstractC0069f.m269G(1);
        } else {
            if (i2 != 3) {
                return;
            }
            AbstractC0069f.m269G(2);
        }
    }

    public final TypedValue getAttributeForTheme(int attributeResourceId) {
        TypedValue typedValue = new TypedValue();
        this.activity.getTheme().resolveAttribute(attributeResourceId, typedValue, true);
        return typedValue;
    }

    public final StoreTheme getBaseTheme() {
        StoreTheme storeTheme = StoreTheme.get(BuildConfig.APTOIDE_THEME, isThemeDark());
        C9801m.m32345e(storeTheme, "get(BuildConfig.APTOIDE_THEME, isThemeDark())");
        return storeTheme;
    }

    public final DarkThemeMode getDarkThemeMode() {
        int i2 = WhenMappings.$EnumSwitchMapping$0[getThemeOption().ordinal()];
        if (i2 == 1) {
            return (this.activity.getResources().getConfiguration().uiMode & 48) == 32 ? DarkThemeMode.SYSTEM_DARK : DarkThemeMode.SYSTEM_LIGHT;
        }
        if (i2 == 2) {
            return DarkThemeMode.LIGHT;
        }
        if (i2 == 3) {
            return DarkThemeMode.DARK;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final StoreTheme getStoreTheme(String storeThemeName) {
        StoreTheme storeTheme = StoreTheme.get(storeThemeName, isThemeDark());
        C9801m.m32345e(storeTheme, "get(storeThemeName, isThemeDark())");
        return storeTheme;
    }

    public final ThemeOption getThemeOption() {
        return ThemeOption.values()[this.sharedPreferences.getInt(this.THEME_PREFERENCE_KEY, 0)];
    }

    public final boolean isThemeDark() {
        ThemeOption themeOption = getThemeOption();
        return themeOption == ThemeOption.DARK || (themeOption == ThemeOption.SYSTEM_DEFAULT && (this.activity.getResources().getConfiguration().uiMode & 48) == 32);
    }

    public final void resetStatusBarColor() {
        if (Build.VERSION.SDK_INT >= 21) {
            setStatusBarThemeColor(getAttributeForTheme(R.attr.statusBarColor).data);
        }
    }

    public final void resetToBaseTheme() {
        setTheme(BuildConfig.APTOIDE_THEME);
    }

    public final void setStatusBarThemeColor(String theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            setStatusBarThemeColor(getAttributeForTheme(theme, R.attr.statusBarColor).data);
        }
    }

    public final void setTheme(String theme) {
        StoreTheme storeTheme = StoreTheme.get(theme, isThemeDark());
        setDefaultNightMode(getThemeOption());
        this.activity.setTheme(storeTheme.getThemeResource());
        setStatusBarThemeColor(theme);
    }

    public final void setThemeOption(ThemeOption themeOption) {
        C9801m.m32346f(themeOption, "themeOption");
        this.sharedPreferences.edit().putInt(this.THEME_PREFERENCE_KEY, themeOption.ordinal()).apply();
    }

    public final TypedValue getAttributeForTheme(String themeName, int attributeResourceId) {
        TypedValue typedValuePeekValue = this.activity.getTheme().obtainStyledAttributes(StoreTheme.get(themeName, isThemeDark()).getThemeResource(), new int[]{attributeResourceId}).peekValue(0);
        C9801m.m32345e(typedValuePeekValue, "activity.theme.obtainSty…ResourceId)).peekValue(0)");
        return typedValuePeekValue;
    }

    public final void setStatusBarThemeColor(int color) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(color);
        }
    }
}
