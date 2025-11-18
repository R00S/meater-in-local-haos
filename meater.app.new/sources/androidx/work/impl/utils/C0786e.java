package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p016n.C0763d;
import p024c.p082u.p083a.InterfaceC1008b;

/* compiled from: PreferenceUtils.java */
/* renamed from: androidx.work.impl.utils.e */
/* loaded from: classes.dex */
public class C0786e {

    /* renamed from: a */
    private final WorkDatabase f4872a;

    public C0786e(WorkDatabase workDatabase) {
        this.f4872a = workDatabase;
    }

    /* renamed from: b */
    public static void m5163b(Context context, InterfaceC1008b interfaceC1008b) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j3 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            interfaceC1008b.mo6458n();
            try {
                interfaceC1008b.mo6457l0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                interfaceC1008b.mo6457l0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j3)});
                sharedPreferences.edit().clear().apply();
                interfaceC1008b.mo6456j0();
            } finally {
                interfaceC1008b.mo6462z0();
            }
        }
    }

    /* renamed from: a */
    public boolean m5164a() {
        Long lMo5076a = this.f4872a.mo4850f().mo5076a("reschedule_needed");
        return lMo5076a != null && lMo5076a.longValue() == 1;
    }

    /* renamed from: c */
    public void m5165c(boolean z) {
        this.f4872a.mo4850f().mo5077b(new C0763d("reschedule_needed", z));
    }
}
