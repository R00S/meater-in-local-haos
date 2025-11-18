package cm.aptoide.p092pt.dataprovider.model.p096v7.listapp;

import java.util.List;

/* loaded from: classes.dex */
public class Urls {
    private List<Url> click;
    private List<Url> download;
    private List<Url> impression;

    public static class Url {
        private String name;
        private String url;

        public String getName() {
            return this.name;
        }

        public String getUrl() {
            return this.url;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    public List<Url> getClick() {
        return this.click;
    }

    public List<Url> getDownload() {
        return this.download;
    }

    public List<Url> getImpression() {
        return this.impression;
    }

    public void setClick(List<Url> list) {
        this.click = list;
    }

    public void setDownload(List<Url> list) {
        this.download = list;
    }

    public void setImpression(List<Url> list) {
        this.impression = list;
    }
}
