package cm.aptoide.p092pt.dataprovider;

import android.telephony.TelephonyManager;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class NetworkOperatorManager {
    private final TelephonyManager telephonyManager;

    public NetworkOperatorManager(TelephonyManager telephonyManager) {
        this.telephonyManager = telephonyManager;
    }

    private int codePortionLength(String str) {
        return Math.min(3, str.length());
    }

    public String getMobileCountryCode() {
        String networkOperator = this.telephonyManager.getNetworkOperator();
        return networkOperator == null ? HttpUrl.FRAGMENT_ENCODE_SET : networkOperator.substring(0, codePortionLength(networkOperator));
    }

    public String getMobileNetworkCode() {
        String networkOperator = this.telephonyManager.getNetworkOperator();
        return networkOperator == null ? HttpUrl.FRAGMENT_ENCODE_SET : networkOperator.substring(codePortionLength(networkOperator));
    }

    public String getSimCountryISO() {
        return this.telephonyManager.getSimCountryIso();
    }

    public boolean isSimStateReady() {
        return this.telephonyManager.getSimState() == 5;
    }
}
