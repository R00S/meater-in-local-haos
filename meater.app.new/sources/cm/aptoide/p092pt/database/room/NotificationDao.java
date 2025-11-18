package cm.aptoide.p092pt.database.room;

import java.util.List;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.AbstractC9082s;

/* loaded from: classes.dex */
public interface NotificationDao {
    void deleteAllByType(int i2);

    void deleteAllExcluding(List<String> list);

    void deleteByKey(List<String> list);

    AbstractC9076m<List<RoomNotification>> getAll();

    AbstractC9076m<List<RoomNotification>> getAllSortedDesc();

    AbstractC9082s<List<RoomNotification>> getAllSortedDescByType(Integer[] numArr);

    AbstractC9082s<List<RoomNotification>> getDismissed(Integer[] numArr, long j2, long j3);

    void insert(RoomNotification roomNotification);

    void insertAll(List<RoomNotification> list);
}
