package cm.aptoide.p092pt.view.p107rx;

import androidx.preference.Preference;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* loaded from: classes.dex */
class PreferenceClickOnSubscribe implements C11234e.a<Preference> {
    private final Preference preference;

    public PreferenceClickOnSubscribe(Preference preference) {
        this.preference = preference;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(final AbstractC11245j<? super Preference> abstractC11245j) {
        AbstractC11247a.verifyMainThread();
        Preference.InterfaceC0544d interfaceC0544d = new Preference.InterfaceC0544d() { // from class: cm.aptoide.pt.view.rx.PreferenceClickOnSubscribe.1
            @Override // androidx.preference.Preference.InterfaceC0544d
            public boolean onPreferenceClick(Preference preference) {
                if (!abstractC11245j.isUnsubscribed()) {
                    abstractC11245j.onNext(preference);
                }
                return true;
            }
        };
        abstractC11245j.add(new AbstractC11247a() { // from class: cm.aptoide.pt.view.rx.PreferenceClickOnSubscribe.2
            @Override // p456rx.p457l.AbstractC11247a
            protected void onUnsubscribe() {
                PreferenceClickOnSubscribe.this.preference.m4006N0(null);
            }
        });
        this.preference.m4006N0(interfaceC0544d);
    }
}
