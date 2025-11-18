package cm.aptoide.p092pt.reactions.network;

import java.util.List;

/* loaded from: classes.dex */
public class TopReactionsResponse {

    /* renamed from: my */
    private C4123My f10948my;
    private List<ReactionTypeResponse> top;
    private int total;

    /* renamed from: cm.aptoide.pt.reactions.network.TopReactionsResponse$My */
    public static class C4123My {
        private String type;
        private String uid;

        public String getType() {
            return this.type;
        }

        public String getUid() {
            return this.uid;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setUid(String str) {
            this.uid = str;
        }
    }

    public static class ReactionTypeResponse {
        private int total;
        private String type;

        public int getTotal() {
            return this.total;
        }

        public String getType() {
            return this.type;
        }

        public void setTotal(int i2) {
            this.total = i2;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    public C4123My getMy() {
        return this.f10948my;
    }

    public List<ReactionTypeResponse> getTop() {
        return this.top;
    }

    public int getTotal() {
        return this.total;
    }

    public void setMy(C4123My c4123My) {
        this.f10948my = c4123My;
    }

    public void setTop(List<ReactionTypeResponse> list) {
        this.top = list;
    }

    public void setTotal(int i2) {
        this.total = i2;
    }
}
