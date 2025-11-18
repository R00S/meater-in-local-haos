package cm.aptoide.p092pt.preferences;

import android.content.SharedPreferences;
import p456rx.AbstractC11245j;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p474t.C11429e;

/* loaded from: classes.dex */
public class Preferences {
    private final SharedPreferences preferences;

    /* renamed from: cm.aptoide.pt.preferences.Preferences$1 */
    class C37711 implements C11234e.a<Void> {
        final /* synthetic */ String val$key;

        C37711(String str) {
            this.val$key = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$call$0, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m8400a(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
            Preferences.this.preferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }

        @Override // p456rx.p460m.InterfaceC11253b
        public void call(final AbstractC11245j<? super Void> abstractC11245j) {
            final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: cm.aptoide.pt.preferences.Preferences.1.1
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    if (abstractC11245j.isUnsubscribed() || !str.equals(C37711.this.val$key)) {
                        return;
                    }
                    abstractC11245j.onNext(null);
                }
            };
            abstractC11245j.add(C11429e.m40674a(new InterfaceC11252a() { // from class: cm.aptoide.pt.preferences.d
                @Override // p456rx.p460m.InterfaceC11252a
                public final void call() {
                    this.f10547f.m8400a(onSharedPreferenceChangeListener);
                }
            }));
            Preferences.this.preferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    public Preferences(SharedPreferences sharedPreferences) {
        this.preferences = sharedPreferences;
    }

    private C11234e<Void> change(String str) {
        return C11234e.m40048l(new C37711(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getBoolean$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8393a(String str, boolean z, Void r3) {
        return Boolean.valueOf(this.preferences.getBoolean(str, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getInt$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Integer m8394b(String str, int i2, Void r3) {
        return Integer.valueOf(this.preferences.getInt(str, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getString$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ String m8395c(String str, String str2, Void r3) {
        return this.preferences.getString(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$remove$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8396d(String str) {
        this.preferences.edit().remove(str).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8397e(String str, boolean z) {
        this.preferences.edit().putBoolean(str, z).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8398f(String str, String str2) {
        this.preferences.edit().putString(str, str2).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8399g(String str, int i2) {
        this.preferences.edit().putInt(str, i2).commit();
    }

    public Single<Boolean> contains(String str) {
        return Single.m39913m(Boolean.valueOf(this.preferences.contains(str)));
    }

    public C11234e<Boolean> getBoolean(final String str, final boolean z) {
        return change(str).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.preferences.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10552f.m8393a(str, z, (Void) obj);
            }
        }).m40054C0(Boolean.valueOf(this.preferences.getBoolean(str, z)));
    }

    public C11234e<Integer> getInt(final String str, final int i2) {
        return change(str).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.preferences.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10563f.m8394b(str, i2, (Void) obj);
            }
        }).m40054C0(Integer.valueOf(this.preferences.getInt(str, i2)));
    }

    public C11234e<String> getString(final String str, final String str2) {
        return change(str).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.preferences.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10566f.m8395c(str, str2, (Void) obj);
            }
        }).m40054C0(this.preferences.getString(str, str2));
    }

    public C11231b remove(final String str) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.preferences.i
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f10561f.m8396d(str);
            }
        });
    }

    public C11231b save(final String str, final boolean z) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.preferences.e
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f10549f.m8397e(str, z);
            }
        });
    }

    public C11231b save(final String str, final String str2) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.preferences.g
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f10555f.m8398f(str, str2);
            }
        });
    }

    public C11231b save(final String str, final int i2) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.preferences.h
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f10558f.m8399g(str, i2);
            }
        });
    }
}
