package cm.aptoide.p092pt.appview;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class PreferencesPersister {
    private SharedPreferences sharedPreferences;

    public PreferencesPersister(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public int get(String str, int i2) {
        return this.sharedPreferences.getInt(str, i2);
    }

    public void save(String str, int i2) {
        this.sharedPreferences.edit().putInt(str, i2).apply();
    }

    public boolean get(String str, boolean z) {
        return this.sharedPreferences.getBoolean(str, z);
    }

    public String get(String str, String str2) {
        return this.sharedPreferences.getString(str, str2);
    }

    public void save(String str, boolean z) {
        this.sharedPreferences.edit().putBoolean(str, z).apply();
    }

    public void save(String str, String str2) {
        this.sharedPreferences.edit().putString(str, str2).apply();
    }
}
