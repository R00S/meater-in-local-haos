package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.promotions;

import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse;

/* loaded from: classes.dex */
public class GetPackagePromotionsResponse extends BaseV7EndlessDataListResponse<PromotionAppModel> {

    public static class PromotionAppModel {
        private float appc;
        private boolean claimed;
        private String packageName;
        private String promotionId;

        public float getAppc() {
            return this.appc;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getPromotionId() {
            return this.promotionId;
        }

        public boolean isClaimed() {
            return this.claimed;
        }

        public void setAppc(float f2) {
            this.appc = f2;
        }

        public void setClaimed(boolean z) {
            this.claimed = z;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setPromotionId(String str) {
            this.promotionId = str;
        }
    }
}
