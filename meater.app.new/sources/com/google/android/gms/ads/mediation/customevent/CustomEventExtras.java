package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.InterfaceC6234e;
import java.util.HashMap;

@Deprecated
/* loaded from: classes2.dex */
public final class CustomEventExtras implements InterfaceC6234e {
    private final HashMap<String, Object> zzeob = new HashMap<>();

    public final Object getExtra(String str) {
        return this.zzeob.get(str);
    }

    public final void setExtra(String str, Object obj) {
        this.zzeob.put(str, obj);
    }
}
