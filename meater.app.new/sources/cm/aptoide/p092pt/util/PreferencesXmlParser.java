package cm.aptoide.p092pt.util;

import android.content.res.XmlResourceParser;
import cm.aptoide.p092pt.database.room.RoomNotification;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class PreferencesXmlParser {
    private final String NAMESPACE = "http://schemas.android.com/apk/res/android";
    private final String DEFAULT_VALUE = "defaultValue";
    private final String KEY = RoomNotification.KEY;
    private int eventType = -1;

    public List<String[]> parse(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i2 = this.eventType;
            if (i2 == 1) {
                return arrayList;
            }
            if (i2 == 2) {
                String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "defaultValue");
                String attributeValue2 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", RoomNotification.KEY);
                if (attributeValue != null) {
                    arrayList.add(new String[]{attributeValue2, attributeValue});
                }
            }
            this.eventType = xmlResourceParser.next();
        }
    }
}
