package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C2569r2;
import com.google.android.gms.internal.measurement.C2585t2;
import com.google.android.gms.internal.measurement.C2601v2;
import com.google.android.gms.internal.measurement.C2609w2;
import com.google.android.gms.internal.measurement.C2625y2;
import com.google.android.gms.internal.measurement.E6;
import com.google.android.gms.internal.measurement.F4;
import com.google.android.gms.internal.measurement.P1;
import com.google.android.gms.internal.measurement.Q1;
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.W6;
import com.google.android.gms.measurement.internal.C2823q3;
import g7.C3445p;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import s.C4391a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2812p extends AbstractC2873x5 {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f35491f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    static final String[] f35492g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f35493h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f35494i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f35495j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f35496k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f35497l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f35498m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f35499n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f35500o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: p, reason: collision with root package name */
    private static final String[] f35501p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d, reason: collision with root package name */
    private final C2867x f35502d;

    /* renamed from: e, reason: collision with root package name */
    private final C2804n5 f35503e;

    C2812p(C2880y5 c2880y5) {
        super(c2880y5);
        this.f35503e = new C2804n5(b());
        this.f35502d = new C2867x(this, a(), "google_app_measurement.db");
    }

    private final String G0() {
        long jA = b().a();
        Locale locale = Locale.US;
        v7.X x10 = v7.X.GOOGLE_SIGNAL;
        Integer numValueOf = Integer.valueOf(x10.a());
        Long lValueOf = Long.valueOf(jA);
        Long lA = K.f34935O.a(null);
        lA.longValue();
        return "(" + String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", numValueOf, lValueOf, lA) + " OR " + String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", Integer.valueOf(x10.a()), Long.valueOf(jA), Long.valueOf(C2763i.S())) + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long J(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = C().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j10;
                }
                long j11 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j11;
            } catch (SQLiteException e10) {
                k().H().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    private final long J0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = C().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                k().H().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final C2609w2 K0(String str, long j10) throws Throwable {
        C2609w2 c2609w2;
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = C().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str, Long.toString(j10)}, null, null, "rowid", "2");
                try {
                    try {
                        if (!cursorQuery.moveToFirst()) {
                            k().H().b("Raw event metadata record is missing. appId", C2759h2.w(str));
                            cursorQuery.close();
                            return null;
                        }
                        try {
                            C2609w2 c2609w22 = (C2609w2) ((com.google.android.gms.internal.measurement.F4) ((C2609w2.a) N5.H(C2609w2.I2(), cursorQuery.getBlob(0))).x());
                            try {
                                if (cursorQuery.moveToNext()) {
                                    k().M().b("Get multiple raw event metadata records, expected one. appId", C2759h2.w(str));
                                }
                                cursorQuery.close();
                                cursorQuery.close();
                                return c2609w22;
                            } catch (SQLiteException e10) {
                                cursor = cursorQuery;
                                c2609w2 = c2609w22;
                                e = e10;
                                k().H().c("Data loss. Error selecting raw event. appId", C2759h2.w(str), e);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return c2609w2;
                            }
                        } catch (IOException e11) {
                            k().H().c("Data loss. Failed to merge raw event metadata. appId", C2759h2.w(str), e11);
                            cursorQuery.close();
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    cursor = cursorQuery;
                    c2609w2 = null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e13) {
            e = e13;
            c2609w2 = null;
        }
    }

    private static String M0(List<Integer> list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    private final M5 Q(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12) {
        v7.X x10;
        if (TextUtils.isEmpty(str2)) {
            k().G().a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            C2601v2.b bVar = (C2601v2.b) N5.H(C2601v2.Q(), bArr);
            v7.X[] xArrValues = v7.X.values();
            int length = xArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    x10 = v7.X.UNKNOWN;
                    break;
                }
                x10 = xArrValues[i12];
                if (x10.a() == i10) {
                    break;
                }
                i12++;
            }
            if (x10 != v7.X.GOOGLE_SIGNAL && x10 != v7.X.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator<C2609w2> it = bVar.H().iterator();
                while (it.hasNext()) {
                    C2609w2.a aVarC = it.next().C();
                    aVarC.L0(i11);
                    arrayList.add((C2609w2) ((com.google.android.gms.internal.measurement.F4) aVarC.x()));
                }
                bVar.E();
                bVar.B(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length2 = strArrSplit.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        break;
                    }
                    String str4 = strArrSplit[i13];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split("=", 2);
                    if (strArrSplit2.length != 2) {
                        k().H().b("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i13++;
                }
            }
            return new L5().h(j10).b((C2601v2) ((com.google.android.gms.internal.measurement.F4) bVar.x())).c(str2).d(map).e(x10).g(j11).a(j12).f();
        } catch (IOException e10) {
            k().H().c("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    private final boolean Q0(String str, List<Integer> list) {
        C3445p.e(str);
        v();
        n();
        SQLiteDatabase sQLiteDatabaseC = C();
        try {
            long jJ0 = J0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, c().z(str, K.f34939Q)));
            if (jJ0 <= iMax) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                Integer num = list.get(i10);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String str2 = "(" + TextUtils.join(",", arrayList) + ")";
            StringBuilder sb2 = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb2.append(str2);
            sb2.append(" order by rowid desc limit -1 offset ?)");
            return sQLiteDatabaseC.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e10) {
            k().H().c("Database error querying filters. appId", C2759h2.w(str), e10);
            return false;
        }
    }

    private final Object R(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            k().H().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            k().H().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        k().H().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <T> T S(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.InterfaceC2846u<T> r5) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.C()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            if (r4 != 0) goto L25
            com.google.android.gms.measurement.internal.h2 r4 = r2.k()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            com.google.android.gms.measurement.internal.i2 r4 = r4.L()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            java.lang.String r5 = "No data found"
            r4.a(r5)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r0
        L20:
            r4 = move-exception
            r0 = r3
            goto L44
        L23:
            r4 = move-exception
            goto L31
        L25:
            java.lang.Object r4 = r5.a(r3)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r4
        L2d:
            r4 = move-exception
            goto L44
        L2f:
            r4 = move-exception
            r3 = r0
        L31:
            com.google.android.gms.measurement.internal.h2 r5 = r2.k()     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.measurement.internal.i2 r5 = r5.H()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "Error querying database."
            r5.b(r1, r4)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L43
            r3.close()
        L43:
            return r0
        L44:
            if (r0 == 0) goto L49
            r0.close()
        L49:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.S(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.u):java.lang.Object");
    }

    private final String T(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = C().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return str2;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e10) {
                k().H().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.measurement.internal.G T0(java.lang.String r29, java.lang.String r30, java.lang.String r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.T0(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.G");
    }

    private static void Y(ContentValues contentValues, String str, Object obj) {
        C3445p.e(str);
        C3445p.k(obj);
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

    private final void d0(String str, G g10) {
        C3445p.k(g10);
        n();
        v();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", g10.f34845a);
        contentValues.put("name", g10.f34846b);
        contentValues.put("lifetime_count", Long.valueOf(g10.f34847c));
        contentValues.put("current_bundle_count", Long.valueOf(g10.f34848d));
        contentValues.put("last_fire_timestamp", Long.valueOf(g10.f34850f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(g10.f34851g));
        contentValues.put("last_bundled_day", g10.f34852h);
        contentValues.put("last_sampled_complex_event_id", g10.f34853i);
        contentValues.put("last_sampling_rate", g10.f34854j);
        contentValues.put("current_session_count", Long.valueOf(g10.f34849e));
        Boolean bool = g10.f34855k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (C().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                k().H().b("Failed to insert/update event aggregates (got -1). appId", C2759h2.w(g10.f34845a));
            }
        } catch (SQLiteException e10) {
            k().H().c("Error storing event aggregates. appId", C2759h2.w(g10.f34845a), e10);
        }
    }

    private final void g0(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseC = C();
            if (contentValues.getAsString(str2) == null) {
                k().I().b("Value of the primary key is not set.", C2759h2.w(str2));
                return;
            }
            if (sQLiteDatabaseC.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && sQLiteDatabaseC.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                k().H().c("Failed to insert/update table (got -1). key", C2759h2.w(str), C2759h2.w(str2));
            }
        } catch (SQLiteException e10) {
            k().H().d("Error storing into table. key", C2759h2.w(str), C2759h2.w(str2), e10);
        }
    }

    private final void h1(String str, String str2) {
        C3445p.e(str2);
        n();
        v();
        try {
            C().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            k().H().c("Error deleting snapshot. appId", C2759h2.w(str2), e10);
        }
    }

    private final boolean j0(long j10, D d10, long j11, boolean z10) {
        n();
        v();
        C3445p.k(d10);
        C3445p.e(d10.f34783a);
        byte[] bArrM = p().F(d10).m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", d10.f34783a);
        contentValues.put("name", d10.f34784b);
        contentValues.put("timestamp", Long.valueOf(d10.f34786d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j11));
        contentValues.put("data", bArrM);
        contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
        try {
            long jUpdate = C().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
            if (jUpdate == 1) {
                return true;
            }
            k().H().c("Failed to update raw event. appId, updatedRows", C2759h2.w(d10.f34783a), Long.valueOf(jUpdate));
            return false;
        } catch (SQLiteException e10) {
            k().H().c("Error updating raw event. appId", C2759h2.w(d10.f34783a), e10);
            return false;
        }
    }

    private final boolean o0(String str, int i10, com.google.android.gms.internal.measurement.Q1 q12) {
        v();
        n();
        C3445p.e(str);
        C3445p.k(q12);
        if (q12.R().isEmpty()) {
            k().M().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C2759h2.w(str), Integer.valueOf(i10), String.valueOf(q12.X() ? Integer.valueOf(q12.N()) : null));
            return false;
        }
        byte[] bArrM = q12.m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", q12.X() ? Integer.valueOf(q12.N()) : null);
        contentValues.put("event_name", q12.R());
        contentValues.put("session_scoped", q12.Y() ? Boolean.valueOf(q12.V()) : null);
        contentValues.put("data", bArrM);
        try {
            if (C().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            k().H().b("Failed to insert event filter (got -1). appId", C2759h2.w(str));
            return true;
        } catch (SQLiteException e10) {
            k().H().c("Error storing event filter. appId", C2759h2.w(str), e10);
            return false;
        }
    }

    private final boolean p0(String str, int i10, com.google.android.gms.internal.measurement.T1 t12) {
        v();
        n();
        C3445p.e(str);
        C3445p.k(t12);
        if (t12.O().isEmpty()) {
            k().M().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C2759h2.w(str), Integer.valueOf(i10), String.valueOf(t12.S() ? Integer.valueOf(t12.n()) : null));
            return false;
        }
        byte[] bArrM = t12.m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", t12.S() ? Integer.valueOf(t12.n()) : null);
        contentValues.put("property_name", t12.O());
        contentValues.put("session_scoped", t12.T() ? Boolean.valueOf(t12.R()) : null);
        contentValues.put("data", bArrM);
        try {
            if (C().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            k().H().b("Failed to insert property filter (got -1). appId", C2759h2.w(str));
            return false;
        } catch (SQLiteException e10) {
            k().H().c("Error storing property filter. appId", C2759h2.w(str), e10);
            return false;
        }
    }

    private final int q1(String str) {
        C3445p.e(str);
        n();
        v();
        try {
            int iZ = c().z(str, K.f35009w);
            if (iZ <= 0) {
                return 0;
            }
            return C().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iZ)});
        } catch (SQLiteException e10) {
            k().H().c("Error deleting over the limit queued batches. appId", C2759h2.w(str), e10);
            return 0;
        }
    }

    public final long A() {
        return J("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long B() {
        return J("select max(timestamp) from raw_events", null, 0L);
    }

    final SQLiteDatabase C() {
        n();
        try {
            return this.f35502d.getWritableDatabase();
        } catch (SQLiteException e10) {
            k().M().b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String D() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.C()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3c
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            com.google.android.gms.measurement.internal.h2 r3 = r6.k()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.i2 r3 = r3.H()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r0 == 0) goto L41
            r0.close()
        L41:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.D():java.lang.String");
    }

    public final int E(String str, String str2) {
        C3445p.e(str);
        C3445p.e(str2);
        n();
        v();
        try {
            return C().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            k().H().d("Error deleting conditional property", C2759h2.w(str), g().g(str2), e10);
            return 0;
        }
    }

    public final long F(C2609w2 c2609w2) throws NoSuchAlgorithmException {
        n();
        v();
        C3445p.k(c2609w2);
        C3445p.e(c2609w2.c0());
        byte[] bArrM = c2609w2.m();
        long jB = p().B(bArrM);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c2609w2.c0());
        contentValues.put("metadata_fingerprint", Long.valueOf(jB));
        contentValues.put("metadata", bArrM);
        try {
            C().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jB;
        } catch (SQLiteException e10) {
            k().H().c("Error storing raw event metadata. appId", C2759h2.w(c2609w2.c0()), e10);
            throw e10;
        }
    }

    public final long H(String str) {
        C3445p.e(str);
        n();
        v();
        try {
            return C().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, c().z(str, K.f34997q))))});
        } catch (SQLiteException e10) {
            k().H().c("Error deleting over the limit events. appId", C2759h2.w(str), e10);
            return 0L;
        }
    }

    public final long H0(String str) {
        C3445p.e(str);
        return J("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final long I(String str, C2601v2 c2601v2, String str2, Map<String, String> map, v7.X x10, Long l10) {
        int iDelete;
        n();
        v();
        C3445p.k(c2601v2);
        C3445p.e(str);
        if (!c().u(K.f34924I0)) {
            return -1L;
        }
        n();
        v();
        if (v0()) {
            long jA = t().f35229f.a();
            long jC = b().c();
            if (Math.abs(jC - jA) > C2763i.T()) {
                t().f35229f.b(jC);
                n();
                v();
                if (v0() && (iDelete = C().delete("upload_queue", G0(), new String[0])) > 0) {
                    k().L().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                if (c().u(K.f34928K0)) {
                    q1(str);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        byte[] bArrM = c2601v2.m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrM);
        contentValues.put("upload_uri", str2);
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb2.append((CharSequence) arrayList.get(0));
            int i10 = 1;
            while (i10 < size) {
                sb2.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i10);
                i10++;
                sb2.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb2.toString());
        contentValues.put("upload_type", Integer.valueOf(x10.a()));
        contentValues.put("creation_timestamp", Long.valueOf(b().a()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = C().insert("upload_queue", null, contentValues);
            if (jInsert == -1) {
                k().H().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            }
            return jInsert;
        } catch (SQLiteException e10) {
            k().H().c("Error storing MeasurementBatch to upload_queue. appId", str, e10);
            return -1L;
        }
    }

    protected final long I0(String str, String str2) {
        C3445p.e(str);
        C3445p.e(str2);
        n();
        v();
        SQLiteDatabase sQLiteDatabaseC = C();
        sQLiteDatabaseC.beginTransaction();
        long j10 = 0;
        try {
            try {
                long J10 = J("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (J10 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseC.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        k().H().c("Failed to insert column (got -1). appId", C2759h2.w(str), str2);
                        return -1L;
                    }
                    J10 = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + J10));
                    if (sQLiteDatabaseC.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        k().H().c("Failed to update column (got 0). appId", C2759h2.w(str), str2);
                        return -1L;
                    }
                    sQLiteDatabaseC.setTransactionSuccessful();
                    return J10;
                } catch (SQLiteException e10) {
                    long j11 = J10;
                    e = e10;
                    j10 = j11;
                    k().H().d("Error inserting column. appId", C2759h2.w(str), str2, e);
                    sQLiteDatabaseC.endTransaction();
                    return j10;
                }
            } catch (SQLiteException e11) {
                e = e11;
            }
        } finally {
            sQLiteDatabaseC.endTransaction();
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0031: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:50), block:B:10:0x0031 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.C2569r2, java.lang.Long> K(java.lang.String r6, java.lang.Long r7) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.n()
            r5.v()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.C()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String[] r3 = new java.lang.String[]{r6, r3}     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            if (r2 != 0) goto L35
            com.google.android.gms.measurement.internal.h2 r6 = r5.k()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.i2 r6 = r6.L()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r7 = "Main event not found"
            r6.a(r7)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r0
        L30:
            r6 = move-exception
            r0 = r1
            goto L8a
        L33:
            r6 = move-exception
            goto L77
        L35:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r3 = 1
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.internal.measurement.r2$a r4 = com.google.android.gms.internal.measurement.C2569r2.W()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.n5 r2 = com.google.android.gms.measurement.internal.N5.H(r4, r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.r2$a r2 = (com.google.android.gms.internal.measurement.C2569r2.a) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.k5 r2 = r2.x()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.F4 r2 = (com.google.android.gms.internal.measurement.F4) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.r2 r2 = (com.google.android.gms.internal.measurement.C2569r2) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            android.util.Pair r6 = android.util.Pair.create(r2, r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r6
        L5d:
            r2 = move-exception
            com.google.android.gms.measurement.internal.h2 r3 = r5.k()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.i2 r3 = r3.H()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2759h2.w(r6)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r3.d(r4, r6, r7, r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r0
        L73:
            r6 = move-exception
            goto L8a
        L75:
            r6 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.h2 r7 = r5.k()     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.measurement.internal.i2 r7 = r7.H()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error selecting main event"
            r7.b(r2, r6)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L89
            r1.close()
        L89:
            return r0
        L8a:
            if (r0 == 0) goto L8f
            r0.close()
        L8f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.K(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final C2819q L(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        C3445p.e(str);
        n();
        v();
        String[] strArr = {str};
        C2819q c2819q = new C2819q();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseC = C();
                Cursor cursorQuery = sQLiteDatabaseC.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    k().M().b("Not updating daily counts, app is not known. appId", C2759h2.w(str));
                    cursorQuery.close();
                    return c2819q;
                }
                if (cursorQuery.getLong(0) == j10) {
                    c2819q.f35517b = cursorQuery.getLong(1);
                    c2819q.f35516a = cursorQuery.getLong(2);
                    c2819q.f35518c = cursorQuery.getLong(3);
                    c2819q.f35519d = cursorQuery.getLong(4);
                    c2819q.f35520e = cursorQuery.getLong(5);
                    c2819q.f35521f = cursorQuery.getLong(6);
                    c2819q.f35522g = cursorQuery.getLong(7);
                }
                if (z10) {
                    c2819q.f35517b += j11;
                }
                if (z11) {
                    c2819q.f35516a += j11;
                }
                if (z12) {
                    c2819q.f35518c += j11;
                }
                if (z13) {
                    c2819q.f35519d += j11;
                }
                if (z14) {
                    c2819q.f35520e += j11;
                }
                if (z15) {
                    c2819q.f35521f += j11;
                }
                if (z16) {
                    c2819q.f35522g += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(c2819q.f35516a));
                contentValues.put("daily_events_count", Long.valueOf(c2819q.f35517b));
                contentValues.put("daily_conversions_count", Long.valueOf(c2819q.f35518c));
                contentValues.put("daily_error_events_count", Long.valueOf(c2819q.f35519d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c2819q.f35520e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(c2819q.f35521f));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(c2819q.f35522g));
                sQLiteDatabaseC.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c2819q;
            } catch (SQLiteException e10) {
                k().H().c("Error updating daily counts. appId", C2759h2.w(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return c2819q;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String L0(long r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r3.n()
            r3.v()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.C()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            if (r5 != 0) goto L35
            com.google.android.gms.measurement.internal.h2 r5 = r3.k()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.i2 r5 = r5.L()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.a(r1)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r4.close()
            return r0
        L30:
            r5 = move-exception
            r0 = r4
            goto L55
        L33:
            r5 = move-exception
            goto L42
        L35:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r4.close()
            return r5
        L3e:
            r5 = move-exception
            goto L55
        L40:
            r5 = move-exception
            r4 = r0
        L42:
            com.google.android.gms.measurement.internal.h2 r1 = r3.k()     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.measurement.internal.i2 r1 = r1.H()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r5)     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L54
            r4.close()
        L54:
            return r0
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.L0(long):java.lang.String");
    }

    public final C2819q M(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return L(j10, str, 1L, false, false, z12, false, z14, z15, z16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        k().H().b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.R5> N0(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.N0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    final void O0(Long l10) throws SQLException {
        n();
        v();
        C3445p.k(l10);
        if (c().u(K.f34924I0) && v0()) {
            if (J0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l10 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                k().M().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                C().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l10 + " AND retry_count < 2147483647");
            } catch (SQLiteException e10) {
                k().H().b("Error incrementing retry count. error", e10);
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x008a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:139), block:B:16:0x008a */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.M5 P(long r17) throws java.lang.Throwable {
        /*
            r16 = this;
            com.google.android.gms.measurement.internal.i r0 = r16.c()
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.K.f34928K0
            boolean r0 = r0.u(r1)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            r16.n()
            r16.v()
            android.database.sqlite.SQLiteDatabase r2 = r16.C()     // Catch: java.lang.Throwable -> L8e android.database.sqlite.SQLiteException -> L90
            java.lang.String r3 = "upload_queue"
            java.lang.String r4 = "rowId"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "measurement_batch"
            java.lang.String r7 = "upload_uri"
            java.lang.String r8 = "upload_headers"
            java.lang.String r9 = "upload_type"
            java.lang.String r10 = "retry_count"
            java.lang.String r11 = "creation_timestamp"
            java.lang.String r12 = "associated_row_id"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}     // Catch: java.lang.Throwable -> L8e android.database.sqlite.SQLiteException -> L90
            java.lang.String r5 = "rowId=?"
            java.lang.String r0 = java.lang.String.valueOf(r17)     // Catch: java.lang.Throwable -> L8e android.database.sqlite.SQLiteException -> L90
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L8e android.database.sqlite.SQLiteException -> L90
            java.lang.String r10 = "1"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8e android.database.sqlite.SQLiteException -> L90
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8c
            if (r0 != 0) goto L4d
            r2.close()
            return r1
        L4d:
            r0 = 1
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8c
            java.lang.Object r0 = g7.C3445p.k(r0)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8c
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8c
            r0 = 2
            byte[] r7 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8c
            r0 = 3
            java.lang.String r8 = r2.getString(r0)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8c
            r0 = 4
            java.lang.String r9 = r2.getString(r0)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8c
            r0 = 5
            int r10 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8c
            r0 = 6
            int r11 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8c
            r0 = 7
            long r12 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8c
            r0 = 8
            long r14 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8c
            r3 = r16
            r5 = r17
            com.google.android.gms.measurement.internal.M5 r0 = r3.Q(r4, r5, r7, r8, r9, r10, r11, r12, r14)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8c
            r2.close()
            return r0
        L89:
            r0 = move-exception
            r1 = r2
            goto La9
        L8c:
            r0 = move-exception
            goto L92
        L8e:
            r0 = move-exception
            goto La9
        L90:
            r0 = move-exception
            r2 = r1
        L92:
            com.google.android.gms.measurement.internal.h2 r3 = r16.k()     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.measurement.internal.i2 r3 = r3.H()     // Catch: java.lang.Throwable -> L89
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. rowId"
            java.lang.Long r5 = java.lang.Long.valueOf(r17)     // Catch: java.lang.Throwable -> L89
            r3.c(r4, r5, r0)     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto La8
            r2.close()
        La8:
            return r1
        La9:
            if (r1 == 0) goto Lae
            r1.close()
        Lae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.P(long):com.google.android.gms.measurement.internal.M5");
    }

    public final void P0(String str, C2823q3 c2823q3) {
        C3445p.k(str);
        C3445p.k(c2823q3);
        n();
        v();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c2823q3.v());
        contentValues.put("consent_source", Integer.valueOf(c2823q3.b()));
        g0("consent_settings", "app_id", contentValues);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:46), block:B:10:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle R0(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.n()
            r5.v()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.C()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            if (r2 != 0) goto L31
            com.google.android.gms.measurement.internal.h2 r6 = r5.k()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.i2 r6 = r6.L()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r2 = "Default event parameters not found"
            r6.a(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L2c:
            r6 = move-exception
            r0 = r1
            goto L84
        L2f:
            r6 = move-exception
            goto L71
        L31:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.internal.measurement.r2$a r3 = com.google.android.gms.internal.measurement.C2569r2.W()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.n5 r2 = com.google.android.gms.measurement.internal.N5.H(r3, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.r2$a r2 = (com.google.android.gms.internal.measurement.C2569r2.a) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.k5 r2 = r2.x()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.F4 r2 = (com.google.android.gms.internal.measurement.F4) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.r2 r2 = (com.google.android.gms.internal.measurement.C2569r2) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            r5.p()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.util.List r6 = r2.Z()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.N5.C(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r6
        L57:
            r2 = move-exception
            com.google.android.gms.measurement.internal.h2 r3 = r5.k()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.i2 r3 = r3.H()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2759h2.w(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r3.c(r4, r6, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L6d:
            r6 = move-exception
            goto L84
        L6f:
            r6 = move-exception
            r1 = r0
        L71:
            com.google.android.gms.measurement.internal.h2 r2 = r5.k()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.i2 r2 = r2.H()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r6)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L83
            r1.close()
        L83:
            return r0
        L84:
            if (r0 == 0) goto L89
            r0.close()
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.R0(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0053: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:84), block:B:14:0x0053 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C2749g S0(java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.S0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.g");
    }

    public final List<Pair<C2609w2, Long>> U(String str, int i10, int i11) {
        byte[] bArrK0;
        long jT;
        long jT2;
        n();
        v();
        int i12 = 1;
        C3445p.a(i10 > 0);
        C3445p.a(i11 > 0);
        C3445p.e(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = C().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i10));
                if (!cursorQuery.moveToFirst()) {
                    List<Pair<C2609w2, Long>> listEmptyList = Collections.emptyList();
                    cursorQuery.close();
                    return listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j10 = cursorQuery.getLong(0);
                    try {
                        bArrK0 = p().k0(cursorQuery.getBlob(i12));
                    } catch (IOException e10) {
                        k().H().c("Failed to unzip queued bundle. appId", C2759h2.w(str), e10);
                    }
                    if (!arrayList.isEmpty() && bArrK0.length + length > i11) {
                        break;
                    }
                    try {
                        C2609w2.a aVar = (C2609w2.a) N5.H(C2609w2.I2(), bArrK0);
                        if (!arrayList.isEmpty()) {
                            C2609w2 c2609w2 = (C2609w2) ((Pair) arrayList.get(0)).first;
                            C2609w2 c2609w22 = (C2609w2) ((com.google.android.gms.internal.measurement.F4) aVar.x());
                            if (!c2609w2.h0().equals(c2609w22.h0()) || !c2609w2.g0().equals(c2609w22.g0()) || c2609w2.x0() != c2609w22.x0() || !c2609w2.i0().equals(c2609w22.i0())) {
                                break;
                            }
                            Iterator<com.google.android.gms.internal.measurement.B2> it = c2609w2.v0().iterator();
                            while (true) {
                                jT = -1;
                                if (!it.hasNext()) {
                                    jT2 = -1;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.B2 next = it.next();
                                if ("_npa".equals(next.Y())) {
                                    jT2 = next.T();
                                    break;
                                }
                            }
                            Iterator<com.google.android.gms.internal.measurement.B2> it2 = c2609w22.v0().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                com.google.android.gms.internal.measurement.B2 next2 = it2.next();
                                if ("_npa".equals(next2.Y())) {
                                    jT = next2.T();
                                    break;
                                }
                            }
                            if (jT2 != jT) {
                                break;
                            }
                        }
                        if (!cursorQuery.isNull(2)) {
                            aVar.L0(cursorQuery.getInt(2));
                        }
                        length += bArrK0.length;
                        arrayList.add(Pair.create((C2609w2) ((com.google.android.gms.internal.measurement.F4) aVar.x()), Long.valueOf(j10)));
                    } catch (IOException e11) {
                        k().H().c("Failed to merge queued bundle. appId", C2759h2.w(str), e11);
                    }
                    if (!cursorQuery.moveToNext() || length > i11) {
                        break;
                    }
                    i12 = 1;
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e12) {
                k().H().c("Error querying bundles. appId", C2759h2.w(str), e12);
                List<Pair<C2609w2, Long>> listEmptyList2 = Collections.emptyList();
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

    public final G U0(String str, String str2) {
        return T0("events", str, str2);
    }

    public final List<C2749g> V(String str, String str2, String str3) {
        C3445p.e(str);
        n();
        v();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb2.append(" and name glob ?");
        }
        return X(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C2828r2 V0(java.lang.String r52) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.V0(java.lang.String):com.google.android.gms.measurement.internal.r2");
    }

    public final List<M5> W(String str, v7.k0 k0Var, int i10) {
        if (!c().u(K.f34928K0)) {
            return Collections.emptyList();
        }
        C3445p.e(str);
        n();
        v();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = C().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id"}, "app_id=?" + M0(k0Var.f51567B) + " AND NOT " + G0(), new String[]{str}, null, null, "creation_timestamp ASC", i10 > 0 ? String.valueOf(i10) : null);
                ArrayList arrayList = new ArrayList();
                while (cursorQuery.moveToNext()) {
                    M5 m5Q = Q(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8));
                    if (m5Q != null) {
                        arrayList.add(m5Q);
                    }
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e10) {
                k().H().c("Error to querying MeasurementBatch from upload_queue. appId", str, e10);
                List<M5> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0059: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:90), block:B:14:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.r W0(java.lang.String r10) throws java.lang.Throwable {
        /*
            r9 = this;
            g7.C3445p.e(r10)
            r9.n()
            r9.v()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.C()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            if (r2 != 0) goto L31
            r1.close()
            return r0
        L31:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            boolean r5 = r1.moveToNext()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            if (r5 == 0) goto L5d
            com.google.android.gms.measurement.internal.h2 r5 = r9.k()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            com.google.android.gms.measurement.internal.i2 r5 = r5.H()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2759h2.w(r10)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            goto L5d
        L58:
            r10 = move-exception
            r0 = r1
            goto L87
        L5b:
            r2 = move-exception
            goto L70
        L5d:
            if (r2 != 0) goto L63
            r1.close()
            return r0
        L63:
            com.google.android.gms.measurement.internal.r r5 = new com.google.android.gms.measurement.internal.r     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r1.close()
            return r5
        L6c:
            r10 = move-exception
            goto L87
        L6e:
            r2 = move-exception
            r1 = r0
        L70:
            com.google.android.gms.measurement.internal.h2 r3 = r9.k()     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.measurement.internal.i2 r3 = r3.H()     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C2759h2.w(r10)     // Catch: java.lang.Throwable -> L58
            r3.c(r4, r10, r2)     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L86
            r1.close()
        L86:
            return r0
        L87:
            if (r0 == 0) goto L8c
            r0.close()
        L8c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.W0(java.lang.String):com.google.android.gms.measurement.internal.r");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        k().H().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.C2749g> X(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.X(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:19:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.R5 X0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            g7.C3445p.e(r11)
            g7.C3445p.e(r12)
            r10.n()
            r10.v()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.C()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            if (r2 != 0) goto L34
            r1.close()
            return r0
        L34:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            r2 = 1
            java.lang.Object r9 = r10.R(r1, r2)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            if (r9 != 0) goto L44
            r1.close()
            return r0
        L44:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            com.google.android.gms.measurement.internal.R5 r2 = new com.google.android.gms.measurement.internal.R5     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            if (r3 == 0) goto L6e
            com.google.android.gms.measurement.internal.h2 r3 = r10.k()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            com.google.android.gms.measurement.internal.i2 r3 = r3.H()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2759h2.w(r11)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            goto L6e
        L69:
            r11 = move-exception
            r0 = r1
            goto L95
        L6c:
            r2 = move-exception
            goto L76
        L6e:
            r1.close()
            return r2
        L72:
            r11 = move-exception
            goto L95
        L74:
            r2 = move-exception
            r1 = r0
        L76:
            com.google.android.gms.measurement.internal.h2 r3 = r10.k()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.i2 r3 = r3.H()     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C2759h2.w(r11)     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.e2 r5 = r10.g()     // Catch: java.lang.Throwable -> L69
            java.lang.String r12 = r5.g(r12)     // Catch: java.lang.Throwable -> L69
            r3.d(r4, r11, r12, r2)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L94
            r1.close()
        L94:
            return r0
        L95:
            if (r0 == 0) goto L9a
            r0.close()
        L9a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.X0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.R5");
    }

    public final C Y0(String str) {
        C3445p.k(str);
        n();
        v();
        return C.c(T("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void Z(G g10) {
        d0("events", g10);
    }

    final Map<Integer, List<com.google.android.gms.internal.measurement.Q1>> Z0(String str, String str2) {
        v();
        n();
        C3445p.e(str);
        C3445p.e(str2);
        C4391a c4391a = new C4391a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = C().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<com.google.android.gms.internal.measurement.Q1>> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.Q1 q12 = (com.google.android.gms.internal.measurement.Q1) ((com.google.android.gms.internal.measurement.F4) ((Q1.a) N5.H(com.google.android.gms.internal.measurement.Q1.O(), cursorQuery.getBlob(1))).x());
                        int i10 = cursorQuery.getInt(0);
                        List arrayList = (List) c4391a.get(Integer.valueOf(i10));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c4391a.put(Integer.valueOf(i10), arrayList);
                        }
                        arrayList.add(q12);
                    } catch (IOException e10) {
                        k().H().c("Failed to merge filter. appId", C2759h2.w(str), e10);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c4391a;
            } catch (SQLiteException e11) {
                k().H().c("Database error querying filters. appId", C2759h2.w(str), e11);
                Map<Integer, List<com.google.android.gms.internal.measurement.Q1>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void a0(C2828r2 c2828r2, boolean z10, boolean z11) {
        C3445p.k(c2828r2);
        n();
        v();
        String strL = c2828r2.l();
        C3445p.k(strL);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strL);
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f35538b.e0(strL).m(C2823q3.a.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", c2828r2.m());
        }
        contentValues.put("gmp_app_id", c2828r2.q());
        if (this.f35538b.e0(strL).m(C2823q3.a.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", c2828r2.s());
        }
        contentValues.put("last_bundle_index", Long.valueOf(c2828r2.G0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c2828r2.I0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c2828r2.E0()));
        contentValues.put("app_version", c2828r2.o());
        contentValues.put("app_store", c2828r2.n());
        contentValues.put("gmp_version", Long.valueOf(c2828r2.A0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c2828r2.u0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c2828r2.A()));
        contentValues.put("day", Long.valueOf(c2828r2.s0()));
        contentValues.put("daily_public_events_count", Long.valueOf(c2828r2.n0()));
        contentValues.put("daily_events_count", Long.valueOf(c2828r2.k0()));
        contentValues.put("daily_conversions_count", Long.valueOf(c2828r2.e0()));
        contentValues.put("config_fetched_time", Long.valueOf(c2828r2.b0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c2828r2.y0()));
        contentValues.put("app_version_int", Long.valueOf(c2828r2.V()));
        contentValues.put("firebase_instance_id", c2828r2.p());
        contentValues.put("daily_error_events_count", Long.valueOf(c2828r2.h0()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c2828r2.q0()));
        contentValues.put("health_monitor_sample", c2828r2.r());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c2828r2.z()));
        contentValues.put("admob_app_id", c2828r2.j());
        contentValues.put("dynamite_version", Long.valueOf(c2828r2.w0()));
        if (this.f35538b.e0(strL).m(C2823q3.a.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", c2828r2.u());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c2828r2.C()));
        contentValues.put("target_os_version", Long.valueOf(c2828r2.K0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(c2828r2.J0()));
        if (W6.a() && c().I(strL, K.f34940Q0)) {
            contentValues.put("ad_services_version", Integer.valueOf(c2828r2.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(c2828r2.Y()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c2828r2.D()));
        contentValues.put("npa_metadata_value", c2828r2.L0());
        contentValues.put("bundle_delivery_index", Long.valueOf(c2828r2.C0()));
        contentValues.put("sgtm_preview_key", c2828r2.v());
        contentValues.put("dma_consent_state", Integer.valueOf(c2828r2.Q()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c2828r2.L()));
        contentValues.put("serialized_npa_metadata", c2828r2.t());
        if (c().I(strL, K.f34928K0)) {
            contentValues.put("client_upload_eligibility", Integer.valueOf(c2828r2.F()));
        }
        List<String> listW = c2828r2.w();
        if (listW != null) {
            if (listW.isEmpty()) {
                k().M().b("Safelisted events should not be an empty list. appId", strL);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listW));
            }
        }
        if (E6.a() && c().u(K.f34918F0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", c2828r2.M0());
        contentValues.put("unmatched_uwa", c2828r2.N0());
        contentValues.put("ad_campaign_info", c2828r2.E());
        try {
            SQLiteDatabase sQLiteDatabaseC = C();
            if (sQLiteDatabaseC.update("apps", contentValues, "app_id = ?", new String[]{strL}) == 0 && sQLiteDatabaseC.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                k().H().b("Failed to insert/update app (got -1). appId", C2759h2.w(strL));
            }
        } catch (SQLiteException e10) {
            k().H().c("Error storing app. appId", C2759h2.w(strL), e10);
        }
    }

    public final C2823q3 a1(String str) {
        C3445p.k(str);
        n();
        v();
        return C2823q3.p(T("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void b0(Long l10) {
        n();
        v();
        C3445p.k(l10);
        if (c().u(K.f34924I0)) {
            try {
                if (C().delete("upload_queue", "rowid=?", new String[]{String.valueOf(l10)}) != 1) {
                    k().M().a("Deleted fewer rows from upload_queue than expected");
                }
            } catch (SQLiteException e10) {
                k().H().b("Failed to delete a MeasurementBatch in a upload_queue table", e10);
                throw e10;
            }
        }
    }

    final Map<Integer, List<com.google.android.gms.internal.measurement.T1>> b1(String str, String str2) {
        v();
        n();
        C3445p.e(str);
        C3445p.e(str2);
        C4391a c4391a = new C4391a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = C().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<com.google.android.gms.internal.measurement.T1>> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.T1 t12 = (com.google.android.gms.internal.measurement.T1) ((com.google.android.gms.internal.measurement.F4) ((T1.a) N5.H(com.google.android.gms.internal.measurement.T1.M(), cursorQuery.getBlob(1))).x());
                        int i10 = cursorQuery.getInt(0);
                        List arrayList = (List) c4391a.get(Integer.valueOf(i10));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c4391a.put(Integer.valueOf(i10), arrayList);
                        }
                        arrayList.add(t12);
                    } catch (IOException e10) {
                        k().H().c("Failed to merge filter", C2759h2.w(str), e10);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c4391a;
            } catch (SQLiteException e11) {
                k().H().c("Database error querying filters. appId", C2759h2.w(str), e11);
                Map<Integer, List<com.google.android.gms.internal.measurement.T1>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void c0(String str, C c10) {
        C3445p.k(str);
        C3445p.k(c10);
        n();
        v();
        C2823q3 c2823q3C1 = c1(str);
        C2823q3 c2823q3 = C2823q3.f35526c;
        if (c2823q3C1 == c2823q3) {
            P0(str, c2823q3);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", c10.j());
        g0("consent_settings", "app_id", contentValues);
    }

    public final C2823q3 c1(String str) {
        C3445p.k(str);
        n();
        v();
        C2823q3 c2823q3 = (C2823q3) S("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new InterfaceC2846u() { // from class: com.google.android.gms.measurement.internal.o
            @Override // com.google.android.gms.measurement.internal.InterfaceC2846u
            public final Object a(Cursor cursor) {
                return C2823q3.e(cursor.getString(0), cursor.getInt(1));
            }
        });
        return c2823q3 == null ? C2823q3.f35526c : c2823q3;
    }

    public final void d1(String str, String str2) {
        C3445p.e(str);
        C3445p.e(str2);
        n();
        v();
        try {
            C().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            k().H().d("Error deleting user property. appId", C2759h2.w(str), g().g(str2), e10);
        }
    }

    public final void e0(String str, C2823q3 c2823q3) {
        C3445p.k(str);
        C3445p.k(c2823q3);
        n();
        v();
        P0(str, c1(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c2823q3.v());
        g0("consent_settings", "app_id", contentValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.M5 e1(java.lang.String r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.e1(java.lang.String):com.google.android.gms.measurement.internal.M5");
    }

    public final void f0(String str, Long l10, String str2, Bundle bundle) {
        C2609w2 c2609w2K0;
        String str3 = str;
        C3445p.k(bundle);
        n();
        v();
        C2853v c2853v = (!c().u(K.f34961a1) || l10 == null) ? new C2853v(this, str3) : new C2853v(this, str3, l10.longValue());
        List<C2839t> listA = c2853v.a();
        while (!listA.isEmpty()) {
            for (C2839t c2839t : listA) {
                if (!TextUtils.isEmpty(str2) && (c2609w2K0 = K0(str3, c2839t.f35639b)) != null) {
                    Iterator<com.google.android.gms.internal.measurement.B2> it = c2609w2K0.v0().iterator();
                    while (it.hasNext()) {
                        if (it.next().Y().equals(str2)) {
                            break;
                        }
                    }
                }
                N5 n5P = p();
                C2569r2 c2569r2 = c2839t.f35641d;
                Bundle bundle2 = new Bundle();
                for (C2585t2 c2585t2 : c2569r2.Z()) {
                    if (c2585t2.e0()) {
                        bundle2.putDouble(c2585t2.b0(), c2585t2.K());
                    } else if (c2585t2.f0()) {
                        bundle2.putFloat(c2585t2.b0(), c2585t2.R());
                    } else if (c2585t2.g0()) {
                        bundle2.putLong(c2585t2.b0(), c2585t2.W());
                    } else if (c2585t2.i0()) {
                        bundle2.putString(c2585t2.b0(), c2585t2.c0());
                    } else if (c2585t2.d0().isEmpty()) {
                        n5P.k().H().b("Unexpected parameter type for parameter", c2585t2);
                    } else {
                        bundle2.putParcelableArray(c2585t2.b0(), N5.j0(c2585t2.d0()));
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String strY = c2569r2.Y();
                if (string == null) {
                    string = "";
                }
                C2780k2 c2780k2 = new C2780k2(strY, string, bundle2, c2569r2.V());
                j().O(c2780k2.f35423d, bundle);
                j0(c2839t.f35638a, new D(this.f35457a, c2780k2.f35421b, str, c2839t.f35641d.Y(), c2839t.f35641d.V(), c2839t.f35641d.U(), c2780k2.f35423d), c2839t.f35639b, c2839t.f35640c);
                str3 = str;
            }
            listA = c2853v.a();
            str3 = str;
        }
    }

    public final boolean f1(String str, String str2) {
        return J0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final List<C2797m5> g1(String str) {
        C3445p.e(str);
        n();
        v();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = C().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new C2797m5(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e10) {
                k().H().c("Error querying trigger uris. appId", C2759h2.w(str), e10);
                List<C2797m5> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    final void h0(String str, List<com.google.android.gms.internal.measurement.P1> list) {
        boolean z10;
        boolean z11;
        C3445p.k(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            P1.a aVarC = list.get(i10).C();
            if (aVarC.v() != 0) {
                for (int i11 = 0; i11 < aVarC.v(); i11++) {
                    Q1.a aVarC2 = aVarC.B(i11).C();
                    Q1.a aVar = (Q1.a) ((F4.a) aVarC2.clone());
                    String strB = v7.H.b(aVarC2.C());
                    if (strB != null) {
                        aVar.A(strB);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    for (int i12 = 0; i12 < aVarC2.v(); i12++) {
                        com.google.android.gms.internal.measurement.R1 r1B = aVarC2.B(i12);
                        String strA = v7.G.a(r1B.P());
                        if (strA != null) {
                            aVar.w(i12, (com.google.android.gms.internal.measurement.R1) ((com.google.android.gms.internal.measurement.F4) r1B.C().v(strA).x()));
                            z11 = true;
                        }
                    }
                    if (z11) {
                        P1.a aVarW = aVarC.w(i11, aVar);
                        list.set(i10, (com.google.android.gms.internal.measurement.P1) ((com.google.android.gms.internal.measurement.F4) aVarW.x()));
                        aVarC = aVarW;
                    }
                }
            }
            if (aVarC.C() != 0) {
                for (int i13 = 0; i13 < aVarC.C(); i13++) {
                    com.google.android.gms.internal.measurement.T1 t1D = aVarC.D(i13);
                    String strA2 = v7.J.a(t1D.O());
                    if (strA2 != null) {
                        aVarC = aVarC.A(i13, t1D.C().v(strA2));
                        list.set(i10, (com.google.android.gms.internal.measurement.P1) ((com.google.android.gms.internal.measurement.F4) aVarC.x()));
                    }
                }
            }
        }
        v();
        n();
        C3445p.e(str);
        C3445p.k(list);
        SQLiteDatabase sQLiteDatabaseC = C();
        sQLiteDatabaseC.beginTransaction();
        try {
            v();
            n();
            C3445p.e(str);
            SQLiteDatabase sQLiteDatabaseC2 = C();
            sQLiteDatabaseC2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseC2.delete("event_filters", "app_id=?", new String[]{str});
            for (com.google.android.gms.internal.measurement.P1 p12 : list) {
                v();
                n();
                C3445p.e(str);
                C3445p.k(p12);
                if (p12.T()) {
                    int iN = p12.n();
                    Iterator<com.google.android.gms.internal.measurement.Q1> it = p12.R().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().X()) {
                                k().M().c("Event filter with no ID. Audience definition ignored. appId, audienceId", C2759h2.w(str), Integer.valueOf(iN));
                                break;
                            }
                        } else {
                            Iterator<com.google.android.gms.internal.measurement.T1> it2 = p12.S().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().S()) {
                                        k().M().c("Property filter with no ID. Audience definition ignored. appId, audienceId", C2759h2.w(str), Integer.valueOf(iN));
                                        break;
                                    }
                                } else {
                                    Iterator<com.google.android.gms.internal.measurement.Q1> it3 = p12.R().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!o0(str, iN, it3.next())) {
                                                z10 = false;
                                                break;
                                            }
                                        } else {
                                            z10 = true;
                                            break;
                                        }
                                    }
                                    if (z10) {
                                        Iterator<com.google.android.gms.internal.measurement.T1> it4 = p12.S().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!p0(str, iN, it4.next())) {
                                                    z10 = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z10) {
                                        v();
                                        n();
                                        C3445p.e(str);
                                        SQLiteDatabase sQLiteDatabaseC3 = C();
                                        sQLiteDatabaseC3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iN)});
                                        sQLiteDatabaseC3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iN)});
                                    }
                                }
                            }
                        }
                    }
                } else {
                    k().M().b("Audience with no ID. appId", C2759h2.w(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.measurement.P1 p13 : list) {
                arrayList.add(p13.T() ? Integer.valueOf(p13.n()) : null);
            }
            Q0(str, arrayList);
            sQLiteDatabaseC.setTransactionSuccessful();
            sQLiteDatabaseC.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabaseC.endTransaction();
            throw th;
        }
    }

    final void i0(List<Long> list) throws SQLException {
        n();
        v();
        C3445p.k(list);
        C3445p.m(list.size());
        if (v0()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (J0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                k().M().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                C().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                k().H().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final List<R5> i1(String str) {
        C3445p.e(str);
        n();
        v();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = C().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursorQuery.getLong(2);
                    Object objR = R(cursorQuery, 3);
                    if (objR == null) {
                        k().H().b("Read invalid user property value, ignoring it. appId", C2759h2.w(str));
                    } else {
                        arrayList.add(new R5(str, str2, string, j10, objR));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e10) {
                k().H().c("Error querying user properties. appId", C2759h2.w(str), e10);
                List<R5> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    final Map<Integer, C2625y2> j1(String str) {
        v();
        n();
        C3445p.e(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = C().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, C2625y2> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                C4391a c4391a = new C4391a();
                do {
                    int i10 = cursorQuery.getInt(0);
                    try {
                        c4391a.put(Integer.valueOf(i10), (C2625y2) ((com.google.android.gms.internal.measurement.F4) ((C2625y2.a) N5.H(C2625y2.V(), cursorQuery.getBlob(1))).x()));
                    } catch (IOException e10) {
                        k().H().d("Failed to merge filter results. appId, audienceId, error", C2759h2.w(str), Integer.valueOf(i10), e10);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c4391a;
            } catch (SQLiteException e11) {
                k().H().c("Database error querying filter results. appId", C2759h2.w(str), e11);
                Map<Integer, C2625y2> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean k0(C2609w2 c2609w2, boolean z10) {
        n();
        v();
        C3445p.k(c2609w2);
        C3445p.e(c2609w2.c0());
        C3445p.n(c2609w2.V0());
        s1();
        long jA = b().a();
        if (c2609w2.r2() < jA - C2763i.S() || c2609w2.r2() > C2763i.S() + jA) {
            k().M().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C2759h2.w(c2609w2.c0()), Long.valueOf(jA), Long.valueOf(c2609w2.r2()));
        }
        try {
            byte[] bArrI0 = p().i0(c2609w2.m());
            k().L().b("Saving bundle, size", Integer.valueOf(bArrI0.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c2609w2.c0());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c2609w2.r2()));
            contentValues.put("data", bArrI0);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (c2609w2.c1()) {
                contentValues.put("retry_count", Integer.valueOf(c2609w2.M1()));
            }
            try {
                if (C().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                k().H().b("Failed to insert bundle (got -1). appId", C2759h2.w(c2609w2.c0()));
                return false;
            } catch (SQLiteException e10) {
                k().H().c("Error storing bundle. appId", C2759h2.w(c2609w2.c0()), e10);
                return false;
            }
        } catch (IOException e11) {
            k().H().c("Data loss. Failed to serialize bundle. appId", C2759h2.w(c2609w2.c0()), e11);
            return false;
        }
    }

    final Map<Integer, List<com.google.android.gms.internal.measurement.Q1>> k1(String str) {
        C3445p.e(str);
        C4391a c4391a = new C4391a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = C().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<com.google.android.gms.internal.measurement.Q1>> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.Q1 q12 = (com.google.android.gms.internal.measurement.Q1) ((com.google.android.gms.internal.measurement.F4) ((Q1.a) N5.H(com.google.android.gms.internal.measurement.Q1.O(), cursorQuery.getBlob(1))).x());
                        if (q12.W()) {
                            int i10 = cursorQuery.getInt(0);
                            List arrayList = (List) c4391a.get(Integer.valueOf(i10));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                c4391a.put(Integer.valueOf(i10), arrayList);
                            }
                            arrayList.add(q12);
                        }
                    } catch (IOException e10) {
                        k().H().c("Failed to merge filter. appId", C2759h2.w(str), e10);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c4391a;
            } catch (SQLiteException e11) {
                k().H().c("Database error querying filters. appId", C2759h2.w(str), e11);
                Map<Integer, List<com.google.android.gms.internal.measurement.Q1>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean l0(C2749g c2749g) {
        C3445p.k(c2749g);
        n();
        v();
        String str = c2749g.f35351B;
        C3445p.k(str);
        if (X0(str, c2749g.f35353D.f35129C) == null && J0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c2749g.f35352C);
        contentValues.put("name", c2749g.f35353D.f35129C);
        Y(contentValues, "value", C3445p.k(c2749g.f35353D.f0()));
        contentValues.put("active", Boolean.valueOf(c2749g.f35355F));
        contentValues.put("trigger_event_name", c2749g.f35356G);
        contentValues.put("trigger_timeout", Long.valueOf(c2749g.f35358I));
        j();
        contentValues.put("timed_out_event", Q5.r0(c2749g.f35357H));
        contentValues.put("creation_timestamp", Long.valueOf(c2749g.f35354E));
        j();
        contentValues.put("triggered_event", Q5.r0(c2749g.f35359J));
        contentValues.put("triggered_timestamp", Long.valueOf(c2749g.f35353D.f35130D));
        contentValues.put("time_to_live", Long.valueOf(c2749g.f35360K));
        j();
        contentValues.put("expired_event", Q5.r0(c2749g.f35361L));
        try {
            if (C().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            k().H().b("Failed to insert/update conditional user property (got -1)", C2759h2.w(str));
            return true;
        } catch (SQLiteException e10) {
            k().H().c("Error storing conditional user property", C2759h2.w(str), e10);
            return true;
        }
    }

    final Map<Integer, List<Integer>> l1(String str) {
        v();
        n();
        C3445p.e(str);
        C4391a c4391a = new C4391a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = C().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!cursorRawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> mapEmptyMap = Collections.emptyMap();
                    cursorRawQuery.close();
                    return mapEmptyMap;
                }
                do {
                    int i10 = cursorRawQuery.getInt(0);
                    List arrayList = (List) c4391a.get(Integer.valueOf(i10));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        c4391a.put(Integer.valueOf(i10), arrayList);
                    }
                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                } while (cursorRawQuery.moveToNext());
                cursorRawQuery.close();
                return c4391a;
            } catch (SQLiteException e10) {
                k().H().c("Database error querying scoped filters. appId", C2759h2.w(str), e10);
                Map<Integer, List<Integer>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean m0(D d10, long j10, boolean z10) {
        n();
        v();
        C3445p.k(d10);
        C3445p.e(d10.f34783a);
        byte[] bArrM = p().F(d10).m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", d10.f34783a);
        contentValues.put("name", d10.f34784b);
        contentValues.put("timestamp", Long.valueOf(d10.f34786d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j10));
        contentValues.put("data", bArrM);
        contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
        try {
            if (C().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            k().H().b("Failed to insert raw event (got -1). appId", C2759h2.w(d10.f34783a));
            return false;
        } catch (SQLiteException e10) {
            k().H().c("Error storing raw event. appId", C2759h2.w(d10.f34783a), e10);
            return false;
        }
    }

    public final void m1(String str) {
        G gU0;
        h1("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = C().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string != null && (gU0 = U0(str, string)) != null) {
                        d0("events_snapshot", gU0);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            } catch (SQLiteException e10) {
                k().H().c("Error creating snapshot. appId", C2759h2.w(str), e10);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final boolean n0(R5 r52) {
        C3445p.k(r52);
        n();
        v();
        if (X0(r52.f35159a, r52.f35161c) == null) {
            if (Q5.J0(r52.f35161c)) {
                if (J0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{r52.f35159a}) >= c().r(r52.f35159a, K.f34941R, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(r52.f35161c) && J0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{r52.f35159a, r52.f35160b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", r52.f35159a);
        contentValues.put("origin", r52.f35160b);
        contentValues.put("name", r52.f35161c);
        contentValues.put("set_timestamp", Long.valueOf(r52.f35162d));
        Y(contentValues, "value", r52.f35163e);
        try {
            if (C().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            k().H().b("Failed to insert/update user property (got -1). appId", C2759h2.w(r52.f35159a));
            return true;
        } catch (SQLiteException e10) {
            k().H().c("Error storing user property. appId", C2759h2.w(r52.f35159a), e10);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n1(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2812p.n1(java.lang.String):void");
    }

    public final void o1() {
        v();
        C().beginTransaction();
    }

    public final boolean p1(String str) {
        if (!c().u(K.f34924I0)) {
            return false;
        }
        if (!c().u(K.f34928K0)) {
            String strG0 = G0();
            StringBuilder sb2 = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ");
            sb2.append(strG0);
            return J0(sb2.toString(), new String[]{str}) != 0;
        }
        v7.X[] xArr = {v7.X.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        for (int i10 = 0; i10 <= 0; i10++) {
            arrayList.add(Integer.valueOf(xArr[0].a()));
        }
        String strM0 = M0(arrayList);
        String strG02 = G0();
        StringBuilder sb3 = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb3.append(strM0);
        sb3.append(" AND NOT ");
        sb3.append(strG02);
        return J0(sb3.toString(), new String[]{str}) != 0;
    }

    final boolean q0(String str, long j10) {
        if (!c().u(K.f34961a1) && b().a() > 15000 + j10) {
            return false;
        }
        try {
            if (J("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0) {
                return false;
            }
            return J("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0;
        } catch (SQLiteException e10) {
            k().H().b("Error checking backfill conditions", e10);
            return false;
        }
    }

    final boolean r0(String str, Bundle bundle) {
        n();
        v();
        byte[] bArrM = p().F(new D(this.f35457a, "", str, "dep", 0L, 0L, bundle)).m();
        k().L().c("Saving default event parameters, appId, data size", g().c(str), Integer.valueOf(bArrM.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrM);
        try {
            if (C().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            k().H().b("Failed to insert default event parameters (got -1). appId", C2759h2.w(str));
            return false;
        } catch (SQLiteException e10) {
            k().H().c("Error storing default event parameters. appId", C2759h2.w(str), e10);
            return false;
        }
    }

    public final void r1() {
        v();
        C().endTransaction();
    }

    public final boolean s0(String str, C2797m5 c2797m5) {
        n();
        v();
        C3445p.k(c2797m5);
        C3445p.e(str);
        long jA = b().a();
        long j10 = c2797m5.f35469C;
        Y1<Long> y12 = K.f34998q0;
        if (j10 < jA - y12.a(null).longValue() || c2797m5.f35469C > y12.a(null).longValue() + jA) {
            k().M().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C2759h2.w(str), Long.valueOf(jA), Long.valueOf(c2797m5.f35469C));
        }
        k().L().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", c2797m5.f35468B);
        contentValues.put("source", Integer.valueOf(c2797m5.f35470D));
        contentValues.put("timestamp_millis", Long.valueOf(c2797m5.f35469C));
        try {
            if (C().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            k().H().b("Failed to insert trigger URI (got -1). appId", C2759h2.w(str));
            return false;
        } catch (SQLiteException e10) {
            k().H().c("Error storing trigger URI. appId", C2759h2.w(str), e10);
            return false;
        }
    }

    final void s1() {
        int iDelete;
        n();
        v();
        if (v0()) {
            long jA = t().f35228e.a();
            long jC = b().c();
            if (Math.abs(jC - jA) > C2763i.T()) {
                t().f35228e.b(jC);
                n();
                v();
                if (!v0() || (iDelete = C().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(b().a()), String.valueOf(C2763i.S())})) <= 0) {
                    return;
                }
                k().L().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    public final boolean t0(String str, Long l10, long j10, C2569r2 c2569r2) {
        n();
        v();
        C3445p.k(c2569r2);
        C3445p.e(str);
        C3445p.k(l10);
        byte[] bArrM = c2569r2.m();
        k().L().c("Saving complex main event, appId, data size", g().c(str), Integer.valueOf(bArrM.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrM);
        try {
            if (C().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            k().H().b("Failed to insert complex main event (got -1). appId", C2759h2.w(str));
            return false;
        } catch (SQLiteException e10) {
            k().H().c("Error storing complex main event. appId", C2759h2.w(str), e10);
            return false;
        }
    }

    public final void t1() {
        v();
        C().setTransactionSuccessful();
    }

    public final boolean u0() {
        return J0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final boolean u1() {
        return J0("select count(1) > 0 from raw_events", null) != 0;
    }

    protected final boolean v0() {
        return a().getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean v1() {
        return J0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2873x5
    protected final boolean y() {
        return false;
    }

    public final long z() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = C().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                k().H().b("Error querying raw events", e10);
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
}
