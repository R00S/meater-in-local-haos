package P5;

import android.content.Intent;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.views.X;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ConnectionWhitelistManager.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003R(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LP5/e;", "", "<init>", "()V", "", "id", "", "d", "(Ljava/lang/String;)Z", "Loa/F;", "b", "Ljava/util/ArrayList;", "a", "Ljava/util/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "list", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: P5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1597e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f14034c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static final C1597e f14035d = new C1597e();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ArrayList<String> list = new ArrayList<>();

    /* compiled from: ConnectionWhitelistManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LP5/e$a;", "", "<init>", "()V", "LP5/e;", "a", "()LP5/e;", "sharedManager", "LP5/e;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: P5.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C1597e a() {
            return C1597e.f14035d;
        }

        private Companion() {
        }
    }

    public static final C1597e c() {
        return INSTANCE.a();
    }

    public final void b() {
        try {
            Scanner scanner = new Scanner(new DataInputStream(x4.g.h().getAssets().open("devices.txt")));
            while (scanner.hasNext()) {
                this.list.add(scanner.next());
            }
        } catch (Exception e10) {
            e10.getLocalizedMessage();
        }
    }

    public final boolean d(String id2) {
        C3862t.g(id2, "id");
        boolean zContains = this.list.contains(id2);
        if (!X.f32790B && zContains) {
            Intent intent = new Intent(MEATERIntent.INTENT_UNSUPPORTED_DEVICE);
            intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, id2);
            intent.setPackage(x4.g.h().getPackageName());
            x4.g.h().sendBroadcast(intent);
        }
        return !zContains;
    }
}
