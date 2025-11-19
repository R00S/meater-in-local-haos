package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class SharedPreferencesEditorC2615x0 implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    private boolean f34434a;

    /* renamed from: b, reason: collision with root package name */
    private Set<String> f34435b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Object> f34436c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ SharedPreferencesC2591u0 f34437d;

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f34436c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f34434a = true;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f34434a) {
            this.f34437d.f34390a.clear();
        }
        this.f34437d.f34390a.keySet().removeAll(this.f34435b);
        for (Map.Entry<String, Object> entry : this.f34436c.entrySet()) {
            this.f34437d.f34390a.put(entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f34437d.f34391b) {
            m8.j0 j0VarC = m8.d0.k(this.f34435b, this.f34436c.keySet()).iterator();
            while (j0VarC.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f34437d, (String) j0VarC.next());
            }
        }
        return (!this.f34434a && this.f34435b.isEmpty() && this.f34436c.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f34435b.add(str);
        return this;
    }

    private SharedPreferencesEditorC2615x0(SharedPreferencesC2591u0 sharedPreferencesC2591u0) {
        this.f34437d = sharedPreferencesC2591u0;
        this.f34434a = false;
        this.f34435b = new HashSet();
        this.f34436c = new HashMap();
    }
}
