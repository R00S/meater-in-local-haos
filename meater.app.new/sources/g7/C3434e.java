package g7;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import s.C4392b;
import w7.C5006a;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: g7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3434e {

    /* renamed from: a, reason: collision with root package name */
    private final Account f42011a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f42012b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f42013c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f42014d;

    /* renamed from: e, reason: collision with root package name */
    private final int f42015e;

    /* renamed from: f, reason: collision with root package name */
    private final View f42016f;

    /* renamed from: g, reason: collision with root package name */
    private final String f42017g;

    /* renamed from: h, reason: collision with root package name */
    private final String f42018h;

    /* renamed from: i, reason: collision with root package name */
    private final C5006a f42019i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f42020j;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    /* renamed from: g7.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f42021a;

        /* renamed from: b, reason: collision with root package name */
        private C4392b f42022b;

        /* renamed from: c, reason: collision with root package name */
        private String f42023c;

        /* renamed from: d, reason: collision with root package name */
        private String f42024d;

        /* renamed from: e, reason: collision with root package name */
        private final C5006a f42025e = C5006a.f51965j;

        public C3434e a() {
            return new C3434e(this.f42021a, this.f42022b, null, 0, null, this.f42023c, this.f42024d, this.f42025e, false);
        }

        public a b(String str) {
            this.f42023c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f42022b == null) {
                this.f42022b = new C4392b();
            }
            this.f42022b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f42021a = account;
            return this;
        }

        public final a e(String str) {
            this.f42024d = str;
            return this;
        }
    }

    public C3434e(Account account, Set set, Map map, int i10, View view, String str, String str2, C5006a c5006a, boolean z10) {
        this.f42011a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f42012b = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f42014d = map;
        this.f42016f = view;
        this.f42015e = i10;
        this.f42017g = str;
        this.f42018h = str2;
        this.f42019i = c5006a == null ? C5006a.f51965j : c5006a;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((C3429A) it.next()).f41940a);
        }
        this.f42013c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f42011a;
    }

    public Account b() {
        Account account = this.f42011a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> c() {
        return this.f42013c;
    }

    public String d() {
        return this.f42017g;
    }

    public Set<Scope> e() {
        return this.f42012b;
    }

    public final C5006a f() {
        return this.f42019i;
    }

    public final Integer g() {
        return this.f42020j;
    }

    public final String h() {
        return this.f42018h;
    }

    public final void i(Integer num) {
        this.f42020j = num;
    }
}
