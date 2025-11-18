package W4;

import android.content.Context;
import com.apptionlabs.meater_app.meatCutStructure.LegacyMeatHelper;
import java.io.File;

/* compiled from: MEATERDataMigrator.java */
/* loaded from: classes2.dex */
public class a {
    private static void a(Context context) {
        File file = new File(new File(context.getDatabasePath("ignore").toString()).getParent());
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }

    public static void b(Context context) {
        LegacyMeatHelper.getInstance().init(context);
        a(context);
        b.b(context);
        c.b(context);
        d.b(context);
    }
}
