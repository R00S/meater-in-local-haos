package cm.aptoide.p092pt.account.view;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Callable;
import p456rx.Single;

/* loaded from: classes.dex */
public class PhotoFileGenerator {
    private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    private final Context context;
    private final String fileProviderAuthority;
    private final File storageDirectory;

    public PhotoFileGenerator(Context context, File file, String str) {
        this.context = context;
        this.storageDirectory = file;
        this.fileProviderAuthority = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$generateNewImageFileUriAsString$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ String m6899a() throws Exception {
        String str = String.format("aptoide_image_%s", DATE_FORMATTER.format(new Date()));
        if (Build.VERSION.SDK_INT >= 21) {
            return FileProvider.m1666e(this.context, this.fileProviderAuthority, File.createTempFile(str, ".jpg", this.storageDirectory)).toString();
        }
        return Uri.fromFile(new File(this.storageDirectory + File.separator + str + ".jpg")).toString();
    }

    public Single<String> generateNewImageFileUriAsString() {
        return Single.m39912l(new Callable() { // from class: cm.aptoide.pt.account.view.c1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7298f.m6899a();
            }
        });
    }
}
