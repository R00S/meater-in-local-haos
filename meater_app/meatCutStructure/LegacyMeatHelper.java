package com.apptionlabs.meater_app.meatCutStructure;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.reflect.f;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/meat/meat/classes.dex */
public class LegacyMeatHelper {
    private static LegacyMeatHelper self;
    public ArrayList<LegacyMeatMapping> legacyMeatMappings;

    public static LegacyMeatHelper getInstance() {
        if (self == null) {
            self = new LegacyMeatHelper();
        }
        return self;
    }

    public int getCutTypeFromLegacyMeat(int i10, int i11) {
        Iterator<LegacyMeatMapping> it = this.legacyMeatMappings.iterator();
        while (it.hasNext()) {
            LegacyMeatMapping next = it.next();
            if (next.legacyMeat == i10 && next.legacyCut == i11) {
                return next.cutID;
            }
        }
        return -1;
    }

    public List getLegacyMeatMappingList() {
        return this.legacyMeatMappings;
    }

    public void init(Context context) {
        Resources resources = context.getResources();
        if (this.legacyMeatMappings == null) {
            try {
                InputStream openRawResource = resources.openRawResource(2131951656);
                byte[] bArr = new byte[openRawResource.available()];
                openRawResource.read(bArr);
                String str = new String(bArr, StandardCharsets.UTF_8);
                openRawResource.close();
                this.legacyMeatMappings = (ArrayList) new Gson().j(str, new f<ArrayList<LegacyMeatMapping>>() { // from class: com.apptionlabs.meater_app.meatCutStructure.LegacyMeatHelper.1
                }.getType());
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }
}
