package com.apptionlabs.meater_app.singletons.cloudpolling;

import com.apptionlabs.meater_app.model.cloudpolling.CloudPolling;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import wh.m;

/* compiled from: CloudPollingManager.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0006\"\f\b\u0000\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0012\u0010\f\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0002J\"\u0010\r\u001a\u00020\b\"\f\b\u0000\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004R\u001e\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/apptionlabs/meater_app/singletons/cloudpolling/CloudPollingManager;", "", "Lcom/apptionlabs/meater_app/model/cloudpolling/CloudPolling;", "T", "Ljava/lang/Class;", "clazz", "", "pollingForClass", "Lih/u;", "start", "stop", "polling", "addOrUpdate", "remove", "", "pollingList", "Ljava/util/List;", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class CloudPollingManager {
    public static final CloudPollingManager INSTANCE = new CloudPollingManager();
    private static final List<CloudPolling<?>> pollingList = new ArrayList();

    private CloudPollingManager() {
    }

    private final <T extends CloudPolling<?>> List<CloudPolling<?>> pollingForClass(Class<T> clazz) {
        List<CloudPolling<?>> list = pollingList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (clazz.isInstance((CloudPolling) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void addOrUpdate(CloudPolling<?> cloudPolling) {
        m.f(cloudPolling, "polling");
        List<CloudPolling<?>> pollingForClass = pollingForClass(cloudPolling.getClass());
        Iterator<T> it = pollingForClass.iterator();
        while (it.hasNext()) {
            ((CloudPolling) it.next()).setPollingRate(cloudPolling.getPollingRate());
        }
        if (pollingForClass.isEmpty()) {
            pollingList.add(cloudPolling);
            cloudPolling.start();
        }
    }

    public final <T extends CloudPolling<?>> void remove(Class<T> cls) {
        m.f(cls, "clazz");
        List<CloudPolling<?>> pollingForClass = pollingForClass(cls);
        Iterator<T> it = pollingForClass.iterator();
        while (it.hasNext()) {
            ((CloudPolling) it.next()).reset();
        }
        pollingList.removeAll(pollingForClass);
    }

    public final void start() {
        Iterator<T> it = pollingList.iterator();
        while (it.hasNext()) {
            ((CloudPolling) it.next()).start();
        }
    }

    public final void stop() {
        Iterator<T> it = pollingList.iterator();
        while (it.hasNext()) {
            ((CloudPolling) it.next()).stop();
        }
    }
}
