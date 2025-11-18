package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p024c.p041e.C0868b;

@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class ClientSettings {

    /* renamed from: a */
    private final Account f17701a;

    /* renamed from: b */
    private final Set<Scope> f17702b;

    /* renamed from: c */
    private final Set<Scope> f17703c;

    /* renamed from: d */
    private final Map<Api<?>, OptionalApiSettings> f17704d;

    /* renamed from: e */
    private final int f17705e;

    /* renamed from: f */
    private final View f17706f;

    /* renamed from: g */
    private final String f17707g;

    /* renamed from: h */
    private final String f17708h;

    /* renamed from: i */
    private final SignInOptions f17709i;

    /* renamed from: j */
    private final boolean f17710j;

    /* renamed from: k */
    private Integer f17711k;

    @KeepForSdk
    public static final class Builder {

        /* renamed from: a */
        private Account f17712a;

        /* renamed from: b */
        private C0868b<Scope> f17713b;

        /* renamed from: c */
        private Map<Api<?>, OptionalApiSettings> f17714c;

        /* renamed from: e */
        private View f17716e;

        /* renamed from: f */
        private String f17717f;

        /* renamed from: g */
        private String f17718g;

        /* renamed from: i */
        private boolean f17720i;

        /* renamed from: d */
        private int f17715d = 0;

        /* renamed from: h */
        private SignInOptions f17719h = SignInOptions.f29467f;

        /* renamed from: a */
        public final Builder m14301a(Collection<Scope> collection) {
            if (this.f17713b == null) {
                this.f17713b = new C0868b<>();
            }
            this.f17713b.addAll(collection);
            return this;
        }

        @KeepForSdk
        /* renamed from: b */
        public final ClientSettings m14302b() {
            return new ClientSettings(this.f17712a, this.f17713b, this.f17714c, this.f17715d, this.f17716e, this.f17717f, this.f17718g, this.f17719h, this.f17720i);
        }

        /* renamed from: c */
        public final Builder m14303c(Account account) {
            this.f17712a = account;
            return this;
        }

        /* renamed from: d */
        public final Builder m14304d(String str) {
            this.f17718g = str;
            return this;
        }

        @KeepForSdk
        /* renamed from: e */
        public final Builder m14305e(String str) {
            this.f17717f = str;
            return this;
        }
    }

    public static final class OptionalApiSettings {

        /* renamed from: a */
        public final Set<Scope> f17721a;
    }

    public ClientSettings(Account account, Set<Scope> set, Map<Api<?>, OptionalApiSettings> map, int i2, View view, String str, String str2, SignInOptions signInOptions, boolean z) {
        this.f17701a = account;
        Set<Scope> setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f17702b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f17704d = map;
        this.f17706f = view;
        this.f17705e = i2;
        this.f17707g = str;
        this.f17708h = str2;
        this.f17709i = signInOptions;
        this.f17710j = z;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator<OptionalApiSettings> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().f17721a);
        }
        this.f17703c = Collections.unmodifiableSet(hashSet);
    }

    @KeepForSdk
    /* renamed from: a */
    public static ClientSettings m14287a(Context context) {
        return new GoogleApiClient.Builder(context).m13891f();
    }

    @KeepForSdk
    /* renamed from: b */
    public final Account m14288b() {
        return this.f17701a;
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: c */
    public final String m14289c() {
        Account account = this.f17701a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @KeepForSdk
    /* renamed from: d */
    public final Account m14290d() {
        Account account = this.f17701a;
        return account != null ? account : new Account(BaseGmsClient.DEFAULT_ACCOUNT, "com.google");
    }

    @KeepForSdk
    /* renamed from: e */
    public final Set<Scope> m14291e() {
        return this.f17703c;
    }

    @KeepForSdk
    /* renamed from: f */
    public final Set<Scope> m14292f(Api<?> api) {
        OptionalApiSettings optionalApiSettings = this.f17704d.get(api);
        if (optionalApiSettings == null || optionalApiSettings.f17721a.isEmpty()) {
            return this.f17702b;
        }
        HashSet hashSet = new HashSet(this.f17702b);
        hashSet.addAll(optionalApiSettings.f17721a);
        return hashSet;
    }

    /* renamed from: g */
    public final Integer m14293g() {
        return this.f17711k;
    }

    /* renamed from: h */
    public final Map<Api<?>, OptionalApiSettings> m14294h() {
        return this.f17704d;
    }

    /* renamed from: i */
    public final String m14295i() {
        return this.f17708h;
    }

    @KeepForSdk
    /* renamed from: j */
    public final String m14296j() {
        return this.f17707g;
    }

    @KeepForSdk
    /* renamed from: k */
    public final Set<Scope> m14297k() {
        return this.f17702b;
    }

    /* renamed from: l */
    public final SignInOptions m14298l() {
        return this.f17709i;
    }

    /* renamed from: m */
    public final boolean m14299m() {
        return this.f17710j;
    }

    /* renamed from: n */
    public final void m14300n(Integer num) {
        this.f17711k = num;
    }
}
