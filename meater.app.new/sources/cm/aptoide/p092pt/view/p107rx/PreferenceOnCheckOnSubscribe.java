package cm.aptoide.p092pt.view.p107rx;

import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* loaded from: classes.dex */
class PreferenceOnCheckOnSubscribe implements C11234e.a<Boolean> {
    private final CheckBoxPreference preference;

    public PreferenceOnCheckOnSubscribe(CheckBoxPreference checkBoxPreference) {
        this.preference = checkBoxPreference;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(final AbstractC11245j<? super Boolean> abstractC11245j) {
        AbstractC11247a.verifyMainThread();
        Preference.InterfaceC0544d interfaceC0544d = new Preference.InterfaceC0544d() { // from class: cm.aptoide.pt.view.rx.PreferenceOnCheckOnSubscribe.1
            @Override // androidx.preference.Preference.InterfaceC0544d
            public boolean onPreferenceClick(Preference preference) {
                if (!abstractC11245j.isUnsubscribed()) {
                    abstractC11245j.onNext(Boolean.valueOf(((CheckBoxPreference) preference).m4090Z0()));
                }
                return true;
            }
        };
        abstractC11245j.add(new AbstractC11247a() { // from class: cm.aptoide.pt.view.rx.PreferenceOnCheckOnSubscribe.2
            @Override // p456rx.p457l.AbstractC11247a
            protected void onUnsubscribe() {
                PreferenceOnCheckOnSubscribe.this.preference.m4006N0(null);
            }
        });
        this.preference.m4006N0(interfaceC0544d);
    }
}
