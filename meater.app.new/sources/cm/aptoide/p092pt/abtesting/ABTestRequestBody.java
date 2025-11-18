package cm.aptoide.p092pt.abtesting;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ABTestRequestBody {
    private List<Data> events;

    public static class Data {
        private String name;

        Data(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public ABTestRequestBody(String str) {
        ArrayList arrayList = new ArrayList();
        this.events = arrayList;
        arrayList.add(new Data(str));
    }

    public List<Data> getEvents() {
        return this.events;
    }
}
