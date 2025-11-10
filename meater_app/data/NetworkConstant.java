package com.apptionlabs.meater_app.data;

import k5.b;
import kotlin.Metadata;
import wh.m;

/* compiled from: NetworkConstant.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/apptionlabs/meater_app/data/NetworkConstant;", "", "", "getCloudBaseUrl", "getCloudMQTTHost", "getCloudAPIHost", "Lk5/b;", "getRepository", "networkConstant", "Lk5/b;", "<init>", "(Lk5/b;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public class NetworkConstant {
    private final b networkConstant;

    public NetworkConstant(b bVar) {
        m.f(bVar, "networkConstant");
        this.networkConstant = bVar;
    }

    public final String getCloudAPIHost() {
        return this.networkConstant.l();
    }

    public final String getCloudBaseUrl() {
        return this.networkConstant.i();
    }

    public final String getCloudMQTTHost() {
        return this.networkConstant.b();
    }

    /* renamed from: getRepository, reason: from getter */
    public final b getNetworkConstant() {
        return this.networkConstant;
    }
}
