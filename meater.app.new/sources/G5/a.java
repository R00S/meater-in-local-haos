package G5;

import F4.h;
import O4.e;
import P5.C1611t;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import b5.C2248v;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.CredentialsEncryption;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.model.cloudpolling.CookInfoUploadPolling;
import com.apptionlabs.meater_app.model.cloudpolling.UserConfigPolling;
import com.apptionlabs.meater_app.versions.VersionManager;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import oa.InterfaceC4164i;
import x4.f;

/* compiled from: Preferences.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f4894a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC4164i<C2248v> f4895b = jd.b.d(C2248v.class);

    /* renamed from: c, reason: collision with root package name */
    private final String f4896c;

    /* compiled from: Preferences.java */
    /* renamed from: G5.a$a, reason: collision with other inner class name */
    class C0093a extends P9.a<HashMap<Integer, HashMap<Integer, ArrayList<String>>>> {
        C0093a(a aVar) {
        }
    }

    /* compiled from: Preferences.java */
    class b extends P9.a<HashMap<Integer, HashMap<Integer, ArrayList<String>>>> {
        b(a aVar) {
        }
    }

    /* compiled from: Preferences.java */
    class c extends P9.a<HashMap<Integer, HashMap<Integer, ArrayList<String>>>> {
        c(a aVar) {
        }
    }

    public a(Context context) {
        this.f4894a = context.getSharedPreferences(context.getPackageName() + ".settings.pref", 0);
        this.f4896c = Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    private void Z() {
        if (f.f52783a.i()) {
            return;
        }
        l0();
        h hVar = h.f4556a;
        hVar.a();
        hVar.c();
    }

    private void k0() {
        d0();
        g0();
        e0();
        f0();
        UserConfigPolling.INSTANCE.addUpdateOrRemove();
    }

    private void l0() {
        d0();
        g0();
        e0();
        f0();
        m0();
        UserConfigPolling.INSTANCE.addUpdateOrRemove();
    }

    private void m0() {
        this.f4894a.edit().remove(d.QSG_VIDEO_TUTORIAL_SHOWN.f4954B).apply();
    }

    public G5.c A() {
        return G5.c.s(this.f4894a.getString(d.READY_TO_REST.f4954B, null), G5.c.f4972S);
    }

    public void A0(int i10) {
        this.f4894a.edit().putInt(d.CRITICAL_ALERT_VOLUME.f4954B, i10).apply();
    }

    public G5.c B() {
        return G5.c.s(this.f4894a.getString(d.READY.f4954B, null), G5.c.f4971R);
    }

    public void B0(String str) {
        this.f4894a.edit().putString(d.CURRENT_COOK_SYNC_HASH.f4954B, str).apply();
    }

    public long C() {
        return this.f4894a.getLong(d.RECIPE_SCREEN_TIME.f4954B, -1L);
    }

    public void C0(String str) {
        this.f4894a.edit().putString(d.CURRENT_NOTE_SYNC_HASH.f4954B, str).apply();
    }

    public Boolean D() {
        return Boolean.valueOf(this.f4894a.getBoolean(d.RECIPE_SKIP_BLOCKING_STEPS.f4954B, true));
    }

    public void D0(boolean z10) {
        this.f4894a.edit().putBoolean("default_cook", z10).apply();
    }

    public int E() {
        return this.f4894a.getInt(d.SAFETY_INFO_LATEST_VERSION.f4954B, -1);
    }

    public void E0(boolean z10) {
        this.f4894a.edit().putBoolean("showFullscreenAlerts", z10).apply();
    }

    public int F() {
        return this.f4894a.getInt(d.SAFETY_INFO_SEEN_VERSION.f4954B, 0);
    }

    public void F0(int i10) {
        this.f4894a.edit().putInt(d.DISPLAY_MODE.f4954B, i10).apply();
    }

    public HashMap<Integer, ArrayList<String>> G(int i10) {
        HashMap map = (HashMap) new Gson().l(this.f4894a.getString(d.ALL_RECIPE_INGREDIENT_MAP.f4954B, ""), new b(this).d());
        if (map == null) {
            map = new HashMap();
        }
        return map.containsKey(Integer.valueOf(i10)) ? (HashMap) map.get(Integer.valueOf(i10)) : new HashMap<>();
    }

    public void G0(boolean z10) {
        this.f4894a.edit().putBoolean(d.ESTIMATE_NOT_AVAILABLE_DISPLAYED.f4954B, z10).apply();
    }

    public Boolean H() {
        return Boolean.valueOf(this.f4894a.getBoolean(d.RECIPE_TOUCHLESS_NEXT_STEP.f4954B, false));
    }

    public void H0(boolean z10) {
        this.f4894a.edit().putBoolean(d.MEASUREMENT.f4954B, z10).apply();
    }

    public long I() {
        return this.f4894a.getLong(d.USER_CONFIG_INTERVAL.f4954B, 0L);
    }

    public void I0(boolean z10) {
        this.f4894a.edit().putBoolean("keep-screen-on", z10).apply();
    }

    public String J() {
        return this.f4894a.getString("user-email", "");
    }

    public void J0(boolean z10) {
        this.f4894a.edit().putBoolean("live_cooks", z10).apply();
    }

    public boolean K() {
        return this.f4894a.getBoolean(d.QSG_PERMISSION_PASSED.f4954B, false);
    }

    public void K0(boolean z10) {
        this.f4894a.edit().putBoolean("cloud-link", z10).apply();
    }

    public int L(String str) {
        int i10 = i(str);
        int i11 = i10 + 1;
        this.f4894a.edit().putInt(d.APP_VERSION_SKIPS.f4954B + str, i11).apply();
        return i11;
    }

    public void L0(boolean z10) {
        this.f4894a.edit().putBoolean("meater-link", z10).apply();
    }

    public void M() {
        if (C1611t.a(Locale.getDefault())) {
            this.f4894a.edit().putBoolean(d.MEASUREMENT.f4954B, true).apply();
            this.f4894a.edit().putBoolean(d.SCALE.f4954B, true).apply();
        } else {
            this.f4894a.edit().putBoolean(d.MEASUREMENT.f4954B, false).apply();
            this.f4894a.edit().putBoolean(d.SCALE.f4954B, false).apply();
        }
    }

    public void M0(boolean z10) {
        this.f4894a.edit().putBoolean("notification", z10).apply();
    }

    public boolean N() {
        return this.f4894a.getBoolean(d.CHARGER_INSTRUCTION.f4954B, true);
    }

    public void N0(G5.c cVar) {
        this.f4894a.edit().putString(d.OVERCOOK_TONE.f4954B, cVar.f4974B).apply();
    }

    public boolean O() {
        return this.f4894a.getBoolean(d.ESTIMATE_NOT_AVAILABLE_DISPLAYED.f4954B, false);
    }

    public void O0(String str) {
        this.f4894a.edit().putString(d.PREVIOUS_COOKS_LAST_UPDATED.f4954B, str).apply();
    }

    public boolean P() {
        return this.f4894a.getBoolean(d.SIGNED_UP_TO_NEWS_LETTER.f4954B, false);
    }

    public void P0(boolean z10) {
        this.f4894a.edit().putBoolean(d.PROBE_CLEANING.f4954B, z10).apply();
    }

    public boolean Q() {
        return this.f4894a.getBoolean(d.MEASUREMENT.f4954B, false);
    }

    public void Q0(boolean z10) {
        this.f4894a.edit().putBoolean(d.PROBE_INSTRUCTION.f4954B, z10).apply();
    }

    public boolean R() {
        return this.f4894a.getBoolean("live_cooks", true);
    }

    public void R0(boolean z10) {
        this.f4894a.edit().putBoolean(d.QUICK_START_ACCOUNT.f4954B, z10).apply();
    }

    public boolean S() {
        return this.f4894a.getBoolean("cloud-link", true);
    }

    public void S0(boolean z10) {
        this.f4894a.edit().putBoolean(d.QSG_PERMISSION_PASSED.f4954B, z10).apply();
    }

    public boolean T() {
        return this.f4894a.getBoolean("meater-link", true);
    }

    public void T0(Set<String> set) {
        this.f4894a.edit().putStringSet(d.QSG_VIDEO_TUTORIAL_SHOWN.f4954B, set).apply();
    }

    public boolean U() {
        return this.f4894a.getBoolean(d.PROBE_CLEANING.f4954B, true);
    }

    public void U0(G5.c cVar) {
        this.f4894a.edit().putString(d.READY_TO_REST.f4954B, cVar.f4974B).apply();
    }

    public boolean V() {
        return this.f4894a.getBoolean(d.PROBE_INSTRUCTION.f4954B, true);
    }

    public void V0(G5.c cVar) {
        this.f4894a.edit().putString(d.READY.f4954B, cVar.f4974B).apply();
    }

    public boolean W() {
        return this.f4894a.getBoolean(d.QUICK_START_ACCOUNT.f4954B, false);
    }

    public void W0(String str) {
        this.f4894a.edit().putString(d.RECIPE_LOCALE.f4954B, str).apply();
    }

    public boolean X() {
        return this.f4894a.getBoolean("keep-screen-on", true);
    }

    public void X0(Long l10) {
        this.f4894a.edit().putLong(d.RECIPE_SCREEN_TIME.f4954B, l10.longValue()).apply();
    }

    public boolean Y() {
        return this.f4894a.getBoolean("notification", false);
    }

    public void Y0(Boolean bool) {
        this.f4894a.edit().putBoolean(d.RECIPE_SKIP_BLOCKING_STEPS.f4954B, bool.booleanValue()).apply();
    }

    public void Z0(int i10) {
        this.f4894a.edit().putInt(d.SAFETY_INFO_LATEST_VERSION.f4954B, i10).apply();
    }

    public boolean a() {
        return this.f4894a.getBoolean(d.ADD_5MIN_ALERT.f4954B, true);
    }

    public void a0() {
        VersionManager.INSTANCE.fetchVersionsFromCloud();
        k0();
        this.f4895b.getValue().A();
        i0();
    }

    public void a1(int i10) {
        this.f4894a.edit().putInt(d.SAFETY_INFO_SEEN_VERSION.f4954B, i10).apply();
    }

    public boolean b() {
        return this.f4894a.getBoolean(d.CRITICAL_ALERTS.f4954B, false);
    }

    public void b0(int i10) {
        SharedPreferences sharedPreferences = this.f4894a;
        d dVar = d.ALL_RECIPE_INGREDIENT_MAP;
        HashMap map = (HashMap) new Gson().l(sharedPreferences.getString(dVar.f4954B, ""), new c(this).d());
        if (map == null) {
            map = new HashMap();
        }
        map.remove(Integer.valueOf(i10));
        this.f4894a.edit().putString(dVar.f4954B, new Gson().t(map)).apply();
    }

    public void b1(boolean z10) {
        this.f4894a.edit().putBoolean(d.FIRST_TIME.f4954B, z10).apply();
    }

    public void c() {
        SharedPreferences.Editor editorEdit = this.f4894a.edit();
        editorEdit.remove("username");
        editorEdit.remove("user-email");
        editorEdit.remove("meater-cloud-token");
        editorEdit.remove("user-token");
        editorEdit.remove("account_type");
        editorEdit.remove("mqqt-token");
        editorEdit.remove("access-token");
        editorEdit.apply();
        G5.b.b("meater-cloud-token_v1", "access-token_v1");
        a0();
    }

    public void c0(int i10, int i11, String str) {
        HashMap<Integer, HashMap<Integer, ArrayList<String>>> mapG = g();
        if (mapG == null) {
            mapG = new HashMap<>();
        }
        if (!mapG.containsKey(Integer.valueOf(i10))) {
            mapG.put(Integer.valueOf(i10), new HashMap<>());
        }
        HashMap<Integer, ArrayList<String>> map = mapG.get(Integer.valueOf(i10));
        if (map == null) {
            map = new HashMap<>();
        }
        if (!map.containsKey(Integer.valueOf(i11))) {
            map.put(Integer.valueOf(i11), new ArrayList<>());
        }
        ArrayList<String> arrayList = map.get(Integer.valueOf(i11));
        Objects.requireNonNull(arrayList);
        arrayList.remove(str);
        this.f4894a.edit().putString(d.ALL_RECIPE_INGREDIENT_MAP.f4954B, new Gson().t(mapG)).apply();
    }

    public void c1(boolean z10) {
        this.f4894a.edit().putBoolean(d.SIGNED_UP_TO_NEWS_LETTER.f4954B, z10).apply();
    }

    public boolean d() {
        return this.f4894a.getBoolean("showFullscreenAlerts", true);
    }

    public void d0() {
        this.f4894a.edit().remove(d.COOK_NOTE_LAST_UPDATED.f4954B).apply();
    }

    public void d1(boolean z10) {
        this.f4894a.edit().putBoolean(d.SYNC_ON_LAUNCH.f4954B, z10).apply();
    }

    public boolean e() {
        return G5.b.d("access-token_v1") != null;
    }

    public void e0() {
        this.f4894a.edit().remove(d.CURRENT_COOK_SYNC_HASH.f4954B).apply();
    }

    public void e1(Boolean bool) {
        this.f4894a.edit().putBoolean(d.RECIPE_TOUCHLESS_NEXT_STEP.f4954B, bool.booleanValue()).apply();
    }

    public G5.c f() {
        return G5.c.s(this.f4894a.getString(d.ALERT_TONE.f4954B, null), G5.c.f4969P);
    }

    public void f0() {
        this.f4894a.edit().remove(d.CURRENT_NOTE_SYNC_HASH.f4954B).apply();
    }

    public void f1(boolean z10) {
        this.f4894a.edit().putBoolean(d.RECIPE_DATA_SOURCE.f4954B, z10).apply();
    }

    public HashMap<Integer, HashMap<Integer, ArrayList<String>>> g() {
        return (HashMap) new Gson().l(this.f4894a.getString(d.ALL_RECIPE_INGREDIENT_MAP.f4954B, ""), new C0093a(this).d());
    }

    public void g0() {
        this.f4894a.edit().remove(d.PREVIOUS_COOKS_LAST_UPDATED.f4954B).apply();
    }

    public void g1(boolean z10) {
        this.f4894a.edit().putBoolean(d.SCALE.f4954B, z10).apply();
    }

    public boolean h() {
        return this.f4894a.getBoolean(d.ALLOW_PAIRING_MEATER_BLOCK_RPOBES.f4954B, false);
    }

    public void h0() {
        this.f4894a.edit().remove(d.RECIPE_LOCALE.f4954B).apply();
    }

    public void h1(long j10) {
        if (j10 < 300000) {
            j10 = 0;
        }
        this.f4894a.edit().putLong(d.USER_CONFIG_INTERVAL.f4954B, j10).apply();
        UserConfigPolling.INSTANCE.addUpdateOrRemove();
    }

    public int i(String str) {
        return this.f4894a.getInt(d.APP_VERSION_SKIPS.f4954B + str, 0);
    }

    public void i0() {
        this.f4894a.edit().remove(d.SAFETY_INFO_SEEN_VERSION.f4954B).apply();
    }

    public boolean i1() {
        return this.f4894a.getBoolean(d.FIRST_TIME.f4954B, true);
    }

    public long j() {
        SharedPreferences sharedPreferences = this.f4894a;
        String str = d.SERVER_MESSAGE_INTERVAL.f4954B;
        Config.getInstance();
        return sharedPreferences.getLong(str, 5000000L);
    }

    public void j0() {
        this.f4894a.edit().clear().commit();
    }

    public void j1(MEATERCloudAccount mEATERCloudAccount) {
        G5.b.c("meater-cloud-token_v1", mEATERCloudAccount.password);
        G5.b.c("access-token_v1", mEATERCloudAccount.accessToken);
        SharedPreferences.Editor editorEdit = this.f4894a.edit();
        editorEdit.putString("username", mEATERCloudAccount.name);
        editorEdit.putString("user-email", mEATERCloudAccount.email);
        editorEdit.remove("user-token");
        editorEdit.remove("mqqt-token");
        editorEdit.remove("account_type");
        editorEdit.remove("meater-cloud-token");
        editorEdit.remove("access-token");
        editorEdit.apply();
        Z();
    }

    public long k() {
        SharedPreferences sharedPreferences = this.f4894a;
        String str = d.SERVER_MESSAGE_STATS_INTERVAL.f4954B;
        Config.getInstance();
        return sharedPreferences.getLong(str, 30000000L);
    }

    public void k1(MEATERCloudAccount mEATERCloudAccount) {
        G5.b.c("meater-cloud-token_v1", mEATERCloudAccount.password);
        G5.b.c("access-token_v1", mEATERCloudAccount.accessToken);
        SharedPreferences.Editor editorEdit = this.f4894a.edit();
        editorEdit.putString("username", mEATERCloudAccount.name).commit();
        editorEdit.putString("user-email", mEATERCloudAccount.email).commit();
        editorEdit.remove("user-token");
        editorEdit.remove("mqqt-token");
        editorEdit.remove("account_type");
        editorEdit.remove("meater-cloud-token");
        editorEdit.remove("access-token");
        Z();
        editorEdit.apply();
        VersionManager.INSTANCE.fetchVersionsFromCloud();
    }

    public MEATERCloudAccount l() {
        MEATERCloudAccount mEATERCloudAccount = new MEATERCloudAccount();
        mEATERCloudAccount.name = this.f4894a.getString("username", null);
        mEATERCloudAccount.email = this.f4894a.getString("user-email", null);
        mEATERCloudAccount.password = this.f4894a.getString("mqqt-token", null);
        String string = this.f4894a.getString("meater-cloud-token", null);
        if (string != null) {
            mEATERCloudAccount.password = string;
            CredentialsEncryption.decryptTokenForAccount(mEATERCloudAccount);
        }
        String string2 = this.f4894a.getString("access-token", null);
        if (string2 != null) {
            mEATERCloudAccount.accessToken = CredentialsEncryption.decryptToken(string2);
        }
        if (mEATERCloudAccount.password == null) {
            mEATERCloudAccount.password = G5.b.d("meater-cloud-token_v1");
        }
        if (mEATERCloudAccount.accessToken == null) {
            mEATERCloudAccount.accessToken = G5.b.d("access-token_v1");
            mEATERCloudAccount.type = MEATERCloudAccount.AccountType.EmailAndPassword;
        }
        if (mEATERCloudAccount.name == null || mEATERCloudAccount.email == null || mEATERCloudAccount.password == null || mEATERCloudAccount.accessToken == null) {
            return null;
        }
        if (!G5.b.a("access-token_v1")) {
            j1(mEATERCloudAccount);
        }
        return mEATERCloudAccount;
    }

    public boolean l1() {
        return this.f4894a.getBoolean(d.SYNC_ON_LAUNCH.f4954B, false);
    }

    public long m() {
        return this.f4894a.getLong(d.COOK_INFO_INTERVAL.f4954B, 0L);
    }

    public boolean m1() {
        return this.f4894a.getBoolean(d.RECIPE_DATA_SOURCE.f4954B, false);
    }

    public String n() {
        return this.f4894a.getString(d.COOK_NOTE_LAST_UPDATED.f4954B, "");
    }

    public void n0(int i10) {
        this.f4894a.edit().putInt(d.QSG_CHOSE_PRODUCT.f4954B, i10).apply();
    }

    public boolean n1() {
        return this.f4894a.getBoolean(d.SCALE.f4954B, false);
    }

    public int o() {
        return this.f4894a.getInt(d.CRITICAL_ALERT_VOLUME.f4954B, 5);
    }

    public void o0(int i10) {
        this.f4894a.edit().putInt(d.QSG_PROGRESS.f4954B, i10).apply();
    }

    public String p() {
        String string = this.f4894a.getString(d.CURRENT_COOK_SYNC_HASH.f4954B, "");
        return string == null ? "" : string;
    }

    public void p0(int i10) {
        this.f4894a.edit().putInt(d.QSG_SELECTED_DEVICE.f4954B, i10).apply();
    }

    public String q() {
        String string = this.f4894a.getString(d.CURRENT_NOTE_SYNC_HASH.f4954B, "");
        return string == null ? "" : string;
    }

    public void q0(int i10, int i11, String str) {
        HashMap<Integer, HashMap<Integer, ArrayList<String>>> mapG = g();
        if (mapG == null) {
            mapG = new HashMap<>();
        }
        if (!mapG.containsKey(Integer.valueOf(i10))) {
            mapG.put(Integer.valueOf(i10), new HashMap<>());
        }
        HashMap<Integer, ArrayList<String>> map = mapG.get(Integer.valueOf(i10));
        if (map == null) {
            map = new HashMap<>();
        }
        if (!map.containsKey(Integer.valueOf(i11))) {
            map.put(Integer.valueOf(i11), new ArrayList<>());
        }
        ArrayList<String> arrayList = map.get(Integer.valueOf(i11));
        if (arrayList != null && !arrayList.contains(str)) {
            arrayList.add(str);
        }
        this.f4894a.edit().putString(d.ALL_RECIPE_INGREDIENT_MAP.f4954B, new Gson().t(mapG)).apply();
    }

    public String r() {
        return this.f4896c;
    }

    public void r0(G5.c cVar) {
        this.f4894a.edit().putString(d.ALERT_TONE.f4954B, cVar.f4974B).apply();
    }

    public int s() {
        return this.f4894a.getInt(d.DISPLAY_MODE.f4954B, e.AUTO.n());
    }

    public void s0(Boolean bool) {
        this.f4894a.edit().putBoolean(d.ALLOW_PAIRING_MEATER_BLOCK_RPOBES.f4954B, bool.booleanValue()).apply();
    }

    public SharedPreferences t() {
        return this.f4894a;
    }

    public void t0(boolean z10) {
        this.f4894a.edit().putBoolean(d.ADD_5MIN_ALERT.f4954B, z10).apply();
    }

    public G5.c u() {
        return G5.c.s(this.f4894a.getString(d.OVERCOOK_TONE.f4954B, null), G5.c.f4970Q);
    }

    public void u0(long j10) {
        if (j10 > 0) {
            this.f4894a.edit().putLong(d.SERVER_MESSAGE_INTERVAL.f4954B, j10).apply();
        }
    }

    public String v() {
        return this.f4894a.getString(d.PREVIOUS_COOKS_LAST_UPDATED.f4954B, "");
    }

    public void v0(long j10) {
        if (j10 > 0) {
            this.f4894a.edit().putLong(d.SERVER_MESSAGE_STATS_INTERVAL.f4954B, j10).apply();
        }
    }

    public int w() {
        return this.f4894a.getInt(d.QSG_CHOSE_PRODUCT.f4954B, 401);
    }

    public void w0(boolean z10) {
        this.f4894a.edit().putBoolean(d.CRITICAL_ALERTS.f4954B, z10).apply();
    }

    public int x() {
        return this.f4894a.getInt(d.QSG_PROGRESS.f4954B, 0);
    }

    public void x0(boolean z10) {
        this.f4894a.edit().putBoolean(d.CHARGER_INSTRUCTION.f4954B, z10).apply();
    }

    public int y() {
        return this.f4894a.getInt(d.QSG_SELECTED_DEVICE.f4954B, 501);
    }

    public void y0(long j10) {
        if (j10 < 300000) {
            j10 = 0;
        }
        this.f4894a.edit().putLong(d.COOK_INFO_INTERVAL.f4954B, j10).apply();
        CookInfoUploadPolling.INSTANCE.addUpdateOrRemove();
    }

    public Set<String> z() {
        return this.f4894a.getStringSet(d.QSG_VIDEO_TUTORIAL_SHOWN.f4954B, new HashSet());
    }

    public void z0(String str) {
        this.f4894a.edit().putString(d.COOK_NOTE_LAST_UPDATED.f4954B, str).apply();
    }

    /* compiled from: Preferences.java */
    private enum d {
        APP_VERSION_SKIPS,
        READY_TO_REST("readytorest"),
        READY("ready"),
        ALERT_TONE("alert-tone"),
        OVERCOOK_TONE("overcook-tone"),
        SCALE("scale"),
        FIRST_TIME("first-time"),
        ADD_5MIN_ALERT("auto-add-5-min-alert"),
        PROBE_INSTRUCTION("probe-instruction"),
        PROBE_CLEANING("probe-cleaning"),
        VIDEO_SCREEN_TIME("video_screen_time"),
        WHATS_NEW_VERSION("whats_new_version"),
        QUICK_START_ACCOUNT("visited_qsg_account"),
        DEVELOPER_SETTINGS_REMINDER("developer_settings_reminder"),
        SERVER_MESSAGE_INTERVAL,
        SERVER_MESSAGE_STATS_INTERVAL,
        NEW_OFFERS,
        AVAILABLE_OFFERS,
        URL_FOR_OFFERS,
        SIGNED_UP_TO_NEWS_LETTER,
        SUCCESSFUL_OFFER_REQUEST_TIME,
        ESTIMATE_NOT_AVAILABLE_DISPLAYED,
        PREVIOUS_COOKS_LAST_UPDATED,
        CRITICAL_ALERTS,
        SYNC_ON_LAUNCH,
        USER_CONFIG_INTERVAL,
        COOK_INFO_INTERVAL,
        CURRENT_COOK_SYNC_HASH,
        COOK_NOTE_LAST_UPDATED,
        CURRENT_NOTE_SYNC_HASH,
        DISPLAY_MODE,
        CRITICAL_ALERT_VOLUME,
        BEEF_SCREEN_TIME,
        POULTRY_SCREEN_TIME,
        PORK_SCREEN_TIME,
        LAMB_SCREEN_TIME,
        FISH_SCREEN_TIME,
        OTHER_SCREEN_TIME,
        GUEST_SCREEN_TIME,
        ALL_SCREEN_TIME,
        SAFETY_INFO_SEEN_VERSION,
        SAFETY_INFO_LATEST_VERSION,
        RECIPE_SCREEN_TIME,
        QSG_PROGRESS("qsg_screen_progress"),
        QSG_SELECTED_DEVICE("qsg_selected_device"),
        QSG_CHOSE_PRODUCT("qsg_chose_product"),
        CHARGER_INSTRUCTION("charger-instruction"),
        QSG_PERMISSION_PASSED,
        QSG_VIDEO_TUTORIAL_SHOWN("qsg_video_tutorial_shown"),
        ALL_RECIPE_INGREDIENT_MAP("all_recipe_ingredient_map"),
        RECIPE_DATA_SOURCE("recipe_data_source"),
        RECIPE_LOCALE("recipe_locale"),
        RECIPE_TOUCHLESS_NEXT_STEP("recipe_touchless_next_step"),
        RECIPE_SKIP_BLOCKING_STEPS("recipe_skip_blocking_steps"),
        MEASUREMENT("measurement"),
        ALLOW_PAIRING_MEATER_BLOCK_RPOBES("allow_pairing_meater_block_probes");


        /* renamed from: B, reason: collision with root package name */
        final String f4954B;

        d() {
            this.f4954B = name();
        }

        d(String str) {
            this.f4954B = str;
        }
    }
}
