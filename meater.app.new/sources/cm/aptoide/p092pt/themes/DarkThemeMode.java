package cm.aptoide.p092pt.themes;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: DarkThemeMode.kt */
@Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m32267d2 = {"Lcm/aptoide/pt/themes/DarkThemeMode;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "isDark", HttpUrl.FRAGMENT_ENCODE_SET, "LIGHT", "DARK", "SYSTEM_LIGHT", "SYSTEM_DARK", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public enum DarkThemeMode {
    LIGHT,
    DARK,
    SYSTEM_LIGHT,
    SYSTEM_DARK;

    public final boolean isDark() {
        return this == DARK || this == SYSTEM_DARK;
    }
}
