package com.apptionlabs.meater_app.model;

import com.apptionlabs.meater_app.model.ProbeEventLog;
import com.apptionlabs.meater_app.v3protobuf.MEATEREvent;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;

/* loaded from: /tmp/meat/meat/classes.dex */
public class LocalMEATEREvent {

    @gg.a
    private MEATEREvent event;

    @gg.a
    private byte[] eventByte;

    @gg.a
    private ProbeEventLog.EventType eventType;

    @gg.a
    private boolean haveConfirmedCookTime;

    @gg.a
    private boolean haveSentToServer;

    @gg.a
    private long time;

    public MEATEREvent getEvent() {
        return this.event;
    }

    public MEATEREvent getEventByte() {
        try {
            ProtoAdapter<MEATEREvent> protoAdapter = MEATEREvent.ADAPTER;
            return (MEATEREvent) protoAdapter.decode(this.eventByte);
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public ProbeEventLog.EventType getEventType() {
        return this.eventType;
    }

    public long getTime() {
        return this.time;
    }

    public boolean haveConfirmedCookTime() {
        return this.haveConfirmedCookTime;
    }

    public boolean haveSentToServer() {
        return this.haveSentToServer;
    }

    public void setEvent(MEATEREvent mEATEREvent) {
        this.event = mEATEREvent;
        setEventByte(mEATEREvent);
    }

    public void setEventByte(MEATEREvent mEATEREvent) {
        this.eventByte = mEATEREvent.encode();
    }

    public void setEventType(ProbeEventLog.EventType eventType) {
        this.eventType = eventType;
    }

    public void setHaveConfirmedCookTime(boolean z10) {
        this.haveConfirmedCookTime = z10;
    }

    public void setHaveSentToServer(boolean z10) {
        this.haveSentToServer = z10;
    }

    public void setTime(long j10) {
        this.time = j10;
    }
}
