package com.apptionlabs.meater_app.model;

import com.apptionlabs.meater_app.data.LocalStorage;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/meat/meat/classes.dex */
public class SavedEventLog {
    public long cookId;
    public long eventLogId;
    private LocalMEATEREvent localMEATEREvent = new LocalMEATEREvent();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void addEvent(long j10, LocalMEATEREvent localMEATEREvent) {
        SavedEventLog savedEventLog = new SavedEventLog();
        savedEventLog.setLocalMEATEREvent(localMEATEREvent);
        savedEventLog.setCookId(j10);
        LocalStorage.sharedStorage().savedEventLogDAO().g(savedEventLog);
    }

    private void setCookId(long j10) {
        this.cookId = j10;
    }

    private void setEventLogId(long j10) {
        this.eventLogId = j10;
    }

    public long getCookId() {
        return this.cookId;
    }

    public ProbeEventLog getEventLog(long j10) {
        List<SavedEventLog> f10 = LocalStorage.sharedStorage().savedEventLogDAO().f(j10);
        ProbeEventLog probeEventLog = new ProbeEventLog();
        Iterator<SavedEventLog> it = f10.iterator();
        while (it.hasNext()) {
            probeEventLog.addLocalEvent(it.next().getLocalMEATEREvent());
        }
        return probeEventLog;
    }

    public long getEventLogId() {
        return this.eventLogId;
    }

    public LocalMEATEREvent getLocalMEATEREvent() {
        return this.localMEATEREvent;
    }

    public void setLocalMEATEREvent(LocalMEATEREvent localMEATEREvent) {
        this.localMEATEREvent = localMEATEREvent;
    }
}
