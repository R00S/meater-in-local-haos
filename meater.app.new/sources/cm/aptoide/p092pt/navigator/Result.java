package cm.aptoide.p092pt.navigator;

import android.content.Intent;

/* loaded from: classes.dex */
public class Result {
    private final Intent data;
    private final int requestCode;
    private final int resultCode;

    public Result(int i2, int i3, Intent intent) {
        this.requestCode = i2;
        this.resultCode = i3;
        this.data = intent;
    }

    public Intent getData() {
        return this.data;
    }

    public int getRequestCode() {
        return this.requestCode;
    }

    public int getResultCode() {
        return this.resultCode;
    }
}
