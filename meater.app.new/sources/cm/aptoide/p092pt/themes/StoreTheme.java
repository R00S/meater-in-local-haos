package cm.aptoide.p092pt.themes;

import cm.aptoide.p092pt.C1146R;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public enum StoreTheme {
    DEFAULT(C1146R.style.AptoideThemeLight, true),
    DEFAULT_DARK(C1146R.style.AptoideThemeDark, false),
    GREEN(C1146R.style.AptoideThemeLight_Green, true),
    GREEN_DARK(C1146R.style.AptoideThemeDark_Green, false),
    TEAL(C1146R.style.AptoideThemeLight_Teal, true),
    TEAL_DARK(C1146R.style.AptoideThemeDark_Teal, false),
    RED(C1146R.style.AptoideThemeLight_Red, true),
    RED_DARK(C1146R.style.AptoideThemeDark_Red, false),
    INDIGO(C1146R.style.AptoideThemeLight_Indigo, true),
    INDIGO_DARK(C1146R.style.AptoideThemeDark_Indigo, false),
    PINK(C1146R.style.AptoideThemeLight_Pink, true),
    PINK_DARK(C1146R.style.AptoideThemeDark_Pink, false),
    ORANGE(C1146R.style.AptoideThemeLight_Orange, true),
    ORANGE_DARK(C1146R.style.AptoideThemeDark_Orange, false),
    BROWN(C1146R.style.AptoideThemeLight_Brown, true),
    BROWN_DARK(C1146R.style.AptoideThemeDark_Brown, false),
    BLUE_GREY(C1146R.style.AptoideThemeLight_BlueGrey, true),
    BLUE_GREY_DARK(C1146R.style.AptoideThemeDark_BlueGrey, false),
    GREY(C1146R.style.AptoideThemeLight_Grey, true),
    GREY_DARK(C1146R.style.AptoideThemeDark_Grey, false),
    BLACK(C1146R.style.AptoideThemeLight_Black, true),
    BLACK_DARK(C1146R.style.AptoideThemeDark_Black, false),
    DEEP_PURPLE(C1146R.style.AptoideThemeLight_DeepPurple, true),
    DEEP_PURPLE_DARK(C1146R.style.AptoideThemeDark_DeepPurple, false),
    AMBER(C1146R.style.AptoideThemeLight_Amber, true),
    AMBER_DARK(C1146R.style.AptoideThemeDark_Amber, false),
    LIGHT_GREEN(C1146R.style.AptoideThemeLight_LightGreen, true),
    LIGHT_GREEN_DARK(C1146R.style.AptoideThemeDark_LightGreen, false),
    LIME(C1146R.style.AptoideThemeLight_Lime, true),
    LIME_DARK(C1146R.style.AptoideThemeDark_Lime, false),
    LIGHT_BLUE(C1146R.style.AptoideThemeLight_LightBlue, true),
    LIGHT_BLUE_DARK(C1146R.style.AptoideThemeDark_LightBlue, false),
    SEA_GREEN(C1146R.style.AptoideThemeLight_Green, false),
    SEA_GREEN_DARK(C1146R.style.AptoideThemeDark_Green, false),
    SLATE_GRAY(C1146R.style.AptoideThemeLight_Teal, false),
    SLATE_GRAY_DARK(C1146R.style.AptoideThemeDark_Teal, false),
    BLUE(C1146R.style.AptoideThemeLight_Indigo, false),
    BLUE_DARK(C1146R.style.AptoideThemeDark_Indigo, false),
    MAROON(C1146R.style.AptoideThemeLight_Brown, false),
    MAROON_DARK(C1146R.style.AptoideThemeDark_Brown, false),
    MIDNIGHT(C1146R.style.AptoideThemeLight_BlueGrey, false),
    MIDNIGHT_DARK(C1146R.style.AptoideThemeDark_BlueGrey, false),
    BLUE_GRAY(C1146R.style.AptoideThemeLight_BlueGrey, false),
    BLUE_GRAY_DARK(C1146R.style.AptoideThemeDark_BlueGrey, false),
    SILVER(C1146R.style.AptoideThemeLight_Grey, false),
    SILVER_DARK(C1146R.style.AptoideThemeDark_Grey, false),
    DIM_GRAY(C1146R.style.AptoideThemeLight_Grey, false),
    DIM_GRAY_DARK(C1146R.style.AptoideThemeDark_Grey, false),
    MAGENTA(C1146R.style.AptoideThemeLight_DeepPurple, false),
    MAGENTA_DARK(C1146R.style.AptoideThemeDark_DeepPurple, false),
    YELLOW(C1146R.style.AptoideThemeLight_Amber, false),
    YELLOW_DARK(C1146R.style.AptoideThemeDark_Amber, false),
    GOLD(C1146R.style.AptoideThemeLight_Amber, false),
    GOLD_DARK(C1146R.style.AptoideThemeDark_Amber, false),
    SPRING_GREEN(C1146R.style.AptoideThemeLight_Green, false),
    SPRING_GREEN_DARK(C1146R.style.AptoideThemeDark_Green, false),
    GREEN_APPLE(C1146R.style.AptoideThemeLight_Lime, false),
    GREEN_APPLE_DARK(C1146R.style.AptoideThemeDark_Lime, false),
    LIGHT_SKY(C1146R.style.AptoideThemeLight_LightBlue, false),
    LIGHT_SKY_DARK(C1146R.style.AptoideThemeDark_LightBlue, false),
    HAPPY_BLUE(C1146R.style.AptoideThemeLight_LightBlue, false),
    HAPPY_BLUE_DARK(C1146R.style.AptoideThemeDark_LightBlue, false);

    private boolean isSelectable;
    private int storeStyle;

    StoreTheme(int i2, boolean z) {
        this.storeStyle = i2;
        this.isSelectable = z;
    }

    static StoreTheme get(String str, boolean z) {
        StoreTheme storeThemeValueOf = null;
        if (str != null) {
            try {
                storeThemeValueOf = valueOf(str.replace("-", "_").toUpperCase());
            } catch (IllegalArgumentException unused) {
            }
        }
        if (storeThemeValueOf == null) {
            storeThemeValueOf = DEFAULT;
        }
        if (!z || storeThemeValueOf.toString().contains("_DARK")) {
            return storeThemeValueOf;
        }
        return valueOf(storeThemeValueOf.toString() + "_DARK");
    }

    public static List<StoreTheme> getThemesFromVersion(int i2) {
        LinkedList linkedList = new LinkedList();
        for (StoreTheme storeTheme : values()) {
            if (storeTheme.isSelectable) {
                linkedList.add(storeTheme);
            }
        }
        return linkedList;
    }

    public String getThemeName() {
        String strReplace = name().toLowerCase().replace('_', '-');
        return strReplace.contains("-dark") ? strReplace.substring(0, strReplace.indexOf("-dark")) : strReplace;
    }

    public int getThemeResource() {
        return this.storeStyle;
    }
}
