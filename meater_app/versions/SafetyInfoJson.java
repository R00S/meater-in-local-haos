package com.apptionlabs.meater_app.versions;

import kotlin.Metadata;

/* compiled from: SafetyInfoJson.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/apptionlabs/meater_app/versions/SafetyInfoJson;", "", "()V", "version_latest", "", "getVersion_latest", "()I", "setVersion_latest", "(I)V", "version_seen", "getVersion_seen", "setVersion_seen", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final class SafetyInfoJson {
    private int version_seen = com.apptionlabs.meater_app.app.a.u().Q();
    private int version_latest = -1;

    public final int getVersion_latest() {
        return this.version_latest;
    }

    public final int getVersion_seen() {
        return this.version_seen;
    }

    public final void setVersion_latest(int i10) {
        this.version_latest = i10;
    }

    public final void setVersion_seen(int i10) {
        this.version_seen = i10;
    }
}
