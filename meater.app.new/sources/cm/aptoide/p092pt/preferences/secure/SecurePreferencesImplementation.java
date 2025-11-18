package cm.aptoide.p092pt.preferences.secure;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import cm.aptoide.p092pt.preferences.secure.SecureCoderDecoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class SecurePreferencesImplementation implements SharedPreferences {
    private static final String TAG = SecurePreferencesImplementation.class.getName();
    private static SharedPreferences instance;
    private static SharedPreferences sFile;
    private static SecureCoderDecoder secureCoderDecoder;

    public static class Editor implements SharedPreferences.Editor {
        private SharedPreferences.Editor mEditor;

        @Override // android.content.SharedPreferences.Editor
        @TargetApi(9)
        public void apply() {
            if (Build.VERSION.SDK_INT >= 9) {
                this.mEditor.apply();
            } else {
                commit();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.mEditor.clear();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return this.mEditor.commit();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.mEditor.putString(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str), SecurePreferencesImplementation.secureCoderDecoder.encrypt(Boolean.toString(z)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f2) {
            this.mEditor.putString(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str), SecurePreferencesImplementation.secureCoderDecoder.encrypt(Float.toString(f2)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i2) {
            this.mEditor.putString(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str), SecurePreferencesImplementation.secureCoderDecoder.encrypt(Integer.toString(i2)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j2) {
            this.mEditor.putString(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str), SecurePreferencesImplementation.secureCoderDecoder.encrypt(Long.toString(j2)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.mEditor.putString(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str), SecurePreferencesImplementation.secureCoderDecoder.encrypt(str2));
            return this;
        }

        public SharedPreferences.Editor putStringNoEncrypted(String str, String str2) {
            this.mEditor.putString(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str), str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @TargetApi(11)
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            HashSet hashSet = new HashSet(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(SecurePreferencesImplementation.secureCoderDecoder.encrypt(it.next()));
            }
            this.mEditor.putStringSet(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str), hashSet);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.mEditor.remove(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str));
            return this;
        }

        @SuppressLint({"CommitPrefEdits"})
        private Editor() {
            this.mEditor = SecurePreferencesImplementation.sFile.edit();
        }
    }

    public SecurePreferencesImplementation(Context context, SharedPreferences sharedPreferences) {
        if (sFile == null) {
            sFile = sharedPreferences;
        }
        if (secureCoderDecoder == null) {
            secureCoderDecoder = new SecureCoderDecoder.Builder(context, sFile).create();
        }
    }

    public static SharedPreferences getInstance(Context context, SharedPreferences sharedPreferences) {
        if (instance == null) {
            synchronized (SecurePreferencesImplementation.class) {
                if (instance == null) {
                    instance = new SecurePreferencesImplementation(context, sharedPreferences);
                }
            }
        }
        return instance;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return sFile.contains(secureCoderDecoder.encrypt(str));
    }

    @Override // android.content.SharedPreferences
    public Map<String, String> getAll() {
        Map<String, ?> all = sFile.getAll();
        HashMap map = new HashMap(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            try {
                map.put(secureCoderDecoder.decrypt(entry.getKey()), secureCoderDecoder.decrypt(entry.getValue().toString()));
            } catch (Exception unused) {
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        String string = sFile.getString(secureCoderDecoder.encrypt(str), null);
        if (string == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(secureCoderDecoder.decrypt(string));
        } catch (NumberFormatException e2) {
            throw new ClassCastException(e2.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
        String string = sFile.getString(secureCoderDecoder.encrypt(str), null);
        if (string == null) {
            return f2;
        }
        try {
            return Float.parseFloat(secureCoderDecoder.decrypt(string));
        } catch (NumberFormatException e2) {
            throw new ClassCastException(e2.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i2) {
        String string = sFile.getString(secureCoderDecoder.encrypt(str), null);
        if (string == null) {
            return i2;
        }
        try {
            return Integer.parseInt(secureCoderDecoder.decrypt(string));
        } catch (NumberFormatException e2) {
            throw new ClassCastException(e2.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j2) {
        String string = sFile.getString(secureCoderDecoder.encrypt(str), null);
        if (string == null) {
            return j2;
        }
        try {
            return Long.parseLong(secureCoderDecoder.decrypt(string));
        } catch (NumberFormatException e2) {
            throw new ClassCastException(e2.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        String string = sFile.getString(secureCoderDecoder.encrypt(str), null);
        return string != null ? secureCoderDecoder.decrypt(string) : str2;
    }

    @Override // android.content.SharedPreferences
    @TargetApi(11)
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = sFile.getStringSet(secureCoderDecoder.encrypt(str), null);
        if (stringSet == null) {
            return set;
        }
        HashSet hashSet = new HashSet(stringSet.size());
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()) {
            hashSet.add(secureCoderDecoder.decrypt(it.next()));
        }
        return hashSet;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        sFile.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        sFile.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public Editor edit() {
        return new Editor();
    }
}
