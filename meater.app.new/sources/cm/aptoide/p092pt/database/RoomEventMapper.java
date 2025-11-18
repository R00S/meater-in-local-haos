package cm.aptoide.p092pt.database;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.data.Event;
import cm.aptoide.p092pt.database.room.RoomEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class RoomEventMapper {
    private final ObjectMapper objectMapper;

    public RoomEventMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public RoomEvent map(Event event) throws JsonProcessingException {
        return new RoomEvent(event.getTimeStamp(), event.getEventName(), event.getAction().ordinal(), event.getContext(), this.objectMapper.writeValueAsString(event.getData()));
    }

    public List<Event> map(List<RoomEvent> list) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (RoomEvent roomEvent : list) {
            arrayList.add(new Event(roomEvent.getEventName(), (Map) this.objectMapper.readValue(roomEvent.getData(), new TypeReference<Map<String, Object>>() { // from class: cm.aptoide.pt.database.RoomEventMapper.1
            }), AnalyticsManager.Action.values()[roomEvent.getAction()], roomEvent.getContext(), roomEvent.getTimestamp()));
        }
        return arrayList;
    }
}
