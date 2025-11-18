package cm.aptoide.p092pt.database.room;

/* loaded from: classes.dex */
public class RoomEvent {
    private int action;
    private String context;
    private String data;
    private String eventName;
    private long timestamp;

    public RoomEvent(long j2, String str, int i2, String str2, String str3) {
        this.timestamp = j2;
        this.eventName = str;
        this.action = i2;
        this.context = str2;
        this.data = str3;
    }

    public int getAction() {
        return this.action;
    }

    public String getContext() {
        return this.context;
    }

    public String getData() {
        return this.data;
    }

    public String getEventName() {
        return this.eventName;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setAction(int i2) {
        this.action = i2;
    }

    public void setContext(String str) {
        this.context = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setEventName(String str) {
        this.eventName = str;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }
}
