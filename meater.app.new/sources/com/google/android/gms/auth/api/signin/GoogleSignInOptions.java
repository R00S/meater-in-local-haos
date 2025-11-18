package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: f */
    @VisibleForTesting
    public static final Scope f17040f = new Scope("profile");

    /* renamed from: g */
    @VisibleForTesting
    public static final Scope f17041g = new Scope("email");

    /* renamed from: h */
    @VisibleForTesting
    public static final Scope f17042h = new Scope("openid");

    /* renamed from: i */
    @VisibleForTesting
    public static final Scope f17043i;

    /* renamed from: j */
    @VisibleForTesting
    public static final Scope f17044j;

    /* renamed from: k */
    public static final GoogleSignInOptions f17045k;

    /* renamed from: l */
    public static final GoogleSignInOptions f17046l;

    /* renamed from: m */
    private static Comparator<Scope> f17047m;

    /* renamed from: n */
    @SafeParcelable.VersionField
    private final int f17048n;

    /* renamed from: o */
    @SafeParcelable.Field
    private final ArrayList<Scope> f17049o;

    /* renamed from: p */
    @SafeParcelable.Field
    private Account f17050p;

    /* renamed from: q */
    @SafeParcelable.Field
    private boolean f17051q;

    /* renamed from: r */
    @SafeParcelable.Field
    private final boolean f17052r;

    /* renamed from: s */
    @SafeParcelable.Field
    private final boolean f17053s;

    /* renamed from: t */
    @SafeParcelable.Field
    private String f17054t;

    /* renamed from: u */
    @SafeParcelable.Field
    private String f17055u;

    /* renamed from: v */
    @SafeParcelable.Field
    private ArrayList<GoogleSignInOptionsExtensionParcelable> f17056v;

    /* renamed from: w */
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> f17057w;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f17043i = scope;
        f17044j = new Scope("https://www.googleapis.com/auth/games");
        f17045k = new Builder().m13687c().m13688d().m13685a();
        f17046l = new Builder().m13689e(scope, new Scope[0]).m13685a();
        CREATOR = new zad();
        f17047m = new C6316b();
    }

    @SafeParcelable.Constructor
    GoogleSignInOptions(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) ArrayList<Scope> arrayList, @SafeParcelable.Param(id = 3) Account account, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) boolean z3, @SafeParcelable.Param(id = 7) String str, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i2, arrayList, account, z, z2, z3, str, str2, m13665J0(arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m13665J0(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap map = new HashMap();
        if (list == null) {
            return map;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.m13696y()), googleSignInOptionsExtensionParcelable);
        }
        return map;
    }

    /* renamed from: M0 */
    public static GoogleSignInOptions m13666M0(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String strOptString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(3, (ArrayList<Scope>) new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap());
    }

    /* renamed from: r1 */
    private final JSONObject m13671r1() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f17049o, f17047m);
            ArrayList<Scope> arrayList = this.f17049o;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Scope scope = arrayList.get(i2);
                i2++;
                jSONArray.put(scope.m13912y());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f17050p;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f17051q);
            jSONObject.put("forceCodeForRefreshToken", this.f17053s);
            jSONObject.put("serverAuthRequested", this.f17052r);
            if (!TextUtils.isEmpty(this.f17054t)) {
                jSONObject.put("serverClientId", this.f17054t);
            }
            if (!TextUtils.isEmpty(this.f17055u)) {
                jSONObject.put("hostedDomain", this.f17055u);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    @KeepForSdk
    /* renamed from: W */
    public String m13677W() {
        return this.f17054t;
    }

    @KeepForSdk
    /* renamed from: Y */
    public boolean m13678Y() {
        return this.f17053s;
    }

    @KeepForSdk
    /* renamed from: e0 */
    public boolean m13679e0() {
        return this.f17051q;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051 A[Catch: ClassCastException -> 0x0082, TryCatch #0 {ClassCastException -> 0x0082, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0017, B:12:0x0027, B:15:0x0034, B:17:0x0038, B:22:0x0049, B:24:0x0051, B:29:0x0068, B:31:0x0070, B:33:0x0078, B:27:0x005c, B:20:0x003f), top: B:39:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[Catch: ClassCastException -> 0x0082, TryCatch #0 {ClassCastException -> 0x0082, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0017, B:12:0x0027, B:15:0x0034, B:17:0x0038, B:22:0x0049, B:24:0x0051, B:29:0x0068, B:31:0x0070, B:33:0x0078, B:27:0x005c, B:20:0x003f), top: B:39:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L82
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f17056v     // Catch: java.lang.ClassCastException -> L82
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L82
            if (r1 > 0) goto L82
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f17056v     // Catch: java.lang.ClassCastException -> L82
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L82
            if (r1 <= 0) goto L17
            goto L82
        L17:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f17049o     // Catch: java.lang.ClassCastException -> L82
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L82
            java.util.ArrayList r2 = r4.m13683z()     // Catch: java.lang.ClassCastException -> L82
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L82
            if (r1 != r2) goto L82
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f17049o     // Catch: java.lang.ClassCastException -> L82
            java.util.ArrayList r2 = r4.m13683z()     // Catch: java.lang.ClassCastException -> L82
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L82
            if (r1 != 0) goto L34
            goto L82
        L34:
            android.accounts.Account r1 = r3.f17050p     // Catch: java.lang.ClassCastException -> L82
            if (r1 != 0) goto L3f
            android.accounts.Account r1 = r4.getAccount()     // Catch: java.lang.ClassCastException -> L82
            if (r1 != 0) goto L82
            goto L49
        L3f:
            android.accounts.Account r2 = r4.getAccount()     // Catch: java.lang.ClassCastException -> L82
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L82
            if (r1 == 0) goto L82
        L49:
            java.lang.String r1 = r3.f17054t     // Catch: java.lang.ClassCastException -> L82
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L82
            if (r1 == 0) goto L5c
            java.lang.String r1 = r4.m13677W()     // Catch: java.lang.ClassCastException -> L82
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L82
            if (r1 == 0) goto L82
            goto L68
        L5c:
            java.lang.String r1 = r3.f17054t     // Catch: java.lang.ClassCastException -> L82
            java.lang.String r2 = r4.m13677W()     // Catch: java.lang.ClassCastException -> L82
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L82
            if (r1 == 0) goto L82
        L68:
            boolean r1 = r3.f17053s     // Catch: java.lang.ClassCastException -> L82
            boolean r2 = r4.m13678Y()     // Catch: java.lang.ClassCastException -> L82
            if (r1 != r2) goto L82
            boolean r1 = r3.f17051q     // Catch: java.lang.ClassCastException -> L82
            boolean r2 = r4.m13679e0()     // Catch: java.lang.ClassCastException -> L82
            if (r1 != r2) goto L82
            boolean r1 = r3.f17052r     // Catch: java.lang.ClassCastException -> L82
            boolean r4 = r4.m13680i0()     // Catch: java.lang.ClassCastException -> L82
            if (r1 != r4) goto L82
            r4 = 1
            return r4
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    @KeepForSdk
    public Account getAccount() {
        return this.f17050p;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f17049o;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Scope scope = arrayList2.get(i2);
            i2++;
            arrayList.add(scope.m13912y());
        }
        Collections.sort(arrayList);
        return new HashAccumulator().m13697a(arrayList).m13697a(this.f17050p).m13697a(this.f17054t).m13699c(this.f17053s).m13699c(this.f17051q).m13699c(this.f17052r).m13698b();
    }

    @KeepForSdk
    /* renamed from: i0 */
    public boolean m13680i0() {
        return this.f17052r;
    }

    /* renamed from: t1 */
    public final String m13681t1() {
        return m13671r1().toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17048n);
        SafeParcelWriter.m14490y(parcel, 2, m13683z(), false);
        SafeParcelWriter.m14484s(parcel, 3, getAccount(), i2, false);
        SafeParcelWriter.m14468c(parcel, 4, m13679e0());
        SafeParcelWriter.m14468c(parcel, 5, m13680i0());
        SafeParcelWriter.m14468c(parcel, 6, m13678Y());
        SafeParcelWriter.m14486u(parcel, 7, m13677W(), false);
        SafeParcelWriter.m14486u(parcel, 8, this.f17055u, false);
        SafeParcelWriter.m14490y(parcel, 9, m13682y(), false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @KeepForSdk
    /* renamed from: y */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> m13682y() {
        return this.f17056v;
    }

    @KeepForSdk
    /* renamed from: z */
    public ArrayList<Scope> m13683z() {
        return new ArrayList<>(this.f17049o);
    }

    public static final class Builder {

        /* renamed from: a */
        private Set<Scope> f17058a;

        /* renamed from: b */
        private boolean f17059b;

        /* renamed from: c */
        private boolean f17060c;

        /* renamed from: d */
        private boolean f17061d;

        /* renamed from: e */
        private String f17062e;

        /* renamed from: f */
        private Account f17063f;

        /* renamed from: g */
        private String f17064g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f17065h;

        public Builder() {
            this.f17058a = new HashSet();
            this.f17065h = new HashMap();
        }

        /* renamed from: h */
        private final String m13684h(String str) {
            Preconditions.m14368g(str);
            String str2 = this.f17062e;
            Preconditions.m14363b(str2 == null || str2.equals(str), "two different server client ids provided");
            return str;
        }

        /* renamed from: a */
        public final GoogleSignInOptions m13685a() {
            if (this.f17058a.contains(GoogleSignInOptions.f17044j)) {
                Set<Scope> set = this.f17058a;
                Scope scope = GoogleSignInOptions.f17043i;
                if (set.contains(scope)) {
                    this.f17058a.remove(scope);
                }
            }
            if (this.f17061d && (this.f17063f == null || !this.f17058a.isEmpty())) {
                m13687c();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f17058a), this.f17063f, this.f17061d, this.f17059b, this.f17060c, this.f17062e, this.f17064g, this.f17065h, null);
        }

        /* renamed from: b */
        public final Builder m13686b() {
            this.f17058a.add(GoogleSignInOptions.f17041g);
            return this;
        }

        /* renamed from: c */
        public final Builder m13687c() {
            this.f17058a.add(GoogleSignInOptions.f17042h);
            return this;
        }

        /* renamed from: d */
        public final Builder m13688d() {
            this.f17058a.add(GoogleSignInOptions.f17040f);
            return this;
        }

        /* renamed from: e */
        public final Builder m13689e(Scope scope, Scope... scopeArr) {
            this.f17058a.add(scope);
            this.f17058a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: f */
        public final Builder m13690f(String str) {
            return m13691g(str, false);
        }

        /* renamed from: g */
        public final Builder m13691g(String str, boolean z) {
            this.f17059b = true;
            this.f17062e = m13684h(str);
            this.f17060c = z;
            return this;
        }

        public Builder(GoogleSignInOptions googleSignInOptions) {
            this.f17058a = new HashSet();
            this.f17065h = new HashMap();
            Preconditions.m14372k(googleSignInOptions);
            this.f17058a = new HashSet(googleSignInOptions.f17049o);
            this.f17059b = googleSignInOptions.f17052r;
            this.f17060c = googleSignInOptions.f17053s;
            this.f17061d = googleSignInOptions.f17051q;
            this.f17062e = googleSignInOptions.f17054t;
            this.f17063f = googleSignInOptions.f17050p;
            this.f17064g = googleSignInOptions.f17055u;
            this.f17065h = GoogleSignInOptions.m13665J0(googleSignInOptions.f17056v);
        }
    }

    private GoogleSignInOptions(int i2, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.f17048n = i2;
        this.f17049o = arrayList;
        this.f17050p = account;
        this.f17051q = z;
        this.f17052r = z2;
        this.f17053s = z3;
        this.f17054t = str;
        this.f17055u = str2;
        this.f17056v = new ArrayList<>(map.values());
        this.f17057w = map;
    }

    /* synthetic */ GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, C6316b c6316b) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) map);
    }
}
