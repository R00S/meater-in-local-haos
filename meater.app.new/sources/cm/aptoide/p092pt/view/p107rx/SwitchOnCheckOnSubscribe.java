package cm.aptoide.p092pt.view.p107rx;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* loaded from: classes.dex */
class SwitchOnCheckOnSubscribe implements C11234e.a<Boolean> {
    private final SwitchCompat switchCompat;

    public SwitchOnCheckOnSubscribe(SwitchCompat switchCompat) {
        this.switchCompat = switchCompat;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(final AbstractC11245j<? super Boolean> abstractC11245j) {
        AbstractC11247a.verifyMainThread();
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: cm.aptoide.pt.view.rx.SwitchOnCheckOnSubscribe.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (abstractC11245j.isUnsubscribed()) {
                    return;
                }
                abstractC11245j.onNext(Boolean.valueOf(z));
            }
        };
        abstractC11245j.add(new AbstractC11247a() { // from class: cm.aptoide.pt.view.rx.SwitchOnCheckOnSubscribe.2
            @Override // p456rx.p457l.AbstractC11247a
            protected void onUnsubscribe() {
                SwitchOnCheckOnSubscribe.this.switchCompat.setOnCheckedChangeListener(null);
            }
        });
        this.switchCompat.setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
