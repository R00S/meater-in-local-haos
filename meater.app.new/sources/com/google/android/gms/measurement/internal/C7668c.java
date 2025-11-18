package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbj;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzky;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.c */
/* loaded from: classes2.dex */
final class C7668c extends AbstractC7703f7 {

    /* renamed from: d */
    private static final String[] f28569d = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: e */
    private static final String[] f28570e = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: f */
    private static final String[] f28571f = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};

    /* renamed from: g */
    private static final String[] f28572g = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: h */
    private static final String[] f28573h = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: i */
    private static final String[] f28574i = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: j */
    private static final String[] f28575j = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: k */
    private static final String[] f28576k = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: l */
    private final C7677d f28577l;

    /* renamed from: m */
    private final C7676c7 f28578m;

    C7668c(zzkc zzkcVar) {
        super(zzkcVar);
        this.f28578m = new C7676c7(mo22837j());
        this.f28577l = new C7677d(this, mo22834f(), "google_app_measurement.db");
    }

    /* renamed from: A */
    private final long m22704A(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m22761x().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j2;
                }
                long j3 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j3;
            } catch (SQLiteException e2) {
                mo22836h().m23137H().m23149c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @VisibleForTesting
    /* renamed from: F */
    private final Object m22706F(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            mo22836h().m23137H().m23147a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            mo22836h().m23137H().m23148b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        mo22836h().m23137H().m23147a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* renamed from: M */
    private static void m22707M(ContentValues contentValues, String str, Object obj) {
        Preconditions.m14368g(str);
        Preconditions.m14372k(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    /* renamed from: V */
    private final boolean m22708V(String str, int i2, zzbj.zzb zzbVar) throws IllegalStateException {
        m22778t();
        mo22792d();
        Preconditions.m14368g(str);
        Preconditions.m14372k(zzbVar);
        if (TextUtils.isEmpty(zzbVar.m21526I())) {
            mo22836h().m23140K().m23150d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzet.m23131x(str), Integer.valueOf(i2), String.valueOf(zzbVar.m21524G() ? Integer.valueOf(zzbVar.m21525H()) : null));
            return false;
        }
        byte[] bArrM22136j = zzbVar.m22136j();
        ContentValues contentValues = new ContentValues();
        contentValues.put(RateAndReviewsFragment.BundleCons.APP_ID, str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", zzbVar.m21524G() ? Integer.valueOf(zzbVar.m21525H()) : null);
        contentValues.put("event_name", zzbVar.m21526I());
        if (mo22841n().m23564B(str, zzap.f29176w0)) {
            contentValues.put("session_scoped", zzbVar.m21533P() ? Boolean.valueOf(zzbVar.m21534Q()) : null);
        }
        contentValues.put("data", bArrM22136j);
        try {
            if (m22761x().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            mo22836h().m23137H().m23148b("Failed to insert event filter (got -1). appId", zzet.m23131x(str));
            return true;
        } catch (SQLiteException e2) {
            mo22836h().m23137H().m23149c("Error storing event filter. appId", zzet.m23131x(str), e2);
            return false;
        }
    }

    /* renamed from: W */
    private final boolean m22709W(String str, int i2, zzbj.zze zzeVar) throws IllegalStateException {
        m22778t();
        mo22792d();
        Preconditions.m14368g(str);
        Preconditions.m14372k(zzeVar);
        if (TextUtils.isEmpty(zzeVar.m21573F())) {
            mo22836h().m23140K().m23150d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzet.m23131x(str), Integer.valueOf(i2), String.valueOf(zzeVar.m21571D() ? Integer.valueOf(zzeVar.m21572E()) : null));
            return false;
        }
        byte[] bArrM22136j = zzeVar.m22136j();
        ContentValues contentValues = new ContentValues();
        contentValues.put(RateAndReviewsFragment.BundleCons.APP_ID, str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", zzeVar.m21571D() ? Integer.valueOf(zzeVar.m21572E()) : null);
        contentValues.put("property_name", zzeVar.m21573F());
        if (mo22841n().m23564B(str, zzap.f29176w0)) {
            contentValues.put("session_scoped", zzeVar.m21577J() ? Boolean.valueOf(zzeVar.m21578K()) : null);
        }
        contentValues.put("data", bArrM22136j);
        try {
            if (m22761x().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            mo22836h().m23137H().m23148b("Failed to insert property filter (got -1). appId", zzet.m23131x(str));
            return false;
        } catch (SQLiteException e2) {
            mo22836h().m23137H().m23149c("Error storing property filter. appId", zzet.m23131x(str), e2);
            return false;
        }
    }

    /* renamed from: h0 */
    private final boolean m22718h0() {
        return mo22834f().getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: i0 */
    private final long m22719i0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m22761x().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e2) {
                mo22836h().m23137H().m23149c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: p0 */
    private final boolean m22720p0(String str, List<Integer> list) throws IllegalStateException {
        Preconditions.m14368g(str);
        m22778t();
        mo22792d();
        SQLiteDatabase sQLiteDatabaseM22761x = m22761x();
        try {
            long jM22719i0 = m22719i0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, mo22841n().m23588t(str, zzap.f29105M)));
            if (jM22719i0 <= iMax) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String strJoin = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 140);
            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb2.append(string);
            sb2.append(" order by rowid desc limit -1 offset ?)");
            return sQLiteDatabaseM22761x.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e2) {
            mo22836h().m23137H().m23149c("Database error querying filters. appId", zzet.m23131x(str), e2);
            return false;
        }
    }

    /* renamed from: A0 */
    public final void m22721A0() {
        m22778t();
        m22761x().endTransaction();
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x008b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x008b */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzbr.zzc, java.lang.Long> m22722B(java.lang.String r8, java.lang.Long r9) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.mo22792d()
            r7.m22778t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.m22761x()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            if (r2 != 0) goto L35
            com.google.android.gms.measurement.internal.zzet r8 = r7.mo22836h()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.zzev r8 = r8.m23145P()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r9 = "Main event not found"
            r8.m23147a(r9)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L35:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzbr$zzc$zza r4 = com.google.android.gms.internal.measurement.zzbr.zzc.m21681c0()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzgn r2 = com.google.android.gms.measurement.internal.zzkg.m23467A(r4, r2)     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzbr$zzc$zza r2 = (com.google.android.gms.internal.measurement.zzbr.zzc.zza) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzgo r2 = r2.mo22283y()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzfd r2 = (com.google.android.gms.internal.measurement.zzfd) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzbr$zzc r2 = (com.google.android.gms.internal.measurement.zzbr.zzc) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r8
        L5b:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzet r3 = r7.mo22836h()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.zzev r3 = r3.m23137H()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzet.m23131x(r8)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r3.m23150d(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L71:
            r8 = move-exception
            goto L77
        L73:
            r8 = move-exception
            goto L8c
        L75:
            r8 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.zzet r9 = r7.mo22836h()     // Catch: java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.zzev r9 = r9.m23137H()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "Error selecting main event"
            r9.m23148b(r2, r8)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L89
            r1.close()
        L89:
            return r0
        L8a:
            r8 = move-exception
            r0 = r1
        L8c:
            if (r0 == 0) goto L91
            r0.close()
        L91:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22722B(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* renamed from: B0 */
    public final boolean m22723B0() {
        return m22719i0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0126  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzab m22724C(long r22, java.lang.String r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22724C(long, java.lang.String, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.zzab");
    }

    /* renamed from: C0 */
    final void m22725C0() {
        int iDelete;
        mo22792d();
        m22778t();
        if (m22718h0()) {
            long jM23155a = mo22840m().f28856i.m23155a();
            long jMo14609b = mo22837j().mo14609b();
            if (Math.abs(jMo14609b - jM23155a) > zzap.f29091F.m23095a(null).longValue()) {
                mo22840m().f28856i.m23156b(jMo14609b);
                mo22792d();
                m22778t();
                if (!m22718h0() || (iDelete = m22761x().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo22837j().mo14608a()), String.valueOf(zzx.m23557N())})) <= 0) {
                    return;
                }
                mo22836h().m23145P().m23148b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017a  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C7713h m22726D(java.lang.String r30, java.lang.String r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22726D(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.h");
    }

    /* renamed from: D0 */
    public final long m22727D0() {
        return m22704A("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* renamed from: E0 */
    public final long m22728E0() {
        return m22704A("select max(timestamp) from raw_events", null, 0L);
    }

    /* renamed from: F0 */
    public final boolean m22729F0() {
        return m22719i0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* renamed from: G0 */
    public final boolean m22730G0() {
        return m22719i0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m22731H(long r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r4.mo22792d()
            r4.m22778t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.m22761x()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            if (r1 != 0) goto L32
            com.google.android.gms.measurement.internal.zzet r6 = r4.mo22836h()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.zzev r6 = r6.m23145P()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.m23147a(r1)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r0
        L32:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r6
        L3a:
            r6 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L55
        L3e:
            r6 = move-exception
            r5 = r0
        L40:
            com.google.android.gms.measurement.internal.zzet r1 = r4.mo22836h()     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.zzev r1 = r1.m23137H()     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "Error selecting expired configs"
            r1.m23148b(r2, r6)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L52
            r5.close()
        L52:
            return r0
        L53:
            r6 = move-exception
            r0 = r5
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22731H(long):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.C7766m7> m22732I(java.lang.String r23) throws java.lang.Throwable {
        /*
            r22 = this;
            com.google.android.gms.common.internal.Preconditions.m14368g(r23)
            r22.mo22792d()
            r22.m22778t()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r22.m22761x()     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L95
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L95
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L95
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L95
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L95
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L95
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L95
            r6[r11] = r23     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L95
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L95
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8d
            if (r3 != 0) goto L46
            r2.close()
            return r0
        L46:
            java.lang.String r18 = r2.getString(r11)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8d
            java.lang.String r3 = r2.getString(r12)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8d
            if (r3 != 0) goto L52
            java.lang.String r3 = ""
        L52:
            r17 = r3
            long r19 = r2.getLong(r13)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8d
            r3 = r22
            java.lang.Object r21 = r3.m22706F(r2, r14)     // Catch: android.database.sqlite.SQLiteException -> L87 java.lang.Throwable -> Lb0
            if (r21 != 0) goto L72
            com.google.android.gms.measurement.internal.zzet r4 = r22.mo22836h()     // Catch: android.database.sqlite.SQLiteException -> L87 java.lang.Throwable -> Lb0
            com.google.android.gms.measurement.internal.zzev r4 = r4.m23137H()     // Catch: android.database.sqlite.SQLiteException -> L87 java.lang.Throwable -> Lb0
            java.lang.String r5 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzet.m23131x(r23)     // Catch: android.database.sqlite.SQLiteException -> L87 java.lang.Throwable -> Lb0
            r4.m23148b(r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L87 java.lang.Throwable -> Lb0
            goto L7d
        L72:
            com.google.android.gms.measurement.internal.m7 r4 = new com.google.android.gms.measurement.internal.m7     // Catch: android.database.sqlite.SQLiteException -> L87 java.lang.Throwable -> Lb0
            r15 = r4
            r16 = r23
            r15.<init>(r16, r17, r18, r19, r21)     // Catch: android.database.sqlite.SQLiteException -> L87 java.lang.Throwable -> Lb0
            r0.add(r4)     // Catch: android.database.sqlite.SQLiteException -> L87 java.lang.Throwable -> Lb0
        L7d:
            boolean r4 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L87 java.lang.Throwable -> Lb0
            if (r4 != 0) goto L46
            r2.close()
            return r0
        L87:
            r0 = move-exception
            goto L99
        L89:
            r0 = move-exception
            r3 = r22
            goto Lb1
        L8d:
            r0 = move-exception
            r3 = r22
            goto L99
        L91:
            r0 = move-exception
            r3 = r22
            goto Lb2
        L95:
            r0 = move-exception
            r3 = r22
            r2 = r1
        L99:
            com.google.android.gms.measurement.internal.zzet r4 = r22.mo22836h()     // Catch: java.lang.Throwable -> Lb0
            com.google.android.gms.measurement.internal.zzev r4 = r4.m23137H()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r5 = "Error querying user properties. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzet.m23131x(r23)     // Catch: java.lang.Throwable -> Lb0
            r4.m23149c(r5, r6, r0)     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto Laf
            r2.close()
        Laf:
            return r1
        Lb0:
            r0 = move-exception
        Lb1:
            r1 = r2
        Lb2:
            if (r1 == 0) goto Lb7
            r1.close()
        Lb7:
            goto Lb9
        Lb8:
            throw r0
        Lb9:
            goto Lb8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22732I(java.lang.String):java.util.List");
    }

    /* renamed from: J */
    public final List<Pair<zzbr.zzg, Long>> m22733J(String str, int i2, int i3) {
        byte[] bArrM23489V;
        mo22792d();
        m22778t();
        Preconditions.m14362a(i2 > 0);
        Preconditions.m14362a(i3 > 0);
        Preconditions.m14368g(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m22761x().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i2));
                if (!cursorQuery.moveToFirst()) {
                    List<Pair<zzbr.zzg, Long>> listEmptyList = Collections.emptyList();
                    cursorQuery.close();
                    return listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                do {
                    long j2 = cursorQuery.getLong(0);
                    try {
                        bArrM23489V = mo22784p().m23489V(cursorQuery.getBlob(1));
                    } catch (IOException e2) {
                        mo22836h().m23137H().m23149c("Failed to unzip queued bundle. appId", zzet.m23131x(str), e2);
                    }
                    if (!arrayList.isEmpty() && bArrM23489V.length + length > i3) {
                        break;
                    }
                    try {
                        zzbr.zzg.zza zzaVar = (zzbr.zzg.zza) zzkg.m23467A(zzbr.zzg.m21799R0(), bArrM23489V);
                        if (!cursorQuery.isNull(2)) {
                            zzaVar.m21980x0(cursorQuery.getInt(2));
                        }
                        length += bArrM23489V.length;
                        arrayList.add(Pair.create((zzbr.zzg) ((zzfd) zzaVar.mo22283y()), Long.valueOf(j2)));
                    } catch (IOException e3) {
                        mo22836h().m23137H().m23149c("Failed to merge queued bundle. appId", zzet.m23131x(str), e3);
                    }
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                } while (length <= i3);
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e4) {
                mo22836h().m23137H().m23149c("Error querying bundles. appId", zzet.m23131x(str), e4);
                List<Pair<zzbr.zzg, Long>> listEmptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return listEmptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        mo22836h().m23137H().m23148b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0145  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.C7766m7> m22734K(java.lang.String r22, java.lang.String r23, java.lang.String r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22734K(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008c, code lost:
    
        mo22836h().m23137H().m23148b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016d  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzv> m22735L(java.lang.String r40, java.lang.String[] r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22735L(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* renamed from: N */
    public final void m22736N(C7713h c7713h) throws IllegalStateException {
        Preconditions.m14372k(c7713h);
        mo22792d();
        m22778t();
        ContentValues contentValues = new ContentValues();
        contentValues.put(RateAndReviewsFragment.BundleCons.APP_ID, c7713h.f28662a);
        contentValues.put("name", c7713h.f28663b);
        contentValues.put("lifetime_count", Long.valueOf(c7713h.f28664c));
        contentValues.put("current_bundle_count", Long.valueOf(c7713h.f28665d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c7713h.f28667f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c7713h.f28668g));
        contentValues.put("last_bundled_day", c7713h.f28669h);
        contentValues.put("last_sampled_complex_event_id", c7713h.f28670i);
        contentValues.put("last_sampling_rate", c7713h.f28671j);
        if (mo22841n().m23564B(c7713h.f28662a, zzap.f29178x0)) {
            contentValues.put("current_session_count", Long.valueOf(c7713h.f28666e));
        }
        Boolean bool = c7713h.f28672k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m22761x().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo22836h().m23137H().m23148b("Failed to insert/update event aggregates (got -1). appId", zzet.m23131x(c7713h.f28662a));
            }
        } catch (SQLiteException e2) {
            mo22836h().m23137H().m23149c("Error storing event aggregates. appId", zzet.m23131x(c7713h.f28662a), e2);
        }
    }

    /* renamed from: O */
    public final void m22737O(C7878z3 c7878z3) {
        Preconditions.m14372k(c7878z3);
        mo22792d();
        m22778t();
        ContentValues contentValues = new ContentValues();
        contentValues.put(RateAndReviewsFragment.BundleCons.APP_ID, c7878z3.m22940t());
        contentValues.put("app_instance_id", c7878z3.m22944x());
        contentValues.put("gmp_app_id", c7878z3.m22882A());
        contentValues.put("resettable_device_id_hash", c7878z3.m22891J());
        contentValues.put("last_bundle_index", Long.valueOf(c7878z3.m22919f0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c7878z3.m22897P()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c7878z3.m22899R()));
        contentValues.put("app_version", c7878z3.m22901T());
        contentValues.put("app_store", c7878z3.m22905X());
        contentValues.put("gmp_version", Long.valueOf(c7878z3.m22907Z()));
        contentValues.put("dev_cert_hash", Long.valueOf(c7878z3.m22911b0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c7878z3.m22917e0()));
        contentValues.put("day", Long.valueOf(c7878z3.m22927j0()));
        contentValues.put("daily_public_events_count", Long.valueOf(c7878z3.m22929k0()));
        contentValues.put("daily_events_count", Long.valueOf(c7878z3.m22931l0()));
        contentValues.put("daily_conversions_count", Long.valueOf(c7878z3.m22933m0()));
        contentValues.put("config_fetched_time", Long.valueOf(c7878z3.m22921g0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c7878z3.m22923h0()));
        contentValues.put("app_version_int", Long.valueOf(c7878z3.m22903V()));
        contentValues.put("firebase_instance_id", c7878z3.m22894M());
        contentValues.put("daily_error_events_count", Long.valueOf(c7878z3.m22922h()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c7878z3.m22920g()));
        contentValues.put("health_monitor_sample", c7878z3.m22924i());
        contentValues.put("android_id", Long.valueOf(c7878z3.m22928k()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c7878z3.m22930l()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(c7878z3.m22932m()));
        contentValues.put("admob_app_id", c7878z3.m22885D());
        contentValues.put("dynamite_version", Long.valueOf(c7878z3.m22915d0()));
        if (c7878z3.m22935o() != null) {
            if (c7878z3.m22935o().size() == 0) {
                mo22836h().m23140K().m23148b("Safelisted events should not be an empty list. appId", c7878z3.m22940t());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c7878z3.m22935o()));
            }
        }
        if (zzky.m22475b() && mo22841n().m23564B(c7878z3.m22940t(), zzap.f29108N0)) {
            contentValues.put("ga_app_id", c7878z3.m22888G());
        }
        try {
            SQLiteDatabase sQLiteDatabaseM22761x = m22761x();
            if (sQLiteDatabaseM22761x.update(DeepLinkIntentReceiver.DeepLinksTargets.APPS, contentValues, "app_id = ?", new String[]{c7878z3.m22940t()}) == 0 && sQLiteDatabaseM22761x.insertWithOnConflict(DeepLinkIntentReceiver.DeepLinksTargets.APPS, null, contentValues, 5) == -1) {
                mo22836h().m23137H().m23148b("Failed to insert/update app (got -1). appId", zzet.m23131x(c7878z3.m22940t()));
            }
        } catch (SQLiteException e2) {
            mo22836h().m23137H().m23149c("Error storing app. appId", zzet.m23131x(c7878z3.m22940t()), e2);
        }
    }

    /* renamed from: P */
    final void m22738P(String str, List<zzbj.zza> list) {
        boolean z;
        m22778t();
        mo22792d();
        Preconditions.m14368g(str);
        Preconditions.m14372k(list);
        SQLiteDatabase sQLiteDatabaseM22761x = m22761x();
        sQLiteDatabaseM22761x.beginTransaction();
        try {
            m22778t();
            mo22792d();
            Preconditions.m14368g(str);
            SQLiteDatabase sQLiteDatabaseM22761x2 = m22761x();
            sQLiteDatabaseM22761x2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM22761x2.delete("event_filters", "app_id=?", new String[]{str});
            for (zzbj.zza zzaVar : list) {
                m22778t();
                mo22792d();
                Preconditions.m14368g(str);
                Preconditions.m14372k(zzaVar);
                if (zzaVar.m21503G()) {
                    int iM21504H = zzaVar.m21504H();
                    Iterator<zzbj.zzb> it = zzaVar.m21508L().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().m21524G()) {
                                mo22836h().m23140K().m23149c("Event filter with no ID. Audience definition ignored. appId, audienceId", zzet.m23131x(str), Integer.valueOf(iM21504H));
                                break;
                            }
                        } else {
                            Iterator<zzbj.zze> it2 = zzaVar.m21506J().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().m21571D()) {
                                        mo22836h().m23140K().m23149c("Property filter with no ID. Audience definition ignored. appId, audienceId", zzet.m23131x(str), Integer.valueOf(iM21504H));
                                        break;
                                    }
                                } else {
                                    Iterator<zzbj.zzb> it3 = zzaVar.m21508L().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!m22708V(str, iM21504H, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<zzbj.zze> it4 = zzaVar.m21506J().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!m22709W(str, iM21504H, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        m22778t();
                                        mo22792d();
                                        Preconditions.m14368g(str);
                                        SQLiteDatabase sQLiteDatabaseM22761x3 = m22761x();
                                        sQLiteDatabaseM22761x3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM21504H)});
                                        sQLiteDatabaseM22761x3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM21504H)});
                                    }
                                }
                            }
                        }
                    }
                } else {
                    mo22836h().m23140K().m23148b("Audience with no ID. appId", zzet.m23131x(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzbj.zza zzaVar2 : list) {
                arrayList.add(zzaVar2.m21503G() ? Integer.valueOf(zzaVar2.m21504H()) : null);
            }
            m22720p0(str, arrayList);
            sQLiteDatabaseM22761x.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseM22761x.endTransaction();
        }
    }

    @VisibleForTesting
    /* renamed from: Q */
    final void m22739Q(List<Long> list) throws SQLException {
        mo22792d();
        m22778t();
        Preconditions.m14372k(list);
        Preconditions.m14374m(list.size());
        if (m22718h0()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 80);
            sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb2.append(string);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m22719i0(sb2.toString(), null) > 0) {
                mo22836h().m23140K().m23147a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM22761x = m22761x();
                StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 127);
                sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb3.append(string);
                sb3.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseM22761x.execSQL(sb3.toString());
            } catch (SQLiteException e2) {
                mo22836h().m23137H().m23148b("Error incrementing retry count. error", e2);
            }
        }
    }

    /* renamed from: R */
    public final boolean m22740R(zzbr.zzg zzgVar, boolean z) throws IllegalStateException {
        mo22792d();
        m22778t();
        Preconditions.m14372k(zzgVar);
        Preconditions.m14368g(zzgVar.m21877L2());
        Preconditions.m14375n(zzgVar.m21905o2());
        m22725C0();
        long jMo14608a = mo22837j().mo14608a();
        if (zzgVar.m21907p2() < jMo14608a - zzx.m23557N() || zzgVar.m21907p2() > zzx.m23557N() + jMo14608a) {
            mo22836h().m23140K().m23150d("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzet.m23131x(zzgVar.m21877L2()), Long.valueOf(jMo14608a), Long.valueOf(zzgVar.m21907p2()));
        }
        try {
            byte[] bArrM23490W = mo22784p().m23490W(zzgVar.m22136j());
            mo22836h().m23145P().m23148b("Saving bundle, size", Integer.valueOf(bArrM23490W.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put(RateAndReviewsFragment.BundleCons.APP_ID, zzgVar.m21877L2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzgVar.m21907p2()));
            contentValues.put("data", bArrM23490W);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzgVar.m21863A0()) {
                contentValues.put("retry_count", Integer.valueOf(zzgVar.m21879N0()));
            }
            try {
                if (m22761x().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                mo22836h().m23137H().m23148b("Failed to insert bundle (got -1). appId", zzet.m23131x(zzgVar.m21877L2()));
                return false;
            } catch (SQLiteException e2) {
                mo22836h().m23137H().m23149c("Error storing bundle. appId", zzet.m23131x(zzgVar.m21877L2()), e2);
                return false;
            }
        } catch (IOException e3) {
            mo22836h().m23137H().m23149c("Data loss. Failed to serialize bundle. appId", zzet.m23131x(zzgVar.m21877L2()), e3);
            return false;
        }
    }

    /* renamed from: S */
    public final boolean m22741S(zzak zzakVar, long j2, boolean z) throws IllegalStateException {
        mo22792d();
        m22778t();
        Preconditions.m14372k(zzakVar);
        Preconditions.m14368g(zzakVar.f29070a);
        zzbr.zzc.zza zzaVarM21703J = zzbr.zzc.m21681c0().m21703J(zzakVar.f29074e);
        Iterator<String> it = zzakVar.f29075f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzbr.zze.zza zzaVarM21742C = zzbr.zze.m21728T().m21742C(next);
            mo22784p().m23485J(zzaVarM21742C, zzakVar.f29075f.m22959W(next));
            zzaVarM21703J.m21696C(zzaVarM21742C);
        }
        byte[] bArrM22136j = ((zzbr.zzc) ((zzfd) zzaVarM21703J.mo22283y())).m22136j();
        mo22836h().m23145P().m23149c("Saving event, name, data size", mo22838k().m23124y(zzakVar.f29071b), Integer.valueOf(bArrM22136j.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(RateAndReviewsFragment.BundleCons.APP_ID, zzakVar.f29070a);
        contentValues.put("name", zzakVar.f29071b);
        contentValues.put("timestamp", Long.valueOf(zzakVar.f29073d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", bArrM22136j);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (m22761x().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            mo22836h().m23137H().m23148b("Failed to insert raw event (got -1). appId", zzet.m23131x(zzakVar.f29070a));
            return false;
        } catch (SQLiteException e2) {
            mo22836h().m23137H().m23149c("Error storing raw event. appId", zzet.m23131x(zzakVar.f29070a), e2);
            return false;
        }
    }

    /* renamed from: T */
    public final boolean m22742T(C7766m7 c7766m7) {
        Preconditions.m14372k(c7766m7);
        mo22792d();
        m22778t();
        if (m22751o0(c7766m7.f28777a, c7766m7.f28779c) == null) {
            if (zzkk.m23504Y(c7766m7.f28779c)) {
                if (m22719i0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c7766m7.f28777a}) >= 25) {
                    return false;
                }
            } else if (mo22841n().m23564B(c7766m7.f28777a, zzap.f29152k0)) {
                if (!"_npa".equals(c7766m7.f28779c) && m22719i0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c7766m7.f28777a, c7766m7.f28778b}) >= 25) {
                    return false;
                }
            } else if (m22719i0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c7766m7.f28777a, c7766m7.f28778b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(RateAndReviewsFragment.BundleCons.APP_ID, c7766m7.f28777a);
        contentValues.put("origin", c7766m7.f28778b);
        contentValues.put("name", c7766m7.f28779c);
        contentValues.put("set_timestamp", Long.valueOf(c7766m7.f28780d));
        m22707M(contentValues, "value", c7766m7.f28781e);
        try {
            if (m22761x().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                mo22836h().m23137H().m23148b("Failed to insert/update user property (got -1). appId", zzet.m23131x(c7766m7.f28777a));
            }
        } catch (SQLiteException e2) {
            mo22836h().m23137H().m23149c("Error storing user property. appId", zzet.m23131x(c7766m7.f28777a), e2);
        }
        return true;
    }

    /* renamed from: U */
    public final boolean m22743U(zzv zzvVar) throws IllegalStateException {
        Preconditions.m14372k(zzvVar);
        mo22792d();
        m22778t();
        if (m22751o0(zzvVar.f29422f, zzvVar.f29424h.f29388g) == null && m22719i0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzvVar.f29422f}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(RateAndReviewsFragment.BundleCons.APP_ID, zzvVar.f29422f);
        contentValues.put("origin", zzvVar.f29423g);
        contentValues.put("name", zzvVar.f29424h.f29388g);
        m22707M(contentValues, "value", zzvVar.f29424h.m23494y());
        contentValues.put("active", Boolean.valueOf(zzvVar.f29426j));
        contentValues.put("trigger_event_name", zzvVar.f29427k);
        contentValues.put("trigger_timeout", Long.valueOf(zzvVar.f29429m));
        mo22839l();
        contentValues.put("timed_out_event", zzkk.m23508g0(zzvVar.f29428l));
        contentValues.put("creation_timestamp", Long.valueOf(zzvVar.f29425i));
        mo22839l();
        contentValues.put("triggered_event", zzkk.m23508g0(zzvVar.f29430n));
        contentValues.put("triggered_timestamp", Long.valueOf(zzvVar.f29424h.f29389h));
        contentValues.put("time_to_live", Long.valueOf(zzvVar.f29431o));
        mo22839l();
        contentValues.put("expired_event", zzkk.m23508g0(zzvVar.f29432p));
        try {
            if (m22761x().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                mo22836h().m23137H().m23148b("Failed to insert/update conditional user property (got -1)", zzet.m23131x(zzvVar.f29422f));
            }
        } catch (SQLiteException e2) {
            mo22836h().m23137H().m23149c("Error storing conditional user property", zzet.m23131x(zzvVar.f29422f), e2);
        }
        return true;
    }

    /* renamed from: X */
    public final boolean m22744X(String str, Long l, long j2, zzbr.zzc zzcVar) throws IllegalStateException {
        mo22792d();
        m22778t();
        Preconditions.m14372k(zzcVar);
        Preconditions.m14368g(str);
        Preconditions.m14372k(l);
        byte[] bArrM22136j = zzcVar.m22136j();
        mo22836h().m23145P().m23149c("Saving complex main event, appId, data size", mo22838k().m23124y(str), Integer.valueOf(bArrM22136j.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(RateAndReviewsFragment.BundleCons.APP_ID, str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrM22136j);
        try {
            if (m22761x().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            mo22836h().m23137H().m23148b("Failed to insert complex main event (got -1). appId", zzet.m23131x(str));
            return false;
        } catch (SQLiteException e2) {
            mo22836h().m23137H().m23149c("Error storing complex main event. appId", zzet.m23131x(str), e2);
            return false;
        }
    }

    /* renamed from: Y */
    public final long m22745Y() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m22761x().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e2) {
                mo22836h().m23137H().m23148b("Error querying raw events", e2);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0294  */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C7878z3 m22746j0(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22746j0(java.lang.String):com.google.android.gms.measurement.internal.z3");
    }

    /* renamed from: k0 */
    public final List<zzv> m22747k0(String str, String str2, String str3) {
        Preconditions.m14368g(str);
        mo22792d();
        m22778t();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m22735L(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> m22748l0(java.lang.String r14, java.util.List<java.lang.String> r15) throws java.lang.Throwable {
        /*
            r13 = this;
            r13.m22778t()
            r13.mo22792d()
            com.google.android.gms.common.internal.Preconditions.m14368g(r14)
            com.google.android.gms.common.internal.Preconditions.m14372k(r15)
            c.e.a r0 = new c.e.a
            r0.<init>()
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L18
            return r0
        L18:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "app_id=? AND property_name in ("
            r1.append(r2)
            r2 = 0
            r3 = 0
        L24:
            int r4 = r15.size()
            if (r3 >= r4) goto L39
            if (r3 <= 0) goto L31
            java.lang.String r4 = ","
            r1.append(r4)
        L31:
            java.lang.String r4 = "?"
            r1.append(r4)
            int r3 = r3 + 1
            goto L24
        L39:
            java.lang.String r3 = ")"
            r1.append(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r15)
            r3.add(r2, r14)
            android.database.sqlite.SQLiteDatabase r4 = r13.m22761x()
            r15 = 0
            java.lang.String r5 = "property_filters"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> Laa android.database.sqlite.SQLiteException -> Lac
            java.lang.String r7 = "audience_id"
            r6[r2] = r7     // Catch: java.lang.Throwable -> Laa android.database.sqlite.SQLiteException -> Lac
            java.lang.String r7 = "filter_id"
            r12 = 1
            r6[r12] = r7     // Catch: java.lang.Throwable -> Laa android.database.sqlite.SQLiteException -> Lac
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> Laa android.database.sqlite.SQLiteException -> Lac
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Laa android.database.sqlite.SQLiteException -> Lac
            java.lang.Object[] r1 = r3.toArray(r1)     // Catch: java.lang.Throwable -> Laa android.database.sqlite.SQLiteException -> Lac
            r8 = r1
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch: java.lang.Throwable -> Laa android.database.sqlite.SQLiteException -> Lac
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Laa android.database.sqlite.SQLiteException -> Lac
            boolean r3 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lc5
            if (r3 != 0) goto L77
            r1.close()
            return r0
        L77:
            int r3 = r1.getInt(r2)     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lc5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lc5
            java.lang.Object r4 = r0.get(r4)     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lc5
            java.util.List r4 = (java.util.List) r4     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lc5
            if (r4 != 0) goto L93
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lc5
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lc5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lc5
            r0.put(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lc5
        L93:
            int r3 = r1.getInt(r12)     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lc5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lc5
            r4.add(r3)     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lc5
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> La8 java.lang.Throwable -> Lc5
            if (r3 != 0) goto L77
            r1.close()
            return r0
        La8:
            r0 = move-exception
            goto Lae
        Laa:
            r14 = move-exception
            goto Lc7
        Lac:
            r0 = move-exception
            r1 = r15
        Lae:
            com.google.android.gms.measurement.internal.zzet r2 = r13.mo22836h()     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.measurement.internal.zzev r2 = r2.m23137H()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r3 = "Database error querying filters. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzet.m23131x(r14)     // Catch: java.lang.Throwable -> Lc5
            r2.m23149c(r3, r14, r0)     // Catch: java.lang.Throwable -> Lc5
            if (r1 == 0) goto Lc4
            r1.close()
        Lc4:
            return r15
        Lc5:
            r14 = move-exception
            r15 = r1
        Lc7:
            if (r15 == 0) goto Lcc
            r15.close()
        Lcc:
            goto Lce
        Lcd:
            throw r14
        Lce:
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22748l0(java.lang.String, java.util.List):java.util.Map");
    }

    /* renamed from: m0 */
    public final void m22749m0(String str, String str2) throws IllegalStateException {
        Preconditions.m14368g(str);
        Preconditions.m14368g(str2);
        mo22792d();
        m22778t();
        try {
            mo22836h().m23145P().m23148b("Deleted user attribute rows", Integer.valueOf(m22761x().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e2) {
            mo22836h().m23137H().m23150d("Error deleting user attribute. appId", zzet.m23131x(str), mo22838k().m23120B(str2), e2);
        }
    }

    /* renamed from: n0 */
    public final long m22750n0(String str) throws IllegalStateException {
        Preconditions.m14368g(str);
        mo22792d();
        m22778t();
        try {
            return m22761x().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, mo22841n().m23588t(str, zzap.f29175w))))});
        } catch (SQLiteException e2) {
            mo22836h().m23137H().m23149c("Error deleting over the limit events. appId", zzet.m23131x(str), e2);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C7766m7 m22751o0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.Preconditions.m14368g(r19)
            com.google.android.gms.common.internal.Preconditions.m14368g(r20)
            r18.mo22792d()
            r18.m22778t()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.m22761x()     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L83
            java.lang.String r11 = "user_attributes"
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L83
            java.lang.String r0 = "set_timestamp"
            r1 = 0
            r12[r1] = r0     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L83
            java.lang.String r0 = "value"
            r2 = 1
            r12[r2] = r0     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L83
            java.lang.String r0 = "origin"
            r3 = 2
            r12[r3] = r0     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L83
            java.lang.String r13 = "app_id=? and name=?"
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L83
            r14[r1] = r19     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L83
            r14[r2] = r8     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L83
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L83
            boolean r0 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7b
            if (r0 != 0) goto L42
            r10.close()
            return r9
        L42:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7b
            r11 = r18
            java.lang.Object r7 = r11.m22706F(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La6
            java.lang.String r3 = r10.getString(r3)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.m7 r0 = new com.google.android.gms.measurement.internal.m7     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La6
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La6
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La6
            if (r1 == 0) goto L71
            com.google.android.gms.measurement.internal.zzet r1 = r18.mo22836h()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.zzev r1 = r1.m23137H()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La6
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzet.m23131x(r19)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La6
            r1.m23148b(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La6
        L71:
            r10.close()
            return r0
        L75:
            r0 = move-exception
            goto L87
        L77:
            r0 = move-exception
            r11 = r18
            goto La7
        L7b:
            r0 = move-exception
            r11 = r18
            goto L87
        L7f:
            r0 = move-exception
            r11 = r18
            goto La8
        L83:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L87:
            com.google.android.gms.measurement.internal.zzet r1 = r18.mo22836h()     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.zzev r1 = r1.m23137H()     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzet.m23131x(r19)     // Catch: java.lang.Throwable -> La6
            com.google.android.gms.measurement.internal.zzer r4 = r18.mo22838k()     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = r4.m23120B(r8)     // Catch: java.lang.Throwable -> La6
            r1.m23150d(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> La6
            if (r10 == 0) goto La5
            r10.close()
        La5:
            return r9
        La6:
            r0 = move-exception
        La7:
            r9 = r10
        La8:
            if (r9 == 0) goto Lad
            r9.close()
        Lad:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22751o0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.m7");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x014e  */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzv m22752q0(java.lang.String r33, java.lang.String r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22752q0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzv");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0072: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:24:0x0072 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] m22753r0(java.lang.String r12) throws java.lang.Throwable {
        /*
            r11 = this;
            com.google.android.gms.common.internal.Preconditions.m14368g(r12)
            r11.mo22792d()
            r11.m22778t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.m22761x()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> L58
            java.lang.String r2 = "apps"
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> L58
            java.lang.String r5 = "remote_config"
            r9 = 0
            r4[r9] = r5     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> L58
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> L58
            r6[r9] = r12     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> L58
            r7 = 0
            r8 = 0
            r10 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> L58
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L71
            if (r2 != 0) goto L35
            r1.close()
            return r0
        L35:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L71
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L71
            if (r3 == 0) goto L50
            com.google.android.gms.measurement.internal.zzet r3 = r11.mo22836h()     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L71
            com.google.android.gms.measurement.internal.zzev r3 = r3.m23137H()     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L71
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzet.m23131x(r12)     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L71
            r3.m23148b(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L54 java.lang.Throwable -> L71
        L50:
            r1.close()
            return r2
        L54:
            r2 = move-exception
            goto L5a
        L56:
            r12 = move-exception
            goto L73
        L58:
            r2 = move-exception
            r1 = r0
        L5a:
            com.google.android.gms.measurement.internal.zzet r3 = r11.mo22836h()     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.measurement.internal.zzev r3 = r3.m23137H()     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzet.m23131x(r12)     // Catch: java.lang.Throwable -> L71
            r3.m23149c(r4, r12, r2)     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L70
            r1.close()
        L70:
            return r0
        L71:
            r12 = move-exception
            r0 = r1
        L73:
            if (r0 == 0) goto L78
            r0.close()
        L78:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22753r0(java.lang.String):byte[]");
    }

    /* renamed from: s0 */
    public final int m22754s0(String str, String str2) throws IllegalStateException {
        Preconditions.m14368g(str);
        Preconditions.m14368g(str2);
        mo22792d();
        m22778t();
        try {
            return m22761x().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            mo22836h().m23137H().m23150d("Error deleting conditional property", zzet.m23131x(str), mo22838k().m23120B(str2), e2);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> m22755t0(java.lang.String r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.m22778t()
            r7.mo22792d()
            com.google.android.gms.common.internal.Preconditions.m14368g(r8)
            c.e.a r0 = new c.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.m22761x()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteException -> L65
            r5 = 0
            r4[r5] = r8     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteException -> L65
            r6 = 1
            r4[r6] = r8     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteException -> L65
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteException -> L65
            boolean r3 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L7e
            if (r3 != 0) goto L30
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L7e
            r1.close()
            return r8
        L30:
            int r3 = r1.getInt(r5)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L7e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L7e
            java.lang.Object r4 = r0.get(r4)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L7e
            java.util.List r4 = (java.util.List) r4     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L7e
            if (r4 != 0) goto L4c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L7e
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L7e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L7e
            r0.put(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L7e
        L4c:
            int r3 = r1.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L7e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L7e
            r4.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L7e
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L61 java.lang.Throwable -> L7e
            if (r3 != 0) goto L30
            r1.close()
            return r0
        L61:
            r0 = move-exception
            goto L67
        L63:
            r8 = move-exception
            goto L80
        L65:
            r0 = move-exception
            r1 = r2
        L67:
            com.google.android.gms.measurement.internal.zzet r3 = r7.mo22836h()     // Catch: java.lang.Throwable -> L7e
            com.google.android.gms.measurement.internal.zzev r3 = r3.m23137H()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzet.m23131x(r8)     // Catch: java.lang.Throwable -> L7e
            r3.m23149c(r4, r8, r0)     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L7d
            r1.close()
        L7d:
            return r2
        L7e:
            r8 = move-exception
            r2 = r1
        L80:
            if (r2 == 0) goto L85
            r2.close()
        L85:
            goto L87
        L86:
            throw r8
        L87:
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22755t0(java.lang.String):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzbr.zzi> m22756u0(java.lang.String r12) throws java.lang.Throwable {
        /*
            r11 = this;
            r11.m22778t()
            r11.mo22792d()
            com.google.android.gms.common.internal.Preconditions.m14368g(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.m22761x()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            java.lang.String r3 = "audience_id"
            r9 = 0
            r2[r9] = r3     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            java.lang.String r3 = "current_results"
            r10 = 1
            r2[r10] = r3     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            java.lang.String r3 = "app_id=?"
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            r4[r9] = r12     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            boolean r1 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            if (r1 != 0) goto L34
            r0.close()
            return r8
        L34:
            c.e.a r1 = new c.e.a     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
        L39:
            int r2 = r0.getInt(r9)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            byte[] r3 = r0.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            com.google.android.gms.internal.measurement.zzbr$zzi$zza r4 = com.google.android.gms.internal.measurement.zzbr.zzi.m22004a0()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            com.google.android.gms.internal.measurement.zzgn r3 = com.google.android.gms.measurement.internal.zzkg.m23467A(r4, r3)     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            com.google.android.gms.internal.measurement.zzbr$zzi$zza r3 = (com.google.android.gms.internal.measurement.zzbr.zzi.zza) r3     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            com.google.android.gms.internal.measurement.zzgo r3 = r3.mo22283y()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            com.google.android.gms.internal.measurement.zzfd r3 = (com.google.android.gms.internal.measurement.zzfd) r3     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            com.google.android.gms.internal.measurement.zzbr$zzi r3 = (com.google.android.gms.internal.measurement.zzbr.zzi) r3     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            r1.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            goto L71
        L5b:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzet r4 = r11.mo22836h()     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            com.google.android.gms.measurement.internal.zzev r4 = r4.m23137H()     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzet.m23131x(r12)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            r4.m23150d(r5, r6, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
        L71:
            boolean r2 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> L98
            if (r2 != 0) goto L39
            r0.close()
            return r1
        L7b:
            r1 = move-exception
            goto L81
        L7d:
            r12 = move-exception
            goto L9a
        L7f:
            r1 = move-exception
            r0 = r8
        L81:
            com.google.android.gms.measurement.internal.zzet r2 = r11.mo22836h()     // Catch: java.lang.Throwable -> L98
            com.google.android.gms.measurement.internal.zzev r2 = r2.m23137H()     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzet.m23131x(r12)     // Catch: java.lang.Throwable -> L98
            r2.m23149c(r3, r12, r1)     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L97
            r0.close()
        L97:
            return r8
        L98:
            r12 = move-exception
            r8 = r0
        L9a:
            if (r8 == 0) goto L9f
            r8.close()
        L9f:
            goto La1
        La0:
            throw r12
        La1:
            goto La0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22756u0(java.lang.String):java.util.Map");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7703f7
    /* renamed from: v */
    protected final boolean mo22757v() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zzb>> m22758v0(java.lang.String r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r12.m22778t()
            r12.mo22792d()
            com.google.android.gms.common.internal.Preconditions.m14368g(r13)
            com.google.android.gms.common.internal.Preconditions.m14368g(r14)
            c.e.a r0 = new c.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.m22761x()
            r9 = 0
            java.lang.String r2 = "event_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            java.lang.String r5 = "app_id=? AND event_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            r6[r10] = r13     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            r6[r11] = r14     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            if (r1 != 0) goto L46
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            r14.close()
            return r13
        L46:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            com.google.android.gms.internal.measurement.zzbj$zzb$zza r2 = com.google.android.gms.internal.measurement.zzbj.zzb.m21521R()     // Catch: java.io.IOException -> L7c android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            com.google.android.gms.internal.measurement.zzgn r1 = com.google.android.gms.measurement.internal.zzkg.m23467A(r2, r1)     // Catch: java.io.IOException -> L7c android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            com.google.android.gms.internal.measurement.zzbj$zzb$zza r1 = (com.google.android.gms.internal.measurement.zzbj.zzb.zza) r1     // Catch: java.io.IOException -> L7c android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            com.google.android.gms.internal.measurement.zzgo r1 = r1.mo22283y()     // Catch: java.io.IOException -> L7c android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            com.google.android.gms.internal.measurement.zzfd r1 = (com.google.android.gms.internal.measurement.zzfd) r1     // Catch: java.io.IOException -> L7c android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            com.google.android.gms.internal.measurement.zzbj$zzb r1 = (com.google.android.gms.internal.measurement.zzbj.zzb) r1     // Catch: java.io.IOException -> L7c android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            if (r3 != 0) goto L78
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
        L78:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            goto L8e
        L7c:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzet r2 = r12.mo22836h()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            com.google.android.gms.measurement.internal.zzev r2 = r2.m23137H()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzet.m23131x(r13)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            r2.m23149c(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
        L8e:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            if (r1 != 0) goto L46
            r14.close()
            return r0
        L98:
            r0 = move-exception
            goto L9e
        L9a:
            r13 = move-exception
            goto Lb7
        L9c:
            r0 = move-exception
            r14 = r9
        L9e:
            com.google.android.gms.measurement.internal.zzet r1 = r12.mo22836h()     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.measurement.internal.zzev r1 = r1.m23137H()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzet.m23131x(r13)     // Catch: java.lang.Throwable -> Lb5
            r1.m23149c(r2, r13, r0)     // Catch: java.lang.Throwable -> Lb5
            if (r14 == 0) goto Lb4
            r14.close()
        Lb4:
            return r9
        Lb5:
            r13 = move-exception
            r9 = r14
        Lb7:
            if (r9 == 0) goto Lbc
            r9.close()
        Lbc:
            goto Lbe
        Lbd:
            throw r13
        Lbe:
            goto Lbd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22758v0(java.lang.String, java.lang.String):java.util.Map");
    }

    /* renamed from: w */
    public final void m22759w() {
        m22778t();
        m22761x().setTransactionSuccessful();
    }

    /* renamed from: w0 */
    public final void m22760w0() {
        m22778t();
        m22761x().beginTransaction();
    }

    @VisibleForTesting
    /* renamed from: x */
    final SQLiteDatabase m22761x() {
        mo22792d();
        try {
            return this.f28577l.getWritableDatabase();
        } catch (SQLiteException e2) {
            mo22836h().m23140K().m23148b("Error opening database", e2);
            throw e2;
        }
    }

    /* renamed from: x0 */
    public final long m22762x0(String str) {
        Preconditions.m14368g(str);
        return m22704A("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m22763y() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m22761x()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L25
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L27
        L20:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3b
        L25:
            r2 = move-exception
            r0 = r1
        L27:
            com.google.android.gms.measurement.internal.zzet r3 = r6.mo22836h()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.zzev r3 = r3.m23137H()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.m23148b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
        L3b:
            if (r0 == 0) goto L40
            r0.close()
        L40:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22763y():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zze>> m22764y0(java.lang.String r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r12.m22778t()
            r12.mo22792d()
            com.google.android.gms.common.internal.Preconditions.m14368g(r13)
            com.google.android.gms.common.internal.Preconditions.m14368g(r14)
            c.e.a r0 = new c.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.m22761x()
            r9 = 0
            java.lang.String r2 = "property_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            java.lang.String r5 = "app_id=? AND property_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            r6[r10] = r13     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            r6[r11] = r14     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            if (r1 != 0) goto L46
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            r14.close()
            return r13
        L46:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            com.google.android.gms.internal.measurement.zzbj$zze$zza r2 = com.google.android.gms.internal.measurement.zzbj.zze.m21569L()     // Catch: java.io.IOException -> L7c android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            com.google.android.gms.internal.measurement.zzgn r1 = com.google.android.gms.measurement.internal.zzkg.m23467A(r2, r1)     // Catch: java.io.IOException -> L7c android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            com.google.android.gms.internal.measurement.zzbj$zze$zza r1 = (com.google.android.gms.internal.measurement.zzbj.zze.zza) r1     // Catch: java.io.IOException -> L7c android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            com.google.android.gms.internal.measurement.zzgo r1 = r1.mo22283y()     // Catch: java.io.IOException -> L7c android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            com.google.android.gms.internal.measurement.zzfd r1 = (com.google.android.gms.internal.measurement.zzfd) r1     // Catch: java.io.IOException -> L7c android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            com.google.android.gms.internal.measurement.zzbj$zze r1 = (com.google.android.gms.internal.measurement.zzbj.zze) r1     // Catch: java.io.IOException -> L7c android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            if (r3 != 0) goto L78
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
        L78:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            goto L8e
        L7c:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzet r2 = r12.mo22836h()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            com.google.android.gms.measurement.internal.zzev r2 = r2.m23137H()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzet.m23131x(r13)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            r2.m23149c(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
        L8e:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Lb5
            if (r1 != 0) goto L46
            r14.close()
            return r0
        L98:
            r0 = move-exception
            goto L9e
        L9a:
            r13 = move-exception
            goto Lb7
        L9c:
            r0 = move-exception
            r14 = r9
        L9e:
            com.google.android.gms.measurement.internal.zzet r1 = r12.mo22836h()     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.measurement.internal.zzev r1 = r1.m23137H()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzet.m23131x(r13)     // Catch: java.lang.Throwable -> Lb5
            r1.m23149c(r2, r13, r0)     // Catch: java.lang.Throwable -> Lb5
            if (r14 == 0) goto Lb4
            r14.close()
        Lb4:
            return r9
        Lb5:
            r13 = move-exception
            r9 = r14
        Lb7:
            if (r9 == 0) goto Lbc
            r9.close()
        Lbc:
            goto Lbe
        Lbd:
            throw r13
        Lbe:
            goto Lbd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7668c.m22764y0(java.lang.String, java.lang.String):java.util.Map");
    }

    /* renamed from: z */
    public final long m22765z(zzbr.zzg zzgVar) throws IllegalStateException, IOException {
        mo22792d();
        m22778t();
        Preconditions.m14372k(zzgVar);
        Preconditions.m14368g(zzgVar.m21877L2());
        byte[] bArrM22136j = zzgVar.m22136j();
        long jM23492x = mo22784p().m23492x(bArrM22136j);
        ContentValues contentValues = new ContentValues();
        contentValues.put(RateAndReviewsFragment.BundleCons.APP_ID, zzgVar.m21877L2());
        contentValues.put("metadata_fingerprint", Long.valueOf(jM23492x));
        contentValues.put("metadata", bArrM22136j);
        try {
            m22761x().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jM23492x;
        } catch (SQLiteException e2) {
            mo22836h().m23137H().m23149c("Error storing raw event metadata. appId", zzet.m23131x(zzgVar.m21877L2()), e2);
            throw e2;
        }
    }

    @VisibleForTesting
    /* renamed from: z0 */
    protected final long m22766z0(String str, String str2) throws Throwable {
        Preconditions.m14368g(str);
        Preconditions.m14368g(str2);
        mo22792d();
        m22778t();
        SQLiteDatabase sQLiteDatabaseM22761x = m22761x();
        sQLiteDatabaseM22761x.beginTransaction();
        long j2 = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            try {
                try {
                    long jM22704A = m22704A(sb.toString(), new String[]{str}, -1L);
                    if (jM22704A == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(RateAndReviewsFragment.BundleCons.APP_ID, str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (sQLiteDatabaseM22761x.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            mo22836h().m23137H().m23149c("Failed to insert column (got -1). appId", zzet.m23131x(str), str2);
                            sQLiteDatabaseM22761x.endTransaction();
                            return -1L;
                        }
                        jM22704A = 0;
                    }
                    try {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put(RateAndReviewsFragment.BundleCons.APP_ID, str);
                        contentValues2.put(str2, Long.valueOf(1 + jM22704A));
                        if (sQLiteDatabaseM22761x.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                            mo22836h().m23137H().m23149c("Failed to update column (got 0). appId", zzet.m23131x(str), str2);
                            sQLiteDatabaseM22761x.endTransaction();
                            return -1L;
                        }
                        sQLiteDatabaseM22761x.setTransactionSuccessful();
                        sQLiteDatabaseM22761x.endTransaction();
                        return jM22704A;
                    } catch (SQLiteException e2) {
                        e = e2;
                        j2 = jM22704A;
                        mo22836h().m23137H().m23150d("Error inserting column. appId", zzet.m23131x(str), str2, e);
                        sQLiteDatabaseM22761x.endTransaction();
                        return j2;
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabaseM22761x.endTransaction();
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        } catch (SQLiteException e4) {
            e = e4;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
