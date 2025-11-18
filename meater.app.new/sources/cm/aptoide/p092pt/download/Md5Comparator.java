package cm.aptoide.p092pt.download;

import android.text.TextUtils;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.io.File;

/* loaded from: classes.dex */
public class Md5Comparator {
    private String generalFolderPath;

    public Md5Comparator(String str) {
        this.generalFolderPath = str;
    }

    public boolean compareMd5(String str, String str2) {
        return TextUtils.equals(AptoideUtils.AlgorithmU.computeMd5(new File(this.generalFolderPath + str2)), str);
    }
}
