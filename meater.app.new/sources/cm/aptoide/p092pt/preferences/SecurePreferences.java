package cm.aptoide.p092pt.preferences;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.preferences.secure.SecureCoderDecoder;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class SecurePreferences extends Preferences {
    private final SecureCoderDecoder decoder;

    public SecurePreferences(SharedPreferences sharedPreferences, SecureCoderDecoder secureCoderDecoder) {
        super(sharedPreferences);
        this.decoder = secureCoderDecoder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getString$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ String m8401h(String str) {
        return this.decoder.decrypt(str);
    }

    @Override // cm.aptoide.p092pt.preferences.Preferences
    public Single<Boolean> contains(String str) {
        return super.contains(this.decoder.encrypt(str));
    }

    @Override // cm.aptoide.p092pt.preferences.Preferences
    public C11234e<Boolean> getBoolean(String str, boolean z) {
        return getString(str, String.valueOf(z)).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.preferences.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf((String) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.preferences.Preferences
    public C11234e<Integer> getInt(String str, int i2) {
        return getString(str, String.valueOf(i2)).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.preferences.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Integer.valueOf((String) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.preferences.Preferences
    public C11234e<String> getString(String str, String str2) {
        return super.getString(this.decoder.encrypt(str), this.decoder.encrypt(str2)).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.preferences.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10570f.m8401h((String) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.preferences.Preferences
    public C11231b remove(String str) {
        return super.remove(this.decoder.encrypt(str));
    }

    @Override // cm.aptoide.p092pt.preferences.Preferences
    public C11231b save(String str, boolean z) {
        return save(str, String.valueOf(z));
    }

    @Override // cm.aptoide.p092pt.preferences.Preferences
    public C11231b save(String str, String str2) {
        return super.save(this.decoder.encrypt(str), this.decoder.encrypt(str2));
    }

    @Override // cm.aptoide.p092pt.preferences.Preferences
    public C11231b save(String str, int i2) {
        return save(str, String.valueOf(i2));
    }
}
