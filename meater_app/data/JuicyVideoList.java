package com.apptionlabs.meater_app.data;

import java.util.ArrayList;
import q6.VideoData;

/* loaded from: /tmp/meat/meat/classes.dex */
public class JuicyVideoList {
    public ArrayList<JuicyVideo> guest = new ArrayList<>();
    public ArrayList<JuicyVideo> meater2 = new ArrayList<>();
    public ArrayList<JuicyVideo> instructional = new ArrayList<>();
    public ArrayList<VideoData> parentList = new ArrayList<>();

    public boolean noData() {
        if (this.guest.isEmpty() && this.meater2.isEmpty() && this.instructional.isEmpty()) {
            return true;
        }
        return false;
    }
}
