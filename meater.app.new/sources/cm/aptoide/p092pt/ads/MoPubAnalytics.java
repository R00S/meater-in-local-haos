package cm.aptoide.p092pt.ads;

import android.os.Bundle;
import cm.aptoide.p092pt.ads.WalletAdsOfferManager;
import cm.aptoide.p092pt.logger.Logger;
import io.rakam.api.C9230f;
import org.json.JSONException;
import org.json.JSONObject;
import p241e.p252d.p253a.C8776b;
import p241e.p291f.p292a.p293a.C8956a;

/* loaded from: classes.dex */
public class MoPubAnalytics {
    private static final String ADS_STATUS_USER_PROPERTY = "ads";

    /* renamed from: cm.aptoide.pt.ads.MoPubAnalytics$1 */
    static /* synthetic */ class C14131 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$ads$WalletAdsOfferManager$OfferResponseStatus */
        static final /* synthetic */ int[] f7511x788a6a9d;

        static {
            int[] iArr = new int[WalletAdsOfferManager.OfferResponseStatus.values().length];
            f7511x788a6a9d = iArr;
            try {
                iArr[WalletAdsOfferManager.OfferResponseStatus.NO_ADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7511x788a6a9d[WalletAdsOfferManager.OfferResponseStatus.ADS_HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7511x788a6a9d[WalletAdsOfferManager.OfferResponseStatus.ADS_SHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private enum AdsVisibility {
        ADS_BLOCKED_BY_OFFER("ads blocked by offer"),
        CONTROL("control"),
        HAS_ADS("has ads");

        private final String type;

        AdsVisibility(String str) {
            this.type = str;
        }

        public String getType() {
            return this.type;
        }
    }

    private JSONObject addAdsSuperProperty(String str, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(ADS_STATUS_USER_PROPERTY, str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private String mapAdsVisibilityToAnalyticsValues(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        int i2 = C14131.f7511x788a6a9d[offerResponseStatus.ordinal()];
        if (i2 == 1) {
            return "no_ads";
        }
        if (i2 == 2) {
            return "ads_block_by_offer";
        }
        if (i2 == 3) {
            return "with_ads";
        }
        throw new IllegalStateException("Invalid OfferResponseStatus");
    }

    private AdsVisibility mapToAdsVisibility(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        int i2 = C14131.f7511x788a6a9d[offerResponseStatus.ordinal()];
        if (i2 == 1) {
            return AdsVisibility.CONTROL;
        }
        if (i2 == 2) {
            return AdsVisibility.ADS_BLOCKED_BY_OFFER;
        }
        if (i2 == 3) {
            return AdsVisibility.HAS_ADS;
        }
        throw new IllegalStateException("Invalid OfferResponseStatus");
    }

    public void setAdsVisibilityUserProperty(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        Bundle bundle = new Bundle();
        String type = mapToAdsVisibility(offerResponseStatus).getType();
        bundle.putString(ADS_STATUS_USER_PROPERTY, type);
        C8776b.b.m27938a(ADS_STATUS_USER_PROPERTY, type);
        C9230f.m29891a().m29950c0(addAdsSuperProperty(mapAdsVisibilityToAnalyticsValues(offerResponseStatus), C9230f.m29891a().m29962x()));
    }

    public void setMoPubAbTestGroup(boolean z) {
        new Bundle().putString("ASV-1377-MoPub-Ads", z ? "a_without_mopub" : "b_with_mopub");
        C8776b.b.m27938a("ASV-1377-MoPub-Ads", z ? "a_without_mopub" : "b_with_mopub");
    }

    void setUserId(String str) {
        C9230f.m29891a().m29951d0(str);
        C8956a.m28547v(str);
        Logger.getInstance().m8273d("RAKAM", "set user");
        Logger.getInstance().m8273d("INDICATIVE", "set user");
    }
}
