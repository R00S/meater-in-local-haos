package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum MEATERLinkClientSubscriptionState implements WireEnum {
    MEATER_LINK_CLIENT_SUBSCRIPTION_STATE_SUBSCRIBE(0),
    MEATER_LINK_CLIENT_SUBSCRIPTION_STATE_TIMEOUT(1);

    public static final ProtoAdapter<MEATERLinkClientSubscriptionState> ADAPTER = ProtoAdapter.newEnumAdapter(MEATERLinkClientSubscriptionState.class);
    private final int value;

    MEATERLinkClientSubscriptionState(int i10) {
        this.value = i10;
    }

    public static MEATERLinkClientSubscriptionState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return MEATER_LINK_CLIENT_SUBSCRIPTION_STATE_TIMEOUT;
        }
        return MEATER_LINK_CLIENT_SUBSCRIPTION_STATE_SUBSCRIBE;
    }

    public int getValue() {
        return this.value;
    }
}
